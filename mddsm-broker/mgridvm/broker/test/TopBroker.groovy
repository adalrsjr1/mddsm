package broker.test

import java.reflect.*;
import java.util.concurrent.*;

import asg.cliche.Command
import asg.cliche.InputConverter
import asg.cliche.Param
import base.Manager
import br.inf.ufg.mddsm.broker.emf.EMFLoader
import br.inf.ufg.mddsm.broker.emf.ManagerFactory
import br.inf.ufg.mddsm.broker.handlers.EventManager
import br.inf.ufg.mddsm.broker.manager.MainManager
import br.inf.ufg.mddsm.broker.manager.SignalInstance
import br.inf.ufg.mddsm.broker.model.UsesEventListener
import br.inf.ufg.mddsm.broker.resource.ResourceManager
import broker.managers.IMHB_Top
import broker.managers.MHB_TopManager
import broker.util.Terminal
import broker.util.Util
import groovy.util.logging.Log4j2
import types.ChargeEnum
import types.ControlEnum
import types.CriticalEnum
import types.SourceEnum
import types.TypeEnum
import types.UsageEnum

@Log4j2
class TopBroker implements UsesEventListener, IMHB_Top {
	public static final InputConverter[] CLI_INPUT_CONVERTERS = [
		TypeEnum.getCliConverter(),
		ControlEnum.getCliConverter(),
		ChargeEnum.getCliConverter(),
		CriticalEnum.getCliConverter(),
		SourceEnum.getCliConverter(),
		UsageEnum.getCliConverter(),
		
		new InputConverter() {
			public Object convertInput(String original, Class toClass)
					throws Exception {
				Map map = null
				if (toClass.equals(Map.class)) 
				{
					String[] strArr = original.split(",");
					map = [:]
					
					for(String str in strArr)
					{
						String[] tuple = str.split(":")
						String value = tuple[1]
						String key = tuple[0]
						
						if(value.isFloat())
						{
							map[key] = value.toFloat()
						}
						else if(value.isInteger())
						{
							map[key] = value.toInteger()
						}
						else if(ControlEnum.contain(value))
						{
							map[key] = ControlEnum.valueOf(value)
						}
						else if(ChargeEnum.contain(value))
						{
							map[key] = ChargeEnum.valueOf(value)
						}
						else if(CriticalEnum.contain(value))
						{
							map[key] = CriticalEnum.valueOf(value)
						}
						else if(SourceEnum.contain(value))
						{
							map[key] = SourceEnum.valueOf(value)
						}
						else if(TypeEnum.contain(value))
						{
							map[key] = TypeEnum.valueOf(value)
						}
						else if(UsageEnum.contain(value))
						{
							map[key] = UsageEnum.valueOf(value)
						}
						else 
						{
							map[key] = value
						}
					}
					
				}
				return map
			}
		},
		
	]	
	
	public static long tb = 0
	
	private EventManager eventManager
	private MainManager mainManager
	private ResourceManager resourceManager

	private MHB_TopManager manager
	
	static BlockingQueue queue = new  LinkedBlockingQueue()
	private final Object lock = new Object()
	
	public TopBroker()
	{
	//	init()
		
	}
	
	public static void main(String[] args)
	{
		TopBroker tb = new TopBroker()
		tb.init()
		Terminal t = new Terminal("TopBroker", tb);
		//ShellFactory.createConsoleShell("TopBroker", "TopBroker", tb).
		//		commandLoop()
			
		
		tb.start("mg001")
		tb.addLocalCtrlr("lc001", "lc001", TypeEnum.LOAD, null)
		tb.addDevice("lc001", "ld001", "ld001", TypeEnum.LOAD, null)
		
		tb.requestCtrlrProperty("lc001", "name")
		
		t.showHierarchy();
	}
	
	void init() {
		Manager managerDef = EMFLoader.loadFirst(MGridVM.centralBrkr, Manager)

		eventManager = new EventManager()
		// add listener do middleware
		//eventManager.addUpListener(...) // camada superior

		eventManager.addUpListener(this) // camada superior
		mainManager = new ManagerFactory().createManager(managerDef)
		mainManager.setEventListener(eventManager)
		resourceManager = mainManager.resourceManager
		manager = new MHB_TopManager(mainManager)
		
		
		invoke()
	}

