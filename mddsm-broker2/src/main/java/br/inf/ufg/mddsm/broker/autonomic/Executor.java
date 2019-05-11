package br.inf.ufg.mddsm.broker.autonomic;

import br.inf.ufg.mddsm.broker.emf.HandlerFactory;
import br.inf.ufg.mddsm.broker.expression.ValueEvaluator;
import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.actions.ActionCaller;


public class Executor {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Executor.class);
	private ManagerContext context;

	public void execute(ChangePlanInstance plan) {
		log.trace("execute(plan: {})", plan);
		ActionCaller caller = new HandlerFactory().createActionCaller(plan.getAction());
		ValueEvaluator eval = context.getMainManager().getEvaluator();
		caller.execute(context, plan, eval);
	}

	public void setContext(ManagerContext context) {
		log.trace("setContext(context:{})", context);
		this.context = context;
	}
}
