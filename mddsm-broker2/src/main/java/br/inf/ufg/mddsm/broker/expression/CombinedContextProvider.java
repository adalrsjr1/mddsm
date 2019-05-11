package br.inf.ufg.mddsm.broker.expression;

import java.util.LinkedHashMap;

public class CombinedContextProvider extends LinkedHashMap<String, Object> implements ContextProvider {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(CombinedContextProvider.class);
	private ContextProvider parent;

    public CombinedContextProvider(ContextProvider parent) {
    	log.trace("new CombinedContextProvider(parent:{})", parent);
        this.parent = parent;
    }

    public Object getVariable(String name) {
    	log.trace("getVariable(name:{})", name);
        Object variable = containsKey(name) ? get(name) : parent.getVariable(name);
        log.trace("getVariable() = {}", variable);
        return variable;
    }
}
