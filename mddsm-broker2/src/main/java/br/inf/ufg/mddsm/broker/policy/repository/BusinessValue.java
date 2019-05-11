package br.inf.ufg.mddsm.broker.policy.repository;

public class BusinessValue {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(BusinessValue.class);
	private String businessGroup;
	private String value;
	
	public BusinessValue(String bgroup, String v)
	{
		log.trace("new BusinessValue(bgroup:{}, value:{})", bgroup, v);
		businessGroup=bgroup;
		value=v;
	}
	
	public String getBusinessGroup()
	{
		log.trace("getBusinessGroup() = {}", businessGroup);
		return businessGroup;
	}
	
	public String getValue()
	{
		log.trace("getValue()", value);
		return value;
	}

	@Override
	public String toString() {
		return "BusinessValue [businessGroup=" + businessGroup + ", value=" + value + "]";
	}
	
}
