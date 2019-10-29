package br.inf.ufg.mddsm.controller.emf

import base.metadata.Annotable
import base.metadata.Attribute
import base.metadata.Feature
import br.inf.ufg.mddsm.controller.policy.metadata.Metadata

class MetadataFactory {
    public Metadata createMetadata(Annotable annotable) {
        createMetadata(annotable.name, annotable.features)
    }

    public Metadata createMetadata(String name, Collection<Feature> features) {
        Metadata result = new Metadata(name)

        features.each { Feature feature ->
            result.addFeature(createFeature(null, feature))
        }

        result
    }

    br.inf.ufg.mddsm.controller.policy.metadata.Feature createFeature(br.inf.ufg.mddsm.controller.policy.metadata.Feature parent, Feature feature) {
        br.inf.ufg.mddsm.controller.policy.metadata.Feature result = new br.inf.ufg.mddsm.controller.policy.metadata.Feature(feature.name, parent)
        feature.subFeatures.each { Feature subFeature ->
            result.addSubFeature(createFeature(result, subFeature))
        }
        feature.attributes.each { Attribute attribute ->
            result.addAttribute(createAttribute(attribute))
        }
        result
    }

    br.inf.ufg.mddsm.controller.policy.metadata.Attribute createAttribute(Attribute attribute) {
        new br.inf.ufg.mddsm.controller.policy.metadata.Attribute(attribute.name, attribute.value)
    }
}
