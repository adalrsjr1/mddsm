package br.inf.ufg.mddsm.controller.tests

import org.eclipse.emf.common.util.EList
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

import base.Manager
import br.inf.ufg.mddsm.controller.emf.EMFLoader
import br.inf.ufg.mddsm.controller.emf.EmfModelHandler
import br.inf.ufg.mddsm.controller.handlers.EventManager
import br.inf.ufg.mddsm.controller.img.DSC
import br.inf.ufg.mddsm.controller.img.Repository
import br.inf.ufg.mddsm.controller.img.Procedure
import br.inf.ufg.mddsm.controller.manager.MainManager
import br.inf.ufg.mddsm.controller.manager.ManagerFacade
import br.inf.ufg.mddsm.controller.emf.ManagerFactory
import br.inf.ufg.mddsm.controller.emf.ModelHandler
import br.inf.ufg.mddsm.controller.resource.ResourceManager
import br.inf.ufg.mddsm.controller.script.ControlScript
import br.inf.ufg.mddsm.controller.script.ScriptInterpreter
import dsk.Dsk
import dsk.DskPackage
import br.inf.ufg.mddsm.controller.img.Type


class TestLoadDSCs {
    
        static EventManager eventManager
        static MainManager mainManager
        static ResourceManager resourceManager
        static Repository repo
        static ModelHandler modelHandler = new EmfModelHandler();
		
		static ArrayList<Procedure> procedures
		static ArrayList<DSC> dependencies
		static Dsk dsk
		static DSC classifier
		
        
        @BeforeAll
        static void main(String[] args) {
                                   
            def model = "src/test/resources/dsk.xmi"
            
            //def resModel = modelHandler.load(model.toURI(), DscPackage.eNS_URI, DscPackage.eINSTANCE)
			
			dsk = modelHandler.load(model.toURI())
			
			//DSK dsk = (DSK) resModel
           	
			//EList list = dsk.getProcedures()					
			
			createRepository()
			
			new ScriptInterpreter().interpreter(new ControlScript())             
            
        }
		
		static void createRepository() {
			println ("Creating repository ... ")
			Repository repo = Repository.getInstance()
			int i = 0
			dsk.getProcedures().each {				
				
				dependencies = new ArrayList<DSC>()
				
				ArrayList<DSC> dep = new ArrayList<DSC>()
				dep = (ArrayList<DSC>) dsk.getProcedures().get(i).getDependencies()
				
				int k=0
				while(k < dep.size){
					DSC dscTmp = new DSC(dep.get(k).getName(), Type.OPER)
					dependencies.add(dscTmp)
					k++
				}
				
				//alterar para pegar o tipo do modelo				
				classifier = new DSC(dsk.getProcedures().get(i).getClassifier().getName(), Type.OPER)
					
				Procedure procedure = new Procedure(dsk.getProcedures().get(i).getId(), dsk.getProcedures().get(i).getName(), classifier, dependencies)
				println( procedure.getName() )
				int j=0
				while(j < dependencies.size) 
					println("Dependencies: "+dependencies.get(j++).getName())
				
				i++
				repo.addProcedure(procedure)
			}
			
			Repository.instance = repo
			
			/*			
			Procedure procedure1 = new Procedure("0001", "SendBasic1", sendDSC, dependencies1);*/
			println ("Repository created ("+repo.getAllProcedures().size+")...")
		}
}
    
    