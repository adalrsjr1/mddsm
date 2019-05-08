package br.inf.ufg.mddsm.broker.expression

import org.slf4j.Logger
import org.slf4j.LoggerFactory

import base.common.*
import br.inf.ufg.mddsm.broker.state.StateHolder
import br.inf.ufg.mddsm.broker.state.StateManager
import br.inf.ufg.mddsm.broker.state.StateTypeManager

class ValueEvaluator {
    // TODO: remove & fix this hack
	private static final Logger log = LoggerFactory.getLogger(ValueEvaluator.class)
    private StateManager stateManager

	ValueEvaluator(StateManager stateManager)
	{
		this.stateManager = stateManager
	}
	
    public Map<String, Object> getParams(ContextProvider context, Collection<ParameterBinding> bindings) {
        Map<String, Object> params = new LinkedHashMap<String, Object>();
		ValueEvaluator eval = new ValueEvaluator(stateManager)
		
        for (ParameterBinding binding: bindings) {
            String name = binding.getParameter().getName();
            Object value = eval.getValue(context, binding.getValue());
            params.put(name, value);
        }

        return params;
    }

    public Object getValue(ContextProvider context, Value value) {
		log.debug("getValue(context:{}, value:{})", context, value)
        evaluate(context, value)
    }

    private Object evaluate(ContextProvider context, Value value) {
		log.warn("getValue(context:{}, value:{})", context, value.dump())
        null
    }

    private Object evaluate(ContextProvider context, ParameterValue value) {
        context.getVariable(value.parameter.name)
    }

    private Object evaluate(ContextProvider context, SignalSource value) {
        context.getVariable("source")
    }

    private Object evaluate(ContextProvider context, ExpressionValue value) {
        CombinedContextProvider params = new CombinedContextProvider(context)
        stateManager.types.each { StateTypeManager typeManager ->
            params[typeManager.name] = new StateTypeManagerContext(typeManager)
        }

        new GroovyShell(new ContextProviderBinding(context: params)).evaluate(value.value)
    }
}

class ContextProviderBinding extends groovy.lang.Binding {
  ContextProvider context

  public Object getParam(String name) {
    context.getVariable(name)
  }

  public Object getVariable(String name) {
    ContextProviderWrapper.wrap(getParam(name))
  }
}

class StateTypeManagerContext extends AbstractMap {
    private StateTypeManager typeManager

    public StateTypeManagerContext(StateTypeManager typeManager) {
        this.typeManager = typeManager
    }

    Set entrySet() {
        typeManager.all.collect { StateHolder holder ->
            new MapEntry(holder.id, holder)
        }
    }


}