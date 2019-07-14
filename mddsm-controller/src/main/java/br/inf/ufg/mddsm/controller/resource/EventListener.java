package br.inf.ufg.mddsm.controller.resource;

import br.inf.ufg.mddsm.controller.adapters.EventException;
import br.inf.ufg.mddsm.controller.manager.SignalInstance;

public interface EventListener {
    public void notify(SignalInstance event);
    public void throwEvent(SignalInstance event) throws EventException;
}
