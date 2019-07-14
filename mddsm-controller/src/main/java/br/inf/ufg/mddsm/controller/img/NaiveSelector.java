package br.inf.ufg.mddsm.controller.img;


import java.util.ArrayList;

public class NaiveSelector implements Selector{
	public IntentModel getBestModel(ArrayList<IntentModel> models){
		IntentModel bestModel = null;
		int bestModelCost = Integer.MAX_VALUE;
		System.out.println("models size" + models.size());
		for (int i = 0; i < models.size(); i++){
			int cost = modelCost(models.get(i));
			if (cost < bestModelCost){
				bestModel = models.get(i);
				bestModelCost = cost;
			}
		}
		
		return bestModel;
	}
	
	static int modelCost(IntentModel m){
		return m.getAllDependencies().size();
	}
}
