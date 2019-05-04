package br.ufg.inf.synthesis.api

import org.eclipse.emf.ecore.EObject

interface ModelHandler {

    EObject load(URI filepath)

    void save(EObject model, URI filepath)

    void addElementTo(def element, def target)

    void deleteElement(def element, def target)

    void updateValueIn(def value, def target)

    void createElement(def element)
}