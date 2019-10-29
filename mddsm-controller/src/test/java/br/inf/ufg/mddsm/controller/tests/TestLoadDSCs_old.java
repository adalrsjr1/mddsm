package br.inf.ufg.mddsm.controller.tests;

import org.eclipse.emf.ecore.resource.Resource;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import base.Manager;
import br.inf.ufg.mddsm.controller.emf.EMFLoader;
import br.inf.ufg.mddsm.controller.emf.EmfModelHandler;
import br.inf.ufg.mddsm.controller.emf.ManagerFactory;
import br.inf.ufg.mddsm.controller.emf.ModelHandler;
import br.inf.ufg.mddsm.controller.handlers.EventManager;
import br.inf.ufg.mddsm.controller.manager.MainManager;
import br.inf.ufg.mddsm.controller.manager.ManagerFacade;
import br.inf.ufg.mddsm.controller.resource.ResourceManager;



public class TestLoadDSCs_old {
	
	static EventManager eventManager;
	static MainManager mainManager;
	static ResourceManager resourceManager;
	
	@BeforeAll
	public static void main(String[] args) {
		System.out.println("running ...");
		Manager managerDef = EMFLoader.loadFirst("dsk-comm.xmi", Manager.class);
		eventManager = new EventManager();
		mainManager = new ManagerFactory().createManager(managerDef);
		resourceManager = mainManager.getResourceManager();
		
		mainManager.start();
		test();
		
		String model = "dsk-comm.xmi";
		
		ModelHandler modelHandler = new EmfModelHandler();
		
		//def resOldModel = modelHandler.load(model.toURI(), TestingPackage.eNS_URI, TestingPackage.eINSTANCE);
		/*
		Resource resource = EMFLoader.loadResource("dsk-comm.xmi");
		int i =0;*/
		
		System.out.println("running ...");
		/*
		while(i<resource.getContents().size()) {
			
			System.out.println(resource.getContents().get(i).toString());
			
			i++;
		}*/
		
		
		
		
	}
	
	@AfterAll
	static void tearDown() {
		mainManager.stop();
	}
	
	@Test
	static void test() {
		TestFrontEnd frontend = new TestFrontEnd(mainManager);
		frontend.testCall(new Object());
	}

}

/*public class TestFrontEnd extends ManagerFacade {
	public TestFrontEnd(MainManager manager) {
		super(manager);
	}
	
	void testCall(Object arg) {
		//enqueue("testAction", ["arg":arg])
	}
}*/
