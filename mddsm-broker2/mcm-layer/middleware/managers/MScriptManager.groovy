package middleware.managers
import java.util.Map;

import middleware.interfaces.Full_MCM_Interface;
import middleware.interfaces.MScriptManagerInterface;
import br.inf.ufg.mddsm.broker.manager.MainManager;
import br.inf.ufg.mddsm.broker.manager.ManagerFacade;

public class MScriptManager extends ManagerFacade implements MScriptManagerInterface {
	
	public MScriptManager(MainManager manager) {
		super(manager);
	}

	@Override
	public Object processScript(String script) {
		Map params = ["script":script];
		return enqueue("ProcessScript", params);
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
			String typeID) {
			Map params = ["controllerID":controllerID, "cName":name, "cardinality":cardinality,
				"critical":critical, "groupAction":groupAction, "lowerWattage":lowerWattage, "upperWattage":upperWattage, "typeID":typeID];
		return enqueue("AddLoadController", params);
	}
			
	@Override
	public Object addStorageController(String controllerID, String name,
			String cardinality, String chargeStatus,
			String typeID) {
			Map params = ["controllerID":controllerID, "cName":name, "cardinality":cardinality, "chargeStatus":chargeStatus, "typeID":typeID];
			return enqueue("AddStorageController", params);
	}

	@Override
	public Object addPCCController(String controllerID, String name,
			String cardinality, String critical, String connected, String TypeID) {
			Map params = ["controllerID":controllerID, "cName":name, "cardinality":cardinality, "critical":critical, "connected":connected, "TypeID":TypeID];
			return enqueue("AddPCCController", params);
	}

	
	@Override
	public Object addLoadDeviceType(String deviceTypeID, String typename,
			String critical, String usage, String controllerID) {
			Map params = ["deviceTypeID":deviceTypeID, "typename":typename, "critical":critical, "usage":usage, "controllerID":controllerID];
			return enqueue("AddLoadDeviceType", params);
	}

	@Override
	public Object addStorageDeviceType(String deviceTypeID, String typename,
			String lowerThres, String upperThres, String controllerID) {
			Map params = ["deviceTypeID":deviceTypeID, "typename":typename, "lowThres":lowThres, "upperThres":upperThres, "controllerID":controllerID];
			return enqueue("AddStorageDeviceType", params);
	}
	
	@Override
	public Object addMeterType(String meterTypeID, String typename,
			String controllerID) {
			Map params = ["meterTypeID":meterTypeID, "typename":typename, "controllerID":controllerID];
			return enqueue("AddMeterType", params);
	}

	@Override
	public Object addLoadDevice(String deviceID, String deviceTypeID,
			String wattage, String control, String critical,
			Map<String, Object> params) {
			params = ["deviceID":deviceID, "deviceTypeID":deviceTypeID, "wattage":wattage, "control":control, "critical":critical];
			return enqueue("AddLoadDevice", params);
	}
			
	@Override
	public Object addStorageDevice(String deviceID, String deviceTypeID,
			String wattage, String capacity, String charging, String chargeT,
			Map<String, Object> params) {
			params = ["deviceID":deviceID,"deviceTypeID":deviceTypeID, "wattage":wattage, "capacity":capacity, "charging":charging, "chargeT":chargeT];
			return enqueue("AddStorageDevice", params);
	}

	@Override
	public Object addSmartMeter(String meterID, String meterTypeID,
			String tarrif, String usage) {
			Map params = ["meterID":meterID, "meterTypeID":meterTypeID, "tarrif":tarrif, "usage":usage];
			return enqueue("AddSmartMeter", params);
	}
					
	@Override
	public Object setDeviceProperty(String deviceID, String atribute,
			String value) {
			Map params = ["deviceID":deviceID, "atribute":atribute, "value":value];
			return enqueue("SetDeviceProperty", params);
	}
}
