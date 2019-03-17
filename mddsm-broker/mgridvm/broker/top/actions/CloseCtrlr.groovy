package broker.top.actions

import java.util.Map

import broker.top.adapters.ILocalControllerAdapter
import broker.top.adapters.LocalControllerAdapter
import broker.util.Util;
import br.inf.ufg.mddsm.broker.adapters.Event
import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.SignalInstance
import br.inf.ufg.mddsm.broker.manager.actions.MacroActionInstance;
import br.inf.ufg.mddsm.broker.resource.Resource
import br.inf.ufg.mddsm.broker.state.StateHolder

class CloseCtrlr implements MacroActionInstance {

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		String mgcc = params["mgcc"]
		String id = params["ctrlrId"]
		
		StateHolder state = ctx.stateManager.getType("top").get(mgcc)
		ILocalControllerAdapter ctrlr = state.get("ctrlrs").find {
				LocalControllerAdapter l ->
				l.id == id
			}
		
		ctrlr.resource.execute(new SignalInstance("closeCtrlr", params))
		ctrlr.execute(new SignalInstance("close", params))
		
		Util.top_mhb_log "closeCtrlr", params, state
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
//		
//		Util.top_mhb_log "CloseCtrlr", params, state
//		if(lca.execute(new SignalInstance("close", params)))
//		{
//			if(lca.closeCtrlr(id))
//			{
//				
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
