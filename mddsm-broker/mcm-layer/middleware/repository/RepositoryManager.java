package middleware.repository;
import java.util.Hashtable;

/*  Management of all data structures  */

public class RepositoryManager {
	private Hashtable<String,Object> controller = new Hashtable<String,Object>();
	private Hashtable<String,Object> deviceType = new Hashtable<String,Object>();
	private Hashtable<String,Object> device = new Hashtable<String,Object>();
	
	public RepositoryManager(){
		
	}
	
	public void addController(String key, Object table){
		controller.put(key, table);
	}
	
	public Object getController(String key) {
		return controller.get(key);
	}
	
	public Object remController(String key){
		return controller.remove(key);
	}
	
	public void addDeviceType(String key, Object table){
		deviceType.put(key, table);
	}
	
	public Object getDeviceType(String key){
		return deviceType.get(key);
	}
	
	public Object remDeviceType(String key){
		return deviceType.remove(key);
	}
	
	public void addDevice(String key, Object table){
		device.put(key, table);
	}
	
	public Object getDevice(String key){
		return device.get(key);
	}
	
	public Object remDevice(String key){
		return device.remove(key);
	}
	
}
