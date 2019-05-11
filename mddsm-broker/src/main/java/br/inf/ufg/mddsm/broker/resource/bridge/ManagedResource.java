package br.inf.ufg.mddsm.broker.resource.bridge;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;

import br.inf.ufg.mddsm.broker.adapters.Event;
import br.inf.ufg.mddsm.broker.adapters.EventException;
import br.inf.ufg.mddsm.broker.adapters.EventNotifier;
import br.inf.ufg.mddsm.broker.adapters.Manageable;
import br.inf.ufg.mddsm.broker.manager.SignalInstance;
import br.inf.ufg.mddsm.broker.policy.metadata.Metadata;
import br.inf.ufg.mddsm.broker.resource.AbstractTouchpoint;
import br.inf.ufg.mddsm.broker.resource.Resource;

/**
 * Communication object used by CSM
 *
 * @author Frank Hernandez
 */
public class ManagedResource extends AbstractTouchpoint implements EventNotifier, Resource {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ManagedResource.class);
    private Manageable bridge;

    public ManagedResource(Metadata metadata, Manageable bridge) {
        super(metadata);
        log.trace("new ManagedResource(metadata:{}, bridge:{})", metadata, bridge);
        bridge.setEventNotifier(this);
        this.bridge = bridge;
        
    }

	public Object execute(SignalInstance signal) {
        return execute(signal.getName(), signal.getParams());
    }

    public Object execute(String message, Map<String, Object> params) {
    	log.trace("execute(message:{}, params:{})", message, params);
    	Object result = null;
        try {
            result = new CallExecutor(bridge).execute(message, params);
        } catch (InvocationTargetException e) {
        	log.error(e.getMessage());
            if (e.getCause() instanceof EventException) {
                EventException ee = (EventException) e.getCause();
                throwEvent(ee.getEvent());
            } else if (e.getCause() instanceof RuntimeException) {
                throw (RuntimeException) e.getCause();
            }
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        // TODO: fixme
        log.trace("execute() = {}", result);
        return result;
    }

    public Object execute(String message) {
        return execute(message, new LinkedHashMap<String, Object>());
    }

    public void notify(SignalInstance signal) {
    	log.trace("notify(signal:{})", signal);
        getEventListener().notify(signal);
    }

    public void notify(Event event) {
        notify(newSignalInstance(event));
    }

    public void throwEvent(SignalInstance signal) throws EventException {
    	log.trace("throwEvent(signal:{})", signal);
        getEventListener().throwEvent(signal);
    }

    public void throwEvent(Event event) {
        throwEvent(newSignalInstance(event));
    }

    private SignalInstance newSignalInstance(Event event) {
    	log.trace("newSignalInstance(event:{})", event);
        return new SignalInstance(this, event.getName(), event.getParams());
    }

    public String toString() {
        return getName();
    }
}
