package middleware.actions.ce;

import java.util.Map;

import broker.managers.MHB_TopManager;

import middleware.tests.Broker;

import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.SignalInstance;
import br.inf.ufg.mddsm.broker.manager.actions.MacroActionInstance;
import br.inf.ufg.mddsm.broker.state.StateHolder;
import br.inf.ufg.mddsm.broker.state.StateTypeManager;

public class InitializeMGrid implements MacroActionInstance{

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		
		Object id = "CE01";
		StateTypeManager stateManager = ctx.getStateManager().getType("CommandExecutorState");
		StateHolder state;
		Object ctrlID = params.get("controllerID");
		
		if(!stateManager.exists(ctrlID)){
			state = stateManager.create(ctrlID);
			Broker broker = new Broker();
			state.set("broker", broker.getManager());
		}
		
		if(!stateManager.exists(id)){
			state = stateManager.create(id);
			Broker broker = new Broker();
			state.set("broker", broker.getManager());
		}
		
		state = stateManager.get(id);
		MHB_TopManager brokerManager = (MHB_TopManager)state.get("broker");
		brokerManager.start((String)params.get("mgridID"));
		//brokerManager.execute(new SignalInstance("Start", params));
		ctx.getMainManager().sendEvent(new SignalInstance("ack"));
		return null;
	}

}
