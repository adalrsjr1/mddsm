package br.ufg.inf.synthesis


import br.ufg.inf.synthesis.api.ModelHandler
import groovy.util.logging.Log4j2

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

@Log4j2
class EmfModelHandler implements ModelHandler {

    EObject load(URI filepath, String eNS_URI='', EPackage ePackageInstance=null ) {
        EPackage.Registry.INSTANCE.put(eNS_URI, ePackageInstance)
        // Register the XMI resource factory for the .website extension
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE
        Map<String, Object> m = reg.getExtensionToFactoryMap()
        m.put("xmi", new XMIResourceFactoryImpl())

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl()

        // Get the resource
        def emfUri = org.eclipse.emf.common.util.URI.createURI(filepath.toString())
        Resource resource = resSet.getResource(emfUri, true);
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        def root =  resource.getContents()?.get(0)
        if(! root) {
            throw new RuntimeException("Cannot load model from $filepath")
        }

        return root

    }

    void save(EObject model, URI filepath) {
        // Register the XMI resource factory for the .website extension
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE
        Map<String, Object> m = reg.getExtensionToFactoryMap()
        m.put("xmi", new XMIResourceFactoryImpl())

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl()

        // create a resource
        def emfUri = org.eclipse.emf.common.util.URI.createURI(filepath.toString())
        Resource resource = resSet.createResource(emfUri)
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        resource.getContents().add(model)

        // now save the content.
        try {
            resource.save(Collections.EMPTY_MAP)
        } catch (IOException e) {
            log.error(e.message)
            throw new RuntimeException(e)
        }
    }

    void save(Resource model, URI filepath) {
        OutputStream os = new FileOutputStream(new File(savePath))

        try {
            model.save(os, Collections.EMPTY_MAP)
        } catch (IOException e) {
            log.error e.message
            e.printStackTrace()
        }
        finally {
            os.close()
        }
    }

    void addElementTo(Object element, Object target) {
        throw new UnsupportedOperationException("method EmfModelHandler.addElementTo not implemented yet")
    }

    void deleteElement(Object element, Object target) {
        throw new UnsupportedOperationException("method EmfModelHandler.deleteElement not implemented yet")
    }

    void updateValueIn(Object value, Object target) {
        throw new UnsupportedOperationException("method EmfModelHandler.updateValueIn not implemented yet")
    }

    void createElement(Object element) {
        throw new UnsupportedOperationException("method EmfModelHandler.createElement not implemented yet")
    }
}
