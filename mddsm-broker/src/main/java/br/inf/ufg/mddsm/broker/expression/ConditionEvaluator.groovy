package br.inf.ufg.mddsm.broker.expression

import base.common.Binding

class ConditionEvaluator {
    ContextBinder binder

    public ConditionEvaluator(ContextBinder binder) {
        this.binder = binder;
    }

    public Collection<EvaluationResult> evaluate(String expression, Collection<Binding> bindings) {
        def context = binder.getBindings(bindings)
        CombinationEvaluator.evaluate(expression, context).findAll { it.isTrue() }
    }

    public Collection<EvaluationResult> evaluate(Collection<String> expressions, Collection<Binding> bindings) {
        Collection<EvaluationResult> result

        for (String expression : expressions) {
            Collection<EvaluationResult> evalResult = evaluate(expression, bindings)
            if (result == null)
                result = new LinkedHashSet<EvaluationResult>(evalResult)

            result.retainAll(evalResult)
        }

        result
    }

}