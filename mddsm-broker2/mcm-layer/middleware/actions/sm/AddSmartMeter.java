package middleware.actions.sm;

import java.util.Map;
import java.util.Set;

import types.TypeEnum;
import broker.managers.MHB_TopManager;


import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.SignalInstance;
import br.inf.ufg.mddsm.broker.manager.actions.MacroActionInstance;
import br.inf.ufg.mddsm.broker.state.StateHolder;
import br.inf.ufg.mddsm.broker.state.StateTypeManager;


public class AddSmartMeter implements MacroActionInstance {
	//Parei aqui

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		StateTypeManager stateTManager = ctx.getStateManager().getType("DeviceType");
		StateHolder state;
		Object devID = params.get("aMeterID");
		
		if(!stateTManager.exists(devID)){
			state = stateTManager.create(devID);
		}else{
			state = stateTManager.get(devID);
		}
		
		state.set("deviceTypeID", params.get("aMeterType"));
		//Set types = state.getAsSet("typeID");
		//types.add(params.get("aTypeID"));
		
		state = ctx.getStateManager().getType("TypeController").get(params.get("aMeterType"));
		Object ctrlID = state.get("controllerID");
		
		
		Object id = "SMS01";
		state = ctx.getStateManager().getType("ScriptManagerState").get(id);
		MHB_TopManager brokerManager = (MHB_TopManager)state.get("broker");
		brokerManager.addDevice((String)ctrlID, (String)devID, (String)params.get("aName"), TypeEnum.SMART_METER, params);
		ctx.getMainManager().sendEvent(new SignalInstance("ack"));
		return null;
	}

}
