package br.inf.ufg.mddsm.controller.expression

import base.common.Binding
import base.common.Bindable
import base.common.Signal
import base.context.State
import br.inf.ufg.mddsm.controller.manager.ManagerContext
import br.inf.ufg.mddsm.controller.manager.SignalInstance
import br.inf.ufg.mddsm.controller.state.StateHolder

class ContextBinder {
    ManagerContext manager
    SignalLogger signalLogger

    public ContextBinder(ManagerContext manager, SignalLogger signalLogger) {
        this.manager = manager;
        this.signalLogger = signalLogger;
    }

    public Map<String, Collection<ContextProvider>> getBindings(Collection<Binding> bindings) {
        Map<String, Collection<ContextProvider>> context = new LinkedHashMap<String, Collection<ContextProvider>>()

        for (Binding binding: bindings) {
            Collection<ContextProvider> values = getBindable(binding.getBindable())
            context.put(binding.getName(), values)
        }

        return context
    }

    public Collection<ContextProvider> getBindable(Bindable bindable) {
        doGetBindable(bindable)
    }

    private Collection<ContextProvider> doGetBindable(Bindable bindable) {
        []
    }

    private Collection<ContextProvider> doGetBindable(State bindable) {
        Collection<ContextProvider> result = new LinkedHashSet<ContextProvider>();
        for (StateHolder holder: manager.getStateManager().getType(bindable).getAll()) {
            result.add(holder);
        }
        return result;
    }

    private Collection<ContextProvider> doGetBindable(Signal bindable) {
        Collection<ContextProvider> result = new LinkedHashSet<ContextProvider>();
        for (SignalInstance instance : signalLogger.getSignalInstances(bindable.getName())) {
          result.add(instance);
        }

        return result;
    }
}
