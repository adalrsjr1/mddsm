package br.inf.ufg.mddsm.controller.resource.bridge

import java.lang.reflect.InvocationTargetException
import java.lang.reflect.Method as JavaMethod

import org.slf4j.Logger
import org.slf4j.LoggerFactory

import br.inf.ufg.mddsm.controller.adapters.Call

class CallExecutor {
    private static Logger log = LoggerFactory.getLogger(Call.class);

    private Object bridge

    public CallExecutor(Object bridge) {
        this.bridge = bridge
    }

    public JavaMethod getMethod(String name, Map<String, Object> params) {		
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
		
		if(annotation != null && method.name == name && areParamsEquiv(method, annotation, params))
			return method
		null
		
		
		// TODO: Bugged
        /*bridge.getClass().methods.find { JavaMethod method ->
            Call annotation = method.getAnnotation(Call)
            annotation != null && method.name == name && areParamsEquiv(method, annotation, params)
        }*/
    }

    boolean areParamsEquiv(JavaMethod method, Call annotation, Map<String, Object> params) {
		
        if (method.parameterTypes.length != annotation.parameters().size())
		{
			println method.parameterTypes.length ":" annotation.parameters().size()
            return false
		}
		

        for (int i = 0; i < annotation.parameters().size(); i++) {
            String paramName = annotation.parameters()[i];
            Class paramType = method.parameterTypes[i];

            Object paramValue = params.get(paramName);
            if (paramValue != null && !paramType.isAssignableFrom(paramValue.getClass()))
                return false
        }

        return true
    }

    public Object execute(String message, Map<String, Object> params) throws InvocationTargetException {
        if (!Thread.currentThread().getName().startsWith("CVM_SC_MGR"))
            log.debug("${bridge}.$message($params)")

        JavaMethod method = getMethod(message, params)
        method.invoke(bridge, orderParameters(method, params))
    }

//    public boolean executeBoolean(String name, Map<String, Object> params) throws InvocationTargetException {
//        execute(name, params)
//    }

    public Object[] orderParameters(JavaMethod method, Map<String, Object> params) {
        Call annotation = method.getAnnotation(Call)

        Object[] result = new Object[annotation.parameters().size()];
        for (int i = 0; i < result.size(); i++) {
            String paramName = annotation.parameters()[i];
            result[i] = params.get(paramName);
        }

        result
    }
}