	public void setUpListener(UsesEventListener listener)
	{
		eventManager.addUpListener(listener)
	}
	
	@Override
	public void use(SignalInstance event) {
		//println "upping event ${event.name} from ${event.source}"
		println ">>>TOP:: top ${event}"
		log.info("TOP:: top ${event}")
		
		if(event.name == 'ack')
		{
			synchronized(this)
			{
				notify()
			}
			
		}else log.info(event)
	}
	
	private void processNext()
	{
		if(queue.size() > 0)
		{
			def m = queue.take()
			manager."$m.name"(m.paramList)
//			print "${m.name}: \n"
		}
	}
	
	
	private synchronized void invoke()
	{
		//this."$methodName"(params)
		def c = this;
		def th = Thread.start {
			while(true)
			{
				tb = System.nanoTime()
				processNext()
				//Thread.sleep(1000)
				synchronized (this) {
					c.wait()
				}
				tb = System.nanoTime() - tb;
				println TimeUnit.MILLISECONDS.convert(tb, TimeUnit.NANOSECONDS) + "ms"
				if(queue.size() == 0)
					Thread.sleep(1000)
				//println ">>> FINISH"
			}
		
		}
		
	}
	
	public void enqueueCalls(String methodName, List params)
	{	
		if(queue.size() == 0)
		{	
			synchronized (this) {
				notify()	
			}
		}
		queue.put([name:methodName, paramList: params])
	}
	private static final int countBench = 100
	
	@Command
	public void bench1()
	{
		enqueueCalls('start',["MGC001"])
		for(int i = 1; i <= countBench; ++i)
		{
			enqueueCalls('addLocalCtrlr',['PCC00'+i, "PCC", TypeEnum.PCC,["limitCurrent":2,
				"limitVoltage":220,"limitPower":300]])
			//if(i == 10 || i == 100 || i == 1000)
			if(i > 0 && i % 10 == 0)
			{
				
				Thread.sleep(1000);
			}
		}
		enqueueCalls('start',["MGC001"])
		enqueueCalls('exit',[new Object()])
	}
	
	@Command
	public void bench2()
	{
		enqueueCalls('start',["MGC001"])
		for(int i = 1; i <= countBench; ++i)
		{
			enqueueCalls('addLocalCtrlr',['PCC00'+i, "PCC", TypeEnum.PCC,["limitCurrent":2,
				"limitVoltage":220,"limitPower":300]])
			//if(i == 10 || i == 100 || i == 1000)
			if(i > 0 && i % 10 == 0)
			{
				
				for(int j = 1; j <= i; ++j)
				{
						int r = new Random().nextInt(i)+1
						enqueueCalls('addDevice',["PCC00"+r,"SM00"+j, "SmartMeter00"+j, TypeEnum.SMART_METER,
							["limitVoltage":220,"limitPower":100]])
				}
				Thread.sleep(1000);
			}
		}
		enqueueCalls('start',["MGC001"])
		enqueueCalls('exit',[new Object()])
	}
	@Command
	public void bench3()
	{
		enqueueCalls('start',["MGC001"])
		def list = []
		def listC = []
		for(int i = 1; i <= countBench; ++i)
		{
			listC.push(i)
			enqueueCalls('addLocalCtrlr',['PCC00'+i, "PCC", TypeEnum.PCC,["limitCurrent":2,
				"limitVoltage":220,"limitPower":300]])
			//if(i == 10 || i == 100 || i == 1000)
			if(i > 0 && i % 10 == 0)
			{
				
				for(int j = 1; j <= i; ++j)
				{
						int r = new Random().nextInt(i)+1
						list.push(r)
						enqueueCalls('addDevice',["PCC00"+r,"SM00"+j, "SmartMeter00"+j, TypeEnum.SMART_METER,
							["limitVoltage":220,"limitPower":100]])
				}
				//Thread.sleep(1000);
			}
		}
		enqueueCalls('start',["MGC001"])
		
		while(!listC.empty)
		{
			def l = list.pop()
			def l2 = listC.pop()
			enqueueCalls('remDevice',["PCC00"+l2,"SM00"+l])
			if(l2 % 10 == 0)
				Thread.sleep(1000);
		}		
		
		
		enqueueCalls('exit',[new Object()])
	}
	
