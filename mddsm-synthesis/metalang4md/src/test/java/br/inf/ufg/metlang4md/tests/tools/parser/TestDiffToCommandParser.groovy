package br.inf.ufg.metlang4md.tests.tools.parser

import br.ufg.inf.synthesis.EmfModelComparator
import br.ufg.inf.synthesis.ModelToCommandParser
import org.junit.jupiter.api.Test

class TestDiffToCommandParser {

	@Test
	void testCMLModelDataSchema() {
		def oldModel = "model/metamodel/cml-model/DataSchemaEmpty.xmi"
		def newModel = "model/metamodel/cml-model/DataSchema-1.xmi"

		EmfModelComparator.computeChanges(newModel, oldModel)
	}

	@Test
	void testCMLModelDataSchema2() {
		def oldModel = "model/metamodel/cml-model/DataSchema-1.xmi"
		def newModel = "model/metamodel/cml-model/DataSchema-2.xmi"

		EmfModelComparator.computeChanges(newModel, oldModel)
	}

	@Test
	void testCMLModelControlSchema1() {
		def oldModel = "model/metamodel/cml-model/ControlSchemaEmpty.xmi"
		def newModel = "model/metamodel/cml-model/ControlSchemaTwoWay.xmi"

		EmfModelComparator.computeChanges(newModel, oldModel)
	}

	@Test
	void testCMLModelControlSchema2() {
		def oldModel = "model/metamodel/cml-model/ControlSchemaTwoWay.xmi"
		def newModel = "model/metamodel/cml-model/ControlSchemaThreeWay.xmi"

		EmfModelComparator.computeChanges(oldModel, newModel)
	}

	@Test
	void testParser1() {
		def oldModel = "model/metamodel/cml-model/DataSchemaEmpty.xmi"
		def newModel = "model/metamodel/cml-model/DataSchema-1.xmi"

		ModelToCommandParser parser = new ModelToCommandParser()

		EmfModelComparator.computeChanges(oldModel, newModel).each {
			parser.process(it)
		}
	}

	@Test
	void testParser2() {
		def oldModel = "model/metamodel/cml-model/DataSchema-1.xmi"
		def newModel = "model/metamodel/cml-model/DataSchema-2.xmi"

		ModelToCommandParser parser = new ModelToCommandParser()

		EmfModelComparator.computeChanges(oldModel, newModel).each {
			parser.process(it)
		}
	}

	@Test
	void testParser3() {
		def oldModel = "model/metamodel/cml-model/ControlSchemaEmpty.xmi"
		def newModel = "model/metamodel/cml-model/ControlSchemaTwoWay.xmi"

		ModelToCommandParser parser = new ModelToCommandParser()

		EmfModelComparator.computeChanges(oldModel, newModel).each {
			parser.process(it)
		}
	}

	@Test
	void testParser4() {
		def oldModel = "model/metamodel/cml-model/ControlSchemaTwoWay.xmi"
		def newModel = "model/metamodel/cml-model/ControlSchemaThreeWay.xmi"

		ModelToCommandParser parser = new ModelToCommandParser()

		EmfModelComparator.computeChanges(oldModel, newModel).each {
			parser.process(it)
		}
	}

}
