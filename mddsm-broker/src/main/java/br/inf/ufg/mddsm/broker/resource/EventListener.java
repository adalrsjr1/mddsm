package br.inf.ufg.mddsm.broker.resource;

import br.inf.ufg.mddsm.broker.adapters.EventException;
import br.inf.ufg.mddsm.broker.manager.SignalInstance;

public interface EventListener {
    public void notify(SignalInstance event);
    public void throwEvent(SignalInstance event) throws EventException;
}
