package br.inf.ufg.mddsm.broker.autonomic;

import java.util.*;

import br.inf.ufg.mddsm.broker.expression.SignalLogger;
import br.inf.ufg.mddsm.broker.manager.SignalInstance;

public class SignalRegistry implements SignalLogger {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(SignalRegistry.class);
    private Map<String, Set<SignalEntry>> registry = new LinkedHashMap<String, Set<SignalEntry>>();

    private static class SignalEntry {
    	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(SignalRegistry.SignalEntry.class);
        private String name;
        private Object source;
        private SignalInstance signal;

        public SignalEntry(SignalInstance signal) {
        	log.trace("new SignalEntry(signal:{})", signal);
            name = signal.getName();
            source = signal.getSource();
            this.signal = signal;
        }

        public int hashCode() {
            return name.hashCode() + (source == null ? 0 : source.hashCode());
        }

        public boolean equals(Object o) {
            SignalEntry e = (SignalEntry) o;

            return name.equals(e.name)
                    && (source == e.source || source != null && source.equals(e.source));
        }

        public SignalInstance getSignal() {
        	log.trace("getSignal() = {}", signal);
            return signal;
        }
    }

    public Collection<SignalInstance> getSignalInstances(String name) {
    	log.trace("getSignalInstances(name:{})", name);
        Collection<SignalInstance> result = new LinkedList<SignalInstance>();
        for (SignalEntry e : getSignalEntries(name)) {
            result.add(e.getSignal());
        }
        log.trace("getSignalInstances() = {}", result);
        return result;
    }

    private Set<SignalEntry> getSignalEntries(String name) {
    	log.trace("getSignalEntries(name:{})", name);
        Set<SignalEntry> entries = registry.get(name);
        if (entries == null) {
            entries = new LinkedHashSet<SignalEntry>();
            registry.put(name, entries);
        }        
        log.trace("getSignalEntries() = {}", entries);
        return entries;
    }

    public void registerSignal(SignalInstance signal) {
    	log.trace("registerSignal(signal:{})", signal);
        getSignalEntries(signal.getName()).add(new SignalEntry(signal));
    }
}
