package armines.utils;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import diff.*;

public class EMFModelLoad {
	public DiffModel load(){
		//Initialize the model
		DiffPackage.eINSTANCE.eClass();
		// Register the XMI resource factory for the .xmi extension
	    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("xmi", new XMIResourceFactoryImpl());
	    //Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();
		// Get the resource
	    Resource resource = resSet.getResource(URI.createURI("diff_model.xmi"), true);
	    // Get the first model element and cast it to the right type
	    DiffModel diffModel = (DiffModel) resource.getContents().get(0);
	    return diffModel;
	}

}
