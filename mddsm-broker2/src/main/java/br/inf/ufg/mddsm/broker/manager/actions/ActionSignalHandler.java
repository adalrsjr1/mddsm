package br.inf.ufg.mddsm.broker.manager.actions;

import base.common.Signal;
import br.inf.ufg.mddsm.broker.expression.ValueEvaluator;
import br.inf.ufg.mddsm.broker.manager.HandlingResult;
import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.SignalHandler;
import br.inf.ufg.mddsm.broker.manager.SignalInstance;

public class ActionSignalHandler implements SignalHandler {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ActionSignalHandler.class);
    private Signal signal;
    public ActionCaller action;

    public ActionSignalHandler(Signal signal, ActionCaller action) {
    	log.trace("new ActionSignalHandler(signal:{}, action:{}", signal, action);
        this.signal = signal;
        this.action = action;
    }

    private boolean canHandle(SignalInstance signal) {
    	log.trace("canHandle(signal:{})", signal);
        boolean result = signal.getName().equals(this.signal.getName());
        log.trace("canHandle() = {}", result);
        return result;
    }

    public HandlingResult handle(SignalInstance signal, ManagerContext ctx) {
    	log.trace("handle(signal:{}, ctx:{}", signal, ctx);
    	ValueEvaluator eval = ctx.getMainManager().getEvaluator();
        HandlingResult result = canHandle(signal)
                ? new HandlingResult(action.execute(ctx, signal, eval))
                : HandlingResult.NOT_HANDLED;
                
        log.trace("handle() = {}", result);
        return result;
    }
}
