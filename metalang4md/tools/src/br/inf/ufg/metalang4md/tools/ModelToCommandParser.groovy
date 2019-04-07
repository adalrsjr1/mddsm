package br.inf.ufg.metalang4md.tools

import org.eclipse.emf.compare.Diff
import org.eclipse.emf.compare.DifferenceKind
import org.eclipse.emf.compare.internal.spec.AttributeChangeSpec
import org.eclipse.emf.ecore.EObject

import metalang4md.EActor
import metalang4md.EDomainSpecificType
import metalang4md.EItem

class ModelToCommandParser {

	public Object process(Diff diff) {
		return CommandFactory.create(diff.kind, diff.value, extractParent(diff))
	}

	private EObject extractParent(Diff diff) {
		if(!(diff instanceof AttributeChangeSpec)) {
			return null
		}
		return diff.attribute.eContainer()
	}
}

enum Actions {
	
}

interface CommandFactory {
	Object create()
}

enum Elements {
	ACTOR {
		
	},
	
	ITEM {
		
	}, 
	
	TYPE {
		
	}
}