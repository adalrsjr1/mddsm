package br.inf.ufg.metlang4md.tests.tools.parser.api

import br.ufg.inf.metalang4md.cml.CmlPackage
import br.ufg.inf.synthesis.api.EmfModelHandler
import br.ufg.inf.synthesis.api.ModelHandler
import org.eclipse.emf.ecore.impl.EObjectImpl
import org.eclipse.emf.ecore.impl.EPackageImpl

class TestEmfModelHandler extends GroovyTestCase {
    final static TEMP_MODEL_NAME = "temp-model"
    ModelHandler modelHandler

    void setUp() {
        modelHandler = new EmfModelHandler()
    }

    void testSave() {
        URI uri = File.createTempFile(TEMP_MODEL_NAME, ".xmi").toURI()
        modelHandler.save(new EObjectImpl(), uri)
    }

    void testSaveNull() {
        shouldFail(RuntimeException) {
            URI uri = File.createTempFile(TEMP_MODEL_NAME, ".xmi").toURI()
            modelHandler.save(null, uri)
        }
    }

    void testSaveNonEObject() {
        shouldFail(RuntimeException) {
            URI uri = File.createTempFile(TEMP_MODEL_NAME, ".xmi").toURI()
            modelHandler.save(null, uri)
        }
    }

    void testSaveInvalidPath() {
        shouldFail {
            URI uri = URI.create()
            modelHandler.save(new EObjectImpl(), uri)
        }
    }

    void testLoad() {
        URI uri = File.createTempFile(TEMP_MODEL_NAME, ".xmi").toURI()
        modelHandler.save(new EObjectImpl(), uri)
        def model = modelHandler.load(uri, "teste", new EPackageImpl())

        assert model
    }

    void testLoadNoMetaAttributes() {
        URI uri = File.createTempFile(TEMP_MODEL_NAME, ".xmi").toURI()
        modelHandler.save(new EObjectImpl(), uri)
        shouldFail {
            def model = modelHandler.load(uri)
        }

    }

    void testLoadNonExistFile() {
        URI uri = URI.create("/tmp/mock-temp-test.xmi")
        shouldFail(RuntimeException) {
            modelHandler.load(uri)
        }
    }

    void testAddElementTo() {
        mockCall("addElementTo")
    }

    void mockCall(String name) {
        shouldFail(UnsupportedOperationException) {
            modelHandler."$name"(null, null)
        }
    }

    void testDeleteElement() {
        mockCall("deleteElement")
    }

    void testUpdateValueIn() {
        mockCall("updateValueIn")
    }

    void testCreateElement() {
        shouldFail(UnsupportedOperationException) {
            modelHandler.createElement(null)
        }
    }

    void testLoadWellDefinedMetamodel() {
        def oldModel = "model/metamodel/cml-model/ControlSchemaTwoWay.xmi"

        def resOldModel = modelHandler.load(URI.create(oldModel), CmlPackage.eNS_URI, CmlPackage.eINSTANCE)
    }

}
