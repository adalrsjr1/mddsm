package br.inf.ufg.mddsm.broker.expression

class EvaluationResult {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(EvaluationResult.class);
    Object result
    Map<String, Object> params

    boolean isTrue() {
		log.trace("isTrue() = {}", result)
        result
    }
	
	String toString() {
		"EvaluationResult(result:$result, params:$params)"
	}
}
