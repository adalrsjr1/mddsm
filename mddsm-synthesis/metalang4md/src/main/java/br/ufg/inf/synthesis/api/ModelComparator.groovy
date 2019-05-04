package br.ufg.inf.synthesis.api

import br.ufg.inf.synthesis.ModelChange
import org.eclipse.emf.common.notify.Notifier
import org.eclipse.emf.compare.Diff

interface ModelComparator {
    // compares the new user-defined model and the current runtime model to produce a change list
    List<ModelChange> compares(Notifier newModel, Notifier oldModel)
    void applyChanges(List<Diff> differences)
    List<Diff> sortingDifferences(List<Diff> differences)
}