	@Command
	public void islandingTest()
	{
		/*enqueueCalls('start',["MGC001"])
		
		enqueueCalls('addLocalCtrlr',["PCC", "PCC", TypeEnum.PCC,
				["current":0, "voltage":0]])
		enqueueCalls('addDevice', ["PCC", "SM001", "smart_meter_001", TypeEnum.SMART_METER, 
				["current":0, "voltage":220] ])*/
		//test()
		
		enqueueCalls('start',["MGC001"])
		
		enqueueCalls('addLocalCtrlr',["PCC001", "PCC", TypeEnum.PCC,["limitCurrent":2,
			"limitVoltage":220,"limitPower":300]])
		enqueueCalls('addLocalCtrlr',["LC001", "LoadCtrlr001", TypeEnum.LOAD,["limitCurrent":2,
			"limitVoltage":220,"limitPower":300]])
		enqueueCalls('addLocalCtrlr',["LC002", "LoadCtrlr002", TypeEnum.LOAD,["limitCurrent":2,
			"limitVoltage":220,"limitPower":300]])
		enqueueCalls('addLocalCtrlr',["SC001", "SourceCtrlr001", TypeEnum.SOURCE,["limitCurrent":2,
			"limitVoltage":220,"limitPower":300]])
		enqueueCalls('addLocalCtrlr',["STC001", "StorageCtrlr001", TypeEnum.STORAGE,["limitCurrent":2,
			"limitVoltage":220,"limitPower":300]])
		
		enqueueCalls('addDevice',["PCC001","SM001", "SmartMeter001", TypeEnum.SMART_METER,
			["limitVoltage":220,"limitPower":100]])
		enqueueCalls('addDevice',["LC001","LD001", "LoadDev001", TypeEnum.LOAD,
			["limitVoltage":220,"limitPower":100, "critical":CriticalEnum.SHEDABLE]])
		enqueueCalls('addDevice',["LC001","LD002", "LoadDev002", TypeEnum.LOAD,
			["limitVoltage":220,"limitPower":100, "critical":CriticalEnum.ANY]])
		enqueueCalls('addDevice',["LC002","LD001", "LoadDev001", TypeEnum.LOAD,
			["limitVoltage":220,"limitPower":100, "critical":CriticalEnum.SENSITIVE]])
		enqueueCalls('addDevice',["SC001","SD001", "SourceDev001", TypeEnum.SOURCE,
			["limitVoltage":220,"limitPower":100, "control":ControlEnum.NON_CONTROLLABLE]])
		enqueueCalls('addDevice',["SC001","SD002", "SourceDev002", TypeEnum.SOURCE,
			["limitVoltage":220,"limitPower":100, "control":ControlEnum.NON_CONTROLLABLE]])
		enqueueCalls('addDevice',["SC001","SD003", "SourceDev003", TypeEnum.SOURCE,
			["limitVoltage":220,"limitPower":100, "control":ControlEnum.CONTROLLABLE]])
		enqueueCalls('addDevice',["STC001","ST001", "StorageDev001", TypeEnum.STORAGE,
			["limitVoltage":220,"limitPower":100]])
		
		enqueueCalls('start',["MGC001"])
		
		
		
//		enqueueCalls('addLocalCtrlr',["STC002", "StorageCtrlr001", TypeEnum.STORAGE,["limitCurrent":2,
//			"limitVoltage":220,"limitPower":300]])
//		enqueueCalls('addDevice',["STC002","ST001", "StorageDev001", TypeEnum.STORAGE,
//			["limitVoltage":220,"limitPower":100]])
		
		
//		enqueueCalls("remLocalCtrlr", ["LC001"])
//		enqueueCalls("remDevice", ["LC002","LD001"])
		
//		enqueueCalls('openDev',["LC001","LD001"])
//		enqueueCalls('openDev',["LC001","LD002"])
//
//		enqueueCalls('openDev',["LC002","LD001"])
//
//		enqueueCalls('openDev',["SC001","SD001"])
//		enqueueCalls('openDev',["SC001","SD002"])
//		enqueueCalls('openDev',["SC001","SD003"])
//
//		enqueueCalls('openDev',["STC001","ST001"])
		
		
//		enqueueCalls('openCtrlr',['LC001'])
//		enqueueCalls('closeCtrlr',['LC001'])
//		enqueueCalls('closeDev',["LC001","LD001"])
//		enqueueCalls('closeDev',["LC001","LD002"])
//		
//		enqueueCalls('openCtrlr',['LC002'])
//		enqueueCalls('closeCtrlr',['LC002'])
//		enqueueCalls('closeDev',["LC002","LD001"])
//		
//		enqueueCalls('openCtrlr',['SC001'])
//		enqueueCalls('closeCtrlr',['SC001'])
//		enqueueCalls('closeDev',["SC001","SD001"])
//		enqueueCalls('closeDev',["SC001","SD002"])
//		enqueueCalls('closeDev',["SC001","SD003"])
//		
//		enqueueCalls('openCtrlr',['STC001'])
//		enqueueCalls('closeCtrlr',['STC001'])
//		enqueueCalls('closeDev',["STC001","ST001"])

//		enqueueCalls('setDevProperty',["LC001", "LD001", "teste", "devTeste"])
//		enqueueCalls('setDevProperty',["LC001", "LD001", "teste", "devTeste2"])
//		enqueueCalls('setDevProperty',["LC001", "LD001", "limitPower", 500f])
//		
//		enqueueCalls('setCtrlrProperty',["LC001", "teste", "ctrlrTeste"])
//		enqueueCalls('setCtrlrProperty',["LC001", "limitPower", 500f])
//		
//		enqueueCalls('requestCtrlrProperty',["LC001", "limitPower"])
//		enqueueCalls('requestCtrlrProperty',["LC001", "teste"])
//
//		enqueueCalls('requestDevProperty',["LC001", "LD001", "limitPower"])
//		enqueueCalls('requestDevProperty',["LC001", "LD001", "teste"])

//		setCtrlrProperty("LC001", "teste", "ctrlrTeste")
		
		
//		enqueueCalls('exit',[new Object()])
	}
	
