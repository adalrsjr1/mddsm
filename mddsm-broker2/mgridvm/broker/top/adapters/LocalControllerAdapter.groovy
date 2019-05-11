package broker.top.adapters

import br.inf.ufg.mddsm.broker.adapters.Call
import br.inf.ufg.mddsm.broker.adapters.Event
import br.inf.ufg.mddsm.broker.adapters.EventException
import br.inf.ufg.mddsm.broker.adapters.EventNotifier
import br.inf.ufg.mddsm.broker.manager.MainManager
import br.inf.ufg.mddsm.broker.manager.SignalInstance
import br.inf.ufg.mddsm.broker.model.UsesEventListener
import br.inf.ufg.mddsm.broker.resource.bridge.ManagedResource
import broker.physical.Controller
import broker.test.BottomBroker
import groovy.util.logging.Log4j2
import types.TypeEnum

@Log4j2
class LocalControllerAdapter implements ILocalControllerAdapter, 
												UsesEventListener, Observer {

	private EventNotifier eventNotifier;
	private BottomBroker broker;
	private ManagedResource resource;
	// start ctrlr properties
	public String id
	public TypeEnum type
	public String name
	public boolean open = false
	public Map properties = [:]
	// end ctrlr properties

	public LocalControllerAdapter() {
		this(false)
	}

	public LocalControllerAdapter(boolean startBroker)
	{
		super()
		if(!startBroker) return
			broker = new BottomBroker()
		broker.init()
		setBrokerListener(this)
		//broker.setUpListener(this)
		// nao e necessario add um upperListener
		// por que um BottomBroker tb e um recurso to TopBroker
		// e como recurso ele ja possui um listener proprio
	}

	public EventNotifier getEventNotifier()
	{
		return eventNotifier
	}

	public BottomBroker getBroker()
	{
		broker
	}

	public void setResource(ManagedResource res)
	{
		resource = res
	}

	public ManagedResource getResource()
	{
		resource
	}

	
	public void use(SignalInstance event) {

		println "LC:: upping event ${event} from ${event.source}"
		if(event.name == 'devFailed')
		{
			int a = 0
		}

		//
		//		log.info("LC:: upping event ${event.name} from ${event.source}")
		//		if(event.name == 'devFailed')
		//		{
		notify(new Event(event.name, event.params))
		//		}
	}

	public void setBrokerListener(UsesEventListener listener)
	{
		broker.setUpListener(listener)
	}

	
	public void setEventNotifier(EventNotifier eventNotifier) {
		this.eventNotifier = eventNotifier
	}

	public void notify(Event e)
	{
		resource.notify(e)
	}

	public void update(Observable o, Object arg)
	{
		//Event e = new Event(name, params)
		//notify(null)
		//println  "\t ${arg}"
		//notify(new Event("updateCtrlr", arg as Map))
		Map args = arg as Map
		if(args.keySet().contains("event"))
		{
			if(args["event"]=="ctrlrFailed")
			{
				println ("Ctrlr[${id}] = [${o}:${arg}]")
				notify(new Event('ctrlrFailed',args))
			}
		}

		log.debug("Ctrlr[${id}] = [${o}:${arg}]")
	}

	

	public MainManager getMainManager() {
		broker.mainManager
	}

	public Object execute(SignalInstance signal)
	{
		broker.execute(signal)
	}

	public void enqueue(SignalInstance signal)
	{
		broker.enqueue(signal)
	}

	public Object get(String attribute)
	{
		if(attribute == "name")
			return name
		if(attribute == "type")
			return type
		if(attribute == "id")
			return id
		if(properties != null)
			if(properties.containsKey(attribute))
				return properties[attribute]
			else null
		return null;
	}

	public boolean set(String attribute, Object value)
	{
		Map params = ["attribute": attribute, "value": value]
		try
		{
			if(attribute == "name")
				name = value.toString()
			else if(type == "type")
				type = (TypeEnum)value
			else if(id == "id")
				id = value.toString()
			else {
				if(properties == null)
					properties = ["${attribute}":value]
				else

					properties[attribute] = value
			}



			return true
		} catch (Exception e)
		{
			e.printStackTrace()
			return false
		}
		//		}
		return false
	}

	private void throwException(String name, Map params)
	{
		throw new EventException(name, params)
	}

	
	@Call(name="startCtrlr", parameters=["id", "name", "type", "properties"])
	public Controller startCtrlr(String id, String name, TypeEnum type,
			Map<String, Object> properties) {
		
		broker.startCtrlr(id, name, type, properties)
	}

	
	@Call(name="stopCtrlr", parameters=["ctrlrId"])
	public boolean stopCtrlr(String ctrlrId) {
		broker.stopCtrlr(ctrlrId)
	}

	
	@Call(name="openCtrlr", parameters=["ctrlrId"])
	public boolean openCtrlr(String ctrlrId) {
		broker.open(ctrlrId)
	}

	
	@Call(name="closeCtrlr", parameters=["ctrlrId"])
	public boolean closeCtrlr(String ctrlrId) {
		broker.close(ctrlrId)
	}

	@Call(name="setCtrlrProperty", parameters=["ctrlrId", "attribute", "value"])
	public boolean setCtrlrProperty(String ctrlrId, String attribute, Object value)
	{
		broker.setCtrlrProperty(ctrlrId, attribute, value)
	}

	
	@Call(name="startDevice", parameters=["ctrlrId", "name", "type", "properties"])
	public boolean startDevice(String id, String name, TypeEnum type,
			Map<String, Object> properties) {
			broker.startCtrlr(id, name, type, properties)
	}

	
	@Call(name="requestProperty", parameters=["devId", "attribute"])
	public boolean requestProperty(String id, String attribute) {
		broker.requestProperty(id, attribute, this.id)
	}

	
	@Call(name="setProperty", parameters=["devId","attribute","value"])
	public boolean setDevProperty(String id, String attribute, Object value) {
		broker.setProperty(id, this.id, attribute, value)
	}

	
	@Call(name="stopDevice", parameters=["devId"])
	public boolean stopDevice(String id) {
		broker.stopDevice(id, this.id)
	}

	
	@Call(name="openDev", parameters=["ctrlrId","devId"])
	public boolean openDev(String ctrlrId, String devId) {
		broker.openDevice(ctrlrId, devId)
	}
	
	
	@Call(name="closeDev", parameters=["ctrlrId","devId"])
	public boolean closeDev(String ctrlrId, String devId) {
		broker.closeDevice(ctrlrId, devId)
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append('(')
				.append("id: " + id + ", ")
				.append("name: " + name + ", ")
				.append("type: " + type + ",")
				.append("prop: " + properties + ",")
				.append("manager: " + broker.mainManager)
				.append(')')

		sb.toString()
	}



}
