package br.inf.ufg.mddsm.broker.policy.metadata;


import java.util.HashSet;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Feature {
	private static Logger log = LoggerFactory.getLogger(Feature.class);

    private String name;
    private HashSet<Attribute> attributes;
    private HashSet<Feature> subFeatures;
    private Feature parentFeature;

    public static final int EQ = 0;
    public static final int LEQ = -1;
    public static final int GEQ = 1;
    public static final int LT = -2;
    public static final int GT = 2;

    public Feature(String fn) {
    	log.trace("new Feature(fn: {})", fn);
        name = fn;
        attributes = new HashSet<Attribute>();
        subFeatures = new HashSet<Feature>();
        parentFeature = null;
    }

    public Feature(String nodeName, Feature parent) {
        this(nodeName);
        setParent(parent);
    }
    
    public HashSet<Attribute> getAttributes() {
    	log.trace("getAttributes() = {}", attributes);
        return attributes;
    }

    public HashSet<Feature> getSubFeatures() {
    	log.trace("getSubFeatures() == {}", subFeatures);
        return subFeatures;
    }

    public String getName() {
    	log.trace("getName() = {}", name);
        return name;
    }


    public void addAttribute(Attribute attr) {
    	log.trace("addAttribute(attr:{})", attr);
        attributes.add(attr);
    }

    public void addSubFeature(Feature feat) {
    	log.trace("addSubFeature(feat:{})", feat);
        subFeatures.add(feat);
    }

    public Attribute getAttribute(String attributeName) {
    	log.trace("getAttribute(featureName:{})", attributeName);
        for (Attribute attribute : getAttributes()) {
            if (attribute.name.equals(attributeName)) {
            	log.trace("getSubFeature() == {}", attribute);
                return attribute;
            }
        }
        log.trace("getSubFeature() == null");
        return null;
    }

    public Feature getSubFeature(String featureName) {
    	log.trace("getSubFeature(featureName:{})", featureName);
        for (Feature feature : getSubFeatures()) {
            if (feature.getName().equals(featureName)) {
            	log.trace("getSubFeature() == {}", feature);
                return feature;
            }
        }
        log.trace("getSubFeature() == null");
        return null;
    }

    public boolean hasAttributeValue(String attrName, Object val, int opcode) {
    	log.trace("hasAttributeValue(attrName:{}, val:{}, opcode:{}", attrName, val, opcode);
    	boolean result = false;
        if (val instanceof Integer) {
            result = hasAttributeValue(attrName, (Integer) val, opcode);
        }
        else if (val instanceof Boolean) {
            result = hasAttributeValue(attrName, (Boolean) val, opcode);
        }
        else {
        	result = hasAttributeValue(attrName, val.toString(), opcode);
        }
        log.trace("hasAttributeValue() = {}", result);
        return result;
    }

    public boolean hasAttributeValue(String attrName, Integer val, int opcode) {
    	log.trace("hasAttributeValue(attrName:{}, val:{}, opcode:{}", attrName, val, opcode);
        Attribute attr = getAttribute(attrName);
        if (attr == null)
            return false;

        int attrVal;
        try {
            attrVal = Integer.parseInt(attr.attributeValue);
        } catch (NumberFormatException e0) {
            log.debug("Attribute value is not an integer!! "
                    + attr.attributeValue);
            return false;
        }

        log.debug("@@@@@@@@@@@@@@@@@@@@@@@@@");
        log.debug("The integer comparison is " + val + " " + opcode + " " + attrVal);
        boolean result = false;
        switch (opcode) {
            case EQ:
                result = val == attrVal;
                break;
            case LEQ:
                result = val <= attrVal;
                break;
            case LT:
            	result = val < attrVal;
            	break;
            case GT:
            	result = val > attrVal;
            	break;
            case GEQ:
                result = val >= attrVal;
                break;
            default:
                log.debug("Invalid opcode!!");
                result = false;
        }
        log.trace("hasAttributeValue() = {}", result);
        return result;
    }

    public boolean hasAttributeValue(String attrName, Boolean val, int opcode) {
    	log.trace("hasAttributeValue(attrName:{}, val:{}, opcode:{}", attrName, val, opcode);

        Attribute attr = getAttribute(attrName);
        if (attr == null)
            return false;

        log.debug("Found attribute");
        boolean attrVal = Boolean.parseBoolean(attr.attributeValue);
        boolean result = attrVal == val;
        log.trace("hasAttributeValue() = {}", result);
        return result;
    }

    public boolean hasAttributeValue(String attrName, String val, int opcode) {
    	log.trace("hasAttributeValue(attrName:{}, val:{}, opcode:{}", attrName, val, opcode);

        Attribute attr = getAttribute(attrName);
        boolean result = attr != null && attr.attributeValue.equals(val);
        log.trace("hasAttributeValue() = {}", result);
        return result;
    }

    public String toString() {
        String str = "Feature: " + this.getName() + " ( ";
        Iterator<Attribute> attrIterator = this.attributes.iterator();
        while (attrIterator.hasNext())
            str = str + ((Attribute) attrIterator.next()).name + " ";
        str = str + " )  Parent: " + ((this.getParentFeature() != null) ? this.getParentFeature().getName() : "");

        if (this.subFeatures.size() > 0)
            str = str + " has the following " + this.subFeatures.size() + " children\n";

        Iterator<Feature> featIterator = this.subFeatures.iterator();
        while (featIterator.hasNext())
            str = str + "\t" + ((Feature) featIterator.next()).toString() + "\n";


        return str;
    }

    public Feature getParentFeature() {
    	log.trace("getParentFeature() = {}", parentFeature);
        return parentFeature;
    }

    public void setParent(Feature parent) {
    	log.trace("setParente(parente:{})", parent);
        parentFeature = parent;
    }
}