	public void exit(def o)
	{
		System.exit(0);
	}
	
	@Command(description="Start the M@RT and/or the simulated devices")
	public Object start(
		@Param(name="mgridId")
		String mgridID)
	{
		Util.mhb_log("Start", null)
		enqueueCalls('start',[mgridID])
		
//		manager.start(mgridID)
		
	}
	
	@Command
	public Object addLocalCtrlr(
		@Param(name="ctrlrId")
		String id, 
		@Param(name="name")
		String name, 
		@Param(name="type", description="must be in CAPITAL. the values can be: LOAD, SOURCE, STORAGE, SMART_METER and PCC ")
		TypeEnum type,
		@Param(name="properties", description="a list of atributes:values separated by comma (,) ex: att1:val1,att2:val2,att3:val3 ...")
		Map properties)
	{
		Util.mhb_log("AddLocalCtrlr", null)
		enqueueCalls("addLocalCtrlr", [id,name,type,properties])
//		manager.addLocalCtrlr(id, name, type, properties)
	}

	@Override
	@Command
	public Object addDevice(
		@Param(name="ctrlrId")
		String lc, 
		@Param(name="devId")
		String id, 
		@Param(name="name")
		String name, 
		@Param(name="type", description="must be in CAPITAL. the values can be: LOAD, SOURCE, STORAGE, SMART_METER and PCC ")
		TypeEnum type,
		@Param(name="properties", description="a list of atributes and values ex: att1:val1,att2:val2...")
		Map properties) 
	{
		Util.mhb_log("AddDevice", null)
		enqueueCalls("addDevice", [lc, id, name,type,properties])
//		manager.addDevice(lc, id, name, type, properties)
	}

