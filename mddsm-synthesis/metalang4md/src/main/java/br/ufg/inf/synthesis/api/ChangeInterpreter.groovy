package br.ufg.inf.synthesis.api

import br.ufg.inf.synthesis.ControlScript
import org.eclipse.emf.compare.Diff

class ChangeInterpreter {
    private def controlLayer
    // processes the change list (using the current state of the labeled transition system for the domain)
    // or handles events from the controller
    void handle(EventObject event) {
        throw new UnsupportedOperationException("Not handling $event yet")
    }

    void process(ControlScript script) {
        controlLayer.process(script.sorting())
    }

    void setControlLayer(def controlLayer) {
        this.controlLayer = controlLayer
    }
}
