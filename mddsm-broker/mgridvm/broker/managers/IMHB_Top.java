package broker.managers;

import java.util.Map;

import types.TypeEnum;

public interface IMHB_Top {

	Object start(String mgridId);
	
	Object addLocalCtrlr(String id, String ctrlrName, TypeEnum type, Map properties);
	
	Object addDevice(String lc, String id, String devName, TypeEnum type, Map properties);
	
	Object requestDevProperty(String lc, String devId, String attribute);
	
	Object requestCtrlrProperty(String ctrlrId, String attribute);
	
	Object remDevice(String ctrlrId, String attribute);
	
	Object remLocalCtrlr(String ctrlrId);
	
	Object setDevProperty(String lc, String devId, String attribuite, Object value);
	
	Object setCtrlrProperty(String ctrlrId, String attribute, Object value);
	
	Object openCtrlr(String ctrlrId);
	
	Object closeCtrlr(String ctrlrId);
	
	Object openDev(String ctrlrId, String devId);
	
	Object closeDev(String ctrlrId, String devId);
}
