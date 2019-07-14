package br.inf.ufg.mddsm.controller.img;

import br.inf.ufg.mddsm.controller.img.DSC;

public class DSCCall extends Call {

	DSC dsc;
	String eUId;
	
	public DSCCall (DSC dsc, String eUId){
		this.dsc = dsc;
		this.eUId = eUId;
	}
	
	public DSC getDSC(){
		return dsc;
	}
	
	public String getEUId(){
		return eUId;
	}
}
