package br.ufg.inf.synthesis.api

import org.eclipse.emf.compare.Diff
import org.eclipse.emf.ecore.resource.Resource

interface ModelComparator {
    // compares the new user-defined model and the current runtime model to produce a change list
    List<Diff> compares(Resource newModel, Resource oldModel)
}
