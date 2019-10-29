package br.inf.ufg.mddsm.controller.manager.actions;

import java.util.Map;

import br.inf.ufg.mddsm.controller.manager.ManagerContext;

public interface MacroActionInstance extends ActionInstance {
    Object execute(ManagerContext ctx, Map<String, Object> params);
}
