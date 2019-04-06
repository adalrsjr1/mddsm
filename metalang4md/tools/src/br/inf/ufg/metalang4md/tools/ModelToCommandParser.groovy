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

class CommandFactory {
	static Command create(DifferenceKind kind, EObject value, EObject parent) {
		return doCreateByKind(kind, value, parent)
	}
	
	static private Command doCreateByKind(DifferenceKind kind, EObject value, EObject parent) {
		 switch(kind) {
			 case DifferenceKind.ADD:
			 return createAdd(value, parent)
			 break
			 
			 case DifferenceKind.DELETE:
			 return createDelete(value, parent)
			 break
			 
			 case DifferenceKind.CHANGE:
			 retrun createChange(value, parent)
			 break
			 
			 case DifferenceKind.MOVE:
			 throw new UnsupportedOperationException("There is no command to hande MOVE operation on model")
			 break
			 
			 default:
			 break
		 }
	}
	
	static private Command createAdd(EObject value, EObject parent) {
	} 
	
	static private Command createDelete(EObject value, EObject parent) {
	}
	
	static private Command createChange(EObject value, EObject parent) {
	}
	
	static private Command createBind(EObject value, EObject parent) {
	}

	static private Command doCreateByType(EObject value, EObject parent) {
		if(value instanceof EDomainSpecificType) {
			
		}
		else if(value instanceof EActor) {
			
		}
		else if(value instanceof EItem) {
			
		}
		else {
			
		}
	}
		
}

interface Command {
	def execute()
}

class CommandAdd implements Command {

	@Override
	public Object execute() {
		return null;
	}
}

class CommandDelete implements Command {

	@Override
	public Object execute() {
		return null;
	}
}

class CommandChange implements Command {

	@Override
	public Object execute() {
		return null;
	} 
}

class CommandBind implements Command {

	@Override
	public Object execute() {
		// TODO Auto-generated method stub
		return null;
	}
	
}