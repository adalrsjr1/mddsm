package br.inf.ufg.mddsm.broker.policy.repository;

public class Condition {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Condition.class);
	private String feature;
	private String operation;
	private String literal;
	
	public Condition(String aFeature, String anOperation, String anLiteral) {
		log.trace("new Condition(aFeature:{}, anOperation:{}, anLiteral:{}", aFeature, anOperation, anLiteral);
		feature = aFeature;
		operation=anOperation;
		literal=anLiteral;
	}
	
	public String getFeature()
	{
		log.trace("getFeature() = {}", feature);
		return feature;
	}
	
	public String getOperation()
	{
		log.trace("getOperation() = {}", operation);
		return operation;
	}
	
	public String getLiteral()
	{
		log.trace("getLiteral() = {}", literal);
		return literal;
	}

	@Override
	public String toString() {
		return "Condition [feature=" + feature + ", operation=" + operation + ", literal=" + literal + "]";
	}
	
	
}
