package br.inf.ufg.mddsm.broker.manager.actions;


import java.util.Map;
import java.util.concurrent.TimeUnit;

import base.common.ActionExecution;
import br.inf.ufg.mddsm.broker.expression.ContextProvider;
import br.inf.ufg.mddsm.broker.expression.ValueEvaluator;
import br.inf.ufg.mddsm.broker.manager.ManagerContext;

public class ActionCaller {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ActionCaller.class);
    private ActionExecution execution;
    private ActionInstance action;

    public ActionCaller(ActionExecution execution, ActionInstance action) {
    	log.trace("new ActionCaller(exection:{}, action:{})", execution, action);
        this.execution = execution;
        this.action = action;
    }

    public Object execute(ManagerContext manager, Map<String, Object> params) {
    	log.trace("execute(manager:{}, params:{}", manager, params);
    	long t = System.nanoTime();
    	Object o = action.execute(manager, params);
    	t = System.nanoTime() - t;
    	
    	System.out.println("\tA: "+action.getClass().getSimpleName() +"()" + 
    			" " + TimeUnit.MILLISECONDS.convert(t, TimeUnit.NANOSECONDS) + "ms");
    	log.trace("execute() = {}", o);
        return o;
    }

    public Object execute(ManagerContext manager, ContextProvider ctx, ValueEvaluator eval) {
    	
        return execute(manager, getParams(ctx, eval));
    }

    private Map<String, Object> getParams(ContextProvider ctx, ValueEvaluator eval) {
    	log.trace("getParams(ctx:{}, eval:{})", ctx, eval);
    	Map<String, Object> params = eval.getParams(ctx, execution.getBindings());
    	log.trace("getParams() = {}", params);
    	return params;
    }
}
