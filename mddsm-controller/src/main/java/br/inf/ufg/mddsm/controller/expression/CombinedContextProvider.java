package br.inf.ufg.mddsm.controller.expression;

import java.util.LinkedHashMap;

public class CombinedContextProvider extends LinkedHashMap<String, Object> implements ContextProvider {
    private ContextProvider parent;

    public CombinedContextProvider(ContextProvider parent) {
        this.parent = parent;
    }

    public Object getVariable(String name) {
        return containsKey(name) ? get(name) : parent.getVariable(name);
    }
}
