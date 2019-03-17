package br.inf.ufg.mddsm.broker.resource;

import br.inf.ufg.mddsm.broker.manager.SignalInstance;
import br.inf.ufg.mddsm.broker.policy.metadata.Metadata;

public interface Resource extends Touchpoint, Executable {
    void enqueue(SignalInstance signal);    
    public String getName();
    public Metadata getMetadata();
}
