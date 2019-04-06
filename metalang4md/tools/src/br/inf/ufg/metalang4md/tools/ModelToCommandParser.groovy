package br.inf.ufg.metalang4md.tools

import org.eclipse.emf.compare.Diff
import org.eclipse.emf.compare.DifferenceKind
import org.eclipse.emf.compare.internal.spec.AttributeChangeSpec
import org.eclipse.emf.ecore.EObject

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
	} }