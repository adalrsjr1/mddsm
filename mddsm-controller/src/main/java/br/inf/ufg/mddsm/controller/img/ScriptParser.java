package br.inf.ufg.mddsm.controller.img;

import java.util.ArrayList;

public class ScriptParser {
	String script;
	String command;
	
	
	public ScriptParser (String script){
		this.script = script;
		
	}
	
	public ArrayList<DSC> getCommandClassifiers(){
		DSC sendDSC = new DSC("Send", Type.OPER);
		ArrayList<DSC> al = new ArrayList<DSC>();
		al.add(sendDSC);
		return al;
	}
	
	public ArrayList<ArrayList<Attribute>> getParameters(){
		ArrayList<ArrayList<Attribute>> al = new ArrayList<ArrayList<Attribute>>();
		ArrayList<Attribute> attributes = new ArrayList<Attribute>();
		attributes.add(new Attribute("fileName", "testFile.txt"));
		al.add(attributes);
		return al;
	}
}
