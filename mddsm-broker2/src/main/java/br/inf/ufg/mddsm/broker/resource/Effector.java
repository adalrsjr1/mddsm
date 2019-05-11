package br.inf.ufg.mddsm.broker.resource;

import base.common.Signal;
import br.inf.ufg.mddsm.broker.manager.SignalInstance;

public interface Effector {
    Object execute(SignalInstance signal);
}
