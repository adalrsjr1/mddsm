package br.inf.ufg.metlang4md.tests.tools.parser

import br.ufg.inf.synthesis.Ml4mdModelComparator
import br.ufg.inf.synthesis.ModelChange
import org.eclipse.emf.compare.Diff
import org.junit.jupiter.api.Test

class TestModelChange {

    @Test
    void test() {
        String version1 = "model/metamodel/cml-model/ControlSchemaTwoWay.xmi"
        String version2 = "model/metamodel/cml-model/ControlSchemaThreeWay.xmi"


        List<Diff> differences = Ml4mdModelComparator.computeChanges(version1, version2)

        differences.each { Diff diff ->
            println diff
            def command = new ModelChange().createCommand()
            assert command != null
        }


    }

    @Test
    void testGetMetadata() {
        String version1 = "model/metamodel/cml-model/ControlSchemaTwoWay.xmi"
        String version2 = "model/metamodel/cml-model/ControlSchemaThreeWay.xmi"


        List<Diff> differences = Ml4mdModelComparator.computeChanges(version1, version2)

        differences.each { Diff diff ->
            ModelChange change = new ModelChange(diff)
            change.getMetadata(diff)
        }



    }
}
