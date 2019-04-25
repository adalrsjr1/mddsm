package br.ufg.inf.synthesis.api

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource

interface Dispatcher {
    // Dispatches a new runtime model to the UI and updates the currently executing model
    boolean dispatchesChangesToUI(EObject runtimeModel, Resource uiModel)

    boolean dispatchesChangesToRuntimeModel(EObject runtimeModel, Resource uiModel)
}
