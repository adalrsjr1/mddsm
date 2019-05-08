package br.inf.ufg.mddsm.broker.manager;

import java.util.Collection;
import java.util.PriorityQueue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SignalHandlerManager {
	private final Logger log = LoggerFactory.getLogger(SignalHandlerManager.class);
	private Collection<HandlerEntry> handlers = new PriorityQueue<HandlerEntry>();

    public void register(int priority, SignalHandler handler) {
        handlers.add(new HandlerEntry(priority, handler));
    }

    public void register(SignalHandler handler) {
        register(0, handler);
    }

    public HandlingResult handle(SignalInstance signal, ManagerContext ctx) { 
        for (HandlerEntry entry : handlers) {
            SignalHandler handler = entry.getHandler();
            HandlingResult result = handler.handle(signal, ctx);
            log.debug("handled: {}, result: {}", handler, result);
            if (result.isHandled())
                return result;
        }

        return null;
    }

    class HandlerEntry implements Comparable<HandlerEntry> {
        private int priority;
        private SignalHandler handler;

        HandlerEntry(int priority, SignalHandler handler) {
            this.priority = priority;
            this.handler = handler;
        }

        public int compareTo(HandlerEntry o) {
            return priority - o.priority;
        }

        public SignalHandler getHandler() {
            return handler;
        }
    }
}
