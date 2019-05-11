package broker.bottom.actions

import java.util.Map

import types.TypeEnum;


import broker.bottom.adapters.DeviceAdapter
import broker.bottom.adapters.IDeviceAdapter
import broker.physical.Device;
import broker.util.Util;

import br.inf.ufg.mddsm.broker.adapters.EventException
import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.SignalInstance
import br.inf.ufg.mddsm.broker.manager.actions.MacroActionInstance;
import br.inf.ufg.mddsm.broker.resource.bridge.ManagedResource
import br.inf.ufg.mddsm.broker.state.StateHolder;

class StartDevice implements MacroActionInstance {

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		String id = params["id"]
		String name = params["devName"]
		TypeEnum type = params["type"]
		Map properties = params["properties"]
		String lc = params["lc"]
		
		StateHolder state = ctx.getStateManager().getType("bottom").get(lc)
		
		IDeviceAdapter dev = state.getAsSet("devs").find {
			it -> id == ((DeviceAdapter)it).id
		}
		
		Device d = dev.resource.execute(new SignalInstance("start", params))
		if(d)
		{
			d.addObserver(dev)
			dev.name = name
			dev.properties = properties
			Util.bottom_mhb_log "StartDevice", params, state
			
			return true
		} 
//		else
//		{
//			Util.bottom_mhb_log "ERROR:: ${dev} removing ${dev}"
//			state.getAsSet("devs").remove(dev)
//			throw new EventException("StartDeviceException")
//			return true
//		}
		return true
	}

}
