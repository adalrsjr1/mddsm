package br.inf.ufg.mddsm.broker.resource.bridge

import java.lang.reflect.InvocationTargetException
import java.lang.reflect.Method as JavaMethod

import org.slf4j.Logger
import org.slf4j.LoggerFactory

import br.inf.ufg.mddsm.broker.adapters.Call
import br.inf.ufg.mddsm.broker.adapters.EventException

class CallExecutor {
    private static Logger log = LoggerFactory.getLogger(Call.class);

    private Object bridge

    public CallExecutor(Object bridge) {
		log.trace("new CallExecutor({})", bridge);
        this.bridge = bridge
    }

    public JavaMethod getMethod(String name, Map<String, Object> params) {
		log.trace("getMethod(name:{}, params:{})", name, params);		
		JavaMethod[] methods = bridge.getClass().getMethods()
	
		
		def annotation = null
		def method = null
		for(int i=0; i<methods.size(); ++i)
		{
			if(methods[i].name.equals(name))
			{
				
				method = methods[i]
				annotation = method.getAnnotation(Call)
			}
				
		}
		
		if(annotation != null && method.name == name && areParamsEquiv(method, annotation, params)) {
			log.trace("getMethod() = {}", method);
			return method
		}
		log.trace("getMethod() = null");
		null
    }

    boolean areParamsEquiv(JavaMethod method, Call annotation, Map<String, Object> params) {
		log.trace("areParamsEquiv(method:{}, annotation:{}, params:{}", method, annotation, params)
		
        if (method.parameterTypes.length != annotation.parameters().size())
		{
			println method.parameterTypes.length ":" annotation.parameters().size()
			log.trace("areParamsEquiv() = {}", false)
            return false
		}
		

        for (int i = 0; i < annotation.parameters().size(); i++) {
            String paramName = annotation.parameters()[i];
            Class paramType = method.parameterTypes[i];

            Object paramValue = params.get(paramName);
            if (paramValue != null && !paramType.isAssignableFrom(paramValue.getClass())) {
				log.trace("areParamsEquiv() = {}", false)
                return false
            }
        }
		log.trace("areParamsEquiv() = {}", true)
        return true
    }

    public Object execute(String message, Map<String, Object> params) throws InvocationTargetException {
		log.trace("execute(message:{}, params:{})", message, params)

        JavaMethod method = getMethod(message, params)
		
		if(!method) {
			throw new InvocationTargetException(new RuntimeException("Method '$message' not found in '${bridge.class}'"))
		}
		
        def result = method.invoke(bridge, orderParameters(method, params))
		log.trace("execute() = {}", result)
		return result
    }

    public Object[] orderParameters(JavaMethod method, Map<String, Object> params) {
		log.trace("orderParameters(method:{}, params:{})", method, params);
        Call annotation = method.getAnnotation(Call)

        Object[] result = new Object[annotation.parameters().size()];
        for (int i = 0; i < result.size(); i++) {
            String paramName = annotation.parameters()[i];
            result[i] = params.get(paramName);
        }

		log.trace("orderParameters() = {}", result)
        result
    }
}
