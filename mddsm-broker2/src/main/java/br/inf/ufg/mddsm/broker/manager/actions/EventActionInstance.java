package br.inf.ufg.mddsm.broker.manager.actions;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import base.common.EnqueueCall;
import br.inf.ufg.mddsm.broker.expression.ContextProviderParams;
import br.inf.ufg.mddsm.broker.expression.ValueEvaluator;
import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.SignalInstance;

public class EventActionInstance implements ActionInstance {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(EventActionInstance.class);
    private EnqueueCall call;

    public EventActionInstance(EnqueueCall call) {
    	log.trace("new EventActionInstance(call:{})", call);
        this.call = call;
    }

    public Object execute(ManagerContext ctx, Map<String, Object> params) {
    	log.trace("execute(ctx:{}, params:{})", ctx, params);
    	long t = System.nanoTime();
    	
    	ValueEvaluator eval = ctx.getMainManager().getEvaluator();
        Map<String, Object> callParams = eval.getParams(new ContextProviderParams(params), call.getBindings());
        String name = call.getCall().getName();
        ctx.getMainManager().sendEvent(new SignalInstance(name, callParams));
        
        t = System.nanoTime() - t;
        System.out.println("\tE: "+name+ " " + TimeUnit.MILLISECONDS.convert(t, TimeUnit.NANOSECONDS) + "ms");
        log.trace("execute() = null");
        return null;
    }
}
