package broker.bottom.actions

import java.util.Map

import broker.util.Util;

import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.SignalInstance
import br.inf.ufg.mddsm.broker.manager.actions.MacroActionInstance;
import br.inf.ufg.mddsm.broker.state.StateHolder;

class StartCtrlr implements MacroActionInstance {

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		String id = params["id"]
		String name = params["ctrlrName"]
		String type = params["type"]
		Map properties = params["properties"]
		ctx.getStateManager().getType("bottom").create(id)
		StateHolder state = ctx.getStateManager().getType("bottom").get(id)
		state.with {
			set("name", name)
			set("type", type)
			set("lc", id)
//			set("limitCurrent", properties["limitCurrent"])
//			set("limitVoltage", properties["limitVoltage"])
//			set("limitPower", properties["limitPower"])
		}		
				
		if(properties != null)
		{
			properties.each {
				state.set(it.key, it.value)
			}
		}
		state.getAsSet("devs")
		Util.bottom_mhb_log "StartCtrlr", params, state
		
	}

}
