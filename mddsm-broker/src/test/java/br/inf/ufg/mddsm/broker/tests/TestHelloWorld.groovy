package br.inf.ufg.mddsm.broker.tests

import static org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

import base.Manager
import br.inf.ufg.mddsm.broker.adapters.Call
import br.inf.ufg.mddsm.broker.adapters.EventNotifier
import br.inf.ufg.mddsm.broker.adapters.Manageable
import br.inf.ufg.mddsm.broker.emf.EMFLoader
import br.inf.ufg.mddsm.broker.emf.ManagerFactory
import br.inf.ufg.mddsm.broker.handlers.EventManager
import br.inf.ufg.mddsm.broker.manager.MainManager
import br.inf.ufg.mddsm.broker.manager.ManagerContext
import br.inf.ufg.mddsm.broker.manager.ManagerFacade
import br.inf.ufg.mddsm.broker.manager.actions.MacroActionInstance
import br.inf.ufg.mddsm.broker.resource.ResourceManager
import groovy.util.logging.Log4j2

@Log4j2
class TestAction implements MacroActionInstance {

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		log.info "Executing TestAction with params: ${params}"
		return new Object();
	}
	
}

interface TestHelloAdapter {
	Object testCallAdapter(Object arg)
}

@Log4j2
class TestHelloAdapterImpl implements TestHelloAdapter, Manageable {

	@Override
	public void setEventNotifier(EventNotifier eventListener) {
	}

	@Override
	@Call(name="testCallAdapter", parameters=["arg"])
	public Object testCallAdapter(Object arg) {
		log.info "Executing testCallAdapter with params: ${param}"
		return new Object()
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
		TestFrontEnd frontend = new TestFrontEnd(mainManager)
		frontend.testCall(new Object())
	}

}

class TestFrontEnd extends ManagerFacade {
	public TestFrontEnd(MainManager manager) {
		super(manager)
	}
	
	def testCall(def arg) {
		enqueue("testAction", ["arg":arg])
	}
}
