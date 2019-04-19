package br.ufg.inf.synthesis

import br.ufg.inf.metalang4md.*
import groovy.util.logging.Log4j2
import org.eclipse.emf.compare.Diff
import org.eclipse.emf.compare.ResourceAttachmentChange
import org.eclipse.emf.compare.internal.spec.AttributeChangeSpec
import org.eclipse.emf.compare.internal.spec.ReferenceChangeSpec

import javax.naming.OperationNotSupportedException

@Log4j2
class ModelToCommandParser {

	String eObjectToXmiString(def eObject) {
		log.warn "ModelToCommandParser.eObjectToXmiString not implemented yet"
		return eObject
	}

	String xmiStringToEObject(String xmiString) {
		log.warn "ModelToCommandParser.xmiStringToEObject not implemented yet"
		return xmiString
	}

	CommandControl process(Diff diff) {
		if(diff instanceof ResourceAttachmentChange) {
			return processResourceAttachementChangeSpec(diff)
		}

		if(diff instanceof ReferenceChangeSpec) {
			return processDomainSpecificElement(diff)
		}

		if(diff instanceof AttributeChangeSpec) {
			return processAttribute(diff)
		}

		throw new OperationNotSupportedException("There is no processor to handle $diff.class diff operation")
	}

	private CommandControl processResourceAttachementChangeSpec(Diff diff) {
		return null
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

	private CommandControl processReferenceChange(Diff diff) {
		return null
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