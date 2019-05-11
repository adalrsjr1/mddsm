package broker.top.actions

import java.util.Map

import types.TypeEnum;


import broker.physical.Controller
import broker.test.BottomBroker
import broker.top.adapters.ILocalControllerAdapter
import broker.top.adapters.LocalControllerAdapter;
import broker.util.Util;
import br.inf.ufg.mddsm.broker.adapters.Event
import br.inf.ufg.mddsm.broker.adapters.EventException
import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.SignalInstance
import br.inf.ufg.mddsm.broker.manager.actions.MacroActionInstance;
import br.inf.ufg.mddsm.broker.resource.Resource;
import br.inf.ufg.mddsm.broker.resource.bridge.BrokerManagedResource;
import br.inf.ufg.mddsm.broker.state.StateHolder;

class AddLocalCtrlr implements MacroActionInstance {

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		String mgcc = params["mgcc"]
		String name = params["ctrlrName"]
		String id = params["id"]
		TypeEnum type = params["type"]
		Map properties = params["properties"]
		
		StateHolder state = ctx.stateManager.getType("top").get(mgcc)
		
		LocalControllerAdapter lca = state.getAsSet("ctrlrs").find
		{
			it -> id == it.id
		}

//		Controller c = lca.execute(new SignalInstance("startCtrlr", params))
//		if(c)
//		{
//			c.addObserver(lca)
//		}  
		lca.execute(new SignalInstance("startCtrlr", params))
		lca.name = name
		lca.properties = properties
		Util.top_mhb_log("AddLocalCtrlr", params, state)
		lca.notify(new Event('ack'))
		
//		String mgcc = params["mgcc"]
//		String name = params["ctrlrName"]
//		String id = params["id"]
//		TypeEnum type = params["type"]
//		Map properties = params["properties"]
//
//		StateHolder state = ctx.stateManager.getType("top").get(mgcc)
//
//		LocalControllerAdapter lca = state.getAsSet("ctrlrs").find
//		{
//			it -> id == it.id
//		}
//
//		def returnState = false
//		try{
//			Util.top_mhb_log("AddLocalCtrlr", params, state)
//			
//			if(lca.startCtrlr(id, name, type, properties)) // physical ctrlr
////			if(true)
//			{
//				
//				if(lca.execute(new SignalInstance("startCtrlr", params))) // bottom mhb
////				if(true)
//				{
//					
//					
////					if(type != TypeEnum.PCC)
////					{	
////						def r = ctx.getResourceManager().getObject("${type}Controller")
////						r.execute(new SignalInstance("startCtrlr", params))
////					}
////					else
////					{
////						def r = ctx.getResourceManager().getObject("${type}_Controller")
////						r.execute(new SignalInstance("startCtrlr", params))
////					}
//						
//					StateHolder ctrlrState = lca.mainManager.context.stateManager.getType("bottom").get(id)
//					ctrlrState.set("type", type)
//					println "<<< " + ctrlrState.dump()
//					
//					
//					//Util.mhb_log ("adding ${lca} :: ${state.getAsSet('ctrlrs')}")
//					
//					//Util.bottom_mhb_log("AddLocalCtrlr:  ${ctrlrState.dump()}" )
//					//lca.notify(new Event('ack'))
//					returnState = true
//				}
//			}
//			
//		}
//		catch(Exception e)
//		{
//			returnState = false
//			e.printStackTrace()
//			throw new EventException("AddCtrlrException")
//		}
//		
//		return returnState
	}

}
