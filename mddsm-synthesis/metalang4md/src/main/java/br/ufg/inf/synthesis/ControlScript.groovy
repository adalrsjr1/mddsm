package br.ufg.inf.synthesis

import br.ufg.inf.metalang4md.*
import groovy.util.logging.Log4j2
import org.eclipse.emf.compare.*
import org.eclipse.emf.compare.internal.spec.AttributeChangeSpec
import org.eclipse.emf.compare.internal.spec.ReferenceChangeSpec
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

import javax.naming.OperationNotSupportedException

class ControlScript {
    private final List<Diff> commands

    ControlScript() {
        commands = []
    }

    ControlScript leftShift(Diff diff) {
        commands << new Command(diff)
        this
    }

    ControlScript leftShift(Command command) {
        commands << command
        this
    }

    ControlScript leftShift(EventObject event) {
        commands << new Command(event)
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
    final private Diff diff

    Command(EventObject event) {
        throw new UnsupportedOperationException("Not handling EventObject yet")
    }

    Command(Diff diff) {
        this.diff = diff
    }

    EObject source() {
        diff.match.left
    }

    EObject target() {
        if(diff instanceof AttributeChange) {
            return diff.attribute
        }
        return diff.reference
    }

    EObject updatedElement() {
        diff.match.right
    }

    def value() {
        diff.value  
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
        switch (diff.kind) {
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
