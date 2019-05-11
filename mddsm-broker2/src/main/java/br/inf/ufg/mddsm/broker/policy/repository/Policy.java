package br.inf.ufg.mddsm.broker.policy.repository;

public class Policy implements Comparable {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Policy.class);
    private Scope pScope;
    private Condition pCondition;
    private BusinessValue pbvalue;
    private Decision pDecision;
    private String pType;

    public boolean isEnabled;
    public String pName;

    public Policy(Scope scope, Condition condition, BusinessValue bvalue, Decision decision, String type, String name) {
    	log.trace("new Policy(scope:{}, condition:{}, bvalue:{}, decision:{}, type:{}, name:{}", scope, condition, bvalue, decision, type, name);
        pScope = scope;
        pCondition = condition;
        pbvalue = bvalue;
        pDecision = decision;
        pType = type;
        pName = name;
    }

    public void enable() {
    	log.trace("enable()");
        isEnabled = true;
    }

    public void disable() {
    	log.trace("disable()");
        isEnabled = false;
    }

    public boolean isEnabled() {
    	log.trace("isEnabled() = {}", isEnabled);
        return isEnabled;
    }

    public Scope getScope() {
    	log.trace("getScope() = {}", pScope);
        return pScope;
    }

    public Condition getCondition() {
    	log.trace("getCondition() = {}", pCondition);
        return pCondition;
    }

    public BusinessValue getBValue() {
    	log.trace("getBValue() = {}", pbvalue);
        return pbvalue;
    }

    public Decision getDecision() {
    	log.trace("getDecision() = {}", pDecision);
        return pDecision;
    }

    public String getPolicyType() {
    	log.trace("getPolicyType() = {}", pType);
        return pType;
    }

    public void setName(String name) {
    	log.trace("setName(name:{})", name);
        pName = name;
    }

    public String getName() {
    	log.trace("getName() = {}", pName);
        return pName;
    }

    public String toString() {
    	StringBuilder sb = new StringBuilder();
    	String str = sb.append("Policy(")
    	  .append(String.format("scope: %b", pScope))
		  .append(String.format("condition: %b", pCondition))
		  .append(String.format("value: %b", pbvalue))
		  .append(String.format("decision: %b", pDecision))
	      .toString();
        
        return str;
    }

    public int compareTo(Object anotherPolicy) {
        int myIntVar = Integer.parseInt(this.getBValue().getValue());
        int theOtherIntVar = Integer.parseInt(((Policy) anotherPolicy).getBValue().getValue());

        if (myIntVar < theOtherIntVar)
            return 1;
        else if (myIntVar > theOtherIntVar)
            return -1;
        else
            return 0;
    }

}
