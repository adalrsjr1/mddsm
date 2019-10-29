package br.inf.ufg.mddsm.controller.emf

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource

interface ModelHandler {

    Resource load(URI filepath, String eNS_URI, EPackage ePackageInstance)

    void save(EObject model, URI filepath)

    void save(Resource model, URI filepath)

    void addElementTo(def element, def target)

    void deleteElement(def element, def target)

    void updateValueIn(def value, def target)

    void createElement(def element)
}