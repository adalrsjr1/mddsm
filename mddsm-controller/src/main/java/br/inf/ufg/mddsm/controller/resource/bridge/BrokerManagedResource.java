package br.inf.ufg.mddsm.controller.resource.bridge;

import br.inf.ufg.mddsm.controller.adapters.Event;
import br.inf.ufg.mddsm.controller.adapters.EventException;
import br.inf.ufg.mddsm.controller.adapters.EventNotifier;
import br.inf.ufg.mddsm.controller.adapters.Manageable;
import br.inf.ufg.mddsm.controller.manager.MainManager;
import br.inf.ufg.mddsm.controller.manager.ManagerContext;
import br.inf.ufg.mddsm.controller.manager.SignalInstance;
import br.inf.ufg.mddsm.controller.policy.metadata.Metadata;
import br.inf.ufg.mddsm.controller.resource.AbstractTouchpoint;
import br.inf.ufg.mddsm.controller.resource.Resource;

@Deprecated
public class BrokerManagedResource extends AbstractTouchpoint implements EventNotifier, Resource {
	private Manageable bridge;
	private MainManager mainManager;
	
    public BrokerManagedResource(Metadata metadata, Manageable bridge) {
        super(metadata);
        this.bridge = bridge;
        this.bridge.setEventNotifier(this);
        this.mainManager = ((IBroker)bridge).getMainManager();
        
    }

	private MainManager getMainManager()
    {
    	return mainManager;
    }
    
    public Object execute(SignalInstance signal) {
    	return mainManager.execute(signal);
        //return execute(signal.getName(), signal.getParams());
    }

//    public Object execute(String message, Map<String, Object> params) {
//        try {
//            return new CallExecutor(bridge).execute(message, params);
//        } catch (InvocationTargetException e) {
//            if (e.getCause() instanceof EventException) {
//                EventException ee = (EventException) e.getCause();
//                throwEvent(ee.getEvent());
//            } else if (e.getCause() instanceof RuntimeException)
//                throw (RuntimeException) e.getCause();
//            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
//        }
//
//        // TODO: fixme
//        return null;
//    }

//    public Object execute(String message) {
//        return execute(message, new LinkedHashMap<String, Object>());
//    }

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
	
	public ManagerContext getContext()
	{
		return getMainManager().getContext();
	}
	
	public void sendEvent(SignalInstance signal)
	{
		getMainManager().sendEvent(signal);
	}

	
}
