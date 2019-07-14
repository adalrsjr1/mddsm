package br.inf.ufg.mddsm.controller.img;

public class Mapper {
	public static Procedure getProcedureForDSC(DSC dsc){
		return null;
	}
	
	public static Procedure getProcedureForDSC(IntentModel model, DSC dsc){
		return model.getProcedure(dsc);
	}

}
