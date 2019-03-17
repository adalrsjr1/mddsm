package br.inf.ufg.mddsm.broker.autonomic;

import base.autonomic.Symptom;
import br.inf.ufg.mddsm.broker.expression.ContextProvider;

import java.util.Map;

public class SymptomOccurrence implements ContextProvider {
    private Symptom symptom;
    private Map<String, Object> values;

    public SymptomOccurrence(Symptom symptom, Map<String, Object> values) {
        this.symptom = symptom;
        this.values = values;
    }

    public Symptom getSymptom() {
        return symptom;
    }

    public Map<String, Object> getParams() {
        return values;
    }

    public Object getVariable(String name) {
        return getParams().get(name);
    }

}
