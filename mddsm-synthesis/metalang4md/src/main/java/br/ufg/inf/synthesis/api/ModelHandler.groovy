package br.ufg.inf.synthesis.api

interface ModelHandler {

    def load(URI filepath)

    void save(def model, URI filepath)

    void addElementTo(def element, def target)

    void deleteElement(def element, def target)

    void updateValueIn(def value, def target)

    void createElement(def element)
}