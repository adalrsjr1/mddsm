package broker.physical

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import broker.test.MGridVM;
import broker.util.Terminal;
import types.TypeEnum;

class MGPlant {
	public static final ExecutorService plantPool = Executors.newCachedThreadPool()
	public static int delay = 1000
	private static final def plant = [] as Set

	private static Terminal t = new Terminal("MGPlant")
	static {
		def th = Thread.start {
			
			while(true && !MGridVM.bench)
			{
				plant.each {
					t.printWithoutTime("|__ ${it.id}:${it.type} [${it.limitVoltage}V ${it.limitCurrent}A ${it.limitPower}W] ${it.voltage}V ${it.current}A ${it.power}W")
					it.devs.each {
						t.printWithoutTime("|   |__ ${it.id}:${it.type} [${it.limitVoltage}V ${it.limitCurrent}A ${it.limitPower}W] ${it.voltage}V ${it.current}A ${it.power}W")
					}
				}
				sleep(delay)
				t.clear()
			}
		}
		
	}

	public static MGPlant instance()
	{
		this
	}
	
	private MGPlant()
	{

	}

	public static void notify2MHB(String ctrlrId, String devId, float current,
		float voltage, float power)
	{
		
	}

	private static Controller addCtrlr(Controller c)
	{
		MGPlant.plantPool.submit(c)
		return c
	}

	/**
	 * Voltage from all sources
	 * @return voltage (mean among all source voltage)
	 */
	public static float globalVoltage()
	{
		float voltage = 0f
		int count = 0
		plant.each {
			if(it.type != TypeEnum.LOAD && it.closed())
			{
				voltage += it.getVoltage()
				++count
			}
		}
		return voltage / count
	}

	/**
	 * Current from all loads
	 * @return sum of all load current
	 */
	public static float globalCurrent()
	{
		float current = 0f
		plant.each {
			if(it.type == TypeEnum.LOAD && it.closed())
			{
				current += it.getCurrent()
			}
		}

		float sources = plant.count {
			it.type != TypeEnum.LOAD && it.closed()
		}

		return current
	}

	private static Device getDev(String ctrlrId, String devId)
	{
		def ctrlrs = MGPlant.plant
		Controller c = ctrlrs.find{
			it.id == ctrlrId
			}
		Device d = c.devs.find {it.id == devId}
		return d
	}
	
	private static Controller getCtrlr(String ctrlrId)
	{
		def ctrlrs = MGPlant.plant
		Controller c = ctrlrs.find{
			it.id == ctrlrId
			}
		return c
	}
	
	public static boolean setCtrlrProperty(String ctrlrId, String attribute, Object value)
	{
		Controller c = getCtrlr(ctrlrId)
		
		if(c.properties.containsKey(attribute))
		{
			Class cls = c.metaClass.getProperty(c, attribute).getClass()
			c.metaClass.setProperty(c, attribute, cls.cast(value))
		}	
		else println "ctrlr do not have ${attribute}"
	}
	
	public static boolean setDevProperty(String lc, String devId, String attribute, Object value)
	{
		Device d = getDev(lc, devId)
		if(d.properties.containsKey(attribute))
		{
			Class cls = d.metaClass.getProperty(d, attribute).getClass()
			d.metaClass.setProperty(d, attribute, cls.cast(value))
		}
		else println "device do not have ${attribute}"
	}
	
	public static void fault(String ctrlrId, String devId, String eventName, boolean ctrlrFault)
	{
		Map faultEvent = ["ctrlrId":ctrlrId, "devId":devId, "event": eventName]
		println "MGPlant::fault::${faultEvent}"
		if(ctrlrFault)
		{
			getCtrlr(ctrlrId).setFault(faultEvent)
		}
		else
		{
			getDev(ctrlrId, devId).setFault(faultEvent)
		}
				
		/*Device d = getDev(ctrlrId, devId)
		
		d.setFault(property)*/
	}
	
	public static void openDev(String ctrlrId, String devId)
	{
		Device d = getDev(ctrlrId, devId)
		d.open()
	}
	
	public static void closeDev(String ctrlrId, String devId)
	{
		Device d = getDev(ctrlrId, devId)
		d.close()
	}
	
