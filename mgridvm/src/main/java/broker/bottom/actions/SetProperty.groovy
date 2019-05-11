package broker.bottom.actions

import java.util.Map

import broker.bottom.adapters.DeviceAdapter
import broker.bottom.adapters.IDeviceAdapter
import broker.util.Util;

import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.SignalInstance
import br.inf.ufg.mddsm.broker.manager.actions.MacroActionInstance;
import br.inf.ufg.mddsm.broker.policy.metadata.Attribute
import br.inf.ufg.mddsm.broker.policy.metadata.Feature
import br.inf.ufg.mddsm.broker.state.StateHolder

class SetProperty implements MacroActionInstance {

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		String id = params["devId"]
		String attribute = params["attribute"]
		String lc = params["lc"]
		Object value = params["value"]
		
		StateHolder state = ctx.getStateManager().getType("bottom").get(lc)
		IDeviceAdapter dev = state.getAsSet("devs").find {
			it -> id == ((IDeviceAdapter)it).id
		}
		dev.resource.execute(new SignalInstance("setDevProperty", params))
		if(dev.set(attribute,value))
		{		
			Util.bottom_mhb_log "SetProperty", params, state
			return true
		}
		return false;
	}

}
