package br.inf.ufg.mddsm.controller.img;


import java.util.ArrayList;

public class ProceduresRepository {
	
	private static ProceduresRepository instance;
	
	ArrayList<Procedure> procedures = new ArrayList<Procedure>();
	
	public void addProcedure(Procedure procedure){
		procedures.add(procedure);
	}
	
	public Procedure getProcedure(String id){
		
		for (int i = 0; i < procedures.size(); i++){
			if (procedures.get(i).getId().equals(id))
				return procedures.get(i);
		}
		return null;
	}
	
	public ArrayList<Procedure> getAllProcedures(){
		return procedures;
	}
	
	public ArrayList<Procedure> getProceduresWithDSC(DSC dsc){
		
		ArrayList<Procedure> matchingProcedures = new ArrayList<Procedure>();
		for (int i = 0; i < procedures.size(); i++){
			if (procedures.get(i).getClassifier().equals(dsc))
				matchingProcedures.add(procedures.get(i));
		}
		return matchingProcedures;
	}
	
	public boolean isEmpty(){
		return procedures.isEmpty();
	}
	
	public static ProceduresRepository getInstance(){
		if (instance == null)
			instance = new ProceduresRepository();
		return instance;
	}
}
