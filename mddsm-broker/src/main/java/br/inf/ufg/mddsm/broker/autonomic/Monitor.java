package br.inf.ufg.mddsm.broker.autonomic;

import base.autonomic.Symptom;
import base.common.Binding;
import base.common.Condition;
import br.inf.ufg.mddsm.broker.expression.ConditionEvaluator;
import br.inf.ufg.mddsm.broker.expression.ContextBinder;
import br.inf.ufg.mddsm.broker.expression.EvaluationResult;
import br.inf.ufg.mddsm.broker.expression.SignalLogger;
import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.SignalInstance;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class Monitor {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Monitor.class);
    private SignalRegistry signalRegistry = new SignalRegistry();
    private ManagerContext context;
    private Collection<Symptom> identifies;

    public Monitor(Collection<Symptom> identifies) {
    	log.trace("new Monitor(identifies:{})", identifies);
        this.identifies = identifies;
    }

    private Analyzer analyzer;

    public void setAnalyzer(Analyzer analyzer) {
    	log.trace("setAnalyzer(analyzer:{})", analyzer);
        this.analyzer = analyzer;
    }

    public void sense(SignalInstance signal) {
    	log.trace("sense(signal:{})", signal);
        signalRegistry.registerSignal(signal);

        for (Symptom symptom : identifies) {
            checkSymptom(symptom);
        }
    }

    public void checkSymptom(Symptom symptom) {
    	log.trace("checkSymptom(symptom:{})", symptom);
        Collection<EvaluationResult> results = evaluateConditions(symptom);
        for (EvaluationResult result : results) {
            enableSymptom(symptom, result);
        }
    }

    private Collection<EvaluationResult> evaluateConditions(Symptom symptom) {
    	log.trace("evaluateConditions(symptom:{})", symptom);
        Collection<String> expressions = new LinkedHashSet<String>();
        Collection<Binding> bindings = symptom.getBindings();

        for (Condition condition : symptom.getConditions()) {
            expressions.add(condition.getExpression());
        }

        ConditionEvaluator evaluator = new ConditionEvaluator(new ContextBinder(context, signalRegistry));
        Collection<EvaluationResult> evaluationResults = evaluator.evaluate(expressions, bindings);
        
        log.trace("evaluationConditions() = {}", evaluationResults);
        
        return evaluationResults;
    }

    public synchronized void enableSymptom(Symptom symptom, EvaluationResult result) {
    	log.trace("enableSymptom(symptom:{}, result:{})", symptom, result);
        analyzer.symptomDetected(new SymptomOccurrence(symptom, result.getParams()));
    }

    public void setContext(ManagerContext context) {
    	log.trace("setContext(context:{})", context);
        this.context = context;
    }
}
