package broker.bottom.actions

import java.util.Map

import broker.bottom.adapters.DeviceAdapter
import broker.util.Util;

import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.SignalInstance
import br.inf.ufg.mddsm.broker.manager.actions.MacroActionInstance;
import br.inf.ufg.mddsm.broker.state.StateHolder

class Open implements MacroActionInstance {

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		String id = params["ctrlrId"]
		
		ctx.getStateManager().getType("bottom").create(id)
		StateHolder state = ctx.getStateManager().getType("bottom").get(id)
		state.set("open", true)
		Set devs = state.getAsSet("devs")
		devs.each {
			
			DeviceAdapter d -> d.open = true
			params["devId"] = d.id
			//d.resource.execute(new SignalInstance("openDev", params))
			Util.bottom_mhb_log "Open", params, state
		}
		
		
		
		return true
	}

}
