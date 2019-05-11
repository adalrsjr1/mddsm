package middleware.actions.mm;

import java.util.Map;
import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.SignalInstance;
import br.inf.ufg.mddsm.broker.manager.actions.MacroActionInstance;

public class MiddlewareEvent implements MacroActionInstance{

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		return null;
	}

}
