package br.inf.ufg.mddsm.controller.img;


import java.util.ArrayList;

public interface Validator {
	public ArrayList<IntentModel> validateModels(ArrayList<IntentModel> models, Object... dsc);
}
