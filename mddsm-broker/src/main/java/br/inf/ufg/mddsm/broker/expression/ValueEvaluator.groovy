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
		log.trace("new ValueEvaluator(stateManager:{})", stateManager);
		this.stateManager = stateManager
	}

	public Map<String, Object> getParams(ContextProvider context, Collection<ParameterBinding> bindings) {
		log.trace("getParams(context:{}, bindings:{})", context, bindings);
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		ValueEvaluator eval = new ValueEvaluator(stateManager)

		for (ParameterBinding binding: bindings) {
			String name = binding.getParameter().getName();
			Object value = eval.getValue(context, binding.getValue());
			params.put(name, value);
		}
		log.trace("getParams() = {}", params)
		return params;
	}

	public Object getValue(ContextProvider context, Value value) {
		log.trace("getValue(context:{}, value:{})", context, value)
		def result = evaluate(context, value)
		log.trace("getValue() = {}", result)
		return value
		
	}

	private Object evaluate(ContextProvider context, Value value) {
		log.warn("getValue(context:{}, value:{}) = null", context, value)
		null
	}

	private Object evaluate(ContextProvider context, ParameterValue value) {
		log.trace("getValue(context:{}, value:{})", context, value)
		def result = context.getVariable(value.parameter.name)
		log.trace("getValue() = {}", result)
		return result
	}

	private Object evaluate(ContextProvider context, SignalSource value) {
		log.trace("getValue(context:{}, value:{})", context, value)
		def result = context.getVariable("source")
		log.trace("getValue() = {}", result)
		return result
	}

	private Object evaluate(ContextProvider context, ExpressionValue value) {
		log.trace("getValue(context:{}, value:{})", context, value)
		CombinedContextProvider params = new CombinedContextProvider(context)
		stateManager.types.each { StateTypeManager typeManager ->
			params[typeManager.name] = new StateTypeManagerContext(typeManager)
		}

		def result = new GroovyShell(new ContextProviderBinding(context: params)).evaluate(value.value)
		log.trace("evaluate() = {}", result)
		return result
	}
}

class ContextProviderBinding extends groovy.lang.Binding {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ContextProviderBinding.class);
	ContextProvider context

	public Object getParam(String name) {
		log.trace("getParam(name:{})", name)
		def param = context.getVariable(name)
		log.trace("getParam() = {}", param)
		return param
	}

	public Object getVariable(String name) {
		log.trace("getVariable(name:{})", name)
		def variable = ContextProviderWrapper.wrap(getParam(name))
		log.trace("getVariable() = {}", variable)
		return variable
	}
}

class StateTypeManagerContext extends AbstractMap {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(StateTypeManagerContext.class);
	private StateTypeManager typeManager

	public StateTypeManagerContext(StateTypeManager typeManager) {
		log.trace("new StateTypeManagerContext(typeManager:{}", typeManager())
		this.typeManager = typeManager
	}

	Set entrySet() {
		typeManager.all.collect { StateHolder holder ->
			new MapEntry(holder.id, holder)
		}
	}
}