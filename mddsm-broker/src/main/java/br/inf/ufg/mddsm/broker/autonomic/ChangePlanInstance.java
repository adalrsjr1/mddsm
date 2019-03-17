package br.inf.ufg.mddsm.broker.autonomic;

import base.autonomic.ChangePlan;
import base.common.ActionExecution;
import br.inf.ufg.mddsm.broker.expression.ContextProvider;

import java.util.LinkedHashMap;
import java.util.Map;


public class ChangePlanInstance implements ContextProvider {
    private ChangePlan plan;
    private ChangeRequestInstance request;

    public ChangePlanInstance(ChangePlan plan, ChangeRequestInstance request) {
        this.plan = plan;
        this.request = request;
    }

    public ActionExecution getAction() {
        return plan.getAction();
    }

    public Map<String, Object> getParams() {
        return request.getParams();
    }


    public Object getVariable(String name) {
        return getParams().get(name);
    }
}
