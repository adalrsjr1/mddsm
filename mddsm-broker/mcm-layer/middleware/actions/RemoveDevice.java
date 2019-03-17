package middleware.actions;

import java.util.Map;
import java.util.Set;

import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.SignalInstance;
import br.inf.ufg.mddsm.broker.manager.actions.MacroActionInstance;
import br.inf.ufg.mddsm.broker.state.StateHolder;

public class RemoveDevice implements MacroActionInstance{

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		//ctx.getStateManager().getType("mainManagerState").create(params.get("session"));
		ctx.getStateManager().getType("mainManagerState").create("agmon");
		StateHolder con = ctx.getStateManager().getType("mainManagerState").get("agmon");
        Set types = con.getAsSet("type");
        types.add("borges");
        if(types.contains("borges") == true){
        	System.out.println("Sim, contém!");
        }
        
		ctx.getMainManager().sendEvent(new SignalInstance("ack"));
		System.out.println("Remove");
		return null;
	}

}
