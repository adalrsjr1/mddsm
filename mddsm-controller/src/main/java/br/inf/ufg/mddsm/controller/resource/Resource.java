package br.inf.ufg.mddsm.controller.resource;

import br.inf.ufg.mddsm.controller.manager.SignalInstance;
import br.inf.ufg.mddsm.controller.policy.metadata.Metadata;

public interface Resource extends Touchpoint, Executable {
    void enqueue(SignalInstance signal);    
    public String getName();
    public Metadata getMetadata();
}
