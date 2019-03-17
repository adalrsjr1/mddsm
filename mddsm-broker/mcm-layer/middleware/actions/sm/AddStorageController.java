package middleware.actions.sm;

import java.util.List;
import java.util.Map;
import java.util.Set;

import types.TypeEnum;

import broker.managers.MHB_TopManager;

import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.SignalInstance;
import br.inf.ufg.mddsm.broker.manager.actions.MacroActionInstance;
import br.inf.ufg.mddsm.broker.state.StateHolder;
import br.inf.ufg.mddsm.broker.state.StateTypeManager;



public class AddStorageController implements MacroActionInstance {

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
	
		StateTypeManager stateTManager = ctx.getStateManager().getType("ControllerTypes");
		StateHolder state;
		Object ctrlID = params.get("aControllerID");
		
		if(!stateTManager.exists(ctrlID)){
			state = stateTManager.create(ctrlID);
		}else{
			state = stateTManager.get(ctrlID);
		}
		
		Set types = state.getAsSet("typeID");
		types.add(params.get("aTypeID"));
		
		Object id = "SMS01";
		state = ctx.getStateManager().getType("ScriptManagerState").get(id);
		MHB_TopManager brokerManager = (MHB_TopManager)state.get("broker");
		brokerManager.addLocalCtrlr((String)ctrlID, (String)params.get("aName"), TypeEnum.STORAGE, params);
		ctx.getMainManager().sendEvent(new SignalInstance("ack"));
		return null;
	}

}