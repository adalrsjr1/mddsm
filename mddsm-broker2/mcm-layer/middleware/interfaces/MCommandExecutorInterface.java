package middleware.interfaces;

import java.util.Map;

public interface MCommandExecutorInterface {
	Object removeDevice(String entityID);
	Object initializeMGrid(String mgridID);
	Object addLoadController(String controllerID, String name, String cardinality, String critical, String groupAction, String lowerWattage, String upperWattage, Map<String, Object> typeIDSet);
	Object addLoadDeviceType(String deviceTypeID, String typename, String critical, String usage, String controllerID);
	Object addLoadDevice(String deviceID, String deviceTypeID, String wattage, String control, String critical, Map<String, Object> properties);
	Object setDeviceProperty(String deviceID, String atribute, String value);
}
