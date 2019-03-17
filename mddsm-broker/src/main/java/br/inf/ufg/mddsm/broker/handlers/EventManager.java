package br.inf.ufg.mddsm.broker.handlers;

import java.util.ArrayList;
import java.util.List;

import br.inf.ufg.mddsm.broker.manager.SignalInstance;
import br.inf.ufg.mddsm.broker.model.UsesEventListener;
import br.inf.ufg.mddsm.broker.resource.EventListener;

/**
 * This class handles the notification of events to the
 * regisetered listeners. This is class specifically signals
 * events to the NCB layer listener.
 *
 * @author fhern006_1
 */
public class EventManager implements EventListener {
	// previously the listeners was static
	//private static List<UsesEventListener> listeners = new ArrayList<UsesEventListener>();
	private List<UsesEventListener> listeners = new ArrayList<UsesEventListener>();

    public synchronized void addUpListener(UsesEventListener listener) {
    	// did't have this decision clause in the original code; Adalberto
    	/*
    	 * if exists a listener, don't need add the same again
    	 */
    	
    	if(!listeners.contains(listener))
    	{
    		listeners.add(listener);
    	}
    		
    }

    public void notify(SignalInstance event) {
    
        if (listeners != null && !listeners.isEmpty()) {
            List<UsesEventListener> list;
            synchronized (this) {
                list = new ArrayList<UsesEventListener>(listeners);
            }
            for (UsesEventListener listener : list) {
                listener.use(event);
            }
        }
    }

    public void throwEvent(SignalInstance event) {
        throw new RuntimeException(event.toString());
//        throw new EventException(event);
    }
}
