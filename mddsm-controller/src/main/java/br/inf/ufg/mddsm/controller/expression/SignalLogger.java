package br.inf.ufg.mddsm.controller.expression;

import java.util.Collection;

import br.inf.ufg.mddsm.controller.manager.SignalInstance;

public interface SignalLogger {
    public Collection<SignalInstance> getSignalInstances(String name);
}
