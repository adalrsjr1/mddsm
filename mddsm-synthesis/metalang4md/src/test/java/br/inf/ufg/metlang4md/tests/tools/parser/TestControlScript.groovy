package br.inf.ufg.metlang4md.tests.tools.parser

import br.ufg.inf.metalang4md.EDomainSpecificElement
import br.ufg.inf.synthesis.Command
import br.ufg.inf.synthesis.ControlScript
import br.ufg.inf.synthesis.api.EmfModelComparator
import br.ufg.inf.synthesis.api.EmfModelHandler
import br.ufg.inf.synthesis.api.ModelComparator
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.compare.Diff
import org.eclipse.emf.compare.DifferenceKind
import org.eclipse.emf.ecore.EObject
import testing.impl.TestingPackageImpl

class TestControlScript extends GroovyTestCase {

    void testDiffComparatorNotEObject() {
        // both has same priority
        def comp = new ControlScript.DiffComparator()

        assert -1 == comp.innerComparision(0, 1)
    }

    void testDiffComparatorNotEObjectIntStr() {
        // both has same priority
        def comp = new ControlScript.DiffComparator()

        assert -1 == comp.innerComparision(1, "20")
    }

    void testDiffComparatorOneEObject() {
        def comp = new ControlScript.DiffComparator()

        def o = new Expando([
                eContents: { []  as EList }
        ]) as EObject

        assert 1 == comp.innerComparision(o, 1)
    }

    void testDiffComparatorEObjects() {
        def comp = new ControlScript.DiffComparator()

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
        def comp = new ControlScript.DiffComparator()

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
        def comp = new ControlScript.DiffComparator()

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
        def comp = new ControlScript.DiffComparator()

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
        def comp = new ControlScript.DiffComparator()

        //  DomainSpecificElement has bigger priority

        def o1 = new Expando([
                getCommandPriority: { 0 }
        ]) as EDomainSpecificElement

        assert 1 == comp.innerComparision(o1, "str")
    }

    void testDiffComparatorByKind() {
        def comp = new ControlScript.DiffComparator()
        def o1 = new Expando([
                getKind: { DifferenceKind.ADD }
        ]) as Diff

        def o2 = new Expando([
                getKind: { DifferenceKind.DELETE }
        ]) as Diff

        assert 1 == comp.compare(o1, o2)

    }

    void testAddCommandToScript() {
        def script = new ControlScript()
        def diff = new Expando() as Diff
        script << diff

        assert 1 == script.size()
    }

    void testAddMultipleCommandsToScript() {
        def script = new ControlScript()
        def diff = new Expando() as Diff

        script << diff << diff << diff
        assert 3 == script.size()
    }

    void testAddElementToAnotherReferenceBased() {
        def model1 = new EmfModelHandler().load("model/metamodel/testing/ClassActor1.xmi".toURI(), TestingPackageImpl.eNS_URI, TestingPackageImpl.eINSTANCE)
        def model2 = new EmfModelHandler().load("model/metamodel/testing/ClassActor2.xmi".toURI(), TestingPackageImpl.eNS_URI, TestingPackageImpl.eINSTANCE)

        def comparator = new EmfModelComparator(model1)

        def diffs = comparator.compares(model2)

        diffs.each { diff ->
            println diff
            new Command(diff)
        }
    }

    void testAddElementToAnotherCompositionBased() { }

    void testRemoveElementFromAnotherReferenceBased() { }

    void testRemoveElementFromAnotherCompositionBased() { }

    void testChangeAttributeIntoElement() { }
}
