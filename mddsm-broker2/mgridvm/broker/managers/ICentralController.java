package broker.managers;

import java.util.Map;

import types.TypeEnum;






public interface ICentralController {

	void start(String mgridID);
	
	void addLocalCtrlr(String id, String name, TypeEnum type, Map<String, Object> properties);
	
	void addDevice(String lc, String id, String name, TypeEnum type, Map<String, Object> properties);
	
	void requestDevProperty(String lc, String devId, String attribute);
	
	void requestCtrlrProperty(String ctrlrId, String attribute);
	
	void remDevice(String ctrlrId, String devId);
	
	void remLocalCtrlr(String ctrlrId);
	
	void setDevProperty(String ctrlrId, String devId, String attribute, Object value);
	
	void setCtrlrProperty(String ctrlrId, String attribute, Object value);
	
	void openCtrlr(String ctrlrId);
	
	void closeCtrlr(String ctrlrId);
	
	void openDev(String ctrlrId, String devId);
	
	void closeDev(String ctrlrId, String devId);
}
