package br.inf.ufg.mddsm.controller.manager;

import br.inf.ufg.mddsm.controller.resource.ResourceManager;
import br.inf.ufg.mddsm.controller.state.StateManager;


public interface ManagerContext {
    public StateManager getStateManager();

    public MainManager getMainManager();

    public ResourceManager getResourceManager();
}
