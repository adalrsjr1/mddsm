package broker.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import types.ChargeEnum;
import types.ControlEnum;
import types.CriticalEnum;
import types.SourceEnum;
import types.TypeEnum;
import types.UsageEnum;

import asg.cliche.InputConverter;
import asg.cliche.ShellFactory;
import broker.physical.MGPlant;
import broker.util.Terminal;

public class MGridVM {
	public static String centralBrkr = "emf/mhb/ManagerTopMHB";
	public static String localBrkr = "emf/mhb/ManagerBottomMHB";
	public static boolean bench = false;
	
	Terminal t;
	
	public Middleware createMw()
	{
		TopBroker broker = new TopBroker();
		broker.init();
		
		Middleware mw = new Middleware(broker);
//		MiddlewareUserInterface mwg = new MiddlewareUserInterface(mw);
		broker.setUpListener(mw);
		t = new Terminal("MHB",broker);
		//broker.islandingTest();
		
//		mw.showHierarchy(broker);
		t.showHierarchy();
		return mw;
	}
	
	public static void main (String[] args) throws IOException
	{
		
		MGridVM mgridVM = new MGridVM();
		Middleware mw = mgridVM.createMw();
		
		ShellFactory.createConsoleShell("MGridVM", "", mw.mhb)
			.commandLoop();
	
	}

	
	
}
