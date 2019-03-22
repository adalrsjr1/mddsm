package br.inf.ufg.mddsm.broker.tests

import static org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

import base.Manager
import br.inf.ufg.mddsm.broker.emf.EMFLoader
import br.inf.ufg.mddsm.broker.emf.ManagerFactory
import br.inf.ufg.mddsm.broker.handlers.EventManager
import br.inf.ufg.mddsm.broker.manager.MainManager
import br.inf.ufg.mddsm.broker.manager.ManagerContext
import br.inf.ufg.mddsm.broker.manager.actions.MacroActionInstance
import br.inf.ufg.mddsm.broker.resource.ResourceManager

class TestAction implements MacroActionInstance {

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		return null;
	}
	
}

class TestHelloWorld {

	static EventManager eventManager
	static MainManager mainManager
	static ResourceManager resourceManager
	
	@BeforeAll
	static void setup() {
		
		Manager managerDef = EMFLoader.loadFirst("hello.xmi", Manager)
		eventManager = new EventManager()
		mainManager = new ManagerFactory().createManager(managerDef)
		resourceManager = mainManager.resourceManager
		
		mainManager.start()
		
	}
	
	@AfterAll
	static void tearDown() {
		mainManager.stop()
	}
	
	@Test
	void test() {
		fail("Not yet implemented")
	}

}