	@Override
	@Command
	public Object requestDevProperty(
		@Param(name="ctrlrId")
		String lc, 
		@Param(name="devId")
		String devId, 
		@Param(name="attribute")
		String attribute) {
		Util.mhb_log("RequestDevProperty", null)
		enqueueCalls("requestDevProperty", [lc,devId,attribute])
//		manager.requestDevProperty(lc, devId, attribute)
	}

	@Override
	@Command
	public Object requestCtrlrProperty(
		@Param(name="ctrlrId")
		String ctrlrId, 
		@Param(name="attribute")
		String attribute) {
		Util.mhb_log("RequestCtrlrProperty", null)
		enqueueCalls("requestCtrlrProperty",[ctrlrId, attribute])
//		manager.requestCtrlrProperty(ctrlrId, attribute)
	}

	@Override
	@Command
	public Object remDevice(
		@Param(name="ctrlrId")
		String ctrlrId, 
		@Param(name="devId")
		String devId) {
		Util.mhb_log("RemDevice", null)
		enqueueCalls("remDevice", [ctrlrId, devId])
//		manager.remDevice(ctrlrId, devId)
		
	}

	@Override
	@Command
	public Object remLocalCtrlr(
		@Param(name="ctrlrId")
		String ctrlrId) {
		Util.mhb_log("RemLocalCtrlr", null)
		enqueueCalls("remLocalCtrlr",[ctrlrId])
//		manager.remLocalCtrlr(ctrlrId)
	}

	@Override
	@Command
	public Object setDevProperty(
		@Param(name="ctrlrId")
		String lc,
		@Param(name="devId")
		String devId,
		@Param(name="attribute")
		String attribute,
		@Param(name="value")
			Object value) {
			
		Util.mhb_log("SetDevProperty", null)
		enqueueCalls("setDevProperty", [lc,devId,attribute])
//		manager.setDevProperty(lc, devId, attribute, value)
	}

	@Override
	@Command
	public Object setCtrlrProperty(
		@Param(name="ctrlrId")
		String ctrlrId,
		@Param(name="attribute")
		String attribute,
		@Param(name="value")
		Object value) {
		Util.mhb_log("SetCtrlrProperty", null)
		enqueueCalls("setCtrlrProperty", [ctrlrId,attribute,value])
//		manager.setCtrlrProperty(ctrlrId, attribute, value)
	}

	@Override
	@Command
	public Object openCtrlr(
		@Param(name="ctrlrId")
		String ctrlrId) {
		Util.mhb_log("OpenCtrlr", null)
		enqueueCalls("openCtrlr",[ctrlrId])
//		manager.openCtrlr(ctrlrId)
	}

	@Override
	@Command
	public Object closeCtrlr(
		@Param(name="ctrlrId")
		String ctrlrId) {
		Util.mhb_log("CloseCtrlr", null)
		enqueueCalls("closeCtrlr",[ctrlrId])
//		manager.closeCtrlr(ctrlrId)
	}

	@Override
	@Command
	public Object openDev(
		@Param(name="ctrlrId")
		String ctrlrId,
		@Param(name="devId")
		String devId) {
		Util.mhb_log("OpenDev", null)
		enqueueCalls("openDev",[ctrlrId,devId])
//		manager.openDev(ctrlrId, devId)
	}

	@Override
	@Command
	public Object closeDev(
		@Param(name="ctrlrId")
		String ctrlrId,
		@Param(name="devId")
		String devId) {
		Util.mhb_log("CloseDev", null)
//		manager.closeDev(ctrlrId, devId)
		enqueueCalls("closeDev",[ctrlrId,devId])
	}
	
//	@Command
//	public Object fault(
//		@Param(name="ctrlrId")
//		String ctrlrId, 
//		@Param(name="devId")
//		String devId, 
//		@Param(name="eventName")
//		String eventName, 
//		@Param(name="ctrlrFault")
//		boolean ctrlrFault)
//	{
//		
////		MGPlant.fault(ctrlrId, devId, eventName, ctrlrFault)
//	}

	public String stateToString()
	{
		return manager.stateToString()
	}
}
