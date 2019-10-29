package br.inf.ufg.mddsm.controller.img;


import java.util.ArrayList;



public interface Selector {
	public IntentModel getBestModel(ArrayList<IntentModel> models);
}
