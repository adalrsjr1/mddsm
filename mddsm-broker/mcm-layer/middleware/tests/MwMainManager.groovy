package middleware.tests;

import base.Manager;
import broker.managers.MHB_TopManager;
import br.inf.ufg.mddsm.broker.emf.EMFLoader;
import br.inf.ufg.mddsm.broker.emf.ManagerFactory;
import br.inf.ufg.mddsm.broker.handlers.EventManager
import br.inf.ufg.mddsm.broker.manager.MainManager;
import br.inf.ufg.mddsm.broker.manager.SignalInstance;
import br.inf.ufg.mddsm.broker.model.UsesEventListener
import br.inf.ufg.mddsm.broker.resource.ResourceManager;
import middleware.managers.MMainManager


public class MwMainManager implements UsesEventListener {

	private EventManager eventManager;
	private MainManager mainManager;
	private ResourceManager resourceManager;
	private MMainManager manager;
	private MwScriptManager scriptManager;
	
	public MwMainManager(){
		init();
	}
	
	/*
	public static void main(String[] args) {
		Middleware test = new Middleware();
		test.init();
	}
	*/
	
	
	public void init(){
		Manager managerDef = EMFLoader.loadFirst("mcm/MMainManager_model_1", Manager);
		eventManager = new EventManager();
		eventManager.addUpListener(this);
		mainManager = new ManagerFactory().createManager(managerDef);
		mainManager.setEventListener(eventManager);
		resourceManager = mainManager.resourceManager;
		//mainManager.start();
		manager = new MMainManager(mainManager);
		//scriptManager = new MwScriptManager();
	}
	
	public MMainManager getManager(){
		return manager;
	}
	
	public void setUpListener(UsesEventListener listener)
	{
		eventManager.addUpListener(listener);
	}
	
	
	@Override
	public void use(SignalInstance event) {
		System.out.println("Signal from MainManager: " + event.toString());
	}

	public Object dispatchScript(String script) {
		return manager.dispatchScript(script);
	}

}