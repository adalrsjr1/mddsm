package broker.managers;

import java.util.Map;

import asg.cliche.Command;

import types.TypeEnum;

public interface IMHB_Bottom {
	
	Object startCtrlr(String id, String ctrlrName, TypeEnum type, Map properties);
	
	Object startDevice(String id, String devName, TypeEnum type, Map properties,
			String lc);
	
	Object requestProperty(String devId, String attribute, String lc);
	
	Object stopDevice(String devId, String ctrlrId);
	
	Object stopCtrlr(String ctrlrId);
	
	Object setProperty(String devId, String lc, String attribute, Object value);
	
	Object setCtrlrProperty(String ctrlrId, String attribute, Object value);
	
	Object open(String ctrlrId);
	
	Object close(String ctrlrId);
	
	Object openDevice(String ctrlrId, String devId);
	
	Object closeDevice(String ctrlrId, String devId);
}
