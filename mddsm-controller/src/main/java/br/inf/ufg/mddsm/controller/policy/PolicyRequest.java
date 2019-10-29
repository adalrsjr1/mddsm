package br.inf.ufg.mddsm.controller.policy;

import base.policy.PolicyEvaluation;
import base.policy.PolicyEvaluationRequest;
import br.inf.ufg.mddsm.controller.expression.ContextProvider;
import br.inf.ufg.mddsm.controller.expression.ValueEvaluator;
import br.inf.ufg.mddsm.controller.manager.ManagerContext;
import br.inf.ufg.mddsm.controller.resource.Resource;

import java.util.Map;

public class PolicyRequest implements ContextProvider {
    private PolicyEvaluationRequest request;
    private Map<String, Object> params;
    private ValueEvaluator evaluator;

    public PolicyRequest(PolicyEvaluationRequest request, Map<String, Object> params, ValueEvaluator eval) {
        this.request = request;
        this.params = params;
        this.evaluator = eval;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public Object getVariable(String name) {
        return getParams().get(name);
    }

    public PolicyContext getPolicyContext() {
        return createPolicyContext(this, request.getHandler().getEvaluation());
    }

    private PolicyContext createPolicyContext(ContextProvider context, PolicyEvaluation evaluation) {
        Map<String, Object> params = evaluator.getParams(context, evaluation.getContextBinding());
        Object feature = evaluator.getValue(context, evaluation.getFeature());
        return new PolicyContext(feature.toString(), params);
    }

    public PolicyEvaluationHandler getHandler() {
        try {
            return (PolicyEvaluationHandler) Class.forName(request.getHandler().getHandlerImpl()).newInstance();
        } catch (Exception ignored) {
        }

        return new PolicyEvaluationHandler() {
            public void handleResource(PolicyRequest request, ManagerContext ctx, Resource selected) {
            }
        };
    }
}
