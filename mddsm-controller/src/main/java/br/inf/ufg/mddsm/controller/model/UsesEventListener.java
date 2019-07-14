package br.inf.ufg.mddsm.controller.model;


import java.util.EventListener;

import br.inf.ufg.mddsm.controller.manager.SignalInstance;


/**
 * Listener interface for up calls for module
 * A contract between a UCIDownEvent source and listener classes.
 */
public interface UsesEventListener extends EventListener {
	public void use(SignalInstance event);
}