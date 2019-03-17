package br.inf.ufg.mddsm.broker.resource.bridge;

import br.inf.ufg.mddsm.broker.manager.MainManager;

public interface IBroker {
	/**
	 * Get the main manager to be used in the BrokerManagerResource
	 * @return
	 */
	public MainManager getMainManager();
}
