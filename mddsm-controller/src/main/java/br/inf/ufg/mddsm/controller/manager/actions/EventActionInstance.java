package br.inf.ufg.mddsm.controller.manager.actions;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import base.common.EnqueueCall;
import br.inf.ufg.mddsm.controller.expression.ContextProviderParams;
import br.inf.ufg.mddsm.controller.expression.ValueEvaluator;
import br.inf.ufg.mddsm.controller.manager.ManagerContext;
import br.inf.ufg.mddsm.controller.manager.SignalInstance;

public class EventActionInstance implements ActionInstance {
    private EnqueueCall call;

    public EventActionInstance(EnqueueCall call) {
        this.call = call;
    }

    public Object execute(ManagerContext ctx, Map<String, Object> params) {
    	long t = System.nanoTime();
    	
    	ValueEvaluator eval = ctx.getMainManager().getEvaluator();
        Map<String, Object> callParams = eval.getParams(new ContextProviderParams(params), call.getBindings());
        String name = call.getCall().getName();
        ctx.getMainManager().sendEvent(new SignalInstance(name, callParams));
        
        t = System.nanoTime() - t;
        System.out.println("\tE: "+name+ " " + TimeUnit.MILLISECONDS.convert(t, TimeUnit.NANOSECONDS) + "ms");
        return null;
    }
}
