package br.inf.ufg.mddsm.broker.expression

import base.common.Binding
import base.common.Bindable
import base.common.Signal
import base.context.State
import br.inf.ufg.mddsm.broker.manager.ManagerContext
import br.inf.ufg.mddsm.broker.manager.SignalInstance
import br.inf.ufg.mddsm.broker.state.StateHolder

class ContextBinder {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ContextBinder.class);
    ManagerContext manager
    SignalLogger signalLogger

    public ContextBinder(ManagerContext manager, SignalLogger signalLogger) {
		log.trace("new ContextBinder(manager:{}, signalLogger:{})", manager, signalLogger)
        this.manager = manager;
        this.signalLogger = signalLogger;
    }

    public Map<String, Collection<ContextProvider>> getBindings(Collection<Binding> bindings) {
		log.trace("getBindings(bindings:{})", bindings)
        Map<String, Collection<ContextProvider>> context = new LinkedHashMap<String, Collection<ContextProvider>>()

        for (Binding binding: bindings) {
            Collection<ContextProvider> values = getBindable(binding.getBindable())
            context.put(binding.getName(), values)
        }
		log.trace("getBindings() = {}", context)
        return context
    }

    public Collection<ContextProvider> getBindable(Bindable bindable) {
        doGetBindable(bindable)
    }

    private Collection<ContextProvider> doGetBindable(Bindable bindable) {
        []
    }

    private Collection<ContextProvider> doGetBindable(State bindable) {
		log.trace("doGetBindable(bindable:{})", bindable)
        Collection<ContextProvider> result = new LinkedHashSet<ContextProvider>();
        for (StateHolder holder: manager.getStateManager().getType(bindable).getAll()) {
            result.add(holder);
        }
		log.trace("doGetBindable() = {}", bindable)
        return result;
    }

    private Collection<ContextProvider> doGetBindable(Signal bindable) {
		log.trace("doGetBindable(bindable:{})", bindable)
        Collection<ContextProvider> result = new LinkedHashSet<ContextProvider>();
        for (SignalInstance instance : signalLogger.getSignalInstances(bindable.getName())) {
          result.add(instance);
        }
		log.trace("doGetBindable() = {}", bindable)
        return result;
    }
}
