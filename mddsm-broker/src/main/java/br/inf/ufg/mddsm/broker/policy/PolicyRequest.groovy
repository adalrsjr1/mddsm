package br.inf.ufg.mddsm.broker.policy;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import base.policy.PolicyEvaluation;
import base.policy.PolicyEvaluationRequest;
import br.inf.ufg.mddsm.broker.expression.ContextProvider;
import br.inf.ufg.mddsm.broker.expression.ValueEvaluator;
import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.resource.Resource;

public class PolicyRequest implements ContextProvider {
	private static Logger log = LoggerFactory.getLogger(PolicyRequest.class);
			
    private PolicyEvaluationRequest request;
    private Map<String, Object> params;
    private ValueEvaluator evaluator;

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("PolicyRequest (")
		  .append("request: ")
		  .append(request)
		  .append(", params: ")
		  .append(params)
		  .append(", evaluator: ")
		  .append(evaluator)
		  .append(')');
		  
		return sb.toString()
	}
	
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
    	log.debug("createPolicyContext(context:{}, evaluation:{}", context.dump(), evaluation.dump());
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
