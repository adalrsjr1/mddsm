package broker.top.actions

import java.util.Map

import broker.util.Util;

import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.SignalInstance
import br.inf.ufg.mddsm.broker.manager.actions.MacroActionInstance;
import br.inf.ufg.mddsm.broker.state.StateHolder;

class Start implements MacroActionInstance {

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		String mgccId = params["mgridID"]	
		
		def stateManager = ctx.getStateManager().getType("top")
		if(stateManager.exists(mgccId))
		{
			ctx.mainManager.sendEvent(new SignalInstance("ack"))
			return null
		}
		
		StateHolder state = ctx.getStateManager().getType("top").create(mgccId);
		state.getAsSet("ctrlrs");
		state.set("islanding", false)
		state.set("blackStart",false)
		Util.top_mhb_log("Start", params, state)
		ctx.mainManager.sendEvent(new SignalInstance("ack"))
		return null;
	}

}
