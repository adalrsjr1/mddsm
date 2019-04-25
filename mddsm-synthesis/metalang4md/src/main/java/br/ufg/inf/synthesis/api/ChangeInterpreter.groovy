package br.ufg.inf.synthesis.api

import org.eclipse.emf.compare.Diff

interface ChangeInterpreter {
    // processes the change list (using the current state of the labeled transition system for the domain)
    // or handles events from the controller
    void handle(EventObject event)

    void process(List<Diff> script)
}
