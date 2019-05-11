package broker.physical;

import broker.util.Util;

public class MGCentralController {
	private MGCentralController() {}
	
	public static boolean activeMGCC(String mgridID)
	{
		Util.mgcc_log "activeMGCC", null
		MGPlant.startPlant()
		true
	}
	
	public static boolean addCtrlr(Map attrs)
	{
		Util.mgcc_log "addCtrlr", attrs
		true
	}
	
	public static boolean remCtrlr(Map attrs)
	{
		Util.mgcc_log "remCtrlr", attrs
		true
	}
	
	public static boolean openCtrlr(Map attrs)
	{
		Util.mgcc_log "openCtrlr", attrs
		true
	}
	
	public static boolean closeCtrlr(Map attrs)
	{
		Util.mgcc_log "closeCtrlr", attrs
		true
	}
}
