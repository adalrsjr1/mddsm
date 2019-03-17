package br.inf.ufg.mddsm.broker.emf

import base.Instance
import br.inf.ufg.mddsm.broker.adapters.Manageable
import br.inf.ufg.mddsm.broker.policy.metadata.Metadata
import br.inf.ufg.mddsm.broker.resource.bridge.ManagedResource

class ManagedResourceFactory {
    private MetadataFactory metadataFactory = new MetadataFactory()

    public ManagedResource createManagedObject(Instance instance) {
		
		Manageable manageable = Class.forName(instance.impl).newInstance()
        Metadata metadata = metadataFactory.createMetadata(instance)

        new ManagedResource(metadata, manageable)
    }

}
