package middleware.interfaces;

import java.util.Map;

public interface MScriptManagerInterface {
	Object processScript(String script);
	Object initializeMGrid(String mgridID);
	Object addLoadController(String controllerID, String name, String cardinality, String critical, String groupAction, String lowerWattage, String upperWattage, String typeID);
	Object addStorageController(String controllerID, String name, String cardinality, String chargeStatus, String TypeID);
	Object addPCCController(String controllerID, String name, String cardinality, String critical, String connected, String TypeID);
	Object addLoadDeviceType(String deviceTypeID, String typename, String critical, String usage, String controllerID);
	Object addStorageDeviceType(String deviceTypeID, String typename, String lowerThres, String upperThres, String controllerID);
	Object addMeterType(String meterTypeID, String typename, String controllerID);
	Object addLoadDevice(String deviceID, String deviceTypeID, String wattage, String control, String critical, Map<String, Object> properties);
	Object addStorageDevice(String deviceID, String deviceTypeID, String wattage, String capacity, String charging, String chargeT, Map<String, Object> params);
	Object addSmartMeter(String meterID, String meterTypeID, String tarrif, String usage);
	Object removeDevice(String entityID);
	Object setDeviceProperty(String deviceID, String atribute, String value);
}
