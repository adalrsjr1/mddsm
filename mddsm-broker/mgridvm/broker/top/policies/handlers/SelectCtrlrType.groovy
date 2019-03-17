package broker.top.policies.handlers

import types.TypeEnum;
import broker.top.adapters.ILocalControllerAdapter
import broker.top.adapters.LoadControllerAdapter;
import broker.top.adapters.LocalControllerAdapter;
import broker.top.adapters.SourceControllerAdapter;
import broker.top.adapters.StorageControllerAdapter;
import broker.top.adapters.PCC_ControllerAdapter;
import broker.util.Util;
import br.inf.ufg.mddsm.broker.emf.BrokerManagerResourceFactory;
import br.inf.ufg.mddsm.broker.manager.MainManager;
import br.inf.ufg.mddsm.broker.manager.ManagerContext
import br.inf.ufg.mddsm.broker.policy.PolicyEvaluationHandler;
import br.inf.ufg.mddsm.broker.policy.PolicyRequest;
import br.inf.ufg.mddsm.broker.resource.Resource;
import br.inf.ufg.mddsm.broker.resource.bridge.BrokerManagedResource;
import br.inf.ufg.mddsm.broker.state.StateHolder;

class SelectCtrlrType implements PolicyEvaluationHandler {
	private static final Map controllers = [(TypeEnum.LOAD): LoadControllerAdapter.class,
		(TypeEnum.SOURCE): SourceControllerAdapter.class,
		(TypeEnum.STORAGE): StorageControllerAdapter.class,
		(TypeEnum.PCC): PCC_ControllerAdapter.class
	]

	@Override
	public void handleResource(PolicyRequest request, ManagerContext ctx,
			Resource selected) {
		String mgcc = request.params["mgcc"]
		String id = request.params["id"]
		TypeEnum type = request.params["type"]

		ILocalControllerAdapter adapter = controllers[type].newInstance(true)

		if(adapter instanceof LocalControllerAdapter)
		{
			//adapter.setBrokerListener(adapter)
			adapter.id = id
			adapter.type = type
			adapter.setResource(selected)
			//adapter.resource = selected
			//adapter.setEventNotifier(selected)
		}
		//			((LocalControllerAdapter)((BrokerManagedResource)selected).bridge).id = id
		//			((BrokerManagedResource)selected).getMainManager().getStateManager().getType("bottom").create(id)

		StateHolder state = ctx.stateManager.getType("top").get(mgcc)
		state.getAsSet("ctrlrs").add(adapter)
		Util.policy_handler_log_top("resource:ctrlr ${selected} selected")

	}

}
