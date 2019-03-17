package br.inf.ufg.mddsm.broker.expression;

import java.util.Collection;

import br.inf.ufg.mddsm.broker.manager.SignalInstance;

public interface SignalLogger {
    public Collection<SignalInstance> getSignalInstances(String name);
}