	public static void openCtrlr(String ctrlrId)
	{
		Controller c = getCtrlr(ctrlrId)
		c.open()
	}
	
	public static void closeCtrlr(String ctrlrId, boolean devs)
	{
		Controller c = getCtrlr(ctrlrId)
		c.close(devs)
	}
	
	public static Controller addCtrlrInPlant(String id, TypeEnum type, float limitCurrent,
		float limitVoltage, float limitPower)
	{
		Controller c;
		switch(type)
		{
			case TypeEnum.LOAD: c = addLoadCtrlr(id, limitCurrent, limitPower, limitVoltage)
								break
			case TypeEnum.SOURCE: c = addSourceCtrlr(id, limitCurrent, limitPower, limitVoltage)
								break
			case TypeEnum.PCC: c = addPCCCtrlr(id, limitCurrent, limitPower, limitVoltage)
								break
			case TypeEnum.STORAGE: c = addStorageCtrlr(id,limitCurrent, limitPower, limitVoltage)
								break
		
		}
		return c
	}
	
	public static Controller addLoadCtrlr(String id, float limitCurrent, 
		float limitPower, float limitVoltage)
	{
		Controller c = new Controller(id,TypeEnum.LOAD,limitCurrent,limitPower, limitVoltage)
		plant << c
		return c
	}
	
	public static Controller addSourceCtrlr(String id, float limitCurrent,
		float limitPower, float limitVoltage)
	{
		Controller c = new Controller(id,TypeEnum.SOURCE,limitCurrent,limitPower, limitVoltage)
		plant << c
		return c
	}
	
	public static Controller addPCCCtrlr(String id, float limitCurrent,
		float limitPower, float limitVoltage)
	{
		Controller c = new Controller(id,TypeEnum.PCC,limitCurrent,limitPower, limitVoltage)
		plant << c
		return c
	}
	
	public static Controller addStorageCtrlr(String id, float limitCurrent,
		float limitPower, float limitVoltage)
	{
		Controller c = new Controller(id,TypeEnum.STORAGE,limitCurrent,limitPower, limitVoltage)
		plant << c
		return c
	}
	
	public static Device addDevInPlant(String ctrlrId, String id, TypeEnum type,
		float limitVoltage, float limitPower)
	{
		Device d
		switch(type)
		{
			case TypeEnum.LOAD: d = addLoadDev(ctrlrId, id, limitPower, limitVoltage)
								break
			case TypeEnum.SOURCE: d = addSourceDev(ctrlrId, id, limitPower, limitVoltage)
								break
			case TypeEnum.SMART_METER: d = addMeterDev(ctrlrId, id, limitPower, limitVoltage)
								break
			case TypeEnum.STORAGE: d = addStorageDev(ctrlrId, id, limitPower, limitVoltage)
								break	
		
		}
		return d
	}
	
	public static Device addLoadDev(String ctrlrId, String devId,
		float power, float voltage)
	{
		Device d = new Device(devId, TypeEnum.LOAD, power, voltage)
		Controller c = getCtrlr(ctrlrId)
		c.addDev(d)
		d.addObserver(c)
		return d
	}
	
	public static Device addSourceDev(String ctrlrId, String devId,
		float power, float voltage)
	{
		Device d = new Device(devId, TypeEnum.SOURCE, power, voltage)
		Controller c = getCtrlr(ctrlrId)
		c.addDev(d)
		d.addObserver(c)
		return d
	}
	
	public static Device addMeterDev(String ctrlrId, String devId,
		float power, float voltage)
	{
		Device d = new Device(devId, TypeEnum.SMART_METER,  power, voltage)
		Controller c = getCtrlr(ctrlrId)
		c.addDev(d)
		d.addObserver(c)
		return d
	}
	
	public static Device addStorageDev(String ctrlrId, String devId,
		float power, float voltage)
	{
		Device d = new Device(devId, TypeEnum.STORAGE,  power, voltage)
		Controller c = getCtrlr(ctrlrId)
		c.addDev(d)
		d.addObserver(c)
		return d
	}
	
	public static void remDev(String ctrlrId, String devId)
	{

		Controller c = getCtrlr(ctrlrId)
		c.remDev(devId)
	}
	
