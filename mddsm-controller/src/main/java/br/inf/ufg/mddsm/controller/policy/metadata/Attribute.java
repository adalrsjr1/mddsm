package br.inf.ufg.mddsm.controller.policy.metadata;

public class Attribute {

	public String name;
	public String attributeValue;
	
	public Attribute(String an, String val){
		name = an;
		attributeValue = val;
	}
	
	@Override
	public String toString()
	{
		return "["+name+":"+attributeValue+"]"; 
	}
}
