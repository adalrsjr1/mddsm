package broker.top.actions

import java.util.Map

import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.actions.MacroActionInstance;
import br.inf.ufg.mddsm.broker.state.StateHolder

class TestTop implements MacroActionInstance {

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		println "Teste Top ::: ${params}"
		
		StateHolder state = ctx.stateManager.getType("top").get(params['mgcc'])
		if(state.get("islanding"))
		{
			return
		}
		state.set("islanding", true)
		println state.properties
		return new Object();
	}

}
