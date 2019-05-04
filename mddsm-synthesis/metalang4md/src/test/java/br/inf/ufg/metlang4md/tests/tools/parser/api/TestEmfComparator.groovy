package br.inf.ufg.metlang4md.tests.tools.parser.api

import br.ufg.inf.metalang4md.EDomainSpecificElement
import br.ufg.inf.metalang4md.cml.CmlPackage
import br.ufg.inf.metalang4md.impl.Metalang4mdFactoryImpl
import br.ufg.inf.synthesis.EmfModelComparator
import br.ufg.inf.synthesis.EmfModelHandler
import br.ufg.inf.synthesis.api.ModelComparator
import br.ufg.inf.synthesis.api.ModelHandler
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.compare.AttributeChange
import org.eclipse.emf.compare.Diff
import org.eclipse.emf.compare.DifferenceKind
import org.eclipse.emf.compare.ReferenceChange
import org.eclipse.emf.compare.ResourceAttachmentChange
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference

class TestEmfComparator extends GroovyTestCase {
    ModelHandler modelHandler
    ModelComparator modelComparator

    void setUp() {
        modelHandler = new EmfModelHandler()
        modelComparator = new EmfModelComparator(modelHandler)
    }

    void testModelComparisonAdd() {
        def oldModel = "model/metamodel/cml-model/ControlSchemaEmpty.xmi"
        def newModel = "model/metamodel/cml-model/ControlSchemaOneItem.xmi"

        def resOldModel = modelHandler.load(URI.create(oldModel), CmlPackage.eNS_URI, CmlPackage.eINSTANCE)
        def resNewModel = modelHandler.load(URI.create(newModel), CmlPackage.eNS_URI, CmlPackage.eINSTANCE)

        assert 1 == modelComparator.compares(resNewModel, resOldModel).findAll { DifferenceKind.ADD == it.kind }.size()
        assert 0 == modelComparator.compares(resNewModel, resOldModel).findAll { DifferenceKind.DELETE == it.kind }.size()

    }

    void testModelComparisonDelete() {
        def newModel = "model/metamodel/cml-model/ControlSchemaEmpty.xmi"
        def oldModel = "model/metamodel/cml-model/ControlSchemaOneItem.xmi"

        def resOldModel = modelHandler.load(URI.create(oldModel), CmlPackage.eNS_URI, CmlPackage.eINSTANCE)
        def resNewModel = modelHandler.load(URI.create(newModel), CmlPackage.eNS_URI, CmlPackage.eINSTANCE)

        assert 0 == modelComparator.compares(resNewModel, resOldModel).findAll { DifferenceKind.ADD == it.kind }.size()
        assert 1 == modelComparator.compares(resNewModel, resOldModel).findAll { DifferenceKind.DELETE == it.kind }.size()
    }

    void testApplyChanges() {
        def oldModel = "model/metamodel/cml-model/ControlSchemaEmpty.xmi"
        def newModel = "model/metamodel/cml-model/ControlSchemaOneItem.xmi"

        def resOldModel = modelHandler.load(URI.create(oldModel), CmlPackage.eNS_URI, CmlPackage.eINSTANCE)
        def resNewModel = modelHandler.load(URI.create(newModel), CmlPackage.eNS_URI, CmlPackage.eINSTANCE)

        def beforeUpdate = resOldModel.eContents().size()

        List<Diff> differences = modelComparator.compares(resNewModel, resOldModel)
        modelComparator.applyChanges(differences)

        def afterUpdate = resOldModel.eContents().size()

        assert beforeUpdate != afterUpdate
    }

    void testDiffComparatorNotEObject() {
        // both has same priority
        def comp = new EmfModelComparator.DiffComparator()

        assert -1 == comp.innerComparision(0, 1)
    }

    void testDiffComparatorNotEObjectIntStr() {
        // both has same priority
        def comp = new EmfModelComparator.DiffComparator()

        assert -1 == comp.innerComparision(1, "20")
    }

    void testDiffComparatorOneEObject() {
        def comp = new EmfModelComparator.DiffComparator()

        def o = new Expando([
                eContents: { []  as EList }
        ]) as EObject

        assert 1 == comp.innerComparision(o, 1)
    }

    void testDiffComparatorEObjects() {
        def comp = new EmfModelComparator.DiffComparator()

        // comparision by number of children

        def o1 = new Expando([
                eContents: { []  as EList }
        ]) as EObject

        def o2 = new Expando([
                eContents: { [1]  as EList }
        ]) as EObject

        assert -1 == comp.innerComparision(o1, o2)
    }

    void testDiffComparatorEObjectsNullEcontents() {
        def comp = new EmfModelComparator.DiffComparator()

        // comparision by number of children

        def o1 = new Expando([
                eContents: { [1]  as EList }
        ]) as EObject

        def o2 = new Expando([
                eContents: { null }
        ]) as EObject

        assert 1 == comp.innerComparision(o1, o2)
    }

    void testDiffComparatorEDSE() {
        def comp = new EmfModelComparator.DiffComparator()

        //  comparision by priority

        def o1 = new Expando([
                getCommandPriority: { 10 }
        ]) as EDomainSpecificElement

        def o2 = new Expando([
                getCommandPriority: { 0 }
        ]) as EDomainSpecificElement

        assert 1 == comp.innerComparision(o1, o2)
    }

    void testDiffComparatorEObjectEDSE() {
        def comp = new EmfModelComparator.DiffComparator()

        //  DomainSpecificElement has bigger priority

        def o1 = new Expando([
                eContents: { []  as EList }
        ]) as EObject

        def o2 = new Expando([
                getCommandPriority: { 0 }
        ]) as EDomainSpecificElement

        assert -1 == comp.innerComparision(o1, o2)
    }

    void testDiffComparatorEDSEAndPrimitive() {
        def comp = new EmfModelComparator.DiffComparator()

        //  DomainSpecificElement has bigger priority

        def o1 = new Expando([
                getCommandPriority: { 0 }
        ]) as EDomainSpecificElement

        assert 1 == comp.innerComparision(o1, "str")
    }

    void testDiffComparatorByKind() {
        def comp = new EmfModelComparator.DiffComparator()
        def o1 = new Expando([
                getKind: { DifferenceKind.ADD }
        ]) as Diff

        def o2 = new Expando([
                getKind: { DifferenceKind.DELETE }
        ]) as Diff

        assert 1 == comp.compare(o1, o2)

    }
}
