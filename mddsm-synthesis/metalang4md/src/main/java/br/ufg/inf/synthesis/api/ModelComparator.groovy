package br.ufg.inf.synthesis.api


import org.eclipse.emf.common.notify.Notifier
import org.eclipse.emf.compare.Diff

interface ModelComparator {
    // compares the new user-defined model and the current runtime model to produce a change list
    List<Diff> compares(Notifier newModel)
    Notifier updateModel(List<Diff> differences)
}
