package br.inf.ufg.mddsm.controller.script;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.compare.Diff;

public class ScriptInterpreter_old {

	private List<Diff> diffs;
	private ControlScript script;
	
	public ScriptInterpreter_old() {
		
	}
	
	public void interpreter(ControlScript script) {
		
		List commands = extractCommand();
		
		ScriptProcessor processor = new ScriptProcessor();
	}
	
	public List<String> extractCommand() {
		
		List<String> commands = new LinkedList<String>();
		
		//Not implemented yet
		
		
		
		return commands;
		
	}
	
	
	
}
