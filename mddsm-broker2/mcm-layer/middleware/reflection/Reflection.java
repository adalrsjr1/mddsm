package middleware.reflection;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Reflection {

	public static void runMethod(Object obj, String[] param){
		Class cls = obj.getClass();
		
		try{
			Method methd = cls.getMethod(param[0], new Class[] {String[].class});
			methd.invoke(obj, new Object[] {param});
		}
		catch(NoSuchMethodException e){
			throw new IllegalArgumentException(cls.getName() + " not support " + param[0]);
				 
		}
		catch(IllegalAccessException e){
			throw new IllegalArgumentException("Permission limited "+ param[0]+" in "+cls.getName());		
		}
		catch(InvocationTargetException e){
			throw new RuntimeException(e);
		}
		
	}
}
