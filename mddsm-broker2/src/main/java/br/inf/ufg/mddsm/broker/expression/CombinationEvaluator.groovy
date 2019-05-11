package br.inf.ufg.mddsm.broker.expression

class CombinationEvaluator {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(CombinationEvaluator.class);
	
    public static Collection<EvaluationResult> evaluate(String expression, Map<String, Collection<ContextProvider>> context) {
        return evaluate(expression, [:], context.entrySet() as List)
    }

    public static Collection<EvaluationResult> evaluate(String expression, Map context, List<Map.Entry> others) {
		log.trace("evaluate(expression:{}, context:{}, others:{})", expression, context, others)
        if (others.empty)
            return [evaluateExpression(expression, context)]

        Map.Entry entry = others.first()
        Collection values = entry.value

        def result = values.collect { ContextProvider value ->
            Map ctx = new LinkedHashMap(context)
            ctx.put(entry.key, value)
            evaluate(expression, ctx, others - entry)
        }.flatten()
		
		log.trace("evaluate() = {}", result)
		return result
    }

	// How to improve the performance for instantiating GroovyShell
    public static EvaluationResult evaluateExpression(String expression, Map context) {
		log.trace("evaluateExpression(expression:{}, context:{})", expression, context)
        Object result = new GroovyShell(new Binding(ContextProviderWrapper.wrap(context))).evaluate(expression)
        def evaluationResult = new EvaluationResult(result: result, params: context)
		log.trace("evaluationExpression() = {}", evaluationResult)
		return evaluationResult
    }


}
