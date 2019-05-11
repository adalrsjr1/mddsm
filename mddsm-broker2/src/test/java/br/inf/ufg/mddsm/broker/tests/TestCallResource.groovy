package br.inf.ufg.mddsm.broker.tests

import base.Manager
import base.PolicyManager
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
import br.inf.ufg.mddsm.broker.model.UsesEventListener
import br.inf.ufg.mddsm.broker.policy.PolicyEvaluationHandler
import br.inf.ufg.mddsm.broker.policy.PolicyRequest
import br.inf.ufg.mddsm.broker.resource.EventListener
import br.inf.ufg.mddsm.broker.resource.Resource
import br.inf.ufg.mddsm.broker.resource.ResourceManager
import groovy.util.logging.Log4j2

class TestCallResource extends GroovyTestCase {
    static EventManager eventManager
    static MainManager mainManager
    static ResourceManager resourceManager
    static PolicyManager policyManager
    static ResourceSelectionManagerFacade facade

	public static void main(String[] args) {
		def instance = new TestCallResource()
		instance.setUp()
		instance.test()
		instance.tearDown()
	}
	
    void setUp() {
		
        Manager managerDef = EMFLoader.loadFirst("TestResourceSelection.xmi", Manager)
        eventManager = new EventManager()
        mainManager = new ManagerFactory().createManager(managerDef)
        resourceManager = mainManager.resourceManager

        facade = new ResourceSelectionManagerFacade(mainManager)
        mainManager.setEventListener(facade)

        mainManager.start()

    }
	
	void tearDown() {
		mainManager.stop()
	}

    void test() {
        def facade = new ResourceSelectionManagerFacade(mainManager)

        facade.testCall("resource2")
    }
}

@Log4j2
class ResourceSelectionManagerFacade extends ManagerFacade implements EventListener {

    @Delegate
    EventListener listener = [notify: { SignalInstance event ->
        log.info "notification: {}", event
    }] as EventListener

    public ResourceSelectionManagerFacade(MainManager manager) {
        super(manager)
    }

    def testCall(def name) {
        enqueue(new SignalInstance("selects", ["resourceName":name, "args":"method_parameters"]))
    }

}

class Resource1 implements Manageable, UsesEventListener {
    private EventNotifier eventListener

    @Override
    void use(SignalInstance event) {
        eventListener.notify(event)
    }

    @Call(name="callResource", parameters = ["args"])
    def callResource(def args) {
        println "resource1: $args"
    }

    @Override
    void setEventNotifier(EventNotifier eventListener) {
        this.eventListener = eventListener
    }
}

class Resource2 implements Manageable, UsesEventListener {

    private EventNotifier eventListener

    @Override
    void use(SignalInstance event) {
        eventListener.notify(event)
    }

    @Call(name="callResource", parameters = ["args"])
    def callResource(def args) {
        println "resource2: $args"
    }

    @Override
    void setEventNotifier(EventNotifier eventListener) {
        this.eventListener = eventListener
    }
}

class ResourceSelectionHandler implements PolicyEvaluationHandler {

    @Override
    void handleResource(PolicyRequest request, ManagerContext ctx, Resource selected) {
//		selected.enqueue(new SignalInstance("callResource", request.params))
		println ctx.dump()
        println request.dump()
        println ">>> [${selected.name}]:${selected.metadata.dump()}]"
    }
}