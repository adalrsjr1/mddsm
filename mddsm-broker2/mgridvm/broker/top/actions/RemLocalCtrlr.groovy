package broker.top.actions

import java.util.Map;

import broker.top.adapters.ILocalControllerAdapter
import broker.top.adapters.LocalControllerAdapter
import broker.util.Util;

import br.inf.ufg.mddsm.broker.adapters.Event
import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.SignalInstance
import br.inf.ufg.mddsm.broker.manager.actions.MacroActionInstance;
import br.inf.ufg.mddsm.broker.resource.Resource
import br.inf.ufg.mddsm.broker.state.StateHolder

class RemLocalCtrlr implements MacroActionInstance {

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		String mgcc = params["mgcc"]
		String id = params["ctrlrId"]
		
		if(id == "LC002")
		{
			int a = 0
		}
		
		StateHolder state = ctx.stateManager.getType("top").get(mgcc)
		ILocalControllerAdapter ctrlr = state.get("ctrlrs").find {
				LocalControllerAdapter l ->
				l.id == id
			}
		
		ctrlr.execute(new SignalInstance("stopCtrlr", params))
		ctrlr.resource.execute(new SignalInstance("stopCtrlr", params))
		
		state.get("ctrlrs").remove(ctrlr)
		Util.top_mhb_log "RemLocalCtrlr", params, state
		ctrlr.notify(new Event('ack'))
//		String mgcc = params["mgcc"]
//		String id = params["ctrlrId"]
//		
//		StateHolder state = ctx.stateManager.getType("top").get(mgcc)
//		
//		LocalControllerAdapter lca = state.getAsSet("ctrlrs").find
//		{
//			it -> id == it.id
//		}
//
//		Map nParams = ["id": id]
//		Util.top_mhb_log "RemLocalCtrlr", params, state
//		if(lca.execute(new SignalInstance("stopCtrlr", params)))
//		{
//			if(lca.stopCtrlr(id))
//			{
//				state.getAsSet("ctrlrs").remove(lca)
//				//lca.notify(new Event('ack'))
//				return true
//			}
//			
//		}
//		
//		
//		return false
	}

}
