package br.ufg.inf.synthesis

import br.ufg.inf.metalang4md.EDomainSpecificElement
import br.ufg.inf.metalang4md.Metalang4mdPackage
import groovy.transform.Canonical
import org.eclipse.emf.compare.AttributeChange
import org.eclipse.emf.compare.Diff
import org.eclipse.emf.compare.ReferenceChange
import org.eclipse.emf.compare.ResourceAttachmentChange

@Canonical
class ModelChange {

    private Diff diff

    private ModelChange(Diff diff) {
        this.diff = diff
    }

    ControlStatement createCommand() {

    }

    private ControlStatement createCommandAdd(Diff diff) {
        ControlStatement.builder()
            .action(CommandAction.transformDifferenceKind(diff.kind))
            .expressionStatement(
                    ExpressionStatementAdd.builder()
                        .element(getValue(diff))
                        .to(getParent(diff))
                        .withMetadata(
                                MetadataStatement.builder()
                                .arisingBehavior()
                                .interactionBehavior()
                                .cardinality()
                                .coordination()
                                .build()
                        ).build()
            )
            .build()
    }

    private getAction(Diff diff) {
        diff.kind
    }

    private getParent(Diff diff) {
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

    private getValue(Diff diff) {
        return diff.value
    }

    private MetadataStatement getMetadata(Diff diff) {
        def value = getValue(diff)
        if(!(value instanceof EDomainSpecificElement)) {
            return MetadataStatement.builder().build()
        }
//
        def feature = value.eClass().getEStructuralFeature(Metalang4mdPackage.ECOORDINATION_BEHAVIOR)
        if(feature)
            println value.  eGet(feature)
    }



}
