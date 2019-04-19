package br.ufg.inf.synthesis

import org.eclipse.emf.compare.Diff

import br.ufg.inf.metalang4md.EArising
import br.ufg.inf.metalang4md.ECardinality
import br.ufg.inf.metalang4md.ECoordinationBehavior
import br.ufg.inf.metalang4md.EDomainSpecificElement
import br.ufg.inf.metalang4md.EDomainSpecificType
import br.ufg.inf.metalang4md.EInteractionBehavior

class ModelToCommandParser {

	public String eObjectToXmiString(def eObject) {
		System.err.println(">>> ModelToCommandParser.eObjectToXmiString not implemented yet")
		return eObject
	}
	
	public String xmiStringToEObject(String xmiString) {
		System.err.println(">>> ModelToCommandParser.xmiStringToEObject not implemented yet")
		return xmiString
	}
	
	public CommandControl process(Diff diff) {
		if((diff.value instanceof EDomainSpecificElement)) {
			return processDomainSpecificElement(diff)
		}
		return processAttribute(diff)
	}

	private CommandControl processDomainSpecificElement(Diff diff) {
		CommandAction action = CommandAction.valueOf(diff.kind.name())
		
		def source = extractSourceFromDSElement(diff)
		def target = extractTargetFromDSElement(diff)
		
		CommandControl c = CommandControl.builder(action)
		.withExpression(CommandExpression.builder()
			.withSource(source)
			.withTarget(target)
			.withMetadata(CommandExpressionMetadata.builder()
				.withInteraction(EInteractionBehavior.SYNC)
				.withArising(EArising.DYNAMIC)
				.withCardinality(ECardinality.MANY)
				.withCoordination(ECoordinationBehavior.DISTRIBUTED)
				.build())
			.build())
		.build()
	}
	
	private CommandControl processAttribute(Diff diff) {
		def attribute = extractAttribute(diff)
		def parent = extractParentFromAttribute(diff)
		
		CommandControl command = CommandControl.builder(CommandAction.CHANGE)
			.withAttribute(attribute)
			.withTarget(parent)
		.build()
		return command
	}
	
	private Tuple2 extractAttribute(Diff diff) {
		return new Tuple2(eObjectToXmiString(diff.attribute), eObjectToXmiString(diff.value))
	}
	
	private Tuple2 extractParentFromAttribute(Diff diff) {
		return new Tuple2(eObjectToXmiString(diff.attribute.eContainer().name), eObjectToXmiString(diff.attribute.eContainer()))
	}
	
	private Tuple2 extractSourceFromDSElement(Diff diff) {
		def value = diff.reference.eContainer()
		def key = value.name
		
		return new Tuple2(key, value)
	}
	
	private Tuple2 extractTargetFromDSElement(Diff diff) {
		def value = eObjectToXmiString(diff.value)  
		def key = eObjectToXmiString(diff.value.eClass().name)
		
		return new Tuple2(key, value)
	}
	
	private CommandExpressionMetadata extractMetadata(Diff diff) {
		def value = diff.value
		
		if(!(value instanceof EDomainSpecificType)) {
			return CommandExpressionMetadata.builder().build()
		}
		
		CommandExpressionMetadata.builder()
			.withInteraction(value.interactionBehavior)
			.withArising(value.arisingBehavior)
			.withCardinality(value.cardinality)
			.withCoordination(value.kindInteraction)
			.build()
	}
}