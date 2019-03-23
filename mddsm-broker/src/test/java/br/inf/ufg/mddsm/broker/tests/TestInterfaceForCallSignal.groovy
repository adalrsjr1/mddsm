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
import br.inf.ufg.mddsm.broker.manager.SignalInstance
import br.inf.ufg.mddsm.broker.manager.actions.MacroActionInstance
import br.inf.ufg.mddsm.broker.resource.EventListener
import br.inf.ufg.mddsm.broker.resource.ResourceManager
import groovy.util.logging.Log4j2

@Log4j2
class TestCall implements MacroActionInstance {

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		log.info "Executing TestAction with params: ${params}"
		log.info "Sending event"
		ctx.mainManager.sendEvent(new SignalInstance("testEvent", ["callReturn": params]))
		return new Object()
	}

}

@Log4j2
class ManagerFacadeForTest extends ManagerFacade implements EventListener {

	@Delegate
	EventListener listener = [notify: { SignalInstance event ->
			log.info "notification: {}", event
			assert "testEvent" == event.name
			assert [callReturn: [expressionArg:42, valueArg:"string"], source:null, name:"testEvent"] == event.params
		}] as EventListener

	public ManagerFacadeForTest(MainManager manager) {
		super(manager)
	}

	def testCall(def callArg) {
		enqueue(new SignalInstance("testCall", ["valueArg":"string"]))
		Thread.sleep(10000)
	}

}

class TestInterfaceForCallSignal {

	static EventManager eventManager
	static MainManager mainManager
	static ResourceManager resourceManager

	static ManagerFacadeForTest facade

	@BeforeAll
	static void setup() {

		Manager managerDef = EMFLoader.loadFirst("TestInterfaceForCallSignal.xmi", Manager)
		eventManager = new EventManager()
		mainManager = new ManagerFactory().createManager(managerDef)
		resourceManager = mainManager.resourceManager

		facade = new ManagerFacadeForTest(mainManager)
		mainManager.setEventListener(facade)

		mainManager.start()

	}

	@AfterAll
	static void tearDown() {
		mainManager.stop()
	}

	@Test
	void test() {
		facade.testCall(new Object())
	}

}
