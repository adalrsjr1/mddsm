package br.inf.ufg.mddsm.broker.policy;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import base.policy.PolicyEvaluationPoint;
import br.inf.ufg.mddsm.broker.expression.ValueEvaluator;
import br.inf.ufg.mddsm.broker.manager.HandlingResult;
import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.SignalHandler;
import br.inf.ufg.mddsm.broker.manager.SignalInstance;
import br.inf.ufg.mddsm.broker.policy.repository.DefaultPolicyRepository;
import br.inf.ufg.mddsm.broker.resource.Resource;

public class PolicyEvaluationManager implements SignalHandler {
	private final Logger log = LoggerFactory.getLogger(PolicyEvaluationManager.class);
	
    private Collection<PolicyEvaluationPoint> evalPoints;
    private PolicyManager policyManager;

    public PolicyEvaluationManager(base.PolicyManager policyManager) {
        this.policyManager = new PolicyManager(new DefaultPolicyRepository(policyManager.getPolicies()));
        this.evalPoints = policyManager.getPoints();
    }

    public HandlingResult handle(SignalInstance signal, ManagerContext ctx) {
        for (PolicyEvaluationPoint evalPoint : evalPoints) {
            eval(signal, ctx, evalPoint);
        }

        return HandlingResult.NOT_HANDLED;
    }

    private void eval(SignalInstance signal, ManagerContext ctx, PolicyEvaluationPoint evalPoint) {
    	log.debug("signal:{}, context:{}, evalPoint:{}", signal, ctx, evalPoint);
        PolicyRequest request = getRequest(signal, evalPoint, ctx);
        if (request == null)
            return;

        Resource resource = policyManager.findConformingObject(ctx.getResourceManager(), request.getPolicyContext());
        if (resource != null)
            request.getHandler().handleResource(request, ctx, resource);
    }

    private PolicyRequest getRequest(SignalInstance signal, PolicyEvaluationPoint evalPoint, ManagerContext ctx ) {
    	log.debug("getRequest(signal:{}, evalPoint:{}, context:{}", signal, evalPoint.dump(), ctx);
        if (!signal.getName().equals(evalPoint.getSignal().getName()))
            return null;
        ValueEvaluator evaluator = ctx.getMainManager().getEvaluator();
        return new PolicyRequest(evalPoint.getRequest(), evaluator.getParams(signal, evalPoint.getRequest().getBindings()), evaluator);
    }

    public SignalHandler getSignalHandler() {
        return this;
    }
}
