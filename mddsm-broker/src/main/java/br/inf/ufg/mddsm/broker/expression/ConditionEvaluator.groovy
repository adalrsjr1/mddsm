package br.inf.ufg.mddsm.broker.expression

import base.common.Binding

class ConditionEvaluator {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ConditionEvaluator.class);
    ContextBinder binder

    public ConditionEvaluator(ContextBinder binder) {
		log.trace("new ConditionEvaluator(binder:{})", binder);
        this.binder = binder;
    }

    public Collection<EvaluationResult> evaluate(String expression, Collection<Binding> bindings) {
		log.trace("evaluate(expression:{}, bindings:{})", expression, bindings);
        def context = binder.getBindings(bindings)
        def result = CombinationEvaluator.evaluate(expression, context).findAll { it.isTrue() }
		log.trace("evaluate() = {}", result)
		return result
    }

    public Collection<EvaluationResult> evaluate(Collection<String> expressions, Collection<Binding> bindings) {
		log.trace("evaluate(expressions:{}, bindings:{})", expressions, bindings)
        Collection<EvaluationResult> result

        for (String expression : expressions) {
            Collection<EvaluationResult> evalResult = evaluate(expression, bindings)
            if (result == null)
                result = new LinkedHashSet<EvaluationResult>(evalResult)

            result.retainAll(evalResult)
        }
		log.trace("evaluate() = result")
        result
    }

}