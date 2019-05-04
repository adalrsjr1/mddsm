package br.ufg.inf.synthesis.api

import br.ufg.inf.synthesis.ModelChange
import org.eclipse.emf.ecore.resource.Resource

interface ModelComparator {
    // compares the new user-defined model and the current runtime model to produce a change list
    List<ModelChange> compares(Resource newModel, Resource oldModel)
}
