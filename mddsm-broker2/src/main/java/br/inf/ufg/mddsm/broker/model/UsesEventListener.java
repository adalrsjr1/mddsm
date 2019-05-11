package br.inf.ufg.mddsm.broker.model;


import java.util.EventListener;

import br.inf.ufg.mddsm.broker.manager.SignalInstance;


/**
 * Listener interface for up calls for module
 * A contract between a UCIDownEvent source and listener classes.
 */
public interface UsesEventListener extends EventListener {
	public void use(SignalInstance event);
}