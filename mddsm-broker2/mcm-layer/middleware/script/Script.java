package middleware.script;

import java.util.LinkedList;

import middleware.util.CommandTokenizer;

public class Script {

	private LinkedList<Command> cmds = new LinkedList<Command>();
	public Script(String script){
		CommandTokenizer cmdTkn = new CommandTokenizer();
		String[] lines = cmdTkn.getCommandLines(script);
		for(int i=0; i<lines.length;i++){
			cmds.add(new Command(lines[i]));
		}
	}
	
	public int getScriptSize(){
		return cmds.size();
	}
	
}
