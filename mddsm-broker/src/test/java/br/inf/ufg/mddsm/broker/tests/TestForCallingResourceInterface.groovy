package br.inf.ufg.mddsm.broker.tests

import static org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

import base.Manager
import br.inf.ufg.mddsm.broker.adapters.Call
import br.inf.ufg.mddsm.broker.adapters.Event
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
import br.inf.ufg.mddsm.broker.resource.bridge.ManagedResource
import groovy.util.logging.Log4j2

@Log4j2
class TestResourceImpl implements Manageable {
	private EventNotifier eventNotifier
	private ManagedResource resource
	
	@Call(name="resourceCall", parameters=["resoruceValueArg"])
	def resourceCall(def valueArg) {
		log.info "Executing call into resource with valueArg={} and expressionArg={}", valueArg, expressionArg
		return "TestForCallingResourceInterface"
	}

	@Override
	public void setEventNotifier(EventNotifier eventNotfier) {
		this.eventNotifier = eventNotfier	
	}
	
	public void notify(Event e) {
		eventNotifier.notify(e)
	}
}

@Log4j2
class TestCall2 implements MacroActionInstance {

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		log.info "Executing TestAction with params: ${params}"
		
//		ctx.mainManager.execute(new SignalInstance("ResourceCall", [valueArg:"valueArg", expressionArg:"expressionArg"]))
		log.info "Sending event"
		
		ctx.mainManager.sendEvent((new SignalInstance("testEvent", ["callReturn": params])))
		return new Object()
	}
	
}

@Log4j2
class ManagerFacadeForTest2 extends ManagerFacade implements EventListener {

	@Delegate
	EventListener listener = [notify: { SignalInstance event ->
			log.info "notification: {}", event
//			assert "testEvent" == event.name
//			assert [callReturn: [expressionArg:42, valueArg:"string"], source:null, name:"testEvent"] == event.params
		}] as EventListener

	public ManagerFacadeForTest2(MainManager manager) {
		super(manager)
	}

	def testCall(def callArg) {
		enqueue(new SignalInstance("testCall", ["valueArg":"string"]))
	}

}

class TestForCallingResourceInterface {

	static EventManager eventManager
	static MainManager mainManager
	static ResourceManager resourceManager

	static ManagerFacadeForTest2 facade

	@BeforeAll
	static void setup() {

		Manager managerDef = EMFLoader.loadFirst("TestForCallingResourceInterface.xmi", Manager)
		eventManager = new EventManager()
		mainManager = new ManagerFactory().createManager(managerDef)
		resourceManager = mainManager.resourceManager

		facade = new ManagerFacadeForTest2(mainManager)
		mainManager.setEventListener(facade)

		mainManager.start()

	}

	@AfterAll
	static void tearDown() {
		Thread.sleep(1000*60*60*60)
		mainManager.stop()
	}

	@Test
	void test() {
		facade.testCall(new Object())
	}

}
