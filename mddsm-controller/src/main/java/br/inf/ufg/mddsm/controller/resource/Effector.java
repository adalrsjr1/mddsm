package br.inf.ufg.mddsm.controller.resource;

import base.common.Signal;
import br.inf.ufg.mddsm.controller.manager.SignalInstance;

public interface Effector {
    Object execute(SignalInstance signal);
}