	public static void remCtrlr(String ctrlrId)
	{
		Controller c = getCtrlr(ctrlrId)
		c.stop()
		plant.remove(c)
	}
	
	public static boolean startPlant()
	{
		plant.each {
			addCtrlr(it)
		}
	}
	
	static main(String[] args)
	{
	
		MGPlant.addLoadCtrlr("C_001",2,100,220)
		MGPlant.addSourceCtrlr("C_002",2,100,220)
		MGPlant.addPCCCtrlr("C_003",2,100,220)
		
		MGPlant.addLoadDev("C_001", "D_001", 100, 220)
		MGPlant.addLoadDev("C_001", "D_002", 100, 220)
		MGPlant.addLoadDev("C_001", "D_003", 100, 220)
		
		MGPlant.addSourceDev("C_002", "D_004", 100, 220)
		MGPlant.addSourceDev("C_002", "D_005", 100, 220)
		MGPlant.addSourceDev("C_002", "D_006", 100, 220)
		
		MGPlant.addMeterDev("C_003", "D_007", 100, 220)
		
		MGPlant.startPlant()
		
		while(true)
		{
			Scanner s = new Scanner(System.in)

			//			if(s.nextInt() == 0)
			//			{
			//				c1.close()
			//				c2.close()
			//				c3.close()
			//			}
			String str;
			if(!(str=s.nextLine()).isEmpty())
			{
				
				if(str.matches("C_[0-9][0-9][0-9] close"))
				{
					String[] tokens = str.split(" ")
					MGPlant.closeCtrlr(tokens[0], false)
				} 
				else if(str.matches("C_[0-9][0-9][0-9] open"))
				{
					String[] tokens = str.split(" ")
					MGPlant.openCtrlr(tokens[0])
				} 
				else if(str.matches("C_[0-9][0-9][0-9] D_[0-9][0-9][0-9] close"))
				{
					String[] tokens = str.split(" ")
					MGPlant.closeDev(tokens[0], tokens[1])
				}
				else if(str.matches("C_[0-9][0-9][0-9] D_[0-9][0-9][0-9] open"))
				{
					String[] tokens = str.split(" ")
					MGPlant.openDev(tokens[0], tokens[1])
				}
				else if(str.matches("C_[0-9][0-9][0-9] D_[0-9][0-9][0-9].*(voltage|current)"))
				{
					String[] tokens = str.split(" ")
					MGPlant.fault(tokens[0], tokens[1], tokens[2])
				}
				else if(str.matches("C_[0-9][0-9][0-9] D_[0-9][0-9][0-9] stop"))
				{
					String[] tokens = str.split(" ")
					MGPlant.remDev(tokens[0], tokens[1])
				}
				else if(str.matches("C_[0-9][0-9][0-9] stop"))
				{
					String[] tokens = str.split(" ")
					MGPlant.remCtrlr(tokens[0])
				}
			}

		}
	}
}

class Controller extends Observable implements Runnable, Observer  {
	public final String id
	public final TypeEnum type

	private float current
	private float voltage
	private float power

	private float limitVoltage
	private float limitCurrent
	private float limitPower


	private int t = MGPlant.delay
	private static Random r = new Random()
	private boolean isClose = true
	private boolean running = true

	private final ExecutorService plantPool = Executors.newCachedThreadPool()
	private final def devs = [] as Set

	public Controller(){}

	public Controller(String ctrlrId, TypeEnum type, float currentLim,
	float powerLim, float voltageLim)
	{
		this(ctrlrId,type)
		this.limitCurrent = currentLim
		this.limitPower = powerLim
		this.limitVoltage = voltageLim

	}

	public Controller(String ctrlrId, TypeEnum type)
	{

		id = ctrlrId
		this.type = type
		this.limitVoltage = 220
		this.limitCurrent = 1
		this.limitPower = 100
	}

	public List getDevs()
	{
		List l = []
		devs.each {
			l << it
		}
		return l
	}
	
	public boolean closed()
	{
		isClose
	}

	public void addDev(Device dev)
	{
		devs << dev
		plantPool.submit(dev)
	}

	public void remDev(String devId)
	{
		Device dev = devs.find {
			it.id == devId
		}
		devs.remove(dev)
		dev.stop()
	}

	public float getLimitVoltage()
	{
		limitVoltage
	}
	
