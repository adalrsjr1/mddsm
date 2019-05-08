package br.inf.ufg.mddsm.broker.emf

import base.Instance
import br.inf.ufg.mddsm.broker.adapters.Manageable
import br.inf.ufg.mddsm.broker.policy.metadata.Metadata
import br.inf.ufg.mddsm.broker.resource.bridge.ManagedResource

class ManagedResourceFactory {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ManagedResourceFactory.class);
    private MetadataFactory metadataFactory = new MetadataFactory()

    public ManagedResource createManagedObject(Instance instance) {
		log.trace("createManagedObject(instance:{})", instance)
		Manageable manageable = Class.forName(instance.impl).newInstance()
        Metadata metadata = metadataFactory.createMetadata(instance)

        def managedResource = new ManagedResource(metadata, manageable)
		log.trace("createManagedObject() = {}", managedResource)
		return managedResource
    }

}
