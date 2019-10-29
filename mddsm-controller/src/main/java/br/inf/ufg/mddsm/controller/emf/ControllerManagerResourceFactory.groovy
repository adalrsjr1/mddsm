package br.inf.ufg.mddsm.controller.emf;

import base.Instance;
import br.inf.ufg.mddsm.controller.adapters.Manageable
import br.inf.ufg.mddsm.controller.policy.metadata.Metadata
import br.inf.ufg.mddsm.controller.resource.bridge.BrokerManagedResource
import br.inf.ufg.mddsm.controller.resource.bridge.ManagedResource

@Deprecated
public class ControllerManagerResourceFactory {
	private MetadataFactory metadataFactory = new MetadataFactory()

    public BrokerManagedResource createManagedObject(Instance instance) {
		
		Manageable manageable = Class.forName(instance.impl).newInstance()
        Metadata metadata = metadataFactory.createMetadata(instance)

        new BrokerManagedResource(metadata, manageable)
    }
}
