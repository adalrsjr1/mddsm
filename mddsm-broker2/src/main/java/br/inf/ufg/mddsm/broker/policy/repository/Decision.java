package br.inf.ufg.mddsm.broker.policy.repository;

public class Decision {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Decision.class);
	private String param;
	private String operation;
	private String value;
	
	public Decision(String par, String anOperation, String val)
	{
		log.trace("new Decision(param:{}, anOperation:{}, value:{}", par, anOperation, val);
		param=par;
		operation= anOperation; 
		value=val;
	}
	
	public String getParam()
	{
		log.trace("getParam() = {}", param);
		return param;
	}
	
	public String getOperation()
	{
		log.trace("getOperation() = {}", operation);
		return operation;
	}
	
	public String getValue()
	{
		log.trace("getValue() = {}", value);
		return value;
	}

	@Override
	public String toString() {
		return "Decision [param=" + param + ", operation=" + operation + ", value=" + value + "]";
	}
	
}
