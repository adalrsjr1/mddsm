package br.ufg.inf.synthesis

import org.eclipse.emf.compare.AttributeChange
import org.eclipse.emf.compare.Diff
import org.eclipse.emf.compare.ReferenceChange
import org.eclipse.emf.compare.ResourceAttachmentChange

class DiffExtractor {

    static def getValue(Diff diff) {
        if(diff instanceof AttributeChange) {
            return diff.attribute.eContainer()
        }

        if(diff instanceof ReferenceChange) {
            return diff.reference.eContainer()
        }

        if(diff instanceof ResourceAttachmentChange) {
            return diff.resourceURI
        }

        return diff.value
    }

}
