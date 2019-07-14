package br.inf.ufg.mddsm.controller.script;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.codehaus.commons.compiler.CompileException;

import br.inf.ufg.mddsm.controller.img.DSC;
import br.inf.ufg.mddsm.controller.img.Executor;
import br.inf.ufg.mddsm.controller.img.IntentModel;
import br.inf.ufg.mddsm.controller.img.NaiveGenerator;
import br.inf.ufg.mddsm.controller.img.NaiveSelector;
import br.inf.ufg.mddsm.controller.img.Negotiate;
import br.inf.ufg.mddsm.controller.img.Type;
import br.inf.ufg.mddsm.controller.img.NaiveValidator;

/*
 * Class responsible for insert operational semantics
 */
public class ScriptProcessor {
	
	List<String> commands;
	ArrayList<IntentModel> matchingModels = null;
	ArrayList<IntentModel> validModels = null;
	IntentModel bestModel = null;
	
	//user preference
	DSC dsc = new DSC("Send", Type.OPER);
	
	public void processor(List<String> commands) {
		this.commands = commands;
		System.out.println("Processing script...");
		generateIMs();
	}
	
	public void addNFProperties() {
		
	}
	
	
	
	public void generateIMs() {
	
		System.out.println("Generating IMs...");
		
		Iterator<String> i = commands.iterator();
		
		while(i.hasNext()) {
		
			// Get initial DSC
			DSC initialDSC = new DSC(i.next(), Type.OPER);
			
			System.out.println("DSC initial: "+initialDSC.getName());
			
			// Find all models which match command
			matchingModels = (new NaiveGenerator()).generateModels(initialDSC);
			
			// Find valid models based on user preferences
			validModels = (new NaiveValidator()).validateModels(matchingModels, dsc);
			
			// Find the best model based on cost
			bestModel = (new NaiveSelector()).getBestModel(validModels);
		
			printIMs(matchingModels, bestModel);
			
		}
		
	}
	
	public void executeModel(IntentModel bestModel) {
		System.out.println("Beginnning Model Execution");
		
		try {
			(new Executor()).executeModel(bestModel, new Negotiate("System.out.println(\"Precondition executing...\"); return true;"));
		} catch (CompileException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (Exception e){
			e.printStackTrace();
		}
		
		
	}
	
	public void printIMs(ArrayList<IntentModel> matchingModels, IntentModel bestModel) {
		// Format and print report
		System.out.println("We generated " + matchingModels.size() + " models");
		System.out.println();
					
		System.out.println();
		if (matchingModels.size() > 0)
			System.out.println("The best model is:\n" + bestModel.prettyPrinter());
			
					
		System.out.println("\n\nThe full list of models:\n");
		for (int k = 0; k < matchingModels.size(); k++){
			System.out.println(matchingModels.get(k).prettyPrinter());
		}
	}
	
	
}
