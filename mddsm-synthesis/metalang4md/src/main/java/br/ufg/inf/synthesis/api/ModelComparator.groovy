package br.ufg.inf.synthesis.api

import br.ufg.inf.synthesis.ModelChange
import org.eclipse.emf.compare.Diff
import org.eclipse.emf.ecore.resource.Resource

interface ModelComparator<T> {
    // compares the new user-defined model and the current runtime model to produce a change list
    List<ModelChange> compares(T newModel, T oldModel)
}
