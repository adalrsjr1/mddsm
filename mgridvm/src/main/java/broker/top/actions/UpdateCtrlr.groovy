package broker.top.actions

import java.util.Map

import broker.top.adapters.ILocalControllerAdapter
import broker.top.adapters.LocalControllerAdapter
import br.inf.ufg.mddsm.broker.adapters.Event
import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.actions.MacroActionInstance;
import br.inf.ufg.mddsm.broker.state.StateHolder

class UpdateCtrlr implements MacroActionInstance {

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		
		String mgcc = params["mgcc"]
		String ctrlrId = params["ctrlrId"]
		float current = params["current"].toFloat()
		float voltage = params["voltage"].toFloat()
		float power = params["power"].toFloat()
		
		StateHolder state = ctx.stateManager.getType("top").get(mgcc)
		
		ILocalControllerAdapter lca = state.getAsSet("ctrlrs").find
		{
			LocalControllerAdapter c -> c.id == ctrlrId
		}
		
		if(lca == null)
		return null
		
		StateHolder ctrlrState = lca.mainManager.getContext().stateManager.getType("bottom").get(ctrlrId)
		
		
		
		ctrlrState.set("current", current)
		ctrlrState.set("voltage", voltage)
		ctrlrState.set("power", power)
				
		
		
		lca.set("current", current)
		lca.set("voltage", voltage)
		lca.set("power", power)
		lca.notify(new Event('ack'))
//		
//		return null;
	}

}
