package br.ufg.inf.synthesis

import br.ufg.inf.metalang4md.EDomainSpecificElement
import br.ufg.inf.synthesis.api.ModelComparator
import groovy.util.logging.Log4j2
import org.eclipse.emf.common.notify.Notifier
import org.eclipse.emf.compare.*
import org.eclipse.emf.compare.match.*
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl
import org.eclipse.emf.compare.merge.BatchMerger
import org.eclipse.emf.compare.merge.IBatchMerger
import org.eclipse.emf.compare.merge.IMerger
import org.eclipse.emf.compare.scope.DefaultComparisonScope
import org.eclipse.emf.compare.scope.IComparisonScope
import org.eclipse.emf.compare.utils.UseIdentifiers
import org.eclipse.emf.ecore.EObject

@Log4j2
class EmfModelComparator implements ModelComparator {

    EmfModelComparator() {
    }

    List<Diff> compares(Notifier newModel, Notifier oldModel) {
        IEObjectMatcher matcher = DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.NEVER)
        IComparisonFactory comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory())
        IMatchEngine.Factory matchEngineFactory = new MatchEngineFactoryImpl(matcher, comparisonFactory)
        matchEngineFactory.setRanking(20)
        IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl()
        matchEngineRegistry.add(matchEngineFactory)
        EMFCompare comparator = EMFCompare.builder().setMatchEngineFactoryRegistry(matchEngineRegistry).build()

        IComparisonScope scope = new DefaultComparisonScope(newModel, oldModel, null)

        return comparator.compare(scope).getDifferences()
    }

    List<Diff> sortingDifferences(List<Diff> differences) {
        return differences.sort(new DiffComparator())
    }

    private static class DiffComparator implements Comparator<Diff> {

        private def getValue(Diff diff) {
            if(diff instanceof AttributeChange) {
                return diff.attribute.eContainer()
            }

            if(diff instanceof ReferenceChange) {
                return diff.reference.eContainer()
            }

            if(diff instanceof ResourceAttachmentChange) {
                return diff.resourceURI
            }

        }

        int compare(Diff arg0, Diff arg1) {
            // add first always
            if(arg0.kind != arg1.kind && DifferenceKind.ADD == arg0.kind) {
                return 1
            }

            def elem0 = getValue(arg0)
            def elem1 = getValue(arg1)

            def result = innerComparision(elem0, elem1)

            return result

        }

        private int innerComparision(def elem0, def elem1) {
            def and = { List list ->
                list.inject { acc, val -> acc && val }
            }

            def xor = { List list ->
                list.inject { acc, val -> acc ^ val }
            }

            def or = { List list ->
                list.inject { acc, val -> acc || val }
            }

            // none is EObject
            if(!(elem0 instanceof EObject) && !(elem1 instanceof EObject)) {
                String s0 = elem0.toString()
                String s1 = elem1.toString()

                return s0 <=> s1
            }

            // only one of them is EObject
            if(elem0 instanceof EObject ^ elem1 instanceof EObject) {
                if(elem0 instanceof EObject) {
                    return 1
                }
                return -1
            }

            // sorting by # of children
            if(!(elem0 instanceof EDomainSpecificElement) && !(elem1 instanceof EDomainSpecificElement)) {
                return elem0.eContents()?.size() ?: 0 <=>  elem1.eContents()?.size() ?: 0
            }

            // sorting by priority
            if(elem0 instanceof EDomainSpecificElement && elem1 instanceof EDomainSpecificElement) {
                return elem0.getCommandPriority() <=> elem1.getCommandPriority()
            }

            // DomainSpecificElement has priority over other elements
            if(elem0 instanceof EDomainSpecificElement ^ elem1 instanceof EDomainSpecificElement) {
                if(elem0 instanceof EDomainSpecificElement) {
                    return 1
                }
                return -1
            }

        }
    }

    void applyChanges(List<Diff> differences) {
        IMerger.Registry mergerRegistry = IMerger.RegistryImpl.createStandaloneInstance()
        IBatchMerger merger = new BatchMerger(mergerRegistry)
        merger.copyAllLeftToRight(differences, null)
    }

}
