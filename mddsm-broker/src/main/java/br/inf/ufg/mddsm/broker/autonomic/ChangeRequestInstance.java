package br.inf.ufg.mddsm.broker.autonomic;


import base.autonomic.ChangeRequest;
import br.inf.ufg.mddsm.broker.expression.ContextProvider;

import java.util.LinkedHashMap;
import java.util.Map;

public class ChangeRequestInstance implements ContextProvider {
    private ChangeRequest request;
    private SymptomOccurrence symptom;

    public ChangeRequestInstance(ChangeRequest request, SymptomOccurrence symptom) {
        this.request = request;
        this.symptom = symptom;
    }

    public ChangeRequest getRequest() {
        return request;
    }

    public Map<String, Object> getParams() {
        return symptom.getParams();
    }

    public Object getVariable(String name) {
        return getParams().get(name);
    }

}
