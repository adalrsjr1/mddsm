package broker.top.actions

import java.util.Map

import broker.top.adapters.ILocalControllerAdapter
import broker.top.adapters.LocalControllerAdapter
import broker.util.Util;

import br.inf.ufg.mddsm.broker.adapters.Event
import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.SignalInstance
import br.inf.ufg.mddsm.broker.manager.actions.MacroActionInstance;
import br.inf.ufg.mddsm.broker.state.StateHolder

class SetDevProperty implements MacroActionInstance {

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		
		String id = params["devId"]
		String mgcc = params["mgcc"]
		String lc = params["lc"]
		String attr = params["attribute"]
		String value = params["value"]
		
		StateHolder state = ctx.stateManager.getType("top").get(mgcc)
					
		ILocalControllerAdapter lca = state.getAsSet("ctrlrs").find
		{
			it -> lc == it.id
		}
		
		Util.top_mhb_log("SetDevProperty", params, state)
		lca.execute(new SignalInstance("setProperty", params))
		lca.notify(new Event('ack'))
	}

}
