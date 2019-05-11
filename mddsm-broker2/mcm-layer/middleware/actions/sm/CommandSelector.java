package middleware.actions.sm;

import br.inf.ufg.mddsm.broker.manager.MainManager;
import br.inf.ufg.mddsm.broker.manager.SignalInstance;
import middleware.managers.MCommandExecutor;
import middleware.managers.MScriptManager;

public class CommandSelector {

	private MScriptManager cmdExecutor;
	
	public CommandSelector(MScriptManager cmdExecutor){
		this.cmdExecutor = cmdExecutor;
	}
	
	public void addLoadController(String[] values){
		cmdExecutor.addLoadController(values[1], values[2], values[3], values[4], values[5], values[6], values[7], values[8]);
	}
	
	public void addStorageController(String[] values){
		cmdExecutor.addStorageController(values[1], values[2], values[3], values[4], values[5]);
	}
	
	public void addPCCController(String[] values){
		cmdExecutor.addPCCController(values[1], values[2], values[3], values[4], values[5], values[6]);
	}
	
	public void addLoadDeviceType(String[] values){
		cmdExecutor.addLoadDeviceType(values[1], values[2], values[3], values[4], values[5]);
	}
	
	public void addStorageDeviceType(String[] values){
		cmdExecutor.addStorageDeviceType(values[1], values[2], values[3], values[4], values[5]);
	}
	
	public void addMeterType(String[] values){
		cmdExecutor.addMeterType(values[1], values[2], values[3]);
	}
	
	public void addLoadDevice(String[] values){
		cmdExecutor.addLoadDevice(values[1], values[2], values[3], values[4], values[5], null);
	}
	
	public void addStorageDevice(String[] values){
		cmdExecutor.addStorageDevice(values[1], values[2], values[3], values[4], values[5], values[6], null);
	}
	
	public void addSmartMeter(String[] values){
		cmdExecutor.addSmartMeter(values[1], values[2], values[3], values[4]);
	}
	
	public void initializeMGrid(String[] value){ 
		cmdExecutor.initializeMGrid(value[1]);
	}
	
	public void removeDevice(String[] value){
		//cmdExecutor.removeDevice(value[1]);
	}
	
	public void setDeviceProperty(String[] values){
		//cmdExecutor.setDeviceProperty(values[1], values[2], values[3]);
	}
}
