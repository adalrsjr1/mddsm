package middleware.actions.ce;

import java.util.Map;

import types.TypeEnum;
import broker.managers.MHB_TopManager;


import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.SignalInstance;
import br.inf.ufg.mddsm.broker.manager.actions.MacroActionInstance;
import br.inf.ufg.mddsm.broker.state.StateHolder;


public class AddLoadDevice implements MacroActionInstance {
	

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		Object id = "CE01";
		StateHolder state = ctx.getStateManager().getType("CommandExecutorState").get(id);
		MHB_TopManager brokerManager = (MHB_TopManager)state.get("broker");
		brokerManager.addDevice("LC001", (String)params.get("deviceID"), "testName", TypeEnum.LOAD, params);
		ctx.getMainManager().sendEvent(new SignalInstance("ack"));
		return null;
	}

}
