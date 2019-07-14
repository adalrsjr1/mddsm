package br.inf.ufg.mddsm.controller.resource.bridge;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;

import br.inf.ufg.mddsm.controller.adapters.Event;
import br.inf.ufg.mddsm.controller.adapters.EventException;
import br.inf.ufg.mddsm.controller.adapters.EventNotifier;
import br.inf.ufg.mddsm.controller.adapters.Manageable;
import br.inf.ufg.mddsm.controller.manager.SignalInstance;
import br.inf.ufg.mddsm.controller.policy.metadata.Metadata;
import br.inf.ufg.mddsm.controller.resource.AbstractTouchpoint;
import br.inf.ufg.mddsm.controller.resource.Resource;

/**
 * Communication object used by CSM
 *
 * @author Frank Hernandez
 */
public class ManagedResource extends AbstractTouchpoint implements EventNotifier, Resource {
    private Manageable bridge;

    public ManagedResource(Metadata metadata, Manageable bridge) {
        super(metadata);
        bridge.setEventNotifier(this);
        this.bridge = bridge;
        
    }

	public Object execute(SignalInstance signal) {
        return execute(signal.getName(), signal.getParams());
    }

    public Object execute(String message, Map<String, Object> params) {
        try {
            return new CallExecutor(bridge).execute(message, params);
        } catch (InvocationTargetException e) {
            if (e.getCause() instanceof EventException) {
                EventException ee = (EventException) e.getCause();
                throwEvent(ee.getEvent());
            } else if (e.getCause() instanceof RuntimeException)
                throw (RuntimeException) e.getCause();
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        // TODO: fixme
        return null;
    }

    public Object execute(String message) {
        return execute(message, new LinkedHashMap<String, Object>());
    }

    public void notify(SignalInstance signal) {
        getEventListener().notify(signal);
    }

    public void notify(Event event) {
        notify(newSignalInstance(event));
    }

    public void throwEvent(SignalInstance signal) throws EventException {
        getEventListener().throwEvent(signal);
    }

    public void throwEvent(Event event) {
        throwEvent(newSignalInstance(event));
    }

    private SignalInstance newSignalInstance(Event event) {
        return new SignalInstance(this, event.getName(), event.getParams());
    }

    public String toString() {
        return getName();
    }
}
