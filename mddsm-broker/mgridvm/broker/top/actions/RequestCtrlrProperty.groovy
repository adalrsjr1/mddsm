package broker.top.actions

import java.util.Map

import broker.top.adapters.ILocalControllerAdapter
import broker.top.adapters.LocalControllerAdapter
import broker.util.Util;

import br.inf.ufg.mddsm.broker.adapters.Event
import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.actions.MacroActionInstance;
import br.inf.ufg.mddsm.broker.state.StateHolder

class RequestCtrlrProperty implements MacroActionInstance {

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		String id = params["ctrlrId"]
		String mgcc = params["mgcc"]
		String attr = params["attribute"]
		
		StateHolder state = ctx.stateManager.getType("top").get(mgcc)
		Set ctrlrs = state.getAsSet("ctrlrs")
		ILocalControllerAdapter lca = state.getAsSet("ctrlrs").find
		{
			it -> id == it.id
		}
		
		def value = lca.get(attr)
		params["value"] = value
		lca.notify(new Event("ctrlrProperty", params))
		//def value = lca.execute(new SignalInstance("requestProperty", params))
		Util.top_mhb_log "RequestCtrlrProperty", params, state
		lca.notify(new Event('ack'))
		return value;
	}

}
