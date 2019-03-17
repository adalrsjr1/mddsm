package middleware.actions.ce;
import java.util.Hashtable;
import java.util.Map;

import types.TypeEnum;
import broker.managers.MHB_TopManager;

import middleware.util.BuildCmdHashTable;

import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.SignalInstance;
import br.inf.ufg.mddsm.broker.manager.actions.MacroActionInstance;
import br.inf.ufg.mddsm.broker.state.StateHolder;

// Without broker access
public class AddLoadDeviceType implements MacroActionInstance {
	private Hashtable<String,Object> properties = new Hashtable<String,Object>();
	
	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		Object id = "CE01";
		StateHolder state = ctx.getStateManager().getType("CommandExecutorState").get(id);
		//MHB_TopManager brokerManager = (MHB_TopManager)state.get("broker");
		ctx.getMainManager().sendEvent(new SignalInstance("ack"));
		return null;
	}

}
