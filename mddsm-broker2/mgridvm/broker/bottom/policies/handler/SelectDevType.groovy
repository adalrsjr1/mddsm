package broker.bottom.policies.handler

import java.util.Map;

import types.TypeEnum;

import broker.bottom.adapters.*
import broker.util.Util;

import br.inf.ufg.mddsm.broker.adapters.EventException
import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.policy.PolicyEvaluationHandler;
import br.inf.ufg.mddsm.broker.policy.PolicyRequest;
import br.inf.ufg.mddsm.broker.resource.Resource;
import br.inf.ufg.mddsm.broker.state.StateHolder

class SelectDevType implements PolicyEvaluationHandler {
	
	private static final Map devices = [(TypeEnum.LOAD):LoadDeviceAdapter.class,
		(TypeEnum.SOURCE):SourceDeviceAdapter.class, 
		(TypeEnum.STORAGE):StorageDeviceAdapter.class,
		(TypeEnum.SMART_METER):SmartMeterDeviceAdapter.class, 
		(TypeEnum.LEGACY_METER):LegacyMeterDeviceAdapter.class]
	
	@Override
	public void handleResource(PolicyRequest request, ManagerContext ctx,
			Resource selected) {
			String lc = request.params["lc"]
			String id = request.params["id"]
			TypeEnum type = request.params["type"]
			TypeEnum ctrlrType = request.params["ctrlrType"]
				
			
			
			if(type == TypeEnum.SMART_METER || type == TypeEnum.LEGACY_METER)
				if(ctrlrType != TypeEnum.PCC)
					throw new EventException(null, null)
			/*if(ctrlrType != type)
			{
				if(!((type == TypeEnum.SMART_METER || type == TypeEnum.LEGACY_METER) 
					&& ctrlrType == TypeEnum.PCC))
				{
					throw new EventException(null, null)
				}else if(ctrlrType != TypeEnum.PCC)
					throw new EventException(null, null)
			}*/
					
			StateHolder state = ctx.stateManager.getType("bottom").get(lc)
			
			IDeviceAdapter adapter = devices[type].newInstance()
			
			
			if(adapter instanceof DeviceAdapter)
			{
				adapter.id = id
				adapter.type = type
				adapter.resource = selected
			}
			adapter.setEventNotifier(selected)
			state.getAsSet("devs").add(adapter)
			
			println adapter
			
			Util.policy_handler_log_bottom("resource:dev ${selected} selected")
			
			
	}

}
