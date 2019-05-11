package broker.bottom.actions

import java.util.Map

import broker.bottom.adapters.DeviceAdapter;
import broker.bottom.adapters.IDeviceAdapter
import broker.util.Util;

import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.SignalInstance
import br.inf.ufg.mddsm.broker.manager.actions.MacroActionInstance;
import br.inf.ufg.mddsm.broker.state.StateHolder

class StopCtrlr implements MacroActionInstance {

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		String id = params["ctrlrId"]
		
		ctx.getStateManager().getType("bottom").create(id)
		StateHolder state = ctx.getStateManager().getType("bottom").get(id)
		
		Set devs = state.getAsSet("devs")
		
		devs.each {
			IDeviceAdapter d-> d.resource.execute(new SignalInstance("stop", ["ctrlrId": id, "devId": d.id]))
		}
		devs.clear()
		
		Util.bottom_mhb_log "StopCtrlr", params, state
		
		return true
	}

}
