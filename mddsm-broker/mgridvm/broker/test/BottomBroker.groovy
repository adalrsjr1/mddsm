package broker.test

import java.util.Map;
import java.util.concurrent.TimeUnit;

import types.*;

import groovy.util.logging.Log4j2
import asg.cliche.Command;
import asg.cliche.InputConverter;
import asg.cliche.ShellFactory;
import base.Manager
import broker.managers.IMHB_Bottom;
import broker.managers.MHB_BottomManager
import broker.util.Terminal;
import br.inf.ufg.mddsm.broker.emf.EMFLoader
import br.inf.ufg.mddsm.broker.emf.ManagerFactory
import br.inf.ufg.mddsm.broker.handlers.EventManager
import br.inf.ufg.mddsm.broker.manager.MainManager
import br.inf.ufg.mddsm.broker.manager.SignalInstance
import br.inf.ufg.mddsm.broker.model.UsesEventListener
import br.inf.ufg.mddsm.broker.resource.ResourceManager
@Log4j2
class BottomBroker implements UsesEventListener, IMHB_Bottom
{
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

	private EventManager eventManager
	private MainManager mainManager
	private ResourceManager resourceManager
	
	private MHB_BottomManager bottomManager;
	
	private static final int t = 250

	public BottomBroker()
	{
	}

	void init() {
		Manager managerDef = EMFLoader.loadFirst(MGridVM.localBrkr, Manager)

		eventManager = new EventManager()

		// add listener do middleware
		//eventManager.addUpListener(...) // camada superior

		eventManager.addUpListener(this)
		mainManager = new ManagerFactory().createManager(managerDef)
		mainManager.setEventListener(eventManager)
		resourceManager = mainManager.resourceManager
		mainManager.start()
		bottomManager = new MHB_BottomManager(mainManager);
	}

	public void setUpListener(UsesEventListener listener)
	{
		eventManager.addUpListener(listener)
	}

	public getMainManager()
	{
		mainManager
	}

	@Override @Command
	public void use(SignalInstance event) {
		//execute(event)
		println ">>> " + event
		log.info("BOTTOM:: ${event}")
		//println "BOTTOM:: ${event}"
	}

	public Object execute(SignalInstance signal)
	{
		long t = TopBroker.tb;
		long t2 = System.nanoTime()
		long tt = t2 - t


		mainManager.execute(signal)
		long tt2 = System.nanoTime()
		println "\tlocal: " + TimeUnit.MILLISECONDS.convert(tt2-t2, TimeUnit.NANOSECONDS) + "ms"
		println "\tcentral: " + TimeUnit.MILLISECONDS.convert(tt, TimeUnit.NANOSECONDS) + "ms"
	}

	public void enqueue(SignalInstance signal)
	{
		mainManager.enqueue(signal)
	}

	@Override @Command
	public Object startCtrlr(String id, String ctrlrName, TypeEnum type,
			Map properties) {
		return bottomManager.startCtrlr(id, ctrlrName, type, properties);
	}

	@Override @Command
	public Object startDevice(String id, String devName, TypeEnum type,
			Map properties, String lc) {
		return bottomManager.startDevice(id, devName, type, properties, lc)
	}

	@Override @Command
	public Object requestProperty(String devId, String attribute, String lc) {
		return bottomManager.requestProperty(devId, attribute, lc)
	}

	@Override @Command
	public Object stopDevice(String devId, String ctrlrId) {
		return bottomManager.stopDevice(devId, ctrlrId)
	}

	@Override @Command
	public Object stopCtrlr(String ctrlrId) {
		return bottomManager.stopCtrlr(ctrlrId)
	}

	@Override @Command
	public Object setProperty(String devId, String lc, String attribute,
			Object value) {
		return bottomManager.setProperty(devId, lc, attribute, value)
	}

	@Override @Command
	public Object setCtrlrProperty(String ctrlrId, String attribute,
			Object value) {
		return bottomManager.setCtrlrProperty(ctrlrId, attribute, value)
	}

	@Override @Command
	public Object open(String ctrlrId) {
		return bottomManager.open(ctrlrId)
	}

	@Override @Command
	public Object close(String ctrlrId) {
		return bottomManager.close(ctrlrId)
	}

	@Override @Command
	public Object openDevice(String ctrlrId, String devId) {
		return bottomManager.openDevice(ctrlrId, devId)
	}

	@Override @Command
	public Object closeDevice(String ctrlrId, String devId) {
		return bottomManager.closeDevice(ctrlrId, devId)
	}
	
	public String stateToString()
	{
		return bottomManager.stateToString();
	}
	
	public static void main(String[] args)
	{
		BottomBroker bb = new BottomBroker()
		bb.init()
		Terminal t = new Terminal("BottomBroker", bb);
		//ShellFactory.createConsoleShell("BottomBroker", "BottomBroker", bb).
		//		commandLoop()
			
		bb.startCtrlr("lc001", "lc001", TypeEnum.LOAD, ["limitPower":100,"limitVoltage":220,"limitCurrent":10])
		bb.startDevice("ld001", "ld001", TypeEnum.LOAD, ["limitPower":100,"limitVoltage":220,"limitCurrent":10], "lc001")
		bb.startDevice("ld002", "ld002", TypeEnum.LOAD, ["limitPower":100,"limitVoltage":220,"limitCurrent":10], "lc001")
		
		bb.setCtrlrProperty("lc001", "teste", "meuTeste")
		bb.requestProperty("ld001", "name", "lc001")
		t.showHierarchy();
		
	}
}
