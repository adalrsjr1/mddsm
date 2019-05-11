package middleware.managers;
import java.util.Map;
import java.util.Scanner;

import br.inf.ufg.mddsm.broker.manager.MainManager;
import br.inf.ufg.mddsm.broker.manager.ManagerFacade;

import middleware.util.CommandTokenizer;
import middleware.interfaces.Full_MCM_Interface;
import middleware.interfaces.MCM_Interface;
import middleware.reflection.Reflection;
//import middleware.script.ScriptInterpreter;

/*  Welcome to Kernel of Microgrid Control Middleware  */


public class AllCommands extends ManagerFacade implements Full_MCM_Interface {
	//ScriptInterpreter scrin = new ScriptInterpreter();
	//CommandTokenizer comtkn = new CommandTokenizer();
	//Scanner reader;
	
	public AllCommands(MainManager manager) {
		super(manager);
	}
	
	@Override
	public Object dispatchScript(String script) {
		Map params = ["script":script];
		return enqueue("DispatchScript", params);
	}

	@Override
	public Object addGroupController(String contGroupID, String controllerID,
			Map<String, Object> controllerIDSet) {
		Map params = ["contGroupID":contGroupID];
		return enqueue("AddGroupController", params);
	}

	@Override
	public Object addLegacyMeter(String meterID, String meterTypeID) {
		Map params = ["meterID":meterID, "meterTypeID":meterTypeID];
		return enqueue("AddLegacyMeter", params);
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
	public Object addLoadDevice(String deviceID, String deviceTypeID,
			String wattage, String control, String critical,
			Map<String, Object> params) {
			params = ["deviceID":deviceID, "deviceTypeID":deviceTypeID, "wattage":wattage, "control":control, "critical":critical];
		return enqueue("AddLoadDevice", params);
	}

	@Override
	public Object addLoadDeviceType(String deviceTypeID, String typename,
			String critical, String usage, String controllerID) {
			Map params = ["deviceTypeID":deviceTypeID, "typename":typename, "critical":critical, "usage":usage, "controllerID":controllerID];
		return enqueue("AddLoadDeviceType", params);
	}

	@Override
	public Object addMeterType(String meterTypeID, String typename,
			String controllerID) {
			Map params = ["meterTypeID":meterTypeID, "typename":typename, "controllerID":controllerID];
		return enqueue("AddMeterType", params);
	}

	@Override
	public Object addPCCController(String controllerID, String name,
			String cardinality, String critical, String connected, String TypeID) {
			Map params = ["controllerID":controllerID, "name":name, "cardinality":cardinality, "critical":critical, "connected":connected, "TypeID":TypeID];
		return enqueue("AddPCCController", params);
	}

	@Override
	public Object addSmartMeter(String meterID, String meterTypeID,
			String tarrif, String usage) {
			Map params = ["meterID":meterID, "meterTypeID":meterTypeID, "tarrif":tarrif, "usage":usage];
		return enqueue("AddSmartMeter", params);
	}

	@Override
	public Object addSource(String sourceID, String sourceTypeID,
			String wattage, String onDemand, String charging, String chargeT,
			Map<String, Object> params) {
			params = ["sourceID":sourceID, "sourceTypeID":sourceTypeID, "wattage":wattage, "onDemand":onDemand, "charging":charging, "chargeT":chargeT];
		return enqueue("AddSource",params);
	}

	@Override
	public Object addSourceController(String controllerID, String name,
			String cardinality, String critical, String groupAction,
			Map<String, Object> params) {
			params = ["controllerID":controllerID, "name":name, "cardinality":cardinality, "critical":critical, "groupAction":groupAction];
		return enqueue("AddSourceController", params);
	}

	@Override
	public Object addSourceType(String sourceTypeID, String typename,
			String source, String priority, String controllerID) {
			Map params = ["sourceTypeID":sourceTypeID, "typename":typename, "source":source, "priority":priority, "controllerID":controllerID];
		return enqueue("AddSourceType", params);
	}

	@Override
	public Object addStorageController(String controllerID, String name,
			String cardinality, String chargeStatus,
			Map<String, Object> params) {
			params = ["controllerID":controllerID, "name":name, "cardinality":cardinality, "chargeStatus":chargeStatus];
		return enqueue("AddStorageController", params);
	}

	@Override
	public Object addStorageDevice(String deviceID, String deviceTypeID,
			String wattage, String capacity, String charging, String chargeT,
			Map<String, Object> params) {
			params = ["deviceID":deviceID,"deviceTypeID":deviceTypeID, "wattage":wattage, "capacity":capacity, "charging":charging, "chargeT":chargeT];
		return enqueue("AddStorageDevice", params);
	}

	@Override
	public Object addStorageDeviceType(String deviceTypeID, String typename,
			String lowerThres, String upperThres, String controllerID) {
			Map params = ["deviceTypeID":deviceTypeID, "typename":typename, "lowThres":lowThres, "upperThres":upperThres, "controllerID":controllerID];
		return enqueue("AddStorageDeviceType", params);
	}

	@Override
	public Object initializeMGrid(String mgridID) {
		System.out.println("MGrid started!");
		Map params = ["mgridID":mgridID];
		return enqueue("InitializeMGrid",params);
	}

	@Override
	public Object removeController(String controllerID) {
		Map params = ["controllerID":controllerID];
		return enqueue("RemoveController", params);
	}

	@Override
	public Object removeGroupController(String contGroupID) {
		Map params = ["contGroupID":contGroupID];
		return enqueue("RemoveGroupController", params);
	}

	@Override
	public Object removeType(String typeID) {
		Map params = ["typeID":typeID];
		return enqueue("RemoveTypes", params);
	}

	@Override
	public Object removeDevice(String entityID) {
		Map params = ["entityID":entityID];
		return enqueue("RemoveDevice", params);
	}

	@Override
	public Object setLCPProperty(String deviceID, String atribute, String value) {
		Map params = ["deviceID":deviceID, "atribute":atribute, "value":value];
		return enqueue("SetLCPProperty", params);
	}

	@Override
	public Object setDeviceProperty(String deviceID, String atribute,
			String value) {
			Map params = ["deviceID":deviceID, "atribute":atribute, "value":value];
		return enqueue("SetDeviceProperty", params);
	}

	@Override
	public Object requestProperty(String deviceID, String atribute) {
		Map params = ["deviceID":deviceID, "atribute":atribute];
		return enqueue("RequestProperty", params);
	}
	
	

}
