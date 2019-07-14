package br.inf.ufg.mddsm.controller.tests

import br.inf.ufg.mddsm.controller.manager.MainManager
import br.inf.ufg.mddsm.controller.script.Command
import br.inf.ufg.mddsm.controller.script.ControlScript

class TestScriptProcessor{
	
	private static MainManager mainManager
	private static ControlScript script
	private static Command command
	
	public static void main(String[] args) {
		
		mainManager = new MainManager()
		
		
						
		mainManager.process(script);
				
	}
	
}