package broker.bottom.actions

import java.util.Map

import broker.bottom.adapters.DeviceAdapter
import broker.bottom.adapters.IDeviceAdapter
import broker.util.Util;
import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.SignalInstance
import br.inf.ufg.mddsm.broker.manager.actions.MacroActionInstance;
import br.inf.ufg.mddsm.broker.state.StateHolder

class OpenDevice implements MacroActionInstance {

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		String id = params["devId"]
		String lc = params["ctrlrId"]
		
		StateHolder state = ctx.getStateManager().getType("bottom").get(lc)
		
		IDeviceAdapter dev = state.getAsSet("devs").find {
			it -> id == ((DeviceAdapter)it).id
		}
		dev.open = true
		
		Util.bottom_mhb_log "OpenDevice", params ,state
		if(dev.resource.execute(new SignalInstance("openDev", params)))
		{
			return true
		}
		return false
	}

}
