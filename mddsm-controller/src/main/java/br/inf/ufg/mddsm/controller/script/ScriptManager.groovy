package br.inf.ufg.mddsm.controller.script

import br.inf.ufg.mddsm.controller.manager.SignalInstance

class ScriptManager{
	
	public void process(ControlScript script) {
		new ScriptInterpreter_old();
		new ScriptProcessor();	
	}
	
}