package br.ufg.inf.synthesis.api

import br.ufg.inf.synthesis.api.ModelComparator
import groovy.util.logging.Log4j2
import org.eclipse.emf.common.notify.Notifier
import org.eclipse.emf.compare.Diff
import org.eclipse.emf.compare.EMFCompare
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

@Log4j2
class EmfModelComparator implements ModelComparator {

    final Notifier currentModel

    EmfModelComparator(Notifier currentModel) {
        this.currentModel = currentModel
    }

    List<Diff> compares(Notifier newModel) {
        IEObjectMatcher matcher = DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.NEVER)
        IComparisonFactory comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory())
        IMatchEngine.Factory matchEngineFactory = new MatchEngineFactoryImpl(matcher, comparisonFactory)
        matchEngineFactory.setRanking(20)
        IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl()
        matchEngineRegistry.add(matchEngineFactory)
        EMFCompare comparator = EMFCompare.builder().setMatchEngineFactoryRegistry(matchEngineRegistry).build()

        IComparisonScope scope = new DefaultComparisonScope(newModel, currentModel, null)

        return comparator.compare(scope).getDifferences()
    }

    Notifier updateModel(List<Diff> differences) {
        IMerger.Registry mergerRegistry = IMerger.RegistryImpl.createStandaloneInstance()
        IBatchMerger merger = new BatchMerger(mergerRegistry)
        merger.copyAllLeftToRight(differences, null)

        return currentModel
    }

}
