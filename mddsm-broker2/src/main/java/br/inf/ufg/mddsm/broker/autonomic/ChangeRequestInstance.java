package br.inf.ufg.mddsm.broker.autonomic;


import base.autonomic.ChangeRequest;
import br.inf.ufg.mddsm.broker.expression.ContextProvider;

import java.util.LinkedHashMap;
import java.util.Map;

public class ChangeRequestInstance implements ContextProvider {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ChangeRequestInstance.class);
    private ChangeRequest request;
    private SymptomOccurrence symptom;

    public ChangeRequestInstance(ChangeRequest request, SymptomOccurrence symptom) {
    	log.trace("new ChangeRequestInstance(request:{}, symptom:{}", request, symptom);
        this.request = request;
        this.symptom = symptom;
    }

    public ChangeRequest getRequest() {
    	log.trace("getRequest() = {}", request);
        return request;
    }

    public Map<String, Object> getParams() {
    	Map<String, Object> params = symptom.getParams();
    	log.trace("getParams() = {}", params);
        return params;
    }

    public Object getVariable(String name) {
    	Object variable = getParams().get(name);
    	log.trace("getVariable() = {}", variable);
        return variable;
    }

}
