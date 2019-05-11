package broker.top.actions;

import java.util.Map;

import types.TypeEnum;


import broker.top.adapters.ILocalControllerAdapter
import broker.top.adapters.LocalControllerAdapter
import broker.util.Util;
import br.inf.ufg.mddsm.broker.adapters.Event
import br.inf.ufg.mddsm.broker.adapters.EventException
import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.SignalInstance
import br.inf.ufg.mddsm.broker.manager.actions.MacroActionInstance;
import br.inf.ufg.mddsm.broker.resource.bridge.BrokerManagedResource
import br.inf.ufg.mddsm.broker.state.StateHolder;

public class AddDevice implements MacroActionInstance {

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		String id = params["id"]
		String name = params["devName"]
		String mgcc = params["mgcc"]
		TypeEnum type = params["type"]
		String lc = params["lc"]
		Map properties = params["properties"]
		
		StateHolder state = ctx.stateManager.getType("top").get(mgcc)
					
		ILocalControllerAdapter lca = state.getAsSet("ctrlrs").find
		{
			it -> lc == it.id
		}
		
		lca.execute(new SignalInstance("startDevice", params))
		Util.top_mhb_log "AddDevice",params,state
		lca.notify(new Event('ack'))
//
//		Map nParams =["devName":name, "id":id, "type":type, "properties": properties, "lc":lc]
//			
//		try
//		{
//			Util.top_mhb_log "AddDevice",params,state
//			if(lca.startDevice(id, name, type, properties))
//				if(lca.execute(new SignalInstance("startDevice", nParams)))
//				{
//				
//					//Util.mhb_log("adding device ${params} at ${lca}")
//					//lca.notify(new Event('ack'))
//					return true
//				}
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace()
//			throw new EventException("AddDeviceException")
//			return false
//		}
		
	}

}
