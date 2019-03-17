package br.inf.ufg.mddsm.broker.autonomic;

import br.inf.ufg.mddsm.broker.emf.HandlerFactory;
import br.inf.ufg.mddsm.broker.expression.ContextProvider;
import br.inf.ufg.mddsm.broker.expression.ValueEvaluator;
import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.actions.ActionCaller;


public class Executor {
    private ManagerContext context;

     public void execute(ChangePlanInstance plan) {
        ActionCaller caller = new HandlerFactory().createActionCaller(plan.getAction());
        ValueEvaluator eval = context.getMainManager().getEvaluator();
        caller.execute(context, plan, eval);
    }

     public void setContext(ManagerContext context) {
    	 
        this.context = context;
    }
}
