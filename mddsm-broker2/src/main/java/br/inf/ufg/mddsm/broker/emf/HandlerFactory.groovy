package br.inf.ufg.mddsm.broker.emf


import base.Handler
import base.common.*
import br.inf.ufg.mddsm.broker.manager.SignalHandler
import br.inf.ufg.mddsm.broker.manager.SignalHandlerManager
import br.inf.ufg.mddsm.broker.manager.actions.ActionCaller
import br.inf.ufg.mddsm.broker.manager.actions.ActionInstance
import br.inf.ufg.mddsm.broker.manager.actions.ActionSignalHandler
import br.inf.ufg.mddsm.broker.manager.actions.CallActionInstance
import br.inf.ufg.mddsm.broker.manager.actions.SequenceActionInstance

class HandlerFactory {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(HandlerFactory.class);
	
    public SignalHandlerManager createSignalHandlerManager(Collection<Handler> handlers) {
		log.trace("createSignalHandlerManager(handlers:{})", handlers)
        SignalHandlerManager manager = new SignalHandlerManager()
	
        handlers.findAll { it.enabled }.each { Handler handler ->
            manager.register(createSignalHandler(handler))
        }
		log.trace("createSignalHandlerManager() = {}", manager)
        manager
    }

    public SignalHandler createSignalHandler(Handler handler) {
		log.trace("createSignalHandlerManager(handler:{})", handler)
        ActionCaller action = createActionCaller(handler.action)

        def signalHandler = action ? new ActionSignalHandler(handler.signal, action) : null
		log.trace("createSignalHandlerManager() = {}", signalHandler)
		return signalHandler
    }

    private ActionInstance createActionInstance(Action action) {
		log.trace("createActionInstance(action:{}) = null", action)
        null
    }

    private ActionInstance createActionInstance(MacroAction action) {
		log.trace("createActionInstance(action:{})", action)
		def actionInstance = Class.forName(action.impl).getConstructor().newInstance()
		log.trace("createActionInstance() = {}", actionInstance)
		return actionInstance
    }

    private ActionInstance createActionInstance(EnqueueCall action) {
		log.trace("createActionInstance(action:{}) = null", action)
        def actionInstance = new CallActionInstance(action)
		log.trace("createActionInstance() = {}", actionInstance)
		return actionInstance
    }

    private ActionInstance createActionInstance(SequenceAction action) {
		log.trace("createActionInstance(action:{})", action)
        def callers = action.children.collect { ActionExecution execution ->
            createActionCaller(execution)
        }

        def actionInstance = new SequenceActionInstance(callers)
		log.trace("createActionInstance() = {}", actionInstance)
		return actionInstance
    }

    public ActionCaller createActionCaller(ActionExecution action) {
		log.trace("createActionInstance(action:{})", action)
        ActionInstance instance = createActionInstance(action.action)
        def actionInstance = instance ? new ActionCaller(action, instance) : null
		log.trace("createActionInstance() = {}", actionInstance)
		return actionInstance
    }

}
