package middleware.actions;

import java.util.Map;

import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.SignalInstance;
import br.inf.ufg.mddsm.broker.manager.actions.MacroActionInstance;

public class DispatchScript implements MacroActionInstance{

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		//ctx.getMainManager().sendEvent(new SignalInstance("ack"));
		System.out.println("Dispatch!");
		return null;
	}

}