	public void setLimitVoltage(float limitVoltage)
	{
		this.limitVoltage = limitVoltage
	}	
	
	public void setLimitCurrent(float limitCurrent)
	{
		this.limitCurrent = limitCurrent
	}
	
	public float getLimitCurrent()
	{
		limitCurrent
	}
	
	public void setLimitPower(float limitPower)
	{
		this.limitPower = limitPower
	}
	
	public float getLimitPower()
	{
		limitPower
	}
	
	
	public void setVoltage(float voltage)
	{
		this.voltage = voltage
		if(type == TypeEnum.LOAD)
		{
			devs.each {
				if(it.closed())
				{
					it.setVoltage(voltage)
				}
			}
		} 
		else if(type == TypeEnum.STORAGE)
		{
			
		}
	}

	public void setCurrent(float c)
	{
		current = c
		int count = 0

		if(type != TypeEnum.LOAD)
		{
			count = devs.count{it.closed()}
			c = current / count
			if(c.naN) c = 0
			devs.each {
				if(it.closed())
				{
					it.setCurrent(c)
				}
			}
		}
	}

	public float getVoltage()
	{
		voltage
	}

	public float getCurrent()
	{
		current
	}
	
	public float getPower()
	{
		power
	}

	private behaviour()
	{
		float minV = 0.95f
		float maxV = 1.05f

		float v, c, p;
		for (Device dev : devs) {
			v += dev.getVoltage()
			c += dev.getCurrent()
			p += dev.getPower()
		}
		
		int devsOpenCount = devs.count{it.closed()} 
		
		if(type == TypeEnum.LOAD)
		{
			setVoltage(MGPlant.globalVoltage())
		}else
			voltage = v / devsOpenCount 
	
		if(voltage.naN) voltage = 0
		current = c
		power = p

		if(type != TypeEnum.LOAD)
		{
			if(devsOpenCount > 0)
			setCurrent(MGPlant.globalCurrent())
		}

	}

	public void setFault(Map faultEvent)
	{
		println "Ctrlr::setFault::${faultEvent}"
		notifyUp(faultEvent)
		open()
	}
	
	@Override
	public void run() {
		while(running)
		{
			sleep(t)
			if(!isClose)
				internOpen()

			behaviour()
			
			def args = ["event":"updateCtrlr", "ctrlrId":id, "current":current, "voltage":voltage, "power": power]
			notifyUp(args)

		}
	}

	public void stop()
	{
		
		devs.each {
			it.stop()
		}
		
		running = false
		plantPool.shutdown()
	}
	
	public boolean open()
	{
		isClose = false
		for (Device d : devs) {
			d.open()
		}

	}

	public void internOpen()
	{
		current = 0
		voltage = 0
		power = 0
		synchronized (this) {
//			println "ctrlr ${id}:${type} openning"

			wait()

		}
	}

	public boolean close(boolean closeDevs)
	{
//		println "ctrlr ${id}:${type} closing"

		isClose = true
		if(closeDevs)
		{
			for (Device d : devs) {
				d.close()
			}
		}
		synchronized (this) {
			notify()


		}
	}
	
	public boolean close()
	{
		close(true)
	}

	void notifyUp(Object args)
	{
		setChanged()
		notifyObservers(args)
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		/*def args = arg1 as Map
		args["ctrlrId"] = id
		
		if(args.containsKey("event"))
		{
			if(args["event"] == "fault")
				notifyUp(args)
		}*/
		
		
	}

	@Override
	public String toString()
	{
		"(${id}:${type})"
	}

}

class Device extends Observable implements Runnable {
	public final String id
	public final TypeEnum type
	
	private float limitVoltage
	private float limitPower
	private float limitCurrent
	
	private float current
	private float voltage
	private float power
	private boolean isClose = true
	private boolean charging = false
	private boolean running = true
	
	private int t = MGPlant.delay
	private static Random r = new Random()

	public Device(){}
	
	public Device(String devId, TypeEnum type, float powerLim,
	float voltageLim)
	{
		this(devId,type)
		limitPower = powerLim
		limitVoltage = voltageLim
	}

	public Device(String devId, TypeEnum type)
	{
		id = devId
		this.type = type
		limitVoltage = 220
		limitPower = 100 
		limitCurrent = limitPower / limitVoltage
	}

