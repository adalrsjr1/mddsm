package broker.bottom.actions

import java.util.Map

import broker.bottom.adapters.DeviceAdapter
import broker.bottom.adapters.IDeviceAdapter
import broker.util.Util;

import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.SignalInstance
import br.inf.ufg.mddsm.broker.manager.actions.MacroActionInstance;
import br.inf.ufg.mddsm.broker.state.StateHolder

class StopDevice implements MacroActionInstance {

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		String id = params["devId"]
		String lc = params["ctrlrId"]
		
		StateHolder state = ctx.getStateManager().getType("bottom").get(lc)
		Set devs = state.getAsSet("devs")
		IDeviceAdapter dev = state.getAsSet("devs").find {
			it -> id == ((DeviceAdapter)it).id
		}
		
		Util.bottom_mhb_log "StopDevice", params ,state
//		if(dev && dev.resource.execute(new SignalInstance("stop", params)))
//		{
			state.getAsSet("devs").remove(dev)
			
			return true
//		}
		return true
	}

}
