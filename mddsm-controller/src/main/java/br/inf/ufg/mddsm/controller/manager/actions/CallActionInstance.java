package br.inf.ufg.mddsm.controller.manager.actions;

import java.util.Map;

import base.common.EnqueueCall;
import br.inf.ufg.mddsm.controller.expression.ContextProviderParams;
import br.inf.ufg.mddsm.controller.expression.ValueEvaluator;
import br.inf.ufg.mddsm.controller.manager.ManagerContext;
import br.inf.ufg.mddsm.controller.manager.SignalInstance;

public class CallActionInstance implements ActionInstance {
    private EnqueueCall call;

    public CallActionInstance(EnqueueCall call) {
        this.call = call;
    }

    public Object execute(ManagerContext ctx, Map<String, Object> params) {
    	ValueEvaluator eval = ctx.getMainManager().getEvaluator();
        Map<String, Object> callParams = eval.getParams(new ContextProviderParams(params), call.getBindings());

        ctx.getMainManager().enqueue(new SignalInstance(call.getCall().getName(), callParams));

        return null;
    }
}
