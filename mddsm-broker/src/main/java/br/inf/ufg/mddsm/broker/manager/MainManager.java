package br.inf.ufg.mddsm.broker.manager;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.inf.ufg.mddsm.broker.expression.ValueEvaluator;
import br.inf.ufg.mddsm.broker.policy.metadata.Metadata;
import br.inf.ufg.mddsm.broker.resource.AbstractTouchpoint;
import br.inf.ufg.mddsm.broker.resource.EventListener;
import br.inf.ufg.mddsm.broker.resource.Executable;
import br.inf.ufg.mddsm.broker.resource.ResourceManager;
import br.inf.ufg.mddsm.broker.state.StateManager;

public class MainManager extends AbstractTouchpoint implements EventListener, Executable {
	private static Logger log = LoggerFactory.getLogger(MainManager.class);
    
    private SignalHandlerManager signalHandlerManager;
    private ResourceManager resourceManager;
    private StateManager stateManager;
    
    public MainManagerContext getContext() {
        return new MainManagerContext();
    }
        
    private class MainManagerContext implements ManagerContext {
        public StateManager getStateManager() {
            return MainManager.this.getStateManager();
        }

        public MainManager getMainManager() {
            return MainManager.this;
        }

        public ResourceManager getResourceManager() {
            return MainManager.this.getResourceManager();
        }
    }

    public MainManager(Metadata metadata, SignalHandlerManager signalHandlerManager, ResourceManager resourceManager,
                       StateManager stateManager) {
        super(metadata);
        log.trace("new MainManager(metadata:{}, signalHandlerManager:{}, resoruceManager:{}, statemManager:{}", metadata, signalHandlerManager, resourceManager, stateManager);
        this.signalHandlerManager = signalHandlerManager;
        this.resourceManager = resourceManager;
        this.stateManager = stateManager;
        
        //valueEvaluator.stateManager = stateManager;
        
    }

	public ValueEvaluator getEvaluator()
    {	
		ValueEvaluator evaluator = new ValueEvaluator(this.stateManager);
		log.trace("getEvaluator() = {}", evaluator);
		return evaluator;
    }
    
    public ResourceManager getResourceManager() {
    	log.trace("getResourceManager() = {}", resourceManager);
        return resourceManager;
    }

    public StateManager getStateManager() {
    	log.trace("getStateManager() = {}", stateManager);
        return stateManager;
    }

    public void start() {
    	log.trace("state()");
        resourceManager.setEventListener(this);
        resourceManager.start();
        super.start();
    }

    public void stop() {
    	log.trace("stop()");
        super.stop();
        resourceManager.stop();
    }

    /**
     * evaluating the signal against the frameworks to
     * find the appropriate framework
     */
    public Object execute(SignalInstance signal) {
    	log.trace("execute(signal:{})", signal);
    	long t1 = System.nanoTime();
    	
        log.debug("Evaluating: " + signal);
//        evaluatePolicies(signal);
        
             
        HandlingResult result = signalHandlerManager.handle(signal, getContext());
        if (result != null)
            return result.getResult();

        sendEvent(signal);
        long t2 = System.nanoTime();
        log.warn("Signal [" + signal + "] not handled!");
        
        System.out.println("MM("+signal+"):" + TimeUnit.MILLISECONDS.convert((t2-t1), TimeUnit.NANOSECONDS) + "ms");
        log.trace("execute() = null");
        return null;
    }

    /**
     * Use this method for external notifications only
     * @param signal
     */
    public void sendEvent(SignalInstance signal) {
    	log.trace("sendEvent(signal:{})", signal);
        if (getEventListener() != null)
            getEventListener().notify(signal);        
    }

    /**
     * Use this method for internal evaluation of the event without enqueueing
     * @param e
     */
    public void throwEvent(SignalInstance e) {
        execute(e);
    }

    /**
     * Use this method for internal evaluation of the event enqueuing
     * @param event
     */
    public void notify(SignalInstance event) {
    	log.trace("notify({})", event);
        enqueue(event.getSource(), event.getName(), event.getParams());
    }
}
