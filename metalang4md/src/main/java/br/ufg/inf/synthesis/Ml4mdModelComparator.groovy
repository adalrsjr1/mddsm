package br.ufg.inf.synthesis

import br.ufg.inf.metalang4md.EDomainSpecificElement
import br.ufg.inf.metalang4md.cml.CmlPackage
import com.google.common.collect.ComparisonChain
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.compare.AttributeChange
import org.eclipse.emf.compare.Comparison
import org.eclipse.emf.compare.Diff
import org.eclipse.emf.compare.EMFCompare
import org.eclipse.emf.compare.ReferenceChange
import org.eclipse.emf.compare.ResourceAttachmentChange
import org.eclipse.emf.compare.internal.spec.ResourceAttachmentChangeSpec
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
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.w3c.dom.Attr

class Ml4mdModelComparator {

    static Tuple2<Resource, Comparison> compare(File newModel, File oldModel) {
        ResourceSet newResourceSet = new ResourceSetImpl()
        ResourceSet oldResourceSet = new ResourceSetImpl()

        String xmi1 = newModel.absolutePath
        String xmi2 = oldModel.absolutePath

        def newResource = load(xmi1, newResourceSet)
        def oldResource = load(xmi2, oldResourceSet)

        return compare(newResource, newResourceSet, oldResource, oldResourceSet)
    }

    static Tuple2<Resource, Comparison> compare(Resource newResource, ResourceSet newResourceSet, Resource oldResource, ResourceSet oldResourceSet) {
        IEObjectMatcher matcher = DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.NEVER)
        IComparisonFactory comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory())
        IMatchEngine.Factory matchEngineFactory = new MatchEngineFactoryImpl(matcher, comparisonFactory)
        matchEngineFactory.setRanking(20)
        IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl()
        matchEngineRegistry.add(matchEngineFactory)
        EMFCompare comparator = EMFCompare.builder().setMatchEngineFactoryRegistry(matchEngineRegistry).build()

        IComparisonScope scope = new DefaultComparisonScope(newResourceSet, oldResourceSet, null)

        return new Tuple2(oldResource, comparator.compare(scope))
    }

    private static sortingDifferences(List<Diff> differences) {
        def and = { List list ->
            list.inject { acc, val -> acc && val }
        }

        def xor = { List list ->
            list.inject { acc, val -> acc ^ val }
        }

        return differences.sort { Diff arg0, Diff arg1 ->
            // decreasing sort

            def elem0 = extractValue(arg0)
            def elem1 = extractValue(arg1)

            ComparisonChain chain = ComparisonChain.start()

            if (and([elem0 instanceof EDomainSpecificElement, elem1 instanceof EDomainSpecificElement])) {
                // comparision by priority
                chain = chain.compare(elem1.commandPriority, elem0.commandPriority)
            } else if (and([elem0 instanceof EObject, elem1 instanceof EObject])) {
                // comparision by # of children
                chain = chain.compare(elem1.eContents().size(), elem0.eContents().size())
            } else if (xor([elem0 instanceof EObject, elem1 instanceof EObject])) {
                // comparision by # of children  -- EObject.compareTo(primitiveType)
                EObject eObject = elem1 instanceof EObject ? elem1 : elem0
                chain = chain.compare(0, eObject.eContents().size())
            } else {
                // comparision by natural ordering
                chain = chain.compare(elem1, elem0)
            }

            return chain.result()
        }
    }

    static private def extractValue(Diff diff) {
        if(diff instanceof AttributeChange) {
            return diff.attribute.eContainer()
        }

        if(diff instanceof ReferenceChange) {
            return diff.reference.eContainer()
        }

        if(diff instanceof ResourceAttachmentChange) {
            return diff.resourceURI
        }

        return diff.value
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
        finally {
            os.close();
        }
    }

    static List<Diff> computeChangesAndSave(String pathnameModel1, String pathnameModel2, String pathnameNewModel) {
        def model1 = new File(pathnameModel1)
        def model2 = new File(pathnameModel2)

        def (newModelResource, comparison) = compare(model2, model1)

        List differences = sortingDifferences(comparison.getDifferences())

        IMerger.Registry mergerRegistry = IMerger.RegistryImpl.createStandaloneInstance()
        IBatchMerger merger = new BatchMerger(mergerRegistry)
        merger.copyAllLeftToRight(differences, null)

        save(pathnameNewModel, newModelResource)

        return differences
    }

    static List<Diff> computeChanges(String pathnameModel1, String pathnameModel2) {
        def model1 = new File(pathnameModel1)
        def model2 = new File(pathnameModel2)

        def (newModelResource, comparison) = compare(model2, model1)

        return sortingDifferences(comparison.getDifferences())
    }

    static void main(String[] args) {
        String empty = "model/metamodel/cml-model/DataSchemaEmpty.xmi"
        String version1 = "model/metamodel/cml-model/DataSchema-1.xmi"


        List<Diff> differences = computeChanges(empty, version1)

        differences.each { Diff diff ->
//			println ${diff.attribute.eContainer()} ${diff.value}
			println diff
//            println ">> ${diff.kind} ${diff.value}"
//            if ((diff.value instanceof EDomainSpecificElement)) {
//				print ">> ${diff.reference.eContainer()}"
//				println ">> ${diff.attribute.eContainer()}"
//            }
//			def value = diff.value
//			println value instanceof EItem
        }
    }
}
