package br.inf.ufg.mddsm.broker.state;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import base.context.State;
import br.inf.ufg.mddsm.broker.expression.ContextProvider;
import br.inf.ufg.mddsm.broker.resource.Resource;

public class StateHolder implements ContextProvider {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(StateHolder.class);
	private State state;

	private Map<String, Object> attributes = Collections.synchronizedMap(new LinkedHashMap<String, Object>());
	private Map<String, StateTypeManager> children = Collections.synchronizedMap(new LinkedHashMap<String, StateTypeManager>());

	public StateHolder(State state, Object id) {
		log.trace("new StateHolder(state:{}, id:{})", state, id);
		this.state = state;
		attributes.put(state.getKey().getName(), id);

		for (State child : state.getChildren()) {
			children.put(child.getName(), new StateTypeManager(child));
		}
	}

	public Object getId() {
		Object id = attributes.get(state.getKey().getName());
		log.trace("getId() = {}", id);
		return id;
	}

	public Set getAsSet(String name) {
		Set set = (Set) get(name, Collections.synchronizedSet(new LinkedHashSet()));
		log.trace("getAsSet(name:{}) = set");
		return set;
	}

	public List getAsList(String name) {
		List list = (List) get(name, Collections.synchronizedList(new LinkedList()));
		log.trace("getAsList(name:{})");
		return list;
	}


	public Object get(String name, Object defaultValue) {
		Object value = attributes.get(name);
		if (value == null) {
			value = defaultValue;
			attributes.put(name, value);
		}

		return value;
	}

	public Object get(String name) {
		Object obj = attributes.get(name);
		log.trace("get(name:{}) = {}", name, obj);
		return obj;
	}

	public void set(String name, Object value) {
		log.trace("set(name:{}, value:{})");
		attributes.put(name, value);
	}

	public Resource getResource(String name) {
		Resource resource = (Resource) get(name);
		log.trace("getResource(name:{}) = {}", name, resource);
		return resource;
	}

	public StateTypeManager getChild(String name) {
		StateTypeManager type = children.get(name);
		log.trace("getChild(name:{})", type);
		return type;
	}

	public Map<String, Object> getParams() {
		log.trace("getParams() = {}", attributes);
		return attributes;
	}

	public String toString() {
		return state.getName() + "(" + getId() + ")";
	}

	public Object getVariable(String name) {
		Object variable = getParams().get(name);
		log.trace("getVariable(name:{})", name);
		return variable;
	}
}
