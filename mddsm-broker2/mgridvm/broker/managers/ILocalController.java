package broker.managers;

import java.util.Map;

import broker.physical.Controller;

import types.TypeEnum;





import br.inf.ufg.mddsm.broker.adapters.Manageable;

public interface ILocalController{
	public Controller startCtrlr(String id, String name, TypeEnum type, Map<String, Object> properties);
	
	public boolean stopCtrlr(String id);
	
	public boolean startDevice(String id, String name, TypeEnum type, Map<String, Object> properties);
	
	public boolean requestProperty(String id, String attribute);
	
	public boolean setDevProperty(String id, String attribute, Object value);
	
	public boolean stopDevice(String id);
	
	public boolean openCtrlr(String id);
	
	public boolean closeCtrlr(String id);

	
}
