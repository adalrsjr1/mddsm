package br.inf.ufg.mddsm.controller.img;


import java.util.ArrayList;

import com.rits.cloning.*;
import br.inf.ufg.mddsm.controller.img.Repository;
import dsk.EDSC;

public class NaiveGenerator_OLD implements Generator{
	
	private static Cloner cloner = new Cloner();
	
	public ArrayList<IntentModel> generateModels(DSC initDSC) {
		
		/** Collection to store final set of models */
		ArrayList<IntentModel> matchingModels = new ArrayList<IntentModel>();
		
		/** Get procedures for the current DSC */
		ArrayList<Procedure> matchingProcedures = Repository.getInstance().getProceduresWithDSC(initDSC);
		System.out.println(initDSC.getName() + ": " + matchingProcedures.size());
		
		if (matchingProcedures.isEmpty()){
			return null;
		}
		
		for (int i = 0; i < matchingProcedures.size(); i++){
			
			
			/** Temporary collection of models for current level */
			ArrayList<IntentModel> tempMatchingModels = new ArrayList<IntentModel>();
			ArrayList<DSC> dependencies = matchingProcedures.get(i).getDependency();
			
			System.out.println("Dependency name: "+ matchingProcedures.get(i).getName());
			
			System.out.println("NUmber of dependencies: "+dependencies.size());
			
			/** If no dependencies, return model with only current procedure */
			if (dependencies.isEmpty()){
				matchingModels.add(new IntentModel(matchingProcedures.get(i)));
			} else {
				/** If further dependencies, make recursive call, then join */
				ArrayList<IntentModel> subModels = null;
				
				for (int j = 0; j < dependencies.size(); j++){
					
					EDSC dscDep = dependencies.get(j);
					System.out.println(dscDep.getName());
					
					System.out.println(matchingProcedures.get(i).getName() + " is calling: " + dependencies.get(j).getName());
					
					subModels = generateModels(dependencies.get(j));
					
					/** If a procedure is not available to meet a stated dependency, that model is removed. */
					if (subModels != null){
						System.out.println("Submodels is not null");
						/**If first dependency, create new set of models, otherwise merge new and current models*/
						if (j == 0){
							ArrayList<IntentModel> singleModelList = new ArrayList<IntentModel>();
							singleModelList.add(new IntentModel(matchingProcedures.get(i)));
							tempMatchingModels = mergeModels(singleModelList, subModels);
						} else {
							tempMatchingModels = mergeModels(tempMatchingModels, subModels);
						}
					} else {
						System.out.println("Submodels is null");
						tempMatchingModels.clear();
					}
				}
			}

			/**Add lower layer models to final collection*/
			matchingModels.addAll(tempMatchingModels);
		}
		System.out.println("Finishing generate models...");
		return matchingModels;
		
	}
	
	/*
	 * Join models by merging on initial procedure of first set of models (cross product).
	 */
	static ArrayList<IntentModel> mergeModels(ArrayList<IntentModel> models, ArrayList<IntentModel> sub){
		ArrayList<IntentModel> newModels = new ArrayList<IntentModel>();
		
		for (int i = 0; i < models.size(); i++){
			for (int j = 0; j < sub.size(); j++){
				
				//IntentModel newModel = cloner.deepClone(models.get(i));
				IntentModel newModel = models.get(i);
				newModel.addDependency(newModel.getInit().getId(), sub.get(j).getInit());
				newModel.addAllDependencies(sub.get(j).getAllDependencies());
				newModels.add(newModel);
			}
		}
		return newModels;
	}
	/*
	public class Repository extends ProceduresRepository {
		
		ArrayList<Procedure> procedures = new ArrayList<Procedure>();
		
		public Repository(ArrayList<Procedure> procedures){
			this.procedures = procedures;
		}
		
		@Override
		public ArrayList<Procedure> getProceduresWithDSC(DSC dsc){
			
			ArrayList<Procedure> matchingProcedures = new ArrayList<Procedure>();
			for (int i = 0; i < procedures.size(); i++){
				if (procedures.get(i).getClassifier().equals(dsc))
					matchingProcedures.add(procedures.remove(i--));
			}
			return matchingProcedures;
		}
		
		public void addProcedures(ArrayList<Procedure> procedures){
			this.procedures = procedures;
		}
		
		public ArrayList<Procedure> getAllProcedures(){
			return procedures;
		}
	}*/
}
