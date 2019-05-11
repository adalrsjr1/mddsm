package broker.bottom.actions

import java.util.Map

import broker.bottom.adapters.DeviceAdapter
import broker.bottom.adapters.IDeviceAdapter
import broker.util.Util;

import br.inf.ufg.mddsm.broker.adapters.Event
import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.actions.MacroActionInstance;
import br.inf.ufg.mddsm.broker.state.StateHolder

class RequestProperty implements MacroActionInstance {

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		String id = params["devId"]
		String attribute = params["attribute"]
		String lc = params["lc"]
		
		StateHolder state = ctx.getStateManager().getType("bottom").get(lc)
				
		IDeviceAdapter dev = state.getAsSet("devs").find {
			it -> id == ((DeviceAdapter)it).id
		}
		
		def value = dev.get(attribute);
		
		params["value"] = value
		
		
		dev.notify(new Event("devProperty", params))
		
		Util.bottom_mhb_log("RequestProperty", params, state)
		return value;
	}

}
