package broker.top.actions;

import java.util.Map;
import java.util.Set;

import types.ControlEnum;
import types.CriticalEnum;
import types.TypeEnum;

import broker.bottom.adapters.DeviceAdapter;
import broker.bottom.adapters.IDeviceAdapter
import broker.test.TopBroker;
import broker.top.adapters.ILocalControllerAdapter
import broker.top.adapters.LocalControllerAdapter;

import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.SignalInstance
import br.inf.ufg.mddsm.broker.manager.actions.MacroActionInstance;
import br.inf.ufg.mddsm.broker.state.StateHolder

public class BlackStart implements MacroActionInstance {
	
	private Set getDevs(ILocalControllerAdapter lca, String ctrlrId)
	{
		StateHolder state = lca.broker.mainManager.stateManager.getType("bottom").get(ctrlrId)
		
		return state.getAsSet("devs")
	}
	
	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		
//		Blackout blackout = new Blackout()
//		blackout.execute(ctx, params)
//		Thread.sleep(2000)
//		println "blackstart"
		String mgcc = params["mgcc"]
		StateHolder state = ctx.stateManager.getType("top").get(mgcc)
		
		if(state.get("blackStart"))
		{
			return false
		}
		
		state.set("blackStart", true)
		
		Set ctrlrs = state.get("ctrlrs")
		def loadC = ctrlrs.findAll {
			ILocalControllerAdapter l -> l.type == TypeEnum.LOAD
		}
		def sourceC = ctrlrs.findAll {
			ILocalControllerAdapter l -> l.type == TypeEnum.SOURCE
		}
		def storageC = ctrlrs.findAll {
			ILocalControllerAdapter l -> l.type == TypeEnum.STORAGE
		}
		
		storageC.each {
			ILocalControllerAdapter lca -> Set devs = getDevs(lca, lca.id)
			devs.each {
				lca.resource.execute(new SignalInstance("closeDev", ["ctrlrId":lca.id, "devId":it.id, "mgcc":mgcc]))
			}
			lca.resource.execute(new SignalInstance("closeCtrlr", ["mgcc":mgcc, "ctrlrId":lca.id]))
			println "closing  storage devices"
		}
		
		sourceC.each {
			ILocalControllerAdapter lca -> Set devs = getDevs(lca, lca.id)
			devs.each {
				
				DeviceAdapter dev ->
				if(dev.get("control") == ControlEnum.CONTROLLABLE)
				{
					lca.resource.execute(new SignalInstance("closeDev", ["ctrlrId":lca.id, "devId":dev.id, "mgcc":mgcc]))
				}
				
			}
			lca.resource.execute(new SignalInstance("closeCtrlr", ["mgcc":mgcc, "ctrlrId":lca.id]))
			println "closing  controlable source devices"
		}
		
		sourceC.each {
			ILocalControllerAdapter lca -> Set devs = getDevs(lca, lca.id)
			devs.each {
				
				IDeviceAdapter dev ->
				if(dev.get("control") != ControlEnum.CONTROLLABLE)
				{
					lca.resource.execute(new SignalInstance("closeDev", ["ctrlrId":lca.id, "devId":dev.id, "mgcc":mgcc]))
				}
				
			}
			lca.resource.execute(new SignalInstance("closeCtrlr", ["mgcc":mgcc, "ctrlrId":lca.id]))
			println "closing  controlable source devices"
		}
		
		loadC.each {
			ILocalControllerAdapter lca -> Set devs = getDevs(lca, lca.id)
			devs.each {
				
				DeviceAdapter dev ->
				if(dev.get("critical") == CriticalEnum.SENSITIVE)
				{
					lca.resource.execute(new SignalInstance("closeDev", ["ctrlrId":lca.id, "devId":dev.id, "mgcc":mgcc]))
				}
				
			}
			lca.resource.execute(new SignalInstance("closeCtrlr", ["mgcc":mgcc, "ctrlrId":lca.id]))
			println "closing  sensitice loads devices"
		}
		
		
	}

}
