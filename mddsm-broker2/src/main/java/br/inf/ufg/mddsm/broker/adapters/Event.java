package br.inf.ufg.mddsm.broker.adapters;

import java.util.LinkedHashMap;
import java.util.Map;

public class Event {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Event.class);
    private String name;
    private Map<String,Object> params;

    public Event(String name) {
        this(name, new LinkedHashMap<String, Object>());
    }

    public Event(String name, Map<String, Object> params) {
    	log.trace("new Event(name:{}, params:{})",name, params);
        this.name = name;
        this.params = params;
    }

    public void setParam(String name, Object value) {
    	log.trace("setParam(name:{}, value:{})", name, value);
        params.put(name, value);
    }

    public String getName() {
    	log.trace("getName() = {}", name);
        return name;
    }

    public Map<String, Object> getParams() {
    	log.trace("getParams() = {}", params);
        return params;
    }
    
    public String toString() {
    	return String.format("Event(name:%s, params:%b", name, params);
    }
}
