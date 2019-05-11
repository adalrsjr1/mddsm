package middleware.actions;


import java.util.Map;


import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.actions.MacroActionInstance;


public class AddGroupController implements MacroActionInstance {

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		System.out.println("New group!");
		return null;
	}

}
