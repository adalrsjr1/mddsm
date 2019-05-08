package br.inf.ufg.mddsm.broker.expression

class ContextProviderWrapper {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ContextProviderWrapper.class);
	
    public static Map wrap(Map context) {
		log.trace("wrap(context:{})", context)
        Map wrapped = [:]
        context.each { String k, Object v ->
            wrapped[k] = wrap(v)
        }
		log.trace("wrap() = {}", wrapped)
        wrapped
    }

    public static Object wrap(Object v) {
        if (v instanceof ContextProvider)
            return new ContextProviderWrapper(v)
        else if (v instanceof Map)
            return wrap(v)
        else
            return v
    }

    public ContextProvider context

    public ContextProviderWrapper(ContextProvider context) {
		log.trace("new ContextProviderWrapper(context:{})", context)
        this.context = context
    }

    public getProperty(String name) {
		log.trace("getProperty(name:{})", name)
        Object value = getValue(name)
        def property = value instanceof ContextProvider ? new ContextProviderWrapper(value) : value
		log.trace("getProperty() = {}", property)
		return property
    }

    private Object getValue(String name) {
		log.trace("getValue(name:{})", name)
        def value = context.getVariable(name) ?: context."${name}"
		log.trace("getValue() = {}", value)
		return value
    }

    public String toString() {
        context
    }
}
