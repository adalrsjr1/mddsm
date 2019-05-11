package broker.top.actions

import java.util.Map
import java.util.Set;

import types.TypeEnum;

import broker.bottom.adapters.DeviceAdapter;
import broker.top.adapters.ILocalControllerAdapter
import broker.top.adapters.LocalControllerAdapter
import broker.util.Util;
import br.inf.ufg.mddsm.broker.adapters.Event
import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.SignalInstance
import br.inf.ufg.mddsm.broker.manager.actions.MacroActionInstance;
import br.inf.ufg.mddsm.broker.state.StateHolder
import java.util.concurrent.*

class Blackout implements MacroActionInstance {
	public void openCtrlrs(TypeEnum type, Set ctrlrs, String mgcc)
	{
		def toOpen = ctrlrs.findAll {
			ILocalControllerAdapter l ->
			l.type == type
		}
		if(toOpen == null || toOpen.size() == 0)
			return 
		
		Util.top_mhb_log("Open "+type+" Ctrlrs", ["ctrlrs":toOpen], null)
		toOpen.each {
			ILocalControllerAdapter l ->
			Map nParams = ["mgcc":mgcc, "ctrlrId":l.id]
			
			l.resource.execute(new SignalInstance("openCtrlr", nParams))
			//l.openCtrlr(l.id)
		}
	}
	
	private Set getDevs(LocalControllerAdapter lca, String ctrlrId)
	{
		StateHolder state = lca.broker.mainManager.stateManager.getType("bottom").get(ctrlrId)
		
		return state.getAsSet("devs")
	}
	private static int count = 0
	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		
//		println "blackout"
		String mgcc = params["mgcc"]
		String id = params["ctrlrId"]
		
		StateHolder state = ctx.stateManager.getType("top").get(mgcc)
		
		if(state.get("islanding"))
		{
			return false
		}
		
		state.set("islanding", true)
		state.set("blackStart", false)
		
		Set ctrlrs = state.getAsSet("ctrlrs")
		
		openCtrlrs(TypeEnum.LOAD, ctrlrs, mgcc)
		openCtrlrs(TypeEnum.STORAGE, ctrlrs, mgcc)
		openCtrlrs(TypeEnum.SOURCE, ctrlrs, mgcc)
		openCtrlrs(TypeEnum.PCC, ctrlrs, mgcc)
		
		ILocalControllerAdapter lca = state.getAsSet("ctrlrs").find
		{
			it -> TypeEnum.PCC == it.type
		}
		
//		BlackStart bs = new BlackStart()
//		bs.execute(ctx, params)
		
//		LocalControllerAdapter lca = state.getAsSet("ctrlrs").find
//		{
//			it -> id == it.id
//		}
//
//		Map nParams = ["id": id]
//		
//		Util.top_mhb_log "Blackout", params, state
//		
//		if(lca.execute(new SignalInstance("open", params)))
//		{
//			if(lca.openCtrlr(id))
//			{
//				lca.notify(new Event('islanding'))
//				//lca.notify(new Event('ack'))
//			}			
//		}
		
		return true
		
		return false
	}

}
