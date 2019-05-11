package middleware.tests

import base.Manager;
import br.inf.ufg.mddsm.broker.emf.EMFLoader;
import br.inf.ufg.mddsm.broker.emf.ManagerFactory;
import br.inf.ufg.mddsm.broker.handlers.EventManager
import br.inf.ufg.mddsm.broker.manager.MainManager;
import br.inf.ufg.mddsm.broker.manager.SignalInstance;
import br.inf.ufg.mddsm.broker.model.UsesEventListener
import br.inf.ufg.mddsm.broker.resource.ResourceManager;
import br.inf.ufg.mddsm.broker.state.StateHolder;
import middleware.managers.MScriptManager


class MwScriptManager implements UsesEventListener{
	private EventManager eventManager;
	private MainManager mainManager;
	private ResourceManager resourceManager;
	private static MScriptManager manager;
	private MwCommandExecutor managerCmdExe;
	
	public MwScriptManager (){
		init();
	}
	
	public void init(){
		Manager managerDef = EMFLoader.loadFirst("mcm/MScriptManager_model_1", Manager);
		eventManager = new EventManager();
		eventManager.addUpListener(this);
		mainManager = new ManagerFactory().createManager(managerDef);
		mainManager.setEventListener(eventManager);
		resourceManager = mainManager.resourceManager;
		//mainManager.start();
		manager = new MScriptManager(mainManager);
	}
	
	public static MScriptManager getManager(){
		return manager;
	}

	@Override
	public void use(SignalInstance event) {
		System.out.println("New ScriptManager event: "+event.toString());
	}
}
