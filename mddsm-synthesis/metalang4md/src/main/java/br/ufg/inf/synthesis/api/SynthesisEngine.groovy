package br.ufg.inf.synthesis.api

import org.eclipse.emf.ecore.resource.Resource

class SynthesisEngine {
    private final ModelHandler modelHandler
    @Delegate private final ModelComparator modelComparator
    @Delegate private final Dispatcher dispatcher
    @Delegate private final ChangeInterpreter changeInterpreter

    private def userInterface
    private def controlLayer

    SynthesisEngine(Resource model) {
        this.modelHandler = new EmfModelHandler()
        this.modelComparator = new EmfModelComparator(model)
        this.dispatcher = null
        this.changeInterpreter = new ChangeInterpreter()
    }

    void setUserInterface(def userInterface) {
        this.userInterface = userInterface
    }

    void setControlLayer(def controlLayer) {
        this.controlLayer = controlLayer
    }
}
