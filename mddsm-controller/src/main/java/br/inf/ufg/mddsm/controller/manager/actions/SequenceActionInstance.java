package br.inf.ufg.mddsm.controller.manager.actions;

import java.util.Collection;
import java.util.Map;

import br.inf.ufg.mddsm.controller.expression.ContextProviderParams;
import br.inf.ufg.mddsm.controller.expression.ValueEvaluator;
import br.inf.ufg.mddsm.controller.manager.ManagerContext;

public class SequenceActionInstance implements ActionInstance {
    private Collection<ActionCaller> callers;

    public SequenceActionInstance(Collection<ActionCaller> callers) {
        this.callers = callers;
    }

    public Object execute(ManagerContext ctx, Map<String, Object> params) {
        Object result = null;
        ValueEvaluator eval = ctx.getMainManager().getEvaluator();
        for (ActionCaller caller : callers) {
            result = caller.execute(ctx, new ContextProviderParams(params), eval);
        }

        return result;
    }
}
