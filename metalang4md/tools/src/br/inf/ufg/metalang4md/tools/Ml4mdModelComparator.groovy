package br.inf.ufg.metalang4md.tools

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.compare.Comparison
import org.eclipse.emf.compare.Diff
import org.eclipse.emf.compare.EMFCompare
import org.eclipse.emf.compare.match.DefaultComparisonFactory
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory
import org.eclipse.emf.compare.match.DefaultMatchEngine
import org.eclipse.emf.compare.match.IComparisonFactory
import org.eclipse.emf.compare.match.IMatchEngine
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl
import org.eclipse.emf.compare.merge.BatchMerger
import org.eclipse.emf.compare.merge.IBatchMerger
import org.eclipse.emf.compare.merge.IMerger
import org.eclipse.emf.compare.scope.DefaultComparisonScope
import org.eclipse.emf.compare.scope.IComparisonScope
import org.eclipse.emf.compare.utils.UseIdentifiers
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

import cml.CmlPackage
import metalang4md.Metalang4mdPackage

class Ml4mdModelComparator {

	static Tuple3<Resource, Resource, Comparison> compare(File newModel, File oldModel) {
		ResourceSet newResourceSet = new ResourceSetImpl()
		ResourceSet oldResourceSet = new ResourceSetImpl()

		String xmi1 = newModel.absolutePath
		String xmi2 = oldModel.absolutePath

		def newResource = load(xmi1, newResourceSet)
		def oldResource = load(xmi2, oldResourceSet)

		IEObjectMatcher matcher = DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.NEVER);
		IComparisonFactory comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory());
		IMatchEngine.Factory matchEngineFactory = new MatchEngineFactoryImpl(matcher, comparisonFactory);
		matchEngineFactory.setRanking(20);
		IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl();
		matchEngineRegistry.add(matchEngineFactory);
		EMFCompare comparator = EMFCompare.builder().setMatchEngineFactoryRegistry(matchEngineRegistry).build();

		IComparisonScope scope = new DefaultComparisonScope(newResourceSet, oldResourceSet, null)

		return new Tuple3(newResource, oldResource, comparator.compare(scope))
	}

	static Resource load(String absolutePath, ResourceSet resourceSet) {
		EPackage.Registry.INSTANCE.put(CmlPackage.eNS_URI, CmlPackage.eINSTANCE)

		URI uri = URI.createFileURI(absolutePath)

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl())

		return resourceSet.getResource(uri, true)
	}

	static void save(String savePath, Resource resource) {
		OutputStream os = new FileOutputStream(new File(savePath))
		
		try {
			resource.save(os, Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static void main(String[] args) {
		def oldModel = new File("model/metamodel/cml-model/cml-model2.xmi")
		def newModel = new File("model/metamodel/cml-model/cml-model3.xmi")

		def (newResource, oldResource, comparison) = compare(newModel, oldModel)

		List<Diff> differences = comparison.getDifferences()
		differences.each { Diff diff ->
//			println ${diff.attribute.eContainer()} ${diff.value}
//			println diff
			println "${diff.kind} ${diff.value}" 
//			def value = diff.value
//			println value instanceof EItem
		}
		
		IMerger.Registry mergerRegistry = IMerger.RegistryImpl.createStandaloneInstance()
		IBatchMerger merger = new BatchMerger(mergerRegistry)
		merger.copyAllLeftToRight(differences, null)

		save("model/metamodel/cml-model/cml-merged.xmi", oldResource)


	}
}
