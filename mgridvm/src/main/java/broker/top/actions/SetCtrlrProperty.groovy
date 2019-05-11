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

class SetCtrlrProperty implements MacroActionInstance {

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		String id = params["ctrlrId"]
		String mgcc = params["mgcc"]
		String attr = params["attribute"]
		Object value = params["value"]
		
		StateHolder state = ctx.stateManager.getType("top").get(mgcc)
					
		ILocalControllerAdapter lca = state.getAsSet("ctrlrs").find
		{
			it -> id == it.id
		}
		
		Util.top_mhb_log "SetCtrlrProperty", params, state
		if(lca.set(attr, value))
		{
			lca.execute(new SignalInstance("setCtrlrProperty", params))
			lca.resource.execute(new SignalInstance("setCtrlrProperty", params))
			lca.notify(new Event('ack'))
//			println "\t${lca}"
			true
		}
		true
		//lca.get(attr)
		//def value = lca.execute(new SignalInstance("requestProperty", params))
		
		
		return false;
	}

}