	public void setCharging(boolean status)
	{
		charging = status
	}
	
	public boolean getChargingStatus()
	{
		charging
	}
	
	public float getLimitCurrent()
	{
		limitCurrent
	}
	
	public void setLimitCurrent(float limitCurrent)
	{
		this.limitCurrent = limitCurrent
	}
	
	public float getLimitVoltage()
	{
		limitVoltage
	}
	
	public void setLimitVoltage(float limitVoltage)
	{
		this.limitVoltage = limitVoltage
	}
	
	public float getLimitPower()
	{
		limitPower
	}
	
	public void setLimitPower(float limitPower)
	{
		this.limitPower= limitPower
	}
	
	public float getCurrent()
	{
		current
	}
	
	public float getVoltage()
	{
		voltage
	}
	
	public float getPower()
	{
		power
	}
	
	public void setVoltage(float voltage)
	{
		if(type == TypeEnum.LOAD)
		{
			this.voltage = voltage
		}
	}

	public void setCurrent(float current)
	{
		if(type != TypeEnum.LOAD)
		{
			this.current = current
		}
	}
	
	public boolean closed()
	{
		isClose
	}

	public void setFault(Map faultEvent)
	{
		println "Device::setFault::${faultEvent}"
		notifyUp(faultEvent)
		open()
	}
	
	public void setFault(String property)
	{
		
		open()	
		
	
//		def voltageFault = {
//				float min = 0.95f // variacao min tensao
//				float max = 1.05f // variacao max tensao
//				
//				float var = r.nextGaussian() / 10f
//				if(var > 0) var += 0.1f;
//				float v = (min + var) * limitVoltage
//				return v
//			}
//		
//		def currentFault = {
//			float c = limitCurrent * (r.nextFloat()/10f + 1.1f)
//			return c
//		}
//		def args
//		switch(property)
//		{
//			case "current": current = currentFault();
//							args = ["devId":id, "current":current, 
//								"voltage":voltage,"power":power]
//							break; 
//			case "voltage": voltage = voltageFault();
//							args = ["devId":id, "current":current,
//								"voltage":voltage,"power":power]
//							break;
//		}
//		args["event"] = "fault"
//		notifyUp(args)
//		open()
	}

	public void notifyUp(Object args)
	{
		setChanged()
		notifyObservers(args)
	}
	
	private void storageBehaviour()
	{
		if(getChargingStatus())
		{
			loadBehaviour()
		} 
		else
		{
			sourceBehaviour()
		}
	}
	
	private void loadBehaviour()
	{

		power = limitPower
		current = power / voltage

	}

	private void sourceBehaviour()
	{
		float rand = r.nextFloat()
		float min = 0.95f // variacao min tensao
		float max = 1.05f // variacao max tensao

		float var

		var = rand * (max - min)
		voltage = (min + var) * limitVoltage

		power = voltage * current

	}

	@Override
	public void run() {
		while(running)
		{

			if(!isClose)
			{
				internOpen()
				sleep(t)
			}

			if(type == TypeEnum.SMART_METER || type == TypeEnum.LEGACY_METER
			|| type == TypeEnum.SOURCE	|| type == TypeEnum.STORAGE)
			{
				sourceBehaviour()
			} else if(type == TypeEnum.LOAD)
			{
				loadBehaviour()
			} else if(type == TypeEnum.STORAGE)
			{
				storageBehaviour()
			}
			def args = ["event":"updateDev", "devId":id, "current":current,
				"voltage":voltage,"power":power]
			sleep(t)
			notifyUp(args)
		}

	}
	
	public void stop()
	{
		running = false
	}

	public boolean open()
	{
		isClose = false

	}

	private void internOpen()
	{
//		println "dev ${id}:${type} openning"
		current = 0
		voltage = 0
		power = 0
		synchronized (this) {

			this.wait()
		}
		
	}

	public boolean close()
	{
		isClose = true
		internClose()
	}

	private void internClose()
	{
//		println "dev ${id}:${type} closing"
		synchronized (this) {

			this.notify()
		}
	}
	
	@Override
	public String toString()
	{
		"(${id}:${type})"
	}

}
