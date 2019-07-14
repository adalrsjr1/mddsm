package br.inf.ufg.mddsm.controller.img;

import java.io.Serializable;
import java.util.ArrayList;

import dsk.EDSC;
import dsk.impl.EDSCImpl;

public class DSC extends EDSCImpl implements Serializable,EDSC{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String name;
	Type type;
	String prefix = "";
	ArrayList<DSC> parameters = new ArrayList<DSC>();

	public DSC(String name, Type type, String prefix, ArrayList<DSC> parameters){
		this.name = name;
		this.type = type;
		this.prefix = prefix;
		this.parameters = parameters;
	}
	
	public DSC(String name, Type type, String prefix){
		this.name = name;
		this.type = type;
		this.prefix = prefix;
	}
	
	public DSC(String name, Type type){
		this.name = name;
		this.type = type;
		this.prefix = "";
	}

	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public ArrayList<DSC> getAllParameters() {
		return parameters;
	}
	
	public void setParameters(ArrayList<DSC> parameters) {
		this.parameters = parameters;
	}
	
	@Override
	public boolean equals(Object o){
		
		DSC currentDSC = (DSC) o;
		if ((this.prefix.equals(currentDSC.getPrefix())) && (this.name.equals(currentDSC.getName())))
			return true;
		else
			return false;
	}

}
