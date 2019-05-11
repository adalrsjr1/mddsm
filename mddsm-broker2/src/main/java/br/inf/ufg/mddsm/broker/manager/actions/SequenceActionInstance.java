package br.inf.ufg.mddsm.broker.manager.actions;

import java.util.Collection;
import java.util.Map;

import br.inf.ufg.mddsm.broker.expression.ContextProviderParams;
import br.inf.ufg.mddsm.broker.expression.ValueEvaluator;
import br.inf.ufg.mddsm.broker.manager.ManagerContext;

public class SequenceActionInstance implements ActionInstance {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(SequenceActionInstance.class);
    private Collection<ActionCaller> callers;

    public SequenceActionInstance(Collection<ActionCaller> callers) {
    	log.trace("new SequenceActionInstance(callers:{})", callers);
        this.callers = callers;
    }

    public Object execute(ManagerContext ctx, Map<String, Object> params) {
    	log.trace("execute(ctx:{}, params:{})", ctx, params);
        Object result = null;
        ValueEvaluator eval = ctx.getMainManager().getEvaluator();
        for (ActionCaller caller : callers) {
            result = caller.execute(ctx, new ContextProviderParams(params), eval);
        }
        log.trace("execute() = {})", result);
        return result;
    }
}
