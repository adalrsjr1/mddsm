package br.inf.ufg.mddsm.broker.policy;

import java.util.Map;

public class PolicyContext {
    private String feature;
    private Map<String, Object> params;

    public PolicyContext(String feature, Map<String, Object> params) {
        this.feature = feature;
        this.params = params;
    }

    public String getFeature() {
        return feature;
    }

    public Map<String, Object> getParams() {
        return params;
    }
    
    public String toString() {
    	return "PolicyContext(feature:" + feature + ", params:" + params+")";
    }
}
