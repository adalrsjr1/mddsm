package br.ufg.inf.mddsm.synthesis

import org.eclipse.emf.compare.AttributeChange
import org.eclipse.emf.compare.Diff
import org.eclipse.emf.compare.DifferenceKind
import org.eclipse.emf.compare.ReferenceChange
import org.eclipse.emf.compare.ResourceAttachmentChange
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature

import br.ufg.inf.metalang4md.EDomainSpecificElement
import groovy.util.logging.Log4j2

class ControlScript {
    private final List<Command> commands

	String toString() {
		StringBuilder sb = new StringBuilder("(")
		commands.inject(sb) { acc, item -> 
			acc.append(item.toString())
			acc.append("\n")
		}
		sb.append(")")
		
		return sb.toString()
	}
	
    ControlScript() {
        commands = []
    }
	
	ControlScript(List commands) {
		this.commands = []
		commands.each { command ->
			if(command instanceof Command || command instanceof Diff) {
				this << command
			} else {
				throw new RuntimeException("unable to create a script with a statement $command of type ${command.class}")
			}
		}
	}
	
	ControlScript leftShift(Diff diff) {
		add(diff)
	}
	
	ControlScript leftShift(EventObject event) {
		add(event)
	}
	
    ControlScript leftShift(Command command) {
        add(command)
        this
    }
	
	void add(Diff diff) {
		commands << diff
	}
	
	void add(EventObject event) {
		commands << event
	}
	
	void add(Command command) {
		commands << command
	}

    int size() {
        commands.size()
    }

    void sorting() {
        commands.sort(new DiffComparator())
    }

    private static class DiffComparator implements Comparator<Diff> {

        private def getValue(Diff diff) {
            if(diff instanceof AttributeChange) {
                return diff.attribute.eContainer()
            }

            if(diff instanceof ReferenceChange) {
                return diff.reference.eContainer()
            }

            if(diff instanceof ResourceAttachmentChange) {
                return diff.resourceURI
            }

        }

        int compare(Diff arg0, Diff arg1) {
            // add first always
            if(arg0.kind != arg1.kind && DifferenceKind.ADD == arg0.kind) {
                return 1
            }

            def elem0 = getValue(arg0)
            def elem1 = getValue(arg1)

            def result = innerComparision(elem0, elem1)

            return result

        }

        private int innerComparision(def elem0, def elem1) {
            def and = { List list ->
                list.inject { acc, val -> acc && val }
            }

            def xor = { List list ->
                list.inject { acc, val -> acc ^ val }
            }

            def or = { List list ->
                list.inject { acc, val -> acc || val }
            }

            // none is EObject
            if(!(elem0 instanceof EObject) && !(elem1 instanceof EObject)) {
                String s0 = elem0.toString()
                String s1 = elem1.toString()

                return s0 <=> s1
            }

            // only one of them is EObject
            if(elem0 instanceof EObject ^ elem1 instanceof EObject) {
                if(elem0 instanceof EObject) {
                    return 1
                }
                return -1
            }

            // sorting by # of children
            if(!(elem0 instanceof EDomainSpecificElement) && !(elem1 instanceof EDomainSpecificElement)) {
                return elem0.eContents()?.size() ?: 0 <=>  elem1.eContents()?.size() ?: 0
            }

            // sorting by priority
            if(elem0 instanceof EDomainSpecificElement && elem1 instanceof EDomainSpecificElement) {
                return elem0.getCommandPriority() <=> elem1.getCommandPriority()
            }

            // DomainSpecificElement has priority over other elements
            if(elem0 instanceof EDomainSpecificElement ^ elem1 instanceof EDomainSpecificElement) {
                if(elem0 instanceof EDomainSpecificElement) {
                    return 1
                }
                return -1
            }

        }
    }

}

@Log4j2
class Command {
	final private EObject source
	final private EObject target
	final private EObject updatedElement
	final private def value
	final private DifferenceKind kind

	String toString() {
		StringBuilder sb = new StringBuilder("Command[")
		sb.append("action:")
		sb.append(kind)
		sb.append(", source:")
		sb.append(source())
		sb.append(", target:")
		sb.append(target())
		sb.append(", value:")
		sb.append(value())
		sb.append("]")
		
		sb.toString()
	}
	
	Command() { }
	
    Command(EventObject event) {
        throw new UnsupportedOperationException("Not handling EventObject yet")
    }

    Command(Diff diff) {
		this.source = diff.match.left
		this.target = extractTarget(diff)
		this.updatedElement = diff.match.right
		this.value = diff.value
		this.kind = diff.kind
    }
	
	private extractTarget(Diff diff) {
		if(diff instanceof AttributeChange) {
			return diff.attribute
		}
		return diff.reference
	}

    EObject source() {
        this.source
    }

    EObject target() {
        this.target
    }
	
    EObject updatedElement() {
        this.updatedElement
    }

    def value() {
        this.value  
    }

    Map valueMetadata() {
        extractMetadata(value())
    }

    private Map extractMetadata(def value) {
        Map metadata = [:]
        if(value instanceof EDomainSpecificElement) {
            metadata["priority"] = value.commandPriority
            addMetapropertyToMap(metadata, "cardinality", value)
            addMetapropertyToMap(metadata, "interactionBehavior", value)
            addMetapropertyToMap(metadata, "kindInteraction", value)
            addMetapropertyToMap(metadata, "arisingBehavior", value)
        }
        return metadata
    }

    private addMetapropertyToMap(Map map, String propertyName, def source) {
        if(source.properties.containsKey(propertyName)) {
            map[propertyName] = source?."${propertyName}"
        }
    }

    Map sourceMetadata() {
        extractMetadata(source())
    }

    CommandAction action() {
        switch (this.kind) {
            case DifferenceKind.ADD: return CommandAction.ADD
            case DifferenceKind.DELETE: return CommandAction.DELETE
            case DifferenceKind.CHANGE: return CommandAction.CHANGE
            case DifferenceKind.MOVE: return CommandAction.MOVE
            case DifferenceKind.ADD_VALUE: return CommandAction.ADD_VALUE
            case DifferenceKind.CHANGE_VALUE: return CommandAction.CHANGE_VALUE
            case DifferenceKind.DELETE_VALUE: return CommandAction.DELETE_VALUE
            case DifferenceKind.MOVE_VALUE: return CommandAction.MOVE_VALUE
            default:
                log.error "Action ${diff.kind} not supported"
                throw new RuntimeException("Action not supported")
        }
    }
}

enum CommandAction {
    ADD, DELETE, CHANGE, MOVE, ADD_VALUE, CHANGE_VALUE, DELETE_VALUE, MOVE_VALUE
}
