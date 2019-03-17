package br.inf.ufg.mddsm.broker.manager.actions;

import base.common.Signal;
import br.inf.ufg.mddsm.broker.expression.ValueEvaluator;
import br.inf.ufg.mddsm.broker.manager.HandlingResult;
import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.SignalHandler;
import br.inf.ufg.mddsm.broker.manager.SignalInstance;

public class ActionSignalHandler implements SignalHandler {
    private Signal signal;
    public ActionCaller action;

    public ActionSignalHandler(Signal signal, ActionCaller action) {
        this.signal = signal;
        this.action = action;
    }

    private boolean canHandle(SignalInstance signal) {
        return signal.getName().equals(this.signal.getName());
    }

    public HandlingResult handle(SignalInstance signal, ManagerContext ctx) {
    	ValueEvaluator eval = ctx.getMainManager().getEvaluator();
        return canHandle(signal)
                ? new HandlingResult(action.execute(ctx, signal, eval))
                : HandlingResult.NOT_HANDLED;
    }
}
