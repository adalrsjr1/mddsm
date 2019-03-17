package br.inf.ufg.mddsm.broker.manager.actions;


import java.util.Map;
import java.util.concurrent.TimeUnit;

import base.common.ActionExecution;
import br.inf.ufg.mddsm.broker.expression.ContextProvider;
import br.inf.ufg.mddsm.broker.expression.ValueEvaluator;
import br.inf.ufg.mddsm.broker.manager.ManagerContext;

public class ActionCaller {
    private ActionExecution execution;
    private ActionInstance action;

    public ActionCaller(ActionExecution execution, ActionInstance action) {
        this.execution = execution;
        this.action = action;
    }

    public Object execute(ManagerContext manager, Map<String, Object> params) {
    	long t = System.nanoTime();
    	Object o = action.execute(manager, params);
    	t = System.nanoTime() - t;
    	
    	System.out.println("\tA: "+action.getClass().getSimpleName() +"()" + 
    			" " + TimeUnit.MILLISECONDS.convert(t, TimeUnit.NANOSECONDS) + "ms");
        return o;
    }

    public Object execute(ManagerContext manager, ContextProvider ctx, ValueEvaluator eval) {
    	
        return execute(manager, getParams(ctx, eval));
    }

    private Map<String, Object> getParams(ContextProvider ctx, ValueEvaluator eval) {
    	
        return eval.getParams(ctx, execution.getBindings());
    }
}
