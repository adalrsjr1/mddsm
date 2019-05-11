package br.inf.ufg.mddsm.broker.autonomic;

import base.autonomic.ChangePlan;

import java.util.Collection;

public class Planner {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Planner.class);
	Collection<ChangePlan> plans;

	public Planner(Collection<ChangePlan> plans) {
		log.trace("new Planner(plans:{})", plans);
		this.plans = plans;
	}

	private Executor executor;
	public void setExecutor(Executor executor) {
		log.trace("setExecutor(executor:{})", executor);
		this.executor = executor;
	}

	public void change(ChangeRequestInstance request) {
		log.trace("change(request:{})", request);
		for (ChangePlan plan : plans) {
			if (plan.getBasedOn().equals(request.getRequest())) {
				executor.execute(new ChangePlanInstance(plan, request));
			}
		}
	}
}
