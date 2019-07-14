package br.inf.ufg.mddsm.controller.img;

import java.lang.reflect.InvocationTargetException;


import org.codehaus.janino.Parser.ParseException;
import org.codehaus.janino.Scanner.ScanException;
import org.codehaus.janino.ScriptEvaluator;

public class Negotiate extends PostModelGenerationOperation {
	
	public Negotiate(Object data){
		super(data);
	}
	public boolean execute (){
		boolean result = false;
		ScriptEvaluator script = new ScriptEvaluator();
		script.setReturnType(boolean.class);
		if (data != null){
			try {
				script.cook(data.toString());
			} catch (org.codehaus.janino.CompileException | ParseException | ScanException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				result = (Boolean) script.evaluate(null);
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		} else
			result = true;
		return result;
	}
}