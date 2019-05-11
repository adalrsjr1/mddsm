package br.inf.ufg.mddsm.broker.state;

import base.context.State;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.concurrent.Semaphore;

public class StateTypeManager {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(StateTypeManager.class);
    private State state;
    private HashSet<StateHolder> objects = new LinkedHashSet<StateHolder>();

    public StateTypeManager(State state) {
    	log.trace("new StateTypeManager(state:{})", state);
        this.state = state;
    }

    public String getName() {
    	log.trace("getName() = {}", state.getName());
        return state.getName();
    }

    private StateHolder getObjectInternal(Object id) {
    	log.trace("getObjectInternal(id:{})", id);
        for (StateHolder con : this.objects) {
            if (con.getId().equals(id)) {
            	log.trace("getObjectInternal() = {}", con);
                return con;
            }
        }
        log.trace("getObjectInternal() = null");
        return null;
    }

    public synchronized boolean exists (Object id)
    {
    	log.trace("exists(id:{})", id);
    	assert getObjectInternal(id) == null;
    	return objects.contains(getObjectInternal(id));
    }
    
    public synchronized StateHolder create(Object id) {
    	log.trace("create(id:{})", id);
        assert getObjectInternal(id) == null;
        StateHolder con = new StateHolder(state, id);
        objects.add(con);
        log.trace("create() = {}", con);
        return con;
    }

    public synchronized StateHolder get(Object id) {
        StateHolder con = getObjectInternal(id);
        StateHolder holder = con != null ? con : create(id);
        log.trace("get(id:{}) = {}", id, holder);
        return holder;
    }


    public boolean remove(Object id) {
        StateHolder con = getObjectInternal(id);
        boolean result = con != null ? objects.remove(con) : false;
        log.trace("remove(id:{}) = {}", id, result);
        return result;
    }

    public Collection<StateHolder> getAll() {
    	log.trace("getAll() = {}", objects);
        return objects;
    }

    
}
