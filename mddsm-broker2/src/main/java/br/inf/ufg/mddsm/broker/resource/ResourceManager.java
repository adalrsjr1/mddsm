package br.inf.ufg.mddsm.broker.resource;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import br.inf.ufg.mddsm.broker.policy.metadata.Metadata;

public class ResourceManager implements Sensor, Executable {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ResourceManager.class);
	private String name;
    private Set<Resource> objects = new LinkedHashSet<Resource>();

    public void setName(String name)
    {
    	log.trace("setName(name:{})", name);
    	this.name = name;
    }
    
    public String getName()
    {
    	log.trace("getName() = {}", name);
    	return name;
    }
    
    public String toString()
    {
    	return this.name;
    }
    
    public synchronized void addObject(Resource obj) {
    	log.trace("addObject(obj:{})", obj);
        if (obj != null)
            doAddObject(obj);
    }

    private void doAddObject(Resource obj) {
    	log.trace("doAddObject(obj:{}", obj);
        Resource prev = getObject(obj.getName());
        if (prev != null)
            objects.remove(prev);
        
        objects.add(obj);
    }

    public synchronized Resource getObject(String name) {
    	log.trace("getObject(name:{})", name);
    	
    	List<Optional<Resource>> resources = objects.stream()
    			.filter(obj -> name.equals(obj.getName()))
    			.map(Optional::of)
    			.collect(Collectors.toList());
    	
        Resource result = null;
        if(resources.size() > 0) {
        	result = resources.get(0).orElse(null);
        }
        log.trace("getObject() = {}", result);
        return result;
    }

    public synchronized boolean removeObject(String name) {
    	log.trace("removeObject(name:{})", name);
        Resource fw = getObject(name);
        boolean result = fw != null && objects.remove(fw);
        log.trace("removeObject(name:{})", name);
        return result;
    }

    public TreeSet<Metadata> getAvailableObjects() {
        TreeSet<Metadata> availSet = new TreeSet<Metadata>();

        for (Resource object : objects) {
            if (object.getMetadata().isAvailable())
                availSet.add(object.getMetadata());
        }

        log.trace("getAvailableObjects() = {}", availSet);
        return availSet;
    }

    public synchronized void clearAllObjects() {
    	log.trace("clearAllObjects()");
        objects.clear();
    }


    public Collection<Resource> getAll() {
    	log.trace("getAll()");
        return objects;
    }

    public void setEventListener(EventListener eventListener) {
    	log.trace("setEventListener() = {}", eventListener);
        for (Resource object : getAll()) {
            object.setEventListener(eventListener);
        }
    }

    public void start() {
    	log.trace("start()");
        for (Resource object : getAll()) {
            object.start();
        }
    }

    public void stop() {
    	log.trace("stop()");
        for (Resource object : getAll()) {
            object.stop();
        }
    }
}
