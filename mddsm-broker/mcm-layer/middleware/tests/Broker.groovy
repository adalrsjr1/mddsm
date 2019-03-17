package middleware.tests;

import base.Manager;
import broker.managers.MHB_TopManager
import br.inf.ufg.mddsm.broker.emf.EMFLoader;
import br.inf.ufg.mddsm.broker.emf.ManagerFactory
import br.inf.ufg.mddsm.broker.handlers.EventManager
import br.inf.ufg.mddsm.broker.manager.MainManager;
import br.inf.ufg.mddsm.broker.manager.SignalInstance;
import br.inf.ufg.mddsm.broker.model.UsesEventListener
import br.inf.ufg.mddsm.broker.resource.ResourceManager;

class Broker implements UsesEventListener {
	private EventManager eventManager;
	private MainManager mainManager;
	private ResourceManager resourceManager;
	private MHB_TopManager centralManager;
	
	public Broker(){
		init();
	}
	
	public void init(){
		Manager managerDef = EMFLoader.loadFirst("mhb/ManagerTopMHB", Manager);
		eventManager = new EventManager();
		eventManager.addUpListener(this);
		mainManager = new ManagerFactory().createManager(managerDef);
		mainManager.setEventListener(eventManager);
		resourceManager = mainManager.resourceManager;
		mainManager.start();
		centralManager = new MHB_TopManager(mainManager);
	}
	
	public MHB_TopManager getManager(){
		return centralManager;
	}
	
	@Override
	public void use(SignalInstance event) {
		System.out.println("New broker event: "+event.toString());
	}
	
	
}
