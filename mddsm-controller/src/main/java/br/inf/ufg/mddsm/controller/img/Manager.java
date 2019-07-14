package br.inf.ufg.mddsm.controller.img;

public class Manager {
	private IntentModel currentModel;
	
	public Procedure getProcedureForDSC(DSC dsc){
		return currentModel.getProcedure(dsc);
	}
}
