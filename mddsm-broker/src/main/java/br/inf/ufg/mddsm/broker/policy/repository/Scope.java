package br.inf.ufg.mddsm.broker.policy.repository;

public class Scope {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Scope.class);
	private String service;
	private String operation;
	private String active;
	
	public Scope (String aService, String anOperation, String isActive)
	{
		log.trace("new Scope(aService:{}, anOperation:{}, isActive:{})", aService, anOperation, isActive);
		service=aService;
		operation=anOperation;
		active = isActive;
	}
	public String getService()
	{
		log.trace("getService() = {}", service);
		return service;
	}
	
	public String getOperation()
	{
		log.trace("getOperation() = {}", operation);
		return operation;
	}
	
	public String getActive()
	{
		log.trace("getActive() = {}", active);
		return active;
	}
	@Override
	public String toString() {
		return "Scope [service=" + service + ", operation=" + operation + ", active=" + active + "]";
	}
	
	

}
