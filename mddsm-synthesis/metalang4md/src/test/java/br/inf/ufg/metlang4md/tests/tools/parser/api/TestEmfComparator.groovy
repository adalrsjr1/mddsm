package br.inf.ufg.metlang4md.tests.tools.parser.api


import br.ufg.inf.metalang4md.cml.CmlPackage
import br.ufg.inf.synthesis.api.EmfModelComparator
import br.ufg.inf.synthesis.api.EmfModelHandler
import br.ufg.inf.synthesis.api.ModelComparator
import br.ufg.inf.synthesis.api.ModelHandler
import org.eclipse.emf.compare.AttributeChange
import org.eclipse.emf.compare.Diff
import org.eclipse.emf.compare.DifferenceKind
import org.eclipse.emf.compare.ReferenceChange
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil
import testing.TestingPackage

class TestEmfComparator extends GroovyTestCase {
    private static ModelHandler modelHandler = new EmfModelHandler()

    void testApplyChanges() {
        def oldModel = "model/metamodel/testing/SandboxEmpty.xmi"
        def newModel = "model/metamodel/testing/SandboxOneElement.xmi"


        def resOldModel = modelHandler.load(oldModel.toURI(), TestingPackage.eNS_URI, TestingPackage.eINSTANCE)
        ModelComparator modelComparator = new EmfModelComparator(resOldModel)
        def resNewModel = modelHandler.load(newModel.toURI(), TestingPackage.eNS_URI, TestingPackage.eINSTANCE)

        def diffs = modelComparator.compares(resNewModel)

        def beforeUpdate = resOldModel.contents[0].elements.size()

        modelComparator.updateModel(diffs)

        def afterUpdate = resOldModel.contents[0].elements.size()

        assert beforeUpdate != afterUpdate

    }

    void testAddNewElement() {
        def oldModel = "model/metamodel/testing/SandboxEmpty.xmi"
        def newModel = "model/metamodel/testing/SandboxOneElement.xmi"


        def resOldModel = modelHandler.load(oldModel.toURI(), TestingPackage.eNS_URI, TestingPackage.eINSTANCE)
        ModelComparator modelComparator = new EmfModelComparator(resOldModel)
        def resNewModel = modelHandler.load(newModel.toURI(), TestingPackage.eNS_URI, TestingPackage.eINSTANCE)

        def diffs = modelComparator.compares(resNewModel)

        assert 1 == diffs.size()
        assert diffs[0] instanceof ReferenceChange
        assert DifferenceKind.ADD == diffs[0].kind

    }

    void testRemoveNewElement() {
        def newModel = "model/metamodel/testing/SandboxEmpty.xmi"
        def oldModel = "model/metamodel/testing/SandboxOneElement.xmi"


        def resOldModel = modelHandler.load(oldModel.toURI(), TestingPackage.eNS_URI, TestingPackage.eINSTANCE)
        ModelComparator modelComparator = new EmfModelComparator(resOldModel)
        def resNewModel = modelHandler.load(newModel.toURI(), TestingPackage.eNS_URI, TestingPackage.eINSTANCE)

        def diffs = modelComparator.compares(resNewModel)

        assert 1 == diffs.size()
        assert diffs[0] instanceof ReferenceChange
        assert DifferenceKind.DELETE == diffs[0].kind
    }

    void testChangeAttributeIntoElement() {
        def oldModel = "model/metamodel/testing/SandboxOneElement.xmi"
        def newModel = "model/metamodel/testing/SandboxOneElementNewAttribute.xmi"

        def resOldModel = modelHandler.load(oldModel.toURI(), TestingPackage.eNS_URI, TestingPackage.eINSTANCE)
        ModelComparator modelComparator = new EmfModelComparator(resOldModel)
        Resource resNewModel = modelHandler.load(newModel.toURI(), TestingPackage.eNS_URI, TestingPackage.eINSTANCE)

        def diffs = modelComparator.compares(resNewModel)

        assert 1 == diffs.size()
        assert diffs[0] instanceof AttributeChange
        assert DifferenceKind.CHANGE == diffs[0].kind
    }

    void testAddNewElementToReference() {
        def oldModel = "model/metamodel/testing/SandboxOneElement.xmi"
        def newModel = "model/metamodel/testing/SandboxOneElementNewReference.xmi"

        def resOldModel = modelHandler.load(oldModel.toURI(), TestingPackage.eNS_URI, TestingPackage.eINSTANCE)
        ModelComparator modelComparator = new EmfModelComparator(resOldModel)
        Resource resNewModel = modelHandler.load(newModel.toURI(), TestingPackage.eNS_URI, TestingPackage.eINSTANCE)

        def diffs = modelComparator.compares(resNewModel)

        assert 1 == diffs.size()
        assert diffs[0] instanceof ReferenceChange
        assert DifferenceKind.ADD == diffs[0].kind
    }

    void testDeleteElementFromReference() {
        def newModel = "model/metamodel/testing/SandboxOneElement.xmi"
        def oldModel = "model/metamodel/testing/SandboxOneElementNewReference.xmi"

        def resOldModel = modelHandler.load(oldModel.toURI(), TestingPackage.eNS_URI, TestingPackage.eINSTANCE)
        ModelComparator modelComparator = new EmfModelComparator(resOldModel)
        Resource resNewModel = modelHandler.load(newModel.toURI(), TestingPackage.eNS_URI, TestingPackage.eINSTANCE)

        def diffs = modelComparator.compares(resNewModel)

        assert 1 == diffs.size()
        assert diffs[0] instanceof ReferenceChange
        assert DifferenceKind.DELETE == diffs[0].kind
    }

}
