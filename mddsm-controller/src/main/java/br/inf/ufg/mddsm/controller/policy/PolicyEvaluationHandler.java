package br.inf.ufg.mddsm.controller.policy;


import br.inf.ufg.mddsm.controller.manager.ManagerContext;
import br.inf.ufg.mddsm.controller.resource.Resource;

public interface PolicyEvaluationHandler {
    public void handleResource(PolicyRequest request, ManagerContext ctx, Resource selected);
}
