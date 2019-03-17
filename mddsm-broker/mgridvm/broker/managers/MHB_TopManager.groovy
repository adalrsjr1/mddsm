package broker.managers

import java.util.Map;

import types.TypeEnum;

import broker.bottom.adapters.DeviceAdapter
import broker.physical.MGCentralController;
import broker.top.adapters.LocalControllerAdapter
import br.inf.ufg.mddsm.broker.adapters.EventException
import br.inf.ufg.mddsm.broker.manager.MainManager;
import br.inf.ufg.mddsm.broker.manager.ManagerFacade;
import br.inf.ufg.mddsm.broker.manager.SignalInstance
import br.inf.ufg.mddsm.broker.state.StateHolder
import br.inf.ufg.mddsm.broker.state.StateTypeManager

/**
 * MGCC and MHB facade
 * 
 * @author Adalberto
 *
 */
class MHB_TopManager extends ManagerFacade implements IMHB_Top {
	public MHB_TopManager(MainManager manager) {
		super(manager);
	}
	
	private void throwException(String name, Map params)
	{
		throw new EventException(name, params)
	}
	
	@Override
	public Object start(String mgridId) {
		Map param = ["mgridID": mgridId]
		enqueue("Start", param)
//		if(MGCentralController.activeMGCC(mgridID))
//			enqueue("Start", param)
//		else
//			throwException(null, null)
	}

	@Override
	public Object addLocalCtrlr(String id, String name, TypeEnum type,
			Map<String, Object> properties) {
		Map params = ["id": id, "ctrlrName": name, "type": type, "properties": properties]
//		if(MGCentralController.addCtrlr(params))
			enqueue("AddLocalCtrlr", params)
//		else
//			throwException(null, null)
	}

	@Override
	public Object addDevice(String lc, String id, String name, TypeEnum type,
			Map<String, Object> properties) {
		Map params = ["lc": lc, "id": id, "devName": name, "type": type, "properties": properties]
		enqueue("AddDevice", params)
	}

	@Override
	public Object requestDevProperty(String lc, String devId, String attribute) {
		Map params = ["lc": lc, "devId": devId, "attribute": attribute]
		enqueue("RequestDevProperty", params)
	}

	@Override
	public Object requestCtrlrProperty(String ctrlrId, String attribute) {
		Map params = ["ctrlrId": ctrlrId, "attribute": attribute]
		enqueue("RequestCtrlrProperty", params)
	}

	@Override
	public Object remDevice(String ctrlrId, String devId) {
		Map params = ["ctrlrId": ctrlrId, "devId": devId]
		enqueue("RemDevice", params)
	}

	@Override
	public Object remLocalCtrlr(String ctrlrId) {
		Map params = ["ctrlrId": ctrlrId]
//		if(execute(new SignalInstance("RemLocalCtrlr", params)))
//		{
//			MGCentralController.remCtrlr(params);
//		}
	}

	@Override
	public Object setDevProperty(String lc, String devId, String attribute,
			Object value) {
		Map params = ["lc": lc, "devId": devId, "attribute": attribute, "value": value]
		enqueue("SetDevProperty", params)
	}

	@Override
	public Object setCtrlrProperty(String lc, String attribute, Object value) {
		Map params = ["ctrlrId": lc, "attribute": attribute, "value": value]
		enqueue("SetCtrlrProperty", params)
	}

	@Override
	public Object openCtrlr(String ctrlrId) {
		enqueue("OpenCtrlr", ["ctrlrId":ctrlrId])
	}

	@Override
	public Object closeCtrlr(String ctrlrId) {
		enqueue("CloseCtrlr", ["ctrlrId":ctrlrId])
	}

	@Override
	public Object openDev(String ctrlrId, String devId) {
		enqueue("OpenDev", ["ctrlrId":ctrlrId, "devId":devId])
	}

	@Override
	public Object closeDev(String ctrlrId, String devId) {
		enqueue("CloseDev", ["ctrlrId":ctrlrId, "devId":devId])
	}
	
	public String stateToString()
	{
		StringBuilder sb = new StringBuilder()
		
		StateTypeManager stm = manager.stateManager.getType('top')
		if(stm.getAll().empty)
			return ""
		
		StateHolder sh = stm.getAll().first()
		
		Set<LocalControllerAdapter> ctrlrs = sh.getAsSet('ctrlrs')
		
		//LocalControllerAdapter ctrlr = ctrlrs.first()
		
		sb.append("|__ ${sh.id}\n")
		for(ctrlr in ctrlrs)
		{
			
			StateTypeManager stm_lc = ctrlr.mainManager.stateManager.getType('bottom')
			StateHolder sh_lc = stm_lc.get(ctrlr.id)
			Set<DeviceAdapter> devs = sh_lc.getAsSet('devs')
			
			//println sh_lc.dump()
			sb.append("|  |__ ${ctrlr.id} : ${sh_lc.attributes}\n")
			devs.each {
				sb.append("|  |  |__ ${it.id} : ${it}\n")
			}
		}
		return sb.toString()
	}
	
}
