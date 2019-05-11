package br.inf.ufg.mddsm.broker.state;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import base.context.State;

public class StateManager {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(StateManager.class);
	private Map<State, StateTypeManager> typeManagers = new LinkedHashMap<State, StateTypeManager>();

	public StateManager(Collection<State> types) {
		log.trace("new StateManager(types:{})", types);
		for (State type : types) {
			typeManagers.put(type, new StateTypeManager(type));
		}
	}

	public Collection<StateTypeManager> getTypes() {
		Collection<StateTypeManager> types = typeManagers.values();
		log.trace("getTypes() = {}", types);
		return types;
	}

	public StateTypeManager getType(State type) {
		log.trace("getType(type:{})", type);
		return typeManagers.get(type);
	}

	public StateTypeManager getType(String name) {
		return getType(findType(name));
	}

	private State findType(String name) {
		log.trace("findType(name:{})", name);
		for (State type : typeManagers.keySet()) {
			if (type.getName().equals(name))
				log.trace("findType() = {}", type);
			return type;
		}

		log.trace("findType() = null");
		return null;
	}
}


