package br.inf.ufg.mddsm.controller.emf


import base.Handler
import base.common.*
import br.inf.ufg.mddsm.controller.manager.SignalHandler
import br.inf.ufg.mddsm.controller.manager.SignalHandlerManager
import br.inf.ufg.mddsm.controller.manager.actions.ActionCaller
import br.inf.ufg.mddsm.controller.manager.actions.ActionInstance
import br.inf.ufg.mddsm.controller.manager.actions.ActionSignalHandler
import br.inf.ufg.mddsm.controller.manager.actions.CallActionInstance
import br.inf.ufg.mddsm.controller.manager.actions.SequenceActionInstance

class HandlerFactory {
    public SignalHandlerManager createSignalHandlerManager(Collection<Handler> handlers) {
        SignalHandlerManager manager = new SignalHandlerManager()
	
		
        handlers.findAll { it.enabled }.each { Handler handler ->
            manager.register(createSignalHandler(handler))
        }

        manager
    }

    public SignalHandler createSignalHandler(Handler handler) {
        ActionCaller action = createActionCaller(handler.action)

        action ? new ActionSignalHandler(handler.signal, action) : null
    }

    private ActionInstance createActionInstance(Action action) {
        null
    }

    private ActionInstance createActionInstance(MacroAction action) {
		Class.forName(action.impl).getConstructor().newInstance()
    }

    private ActionInstance createActionInstance(EnqueueCall action) {
        new CallActionInstance(action)
    }

    private ActionInstance createActionInstance(SequenceAction action) {
        def callers = action.children.collect { ActionExecution execution ->
            createActionCaller(execution)
        }

        new SequenceActionInstance(callers)
    }

    public ActionCaller createActionCaller(ActionExecution action) {
        ActionInstance instance = createActionInstance(action.action)
        instance ? new ActionCaller(action, instance) : null
    }

}
