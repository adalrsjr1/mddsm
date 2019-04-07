package br.inf.ufg.metalang4md.tools

import org.eclipse.emf.compare.Diff
import org.eclipse.emf.ecore.EObject

import metalang4md.EDomainSpecificElement
class ModelToCommandParser {

	public Object process(Diff diff) {
		if((diff.value instanceof EDomainSpecificElement)) {
			return processDomainSpecificElement(diff)
		}
		return processAttribute(diff)
	}

	private Object processDomainSpecificElement(Diff diff) {
		
	}
	
	private Object processAttribute(Diff diff) {
		
	}
	
	private EObject extractParent(Diff diff) {
		return extract(diff, {diff.value.eContainer()}, {diff.attribute.eContainer()})
	}
	
	private def extract(Diff diff, Closure closureForDSE, Closure closureAttribute) {
		if((diff.value instanceof EDomainSpecificElement)) {
			return closureAttribute(diff)
		}
		return closureForDSE(diff)
	}
	
	private def extract(Diff diff, Closure closure) {
		return closure(diff)
	}
	
	private Object extractAction(Diff diff) {
		return extract(diff) {
			diff.kind
		}
	}
	
	private Object extractElement(Diff diff) {
		return extract(diff, {diff.value}, {diff.value})
	}
	
	private Object extractInteractionBehavior(Diff diff) {
		
	}
	
	private Object extractArisingBehavior(Diff diff) {
		
	}
	
	private Object extractCardinality(Diff diff) {
		
	}
	
	private Object extractCoordiantionBehavior(Diff diff) {
		
	}
}