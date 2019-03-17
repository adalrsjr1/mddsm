package middleware.managers

import java.util.Map;

import br.inf.ufg.mddsm.broker.manager.MainManager;
import br.inf.ufg.mddsm.broker.manager.ManagerFacade;
import middleware.util.CommandTokenizer;
import middleware.interfaces.MCM_Interface;
import middleware.interfaces.MMainManagerInterface
import middleware.reflection.Reflection;
import middleware.interfaces.MCommandExecutorInterface

public class MCommandExecutor extends ManagerFacade implements MCommandExecutorInterface {
	
	public MCommandExecutor(MainManager manager) {
		super(manager);
	}

	@Override
	public Object removeDevice(String entityID) {
		Map params = ["entityID":entityID];
		return enqueue("RemoveDevice", params);
	}

	@Override
	public Object initializeMGrid(String mgridID) {
		Map params = ["mgridID":mgridID];
		return enqueue("InitializeMGrid", params);
	}

	@Override
	public Object addLoadController(String controllerID, String name,
			String cardinality, String critical, String groupAction,
			String lowerWattage, String upperWattage,
			Map<String, Object> params) {
			params = ["controllerID":controllerID, "name":name, "cardinality":cardinality,
				"critical":critical, "groupAction":groupAction, "lowerWattage":lowerWattage, "upperWattage":upperWattage];
		return enqueue("AddLoadController", params);
	}

	@Override
	public Object addLoadDeviceType(String deviceTypeID, String typename,
			String critical, String usage, String controllerID) {
			Map params = ["deviceTypeID":deviceTypeID, "typename":typename, "critical":critical, "usage":usage, "controllerID":controllerID];
			return enqueue("AddLoadDeviceType", params);
	}

	@Override
	public Object addLoadDevice(String deviceID, String deviceTypeID,
			String wattage, String control, String critical,
			Map<String, Object> params) {
			params = ["deviceID":deviceID, "deviceTypeID":deviceTypeID, "wattage":wattage, "control":control, "critical":critical];
			return enqueue("AddLoadDevice", params);
	}

	@Override
	public Object setDeviceProperty(String deviceID, String atribute,
			String value) {
			Map params = ["deviceID":deviceID, "atribute":atribute, "value":value];
			return enqueue("SetDeviceProperty", params);
	}
}
