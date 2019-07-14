package br.inf.ufg.mddsm.controller.emf

import base.Instance
import br.inf.ufg.mddsm.controller.adapters.Manageable
import br.inf.ufg.mddsm.controller.policy.metadata.Metadata
import br.inf.ufg.mddsm.controller.resource.bridge.ManagedResource

class ManagedResourceFactory {
    private MetadataFactory metadataFactory = new MetadataFactory()

    public ManagedResource createManagedObject(Instance instance) {
		
		Manageable manageable = Class.forName(instance.impl).newInstance()
        Metadata metadata = metadataFactory.createMetadata(instance)

        new ManagedResource(metadata, manageable)
    }

}
