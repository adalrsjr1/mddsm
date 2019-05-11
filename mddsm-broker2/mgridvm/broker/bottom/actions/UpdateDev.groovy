package broker.bottom.actions

import java.util.Map

import broker.bottom.adapters.DeviceAdapter;
import broker.bottom.adapters.IDeviceAdapter

import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.actions.MacroActionInstance;
import br.inf.ufg.mddsm.broker.state.StateHolder

class UpdateDev implements MacroActionInstance {

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		String ctrlrId = params["ctrlrId"]
		String devId = params["devId"]
		float current = params["current"].toFloat()
		float voltage = params["voltage"].toFloat()
		float power = params["power"].toFloat()
		
		StateHolder state = ctx.getStateManager().getType("bottom").get(ctrlrId)
		
		IDeviceAdapter dev = state.getAsSet("devs").find {
			DeviceAdapter d -> d.id == devId
		} 
		if(dev == null)
			return null
		
		dev.set("current", current)
		dev.set("voltage", voltage)
		dev.set("power", power)
		
		
		return null;
	}

}
