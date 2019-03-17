package broker.bottom.actions

import broker.util.Util;
import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.actions.MacroActionInstance;
import br.inf.ufg.mddsm.broker.state.StateHolder

class Close implements MacroActionInstance {

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		String id = params["ctrlrId"]
		
		ctx.getStateManager().getType("bottom").create(id)
		StateHolder state = ctx.getStateManager().getType("bottom").get(id)
		state.set("open", false)
		
//		Set devs = state.getAsSet("devs")
//		devs.each {
//			DeviceAdapter d-> d.resource.execute(new SignalInstance("stop", ["ctrlrId": id, "devId": d.id]))
//		}
		
		Util.bottom_mhb_log "Close", params, state
		
		return true
	}

}
