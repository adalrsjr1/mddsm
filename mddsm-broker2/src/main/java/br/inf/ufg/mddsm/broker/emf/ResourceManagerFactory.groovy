package br.inf.ufg.mddsm.broker.emf

import base.Instance
import base.InstanceResourceManager
import base.ResourceManager
import br.inf.ufg.mddsm.broker.manager.MainManager
import br.inf.ufg.mddsm.broker.resource.bridge.IBroker

class ResourceManagerFactory {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ResourceManagerFactory.class);
    ManagedResourceFactory objectFactory = new ManagedResourceFactory()

    public br.inf.ufg.mddsm.broker.resource.ResourceManager createObjectManager(ResourceManager resourceManager) {
		log.trace("createObjectManager(resourceManager: {})")
        def resManager = doCreateObjectManager(resourceManager)
		log.trace("createObjectManager() = {}", resManager)
		return resManager
    }

    private br.inf.ufg.mddsm.broker.resource.ResourceManager doCreateObjectManager(InstanceResourceManager resourceManager) {
		log.trace("doCreateObjectManager(resourceManager:{})", resourceManager)
        br.inf.ufg.mddsm.broker.resource.ResourceManager manager = new br.inf.ufg.mddsm.broker.resource.ResourceManager()
		manager.setName(resourceManager.name);

		resourceManager.instances.each {
			Instance instance -> manager.addObject(objectFactory.createManagedObject(instance)) 
		}
		log.trace("doCreateObjectManager() = {}", manager)
        manager
    }

    private br.inf.ufg.mddsm.broker.resource.ResourceManager doCreateObjectManager(ResourceManager resourceManager) {
		log.trace("doCreateObjectManager(resourceManager:{}) = null", resourceManager)
        null
    }

}
