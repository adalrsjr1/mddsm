package br.inf.ufg.mddsm.broker.expression;


import java.util.Map;

public class ContextProviderParams implements ContextProvider {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ContextProviderParams.class);
    private Map<String, Object> params;

    public ContextProviderParams(Map<String, Object> params) {
    	log.trace("new ContextProviderParams(params:{})", params);
        this.params = params;
    }

    public Map<String, Object> getParams() {
    	log.trace("getParams() = {}", params);
        return params;
    }

    public Object getVariable(String name) {
    	log.trace("getVariable(name:{})", name);
    	Object variable = getParams().get(name);
    	log.trace("getVariable() = {}", variable);
    	return variable;
    }
    
    public String toString() {
    	return "ContextProviderParams(params:" + params + ")";
    }
}
