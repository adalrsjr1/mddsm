package broker.util

import broker.test.MGridVM;
import br.inf.ufg.mddsm.broker.state.StateHolder;

class Util {
	private static Terminal t = new Terminal("Terminal")	
	private static Terminal t2 = new Terminal("Terminal Trace")
	
	private static msg(String s)
	{
		if(MGridVM.bench) return;
		t.print(s)
		//println ("${s}")
	}
	
	private static msg_trace(String s)
	{
		
		if(MGridVM.bench) return;
		t2.print(s)	
	}
	
	static void mgcc_log(String methodName, Map attrs)
	{
		
		msg_trace "|  |__ mgcc [${methodName}]"
		msg "|  |__ ${methodName} :: ${attrs}"
	}
	
	static void lc_log(String methodName, Map attrs)
	{
		msg_trace "|  |  |__ lc [${methodName}]"
		msg "|  |  |__ ${methodName} :: ${attrs}"
	}
	
	static void dev_log(String methodName, Map attrs)
	{
		msg_trace "|  |  |  |__ dev [${methodName}]"
		msg "|  |  |  |__ ${methodName} :: ${attrs}"
		
	}
	
	static void mhb_log(String methodName, Map attrs)
	{
		msg_trace "|__ MHB [${methodName}]"
		msg "|__ MHB [${methodName}]"
	}
	
	static void top_mhb_log(String methodName, Map params, StateHolder state)
	{
		msg_trace "|  |__ top_mhb_log [${methodName}]"
		msg "|  |__ ${methodName} :: ${params}"
	}
	
	static void bottom_mhb_log(String methodName, Map params, StateHolder state)
	{
		
		msg_trace "|  |  |__ bottom_mhb_log [${methodName}]"
		msg "|  |  |__ ${methodName} :: ${params}"
	}
	
	static void policy_handler_log_top(String methodName)
	{
		msg_trace "|  |__ policy_handler_log_top"
		msg "|  |__ policy_handler_log_top --- [${methodName}] --- "
	}
	
	static void policy_handler_log_bottom(String methodName)
	{
		
		msg_trace "|  |  |__ policy_handler_log_bottom"
		msg "|  |  |__ policy_handler_log_bottom --- [${methodName}] --- "
	}
}
