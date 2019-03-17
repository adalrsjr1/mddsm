package broker.managers

import java.util.Map;

import types.TypeEnum;


import broker.bottom.adapters.DeviceAdapter
import broker.physical.MGLocalController;
import broker.top.adapters.ILocalControllerAdapter;
import broker.top.adapters.LocalControllerAdapter
import br.inf.ufg.mddsm.broker.adapters.Call;
import br.inf.ufg.mddsm.broker.adapters.EventException
import br.inf.ufg.mddsm.broker.adapters.EventNotifier;
import br.inf.ufg.mddsm.broker.manager.MainManager
import br.inf.ufg.mddsm.broker.manager.ManagerFacade;
import br.inf.ufg.mddsm.broker.state.StateHolder
import br.inf.ufg.mddsm.broker.state.StateTypeManager

class MHB_BottomManager extends ManagerFacade implements IMHB_Bottom {

	public String stateToString()
	{
		StringBuilder sb = new StringBuilder()
		StateTypeManager stm = manager.stateManager.getType('bottom')
		if(stm.getAll().empty)
			return ""

		StateHolder sh = stm.getAll().first()

		Set<DeviceAdapter> devs = sh.getAsSet('devs')

		sb.append("|__ ${sh.id} ${sh.params}\n")
		for(dev in devs)
		{
			sb.append("|  |__ ${dev.id} : ${dev}\n")
		}
		
		return sb.toString()
	}

	public MHB_BottomManager(MainManager manager) {
		super(manager);
	}

	private void throwException(String name, Map params)
	{
		throw new EventException(name, params)
	}

	@Override
	public Object startCtrlr(String id, String ctrlrName, TypeEnum type,
			Map properties) {
		Map params = ["id": id, "ctrlrName": ctrlrName, "type": type, "properties": properties]
		return enqueue("startCtrlr", params)
	}

	@Override
	public Object startDevice(String id, String devName, TypeEnum type,
			Map properties, String lc) {
		Map params = ["id": id, "lc":lc, "devName": devName, "type": type, "properties": properties]
		return enqueue("startDevice", params)
	}

	@Override
	public Object requestProperty(String devId, String attribute, String lc) {
		Map params = ["devId": devId, "attribute": attribute, "lc": lc]
		return enqueue("requestProperty", params)
	}

	@Override
	public Object stopDevice(String devId, String ctrlrId) {
		Map params = ["devId": devId, "ctrlrId": ctrlrId]
		return enqueue("stopDevice", params)
	}

	@Override
	public Object stopCtrlr(String ctrlrId) {
		Map params = ["ctrlrId": ctrlrId]
		return enqueue("stopCtrlr", params)
	}

	@Override
	public Object setProperty(String devId, String lc, String attribute,
			Object value) {
		Map params = ["devId": devId, "lc": lc, "attribute": attribute, "value": value]
		return enqueue("setProperty", params)
	}

	@Override
	public Object setCtrlrProperty(String ctrlrId, String attribute,
			Object value) {
		Map params = ["ctrlrId": ctrlrId, "attribute": attribute, "value": value]
		return enqueue("setCtrlrProperty", params)
	}

	@Override
	public Object open(String ctrlrId) {
		Map params = ["ctrlrId": ctrlrId]
		return enqueue("open", params)
	}

	@Override
	public Object close(String ctrlrId) {
		Map params = ["ctrlrId": ctrlrId]
		return enqueue("startCtrlr", params)
	}

	@Override
	public Object openDevice(String ctrlrId, String devId) {
		Map params = ["ctrlrId": ctrlrId, "devId": devId]
		return enqueue("openDevice", params)
	}

	@Override
	public Object closeDevice(String ctrlrId, String devId) {
		Map params = ["ctrlrId": ctrlrId, "devId": devId]
		return enqueue("closeDevice", params)
	}
}
