package br.inf.ufg.metlang4md.tests.tools.parser.api

import br.ufg.inf.synthesis.EmfModelComparator
import br.ufg.inf.synthesis.api.ModelComparator

class TestEmfComparator extends GroovyTestCase {

    ModelComparator modelComparator

    void setUp() {
        modelComparator = new EmfModelComparator()
    }

    void test() {
        assert false
    }
}
