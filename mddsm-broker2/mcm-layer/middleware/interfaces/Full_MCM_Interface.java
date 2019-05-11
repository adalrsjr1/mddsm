package middleware.interfaces;

import java.util.Map;

import types.TypeEnum;

public interface Full_MCM_Interface {
	Object addGroupController(String contGroupID, String controllerID, Map<String, Object> controllerIDSet);
	Object addLegacyMeter(String meterID, String meterTypeID);
	Object addLoadController(String controllerID, String name, String cardinality, String critical, String groupAction, String lowerWattage, String upperWattage, Map<String, Object> typeIDSet);
	Object addLoadDevice(String deviceID, String deviceTypeID, String wattage, String control, String critical, Map<String, Object> properties);
	Object addLoadDeviceType(String deviceTypeID, String typename, String critical, String usage, String controllerID);
	Object addMeterType(String meterTypeID, String typename, String controllerID);
	Object addPCCController(String controllerID, String name, String cardinality, String critical, String connected, String TypeID);
	Object addSmartMeter(String meterID, String meterTypeID, String tarrif, String usage);
	Object addSource(String sourceID, String sourceTypeID, String wattage, String onDemand, String charging, String chargeT, Map<String, Object> properties);
	Object addSourceController(String controllerID, String name, String cardinality, String critical, String groupAction, Map<String, Object> properties);
	Object addSourceType(String sourceTypeID, String typename, String source, String priority, String controllerID);
	Object addStorageController(String controllerID, String name, String cardinality, String chargeStatus, Map<String, Object> properties);
	Object addStorageDevice(String deviceID, String deviceTypeID, String wattage, String capacity, String charging, String chargeT, Map<String, Object> properties);
	Object addStorageDeviceType(String deviceTypeID, String typename, String lowerThres, String upperThres, String controllerID);
	Object initializeMGrid(String mgridID);
	Object removeController(String controllerID);
	Object removeGroupController(String contGroupID);
	Object removeType(String typeID);
	Object removeDevice(String entityID);
	Object setLCPProperty(String deviceID, String atribute, String value);
	Object setDeviceProperty(String deviceID, String atribute, String value);
	Object requestProperty(String deviceID, String atribute);
	Object dispatchScript(String script);
}
