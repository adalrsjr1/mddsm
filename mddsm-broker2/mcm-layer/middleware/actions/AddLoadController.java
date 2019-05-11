package middleware.actions;

import java.util.Map;

import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.actions.MacroActionInstance;



public class AddLoadController implements MacroActionInstance {
	
	public AddLoadController(){
		
	}

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		return null;
	}

}
