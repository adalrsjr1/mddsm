package br.inf.ufg.mddsm.broker.manager.actions;

import java.util.Map;

import base.common.EnqueueCall;
import br.inf.ufg.mddsm.broker.expression.ContextProviderParams;
import br.inf.ufg.mddsm.broker.expression.ValueEvaluator;
import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.SignalInstance;

public class CallActionInstance implements ActionInstance {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(CallActionInstance.class);
    private EnqueueCall call;

    public CallActionInstance(EnqueueCall call) {
    	log.trace("new CallActionInstance(call:{}", call);
        this.call = call;
    }

    public Object execute(ManagerContext ctx, Map<String, Object> params) {
    	log.trace("execute(ctx:{}, params:{})", ctx, params);
    	ValueEvaluator eval = ctx.getMainManager().getEvaluator();
        Map<String, Object> callParams = eval.getParams(new ContextProviderParams(params), call.getBindings());
        
        ctx.getMainManager().enqueue(new SignalInstance(call, call.getCall().getName(), callParams));
        log.trace("execute() = null");
        return null;
    }
}
