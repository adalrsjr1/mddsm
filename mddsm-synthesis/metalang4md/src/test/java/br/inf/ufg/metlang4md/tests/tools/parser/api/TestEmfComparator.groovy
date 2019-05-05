package br.inf.ufg.metlang4md.tests.tools.parser.api


import br.ufg.inf.metalang4md.cml.CmlPackage
import br.ufg.inf.synthesis.api.EmfModelComparator
import br.ufg.inf.synthesis.api.EmfModelHandler
import br.ufg.inf.synthesis.api.ModelComparator
import br.ufg.inf.synthesis.api.ModelHandler
import org.eclipse.emf.compare.Diff
import org.eclipse.emf.compare.DifferenceKind

class TestEmfComparator extends GroovyTestCase {
    private static ModelHandler modelHandler = new EmfModelHandler()

    void testModelComparisonAdd() {
        def oldModel = "model/metamodel/cml-model/ControlSchemaEmpty.xmi"
        def newModel = "model/metamodel/cml-model/ControlSchemaOneItem.xmi"

        def resOldModel = modelHandler.load(URI.create(oldModel), CmlPackage.eNS_URI, CmlPackage.eINSTANCE)
        ModelComparator modelComparator = new EmfModelComparator(resOldModel)
        def resNewModel = modelHandler.load(URI.create(newModel), CmlPackage.eNS_URI, CmlPackage.eINSTANCE)

        assert 1 == modelComparator.compares(resNewModel).findAll { DifferenceKind.ADD == it.kind }.size()
        assert 0 == modelComparator.compares(resNewModel).findAll { DifferenceKind.DELETE == it.kind }.size()

    }

    void testModelComparisonDelete() {
        def newModel = "model/metamodel/cml-model/ControlSchemaEmpty.xmi"
        def oldModel = "model/metamodel/cml-model/ControlSchemaOneItem.xmi"

        def resOldModel = modelHandler.load(URI.create(oldModel), CmlPackage.eNS_URI, CmlPackage.eINSTANCE)
        ModelComparator modelComparator = new EmfModelComparator(resOldModel)
        def resNewModel = modelHandler.load(URI.create(newModel), CmlPackage.eNS_URI, CmlPackage.eINSTANCE)

        assert 0 == modelComparator.compares(resNewModel).findAll { DifferenceKind.ADD == it.kind }.size()
        assert 1 == modelComparator.compares(resNewModel).findAll { DifferenceKind.DELETE == it.kind }.size()
    }

    void testApplyChanges() {
        def oldModel = "model/metamodel/cml-model/ControlSchemaEmpty.xmi"
        def newModel = "model/metamodel/cml-model/ControlSchemaOneItem.xmi"

        def resOldModel = modelHandler.load(URI.create(oldModel), CmlPackage.eNS_URI, CmlPackage.eINSTANCE)
        ModelComparator modelComparator = new EmfModelComparator(resOldModel)
        def resNewModel = modelHandler.load(URI.create(newModel), CmlPackage.eNS_URI, CmlPackage.eINSTANCE)



        def beforeUpdate = resOldModel.getAllContents().size()

        List<Diff> differences = modelComparator.compares(resNewModel)
        modelComparator.updateModel(differences)

        def afterUpdate = resOldModel.getAllContents().size()

        resOldModel.getAllContents().each {println it}

        assert beforeUpdate != afterUpdate
    }

}
