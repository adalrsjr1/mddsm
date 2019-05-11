package middleware.actions.sm;

import java.util.Map;

import middleware.managers.MCommandExecutor;
import middleware.managers.MScriptManager;
import middleware.reflection.Reflection;
import middleware.tests.MwCommandExecutor;
import middleware.tests.MwScriptManager;
import middleware.util.CommandTokenizer;

import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.SignalInstance;
import br.inf.ufg.mddsm.broker.manager.actions.MacroActionInstance;
import br.inf.ufg.mddsm.broker.state.StateHolder;
import br.inf.ufg.mddsm.broker.state.StateTypeManager;

public class ProcessScript implements MacroActionInstance {

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		Object id = "SMS01";
		//StateTypeManager stateManager = ctx.getStateManager().getType("ScriptManagerState");
		//StateHolder state;
		//if(!stateManager.exists(id)){
		//	state = stateManager.create(id);
			//MwCommandExecutor mwCommandExecutor = new MwCommandExecutor();
			//state.set("commandExecutor", mwCommandExecutor.getManager());
		//}
		
		//state = stateManager.get(id);
		//MCommandExecutor commandExecutor = (MCommandExecutor)state.get("commandExecutor");
		
		CommandTokenizer cmdTkn = new CommandTokenizer();
		
		//Reflection reflection = new Reflection();
		CommandSelector cmdSelector = new CommandSelector(MwScriptManager.getManager());
		String[] cmdLines = cmdTkn.getCommandLines((String)params.get("aScript"));
		for(int i=0; i<cmdLines.length; i++){
			Reflection.runMethod(cmdSelector, cmdTkn.getCommandParams(cmdLines[i]));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		/*
		String[] cmdParams = cmdTkn.getCommandParam((String)params.get("script"));
		commandExecutor.initializeMGrid(cmdParams[1]);
		*/
		ctx.getMainManager().sendEvent(new SignalInstance("ack"));
		return null;
		
	}
	
}
