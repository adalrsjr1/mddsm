package br.inf.ufg.mddsm.controller.resource.bridge;

import br.inf.ufg.mddsm.controller.manager.MainManager;

public interface IBroker {
	/**
	 * Get the main manager to be used in the BrokerManagerResource
	 * @return
	 */
	public MainManager getMainManager();
}
