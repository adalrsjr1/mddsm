package br.inf.ufg.mddsm.broker.manager;

public class HandlingResult {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(HandlingResult.class);
    private boolean handled;
    private Object result;
    public static final HandlingResult NOT_HANDLED = new HandlingResult();

    public HandlingResult(boolean handled, Object result) {
    	log.trace("new HandlingResult(handled:{}, result:{})");
        this.handled = handled;
        this.result = result;
    }

    public HandlingResult() {
    	this(false, null);
    }

    public HandlingResult(Object result) {
        this(true, result);
    }

    public boolean isHandled() {
    	log.trace("isHandled() = {}", handled);
        return handled;
    }

    public Object getResult() {
    	log.trace("getResult() = {}", result);
        return result;
    }
    
    public String toString() {
		return "result(handled:" + handled +" , result:"+ result +")";
    	
    }
}
