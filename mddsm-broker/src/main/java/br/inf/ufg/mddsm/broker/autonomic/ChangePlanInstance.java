package br.inf.ufg.mddsm.broker.autonomic;

import base.autonomic.ChangePlan;
import base.common.ActionExecution;
import br.inf.ufg.mddsm.broker.expression.ContextProvider;

import java.util.LinkedHashMap;
import java.util.Map;


public class ChangePlanInstance implements ContextProvider {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ChangePlanInstance.class);
    private ChangePlan plan;
    private ChangeRequestInstance request;

    public ChangePlanInstance(ChangePlan plan, ChangeRequestInstance request) {
    	log.trace("new ChangePlanInstance(plan:{}, request:{})", plan, request);
        this.plan = plan;
        this.request = request;
    }

    public ActionExecution getAction() {
    	ActionExecution action = plan.getAction();
    	log.trace("getAction() = {}", action);
        return action;
    }

    public Map<String, Object> getParams() {
    	Map<String, Object> params = request.getParams();
    	log.trace("getParams() = {}", params);
        return params;
    }


    public Object getVariable(String name) {
    	Object variable = getParams().get(name);
    	log.trace("getVariable() = {}", variable);
        return variable;
    }
}
