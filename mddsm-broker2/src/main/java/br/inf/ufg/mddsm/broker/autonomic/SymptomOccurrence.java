package br.inf.ufg.mddsm.broker.autonomic;

import base.autonomic.Symptom;
import br.inf.ufg.mddsm.broker.expression.ContextProvider;

import java.util.Map;

public class SymptomOccurrence implements ContextProvider {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(SymptomOccurrence.class);
    private Symptom symptom;
    private Map<String, Object> values;

    public SymptomOccurrence(Symptom symptom, Map<String, Object> values) {
    	log.trace("new SymptomOccurrence(symptom:{}, values:{})", symptom, values);
        this.symptom = symptom;
        this.values = values;
    }

    public Symptom getSymptom() {
    	log.trace("getSymptom() = {}", symptom);
        return symptom;
    }

    public Map<String, Object> getParams() {
    	log.trace("getParams() = {}", values);
        return values;
    }

    public Object getVariable(String name) {
    	log.trace("getVariable(name:{})", name);
    	Object variable = getParams().get(name);
    	log.trace("getVariable() = {}", name);
        return variable;
    }

}
