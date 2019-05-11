package br.inf.ufg.mddsm.broker.emf

import base.metadata.Annotable
import base.metadata.Attribute
import base.metadata.Feature
import br.inf.ufg.mddsm.broker.policy.metadata.Metadata

class MetadataFactory {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(MetadataFactory.class);
	
    public Metadata createMetadata(Annotable annotable) {
        def metadata = createMetadata(annotable.name, annotable.features)
		
		return metadata
    }

    public Metadata createMetadata(String name, Collection<Feature> features) {
		log.trace("createMetadata(name:{}, features:{})", name, features)
        Metadata result = new Metadata(name)

        features.each { Feature feature ->
            result.addFeature(createFeature(null, feature))
        }
		log.trace("createMetadata() = {}", result)
        result
    }

    br.inf.ufg.mddsm.broker.policy.metadata.Feature createFeature(br.inf.ufg.mddsm.broker.policy.metadata.Feature parent, Feature feature) {
		log.trace("createFeature(parent:{}, feature:{})", parent, feature)
        br.inf.ufg.mddsm.broker.policy.metadata.Feature result = new br.inf.ufg.mddsm.broker.policy.metadata.Feature(feature.name, parent)
        feature.subFeatures.each { Feature subFeature ->
            result.addSubFeature(createFeature(result, subFeature))
        }
        feature.attributes.each { Attribute attribute ->
            result.addAttribute(createAttribute(attribute))
        }
		log.trace("createFeature() = {}", result)
        result
    }

    br.inf.ufg.mddsm.broker.policy.metadata.Attribute createAttribute(Attribute attribute) {
		log.trace("createAttribute(attribute:{})", attribute)
        def attr = new br.inf.ufg.mddsm.broker.policy.metadata.Attribute(attribute.name, attribute.value)
		log.trace("createAttribute() = attr", attr)
		return attr
    }
}
