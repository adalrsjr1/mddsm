package br.inf.ufg.mddsm.broker.policy.metadata;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class Metadata implements Comparable<Metadata> {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Metadata.class);
    private String name;
    private boolean available = true;

    private Map<String, Feature> features = new LinkedHashMap<String, Feature>();

    public Metadata(String name) {
    	log.trace("new Metadata(name:{})", name);
        this.name = name;
    }
    
    
    @Override
	public Object clone() throws CloneNotSupportedException {
		Metadata meta = new Metadata(this.name);
		meta.available = this.available;
		meta.setFeatures(features);
		log.trace("clone() = {}", meta);
		return meta;
	}

    private void setFeatures(Map<String, Feature> f)
    {
    	features.putAll(f);
    }

	public String getName() {
		log.trace("getName() = {}", name);
        return name;
    }

    public Collection<Feature> getFeatures() {
    	Collection<Feature> result = features.values();
    	log.trace("getFeatures() = {}", result);
        return result;
    }

    public void addFeature(Feature feat) {
    	log.trace("addFeatures(feat:{})", feat);
        features.put(feat.getName(), feat);
    }

    public String toString() {
        return name;
    }

    public int compareTo(Metadata other) {
        return name.compareTo(other.name);
    }

    public boolean isAvailable() {
    	log.trace("isAvailable() = {}", available);
        return available;
    }

    public void fail() {
    	log.trace("fail()");
        available = false;
    }

    public void restore() {
    	log.trace("restore()");
        available = true;
    }
}
