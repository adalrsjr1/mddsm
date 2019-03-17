package broker.bottom.actions

import java.util.Map

import broker.bottom.adapters.DeviceAdapter
import broker.util.Util;

import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.actions.MacroActionInstance;
import br.inf.ufg.mddsm.broker.state.StateHolder

class SetCtrlrProperty implements MacroActionInstance {

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		String id = params["ctrlrId"]
		String attr = params["attribute"]
		String value = params["value"]
		
		StateHolder state = ctx.getStateManager().getType("bottom").get(id)
		
		state.set(attr, value);
		
		Util.bottom_mhb_log("SetCtrlrProperty",params, state)
		return true;
	}

}
