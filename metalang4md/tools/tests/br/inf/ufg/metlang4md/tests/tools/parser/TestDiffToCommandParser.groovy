package br.inf.ufg.metlang4md.tests.tools.parser

import org.eclipse.emf.compare.Diff
import org.junit.jupiter.api.Test

import br.inf.ufg.metalang4md.tools.comparator.Ml4mdModelComparator
import br.inf.ufg.metalang4md.tools.parser.CommandControl
import br.inf.ufg.metalang4md.tools.parser.ModelToCommandParser

class TestDiffToCommandParser {

	@Test
	void testChangeAttribute() {
		def oldModel = new File("model/metamodel/cml-model/cml-model2.xmi")
		def newModel = new File("model/metamodel/cml-model/cml-model3.xmi")

		def (newResource, oldResource, comparison) = Ml4mdModelComparator.compare(newModel, oldModel)

		List<Diff> differences = comparison.getDifferences()
		Diff diffAttribute = differences[1]
		ModelToCommandParser parser = new ModelToCommandParser()
		CommandControl command = parser.process(diffAttribute)
		
	}
	
	@Test
	void testAddElement() {
		def oldModel = new File("model/metamodel/cml-model/cml-model2.xmi")
		def newModel = new File("model/metamodel/cml-model/cml-model3.xmi")

		def (newResource, oldResource, comparison) = Ml4mdModelComparator.compare(newModel, oldModel)

		List<Diff> differences = comparison.getDifferences()
		Diff diff = differences[-1]
		println diff.value
		ModelToCommandParser parser = new ModelToCommandParser()
		CommandControl command = parser.process(diff)
		
	}

}
