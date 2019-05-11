package broker.bottom.actions

import java.util.Map

import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.actions.MacroActionInstance;

class Teste implements MacroActionInstance {

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		println " >>> teste ::: ${params}"
		return null;
	}

}
