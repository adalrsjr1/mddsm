package br.inf.ufg.mddsm.broker.resource;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.inf.ufg.mddsm.broker.manager.SignalInstance;
import br.inf.ufg.mddsm.broker.policy.metadata.Metadata;

public abstract class AbstractTouchpoint implements Resource {
	private static Logger log = LoggerFactory.getLogger(AbstractTouchpoint.class);

    private ThreadedQueue queue = new ThreadedQueue(new ConcurrentLinkedQueue<SignalInstance>());
    private EventListener eventListener;

    public void start() {
        queue.start(this);
    }

    public final void enqueue(SignalInstance signal) {
        log.debug("Call enqueued: " + signal);
        queue.enqueue(signal);
    }

    public final void enqueue(Object source, String message, Object... params) {
        Map<String, Object> paramMap = new LinkedHashMap<String, Object>();
        for (int i = 0; i < params.length; i += 2) {
            String key = params[i].toString();
            Object value = params[i+1];
            paramMap.put(key, value);
        }

        enqueue(source, message, paramMap);
    }

    public final void enqueue(Object source, String message, Map<String, Object> params) {
        enqueue(new SignalInstance(source, message, params ));
    }

    public final void setEventListener(EventListener eventListener) {
        this.eventListener = eventListener;
    }

    public final EventListener getEventListener() {
        return eventListener;
    }

    public void stop() {
        queue.stop();
    }

    private Metadata metadata;

    public AbstractTouchpoint(Metadata metadata) {
        this.metadata = metadata;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public String getName() {
        return metadata.getName();
    }
}
