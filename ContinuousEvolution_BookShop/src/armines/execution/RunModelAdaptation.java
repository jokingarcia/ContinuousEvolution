package armines.execution;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFReferenceModel;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.emfvm.adapter.EMFModelAdapter;
import org.eclipse.m2m.atl.engine.emfvm.adapter.IModelAdapter;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;

public class RunModelAdaptation {
	
	public void runTransformation(String pMetamodel, String pMetamodel2, String pTransformation, String pInputModel, String pOutputModel){
		try {
			/*
			 * Initializations
			 */
			ILauncher transformationLauncher = new EMFVMLauncher();
			ModelFactory modelFactory = new EMFModelFactory();
			IInjector injector = new EMFInjector();
			IExtractor extractor = new EMFExtractor();
			/*
			 * Load metamodel 2
			 */
			IReferenceModel metamodel2 = modelFactory.newReferenceModel();
			injector.inject(metamodel2, pMetamodel2);
			/*
			 * Load metamodel 1
			 */
			IReferenceModel metamodel1 = modelFactory.newReferenceModel();
			injector.inject(metamodel1, pMetamodel); 
			
			/*
			 * Run transformation
			 */
			IModel inputModel = modelFactory.newModel(metamodel1);
			injector.inject(inputModel, pInputModel);
			IModel outputModel = modelFactory.newModel(metamodel2);
			
			IModelAdapter modelAdapter = new EMFModelAdapter();
			modelAdapter.setAllowInterModelReferences(true); //$NON-NLS-1$ //$NON-NLS-2$
			
			transformationLauncher.initialize(new HashMap<String,Object>());
			transformationLauncher.addInModel(inputModel, "IN", "SWML");
			transformationLauncher.addOutModel(outputModel, "OUT", "SWML_v2");
			transformationLauncher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(), new HashMap<String,Object>(),
				new FileInputStream(pTransformation));
			
			extractor.extract(outputModel, pOutputModel);
			
			/*
			 * Unload all models and metamodels (EMF-specific)
			 */
			EMFModelFactory emfModelFactory = (EMFModelFactory) modelFactory;
			emfModelFactory.unload((EMFModel) outputModel);
			emfModelFactory.unload((EMFReferenceModel) metamodel1);
			emfModelFactory.unload((EMFReferenceModel) metamodel2);
			System.out.println("Finished transformation");
		} catch (ATLCoreException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		RunModelAdaptation rtj = new RunModelAdaptation();
		//metamodels, transformation, input model, output model
		rtj.runTransformation("metamodels/SWML.ecore", "metamodels/SWML_v2.ecore", "transformations/Model_adaptation.asm",
				"models/sWML_Model.xmi","models/sWML_Model_v2.xmi");
		//rtj.runTransformation(args[0], args[1], args[2], args[3],args[4]);
		System.out.println("ok");
	}
}