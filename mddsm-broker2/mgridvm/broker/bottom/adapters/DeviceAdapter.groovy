package broker.bottom.adapters

import groovy.util.logging.Log4j2
import types.TypeEnum
import broker.physical.Device
import broker.physical.MGPlant
import broker.test.MGridVM;
import br.inf.ufg.mddsm.broker.adapters.Call
import br.inf.ufg.mddsm.broker.adapters.Event
import br.inf.ufg.mddsm.broker.adapters.EventNotifier
import br.inf.ufg.mddsm.broker.adapters.Manageable
import br.inf.ufg.mddsm.broker.resource.bridge.ManagedResource

@Log4j2
class DeviceAdapter implements IDeviceAdapter, Manageable, Observer {
	private EventNotifier eventNotifier;

	public String id;
	public String name;
	public TypeEnum type;
	public Map properties;
	public boolean open = false;
	
	public ManagedResource resource;

	public DeviceAdapter()
	{
		properties = [:]
	}

	public String toString()
	{
		
		"(id: ${id} name: ${name} type: ${type} open: ${open} properties: ${properties})"
	}

	
	
	public void update(Observable arg0, Object arg1) {
		// notify
		
		Map args = arg1 as Map
		if(args.containsKey("event"))
		{
			if(args["event"] == "updateDev" && !MGridVM.bench)
			{
				notify(new Event("updateDev", args))
			}
			else
			{
				notify(new Event("devFailed", args))
			}
//			if(args["event"] == "devFailed")
//			{
//				
//				
//				args['status'] = 'upping'
//				notify(new Event("devFailed", args))
//			}
//			else 
		}
		
		log.debug("Dev[${id}] = [${arg0}:${arg1}]")
	}
	
	
	public void setEventNotifier(EventNotifier eventNotifier) {
		this.eventNotifier = eventNotifier
	}
	
	public void notify(Event e)
	{
		eventNotifier.notify(e)
	}
	
	@Call(name="start", parameters=["lc", "id", "devName", "type", "properties"])
	public Device start(String lc, String id, String name, TypeEnum type, Map properties)
	{
	}
	
	@Call(name="stop", parameters=["ctrlrId", "devId"])
	public boolean stop(String lc, String id)
	{
	}
	
	
	@Call(name="openDev", parameters=["ctrlrId", "devId"])
	public boolean openDev(String ctrlrId, String devId) {
	}

	
	@Call(name="closeDev", parameters=["ctrlrId", "devId"])
	public boolean closeDev(String ctrlrId, String devId) {
	}

	@Call(name="setDevProperty", parameters=["lc","devId","attribute","value"])
	public boolean setDevProperty(String lc, String devId, String attribute, Object value)
	{
	}
	
	public Object get(String attribute)
	{
		try
		{
			if(attribute == "name")
				return name
			else if(type == "type")
				return type
			else if(id == "id")
				return type
			else {
				if(properties.containsKey(attribute))
					return properties[attribute]
			}
		} catch (Exception e)
		{
			e.printStackTrace()
			return null
		}
		return null
	}

	public boolean set(String attribute, Object value)
	{
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
		} catch (Exception e)
		{
			e.printStackTrace()
			return false
		}
		return true
	}

}
