package middleware.script;
/*
import java.util.Hashtable;
import java.util.Map;

import cvm.sb.adapters.EventException;
import cvm.sb.manager.MainManager;
import cvm.sb.manager.ManagerFacade;

import broker.test.TopBroker;

import middleware.enumerate.TypeEnum;
import middleware.repository.RepositoryManager;
import middleware.util.BuildCmdHashTable;

Classe que implementa cada comando do script
//Em todos os vetores, os dados iniciam a partir da posicao 1


public class ScriptInterpreter extends ManagerFacade {
	private RepositoryManager repository = new RepositoryManager();
	private TopBroker broker = new TopBroker();
	private BuildCmdHashTable buildCmdHashTable;
	Hashtable<String,Object> properties;
	
	
	public ScriptInterpreter(MainManager manager){
		super(manager);
	}
	
	public ScriptInterpreter(){
		super(null);
	}
	
	private void throwException(String name, Map params)
	{
		throw new EventException(name, params);
	}
	
	public void initializeMGrid(String[] params){
		Map params = 
		broker.start(values[1]);
	}
	
	public void addGroupController(String[] values){
		buildCmdHashTable = new AddGroupController();
		properties = buildCmdHashTable.build(values);
		repository.addController((String)properties.get("contGroupID"), properties);
	}
	
	public void removeGroupController(String[] values){
		repository.remController(values[1]);
	}
	
	public void addLoadController(String[] values){
		buildCmdHashTable = new AddLoadController();
		properties = buildCmdHashTable.build(values);
		repository.addController((String)properties.get("controllerID"), properties);
		broker.addLocalCtrlr((String)properties.get("controllerID"), (String)properties.get("name"), TypeEnum.LOAD, properties);
	}
	
	public void addStorageController(String[] values){
		buildCmdHashTable = new AddStorageController();
		properties = buildCmdHashTable.build(values);
		repository.addController((String)properties.get("controllerID"), properties);
		broker.addLocalCtrlr((String)properties.get("controllerID"), (String)properties.get("name"), TypeEnum.STORAGE, properties);
	}
	
	public void addSourceController(String[] values){
		buildCmdHashTable = new AddSourceController();
		properties = buildCmdHashTable.build(values);
		repository.addController((String)properties.get("controllerID"), properties);
		broker.addLocalCtrlr((String)properties.get("controllerID"), (String)properties.get("name"), TypeEnum.SOURCE, properties);
	}
	
	public void addPCCController(String[] values){	
		buildCmdHashTable = new AddPCCController();
		properties = buildCmdHashTable.build(values);
		repository.addController((String)properties.get("controllerID"), properties);
		broker.addLocalCtrlr((String)properties.get("controllerID"), (String)properties.get("name"), TypeEnum.PCC, properties);
	}
	
	public void removeController(String[] values){
		repository.remController(values[1]);
		broker.remLocalCtrlr(values[1]);
	}
	
	public void addLoadDeviceType(String[] values){
		buildCmdHashTable = new AddLoadDeviceType();
		properties = buildCmdHashTable.build(values);
		repository.addDeviceType((String)properties.get("deviceTypeID"), properties);
	}
	
	public void addStorageDeviceType(String[] values){
		buildCmdHashTable = new AddStorageDeviceType();
		properties = buildCmdHashTable.build(values);
		repository.addDeviceType((String)properties.get("deviceTypeID"), properties);
	}
	
	public void addSourceType(String[] values){
		buildCmdHashTable = new AddSourceType();
		properties = buildCmdHashTable.build(values);
		repository.addDeviceType((String)properties.get("sourceTypeID"), properties);
	}
	
	public void addMeterType(String[] values){
		buildCmdHashTable = new AddMeterType();
		properties = buildCmdHashTable.build(values);
		repository.addDeviceType((String)properties.get("sourceTypeID"), properties);
	}
	
	public void removeType(String[] values){
		repository.remDeviceType(values[1]);
	}
	
	public void addLoadDevice(String[] values){
		Hashtable<String,Object> deviceType;
		buildCmdHashTable = new AddLoadDevice();
		properties = buildCmdHashTable.build(values);
		repository.addDevice((String)properties.get("deviceID"), properties);
		deviceType = (Hashtable<String, Object>) repository.getDeviceType((String)properties.get("deviceTypeID"));
		broker.addDevice((String)deviceType.get("controllerID"),(String)properties.get("deviceID"),(String)properties.get("name"), TypeEnum.LOAD, properties);
	}
	
	public void addStorageDevice(String[] values){
		Hashtable<String,Object> deviceType;
		buildCmdHashTable = new AddStorageDevice();
		properties = buildCmdHashTable.build(values);
		repository.addDevice((String)properties.get("deviceID"), properties);
		deviceType = (Hashtable<String, Object>) repository.getDeviceType((String)properties.get("deviceTypeID"));
		broker.addDevice((String)deviceType.get("controllerID"),(String)properties.get("deviceID"),(String)properties.get("name"), TypeEnum.STORAGE, properties);
	}
	
	public void addSource(String[] values){ //Not have field name
		Hashtable<String,Object> deviceType;
		buildCmdHashTable = new AddSource();
		properties = buildCmdHashTable.build(values);
		repository.addDevice((String)properties.get("sourceID"), properties);
		deviceType = (Hashtable<String, Object>) repository.getDeviceType((String)properties.get("sourceTypeID"));
		broker.addDevice((String)deviceType.get("controllerID"),(String)properties.get("sourceID"),(String)properties.get("name"), TypeEnum.SOURCE, properties);
	}
	
	public void addSmartMeter(String[] values){ //Not have field name
		Hashtable<String,Object> deviceType;
		buildCmdHashTable = new AddSmartMeter();
		properties = buildCmdHashTable.build(values);
		repository.addDevice((String)properties.get("meterID"), properties);
		deviceType = (Hashtable<String, Object>) repository.getDeviceType((String)properties.get("meterTypeID"));
		broker.addDevice((String)deviceType.get("controllerID"),(String)properties.get("meterID"),(String)properties.get("name"), TypeEnum.SMART_METER, properties);
	}
	
	public void addLegacyMeter(String[] values){ //Not have field name
		Hashtable<String,Object> deviceType;
		buildCmdHashTable = new AddLegacyMeter();
		properties = buildCmdHashTable.build(values);
		repository.addDevice((String)properties.get("meterID"), properties);
		deviceType = (Hashtable<String, Object>) repository.getDeviceType((String)properties.get("meterTypeID"));
		broker.addDevice((String)deviceType.get("controllerID"),(String)properties.get("meterID"),(String)properties.get("name"), TypeEnum.LEGACY_METER, properties);
	}
	
	public void removeDevice(String[] values){ //Not work for all deviceTypes
		Hashtable<String,Object> deviceType;
		Hashtable<String,Object> device;
		device = (Hashtable<String, Object>) repository.remDevice(values[1]);
		deviceType = (Hashtable<String, Object>) repository.getDeviceType((String)device.get("deviceTypeID"));
		broker.remDevice((String)deviceType.get("controllerID"), values[1]);
	}
	
	public void setLCPropertry(String[] values){
		properties = (Hashtable<String, Object>) repository.getController(values[1]);
		properties.put(values[2], values[3]); //Update my model
		broker.setCtrlrProperty(values[1], values[2], values[3]);
	}
	
	public void setDeviceProperty(String[] values){
		Hashtable<String,Object> deviceType;
		Hashtable<String,Object> device;
		device = (Hashtable<String, Object>) repository.getDevice(values[1]);
		device.put(values[2], values[3]); //Update my model
		deviceType = (Hashtable<String, Object>) repository.getDeviceType((String)device.get("deviceTypeID"));
		broker.setDevProperty((String)deviceType.get("controllerID"), values[1], values[2], values[3]);
	}
	
	public void requestProperty(String[] values){ //Throw a event?
		//Controller or device?
	}

}
*/
