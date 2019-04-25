package br.ufg.inf.synthesis

import br.ufg.inf.metalang4md.*
import groovy.transform.builder.Builder
import org.eclipse.emf.ecore.EObject

class ControlScript {

    void sorting() { }
}

@Builder
class ControlStatement {
    CommandAction action
    ExpressionStatement expressionStatement
}

interface ExpressionStatement {
    boolean hasTarget()

    boolean hasMetadata()
}

@Builder
class ExpressionStatementAdd implements ExpressionStatement {
    EObject element
    EObject to
    MetadataStatement withMetadata

    boolean hasTarget() {
        to != null
    }

    boolean hasMetadata() {
        withMetadata != null
    }
}

@Builder
class MetadataStatement {
    EArising arisingBehavior
    EInteractionBehavior interactionBehavior
    ECardinality cardinality
    ECoordinationBehavior coordination
}

@Builder
class ExpressionStatementDelete implements ExpressionStatement {
    EObject element
    EObject from

    boolean hasTarget() {
        return from != null
    }

    boolean hasMetadata() {
        return false
    }
}

@Builder
class ExpressionStatementChange implements ExpressionStatement {
    String name
    Object value
    EObject into

    boolean hasTarget() {
        return false
    }

    boolean hasMetadata() {
        return false
    }
}