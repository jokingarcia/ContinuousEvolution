package armines.execution;

import diff.*;

import java.util.Iterator;
import java.util.Map;
import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;



public class AreBreakingChanges {
	public static DiffModel load(){
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
	public static boolean areBreakingChangesTransf(DiffElement element){
		boolean result = false;
		if(element.getClass().getName().split("\\.")[2].compareTo("UpdateAttributeImpl")==0){
			result = true;
		}else if (element.getClass().getName().split("\\.")[2].compareTo("DiffGroupImpl")==0){
			//call again for each of the elements in the diffgroup
			 for (Iterator<DiffElement> iterator = element.getSubDiffElements().iterator(); iterator.hasNext();) {
		          DiffElement element2 = iterator.next();
		          areBreakingChangesTransf(element2);
		    }
		}else{
			result = false;
		}
		return result;
	}
	public static boolean areBreakingChangesModel(DiffElement element){
		boolean result = false;
		if(element.getClass().getName().split("\\.")[2].compareTo("UpdateAttributeImpl")==0){
			result = true;
		}else if (element.getClass().getName().split("\\.")[2].compareTo("DiffGroupImpl")==0){
			//call again for each of the elements in the diffgroup
			 for (Iterator<DiffElement> iterator = element.getSubDiffElements().iterator(); iterator.hasNext();) {
		          DiffElement element2 = iterator.next();
		          areBreakingChangesModel(element2);
		    }
		}else{
			result = false;
		}
		return result;
	}
	public static void main(String[] args) {
		//delete file BreakingChangesTransf.txt
		File f = new File("BreakingChangesTransf.txt");
		if(f.delete()){
			System.out.println("BreakingChangesTransf file is deleted");
		} else {
			System.err.println("Failed to delete file BreakingChangesTransf");
		}
		//delete file BreakingChangesModel.txt
		File f2 = new File("BreakingChangesModel.txt");
		if(f2.delete()){
			System.out.println("BreakingChangesModel file is deleted");
		} else {
			System.err.println("Failed to delete file BreakingChangesModel");
		}
		boolean areBreakingChangesTransf = false;
		boolean areBreakingChangesModel = false;
		 // Loading the existing model
	    DiffModel diffModel = load();
	    // Accessing the model information
	    for (Iterator<DiffElement> iterator = diffModel.getOwnedElements().iterator(); iterator.hasNext();) {
	          DiffElement element = iterator.next();
	          if(areBreakingChangesTransf(element)==true){
	        	  areBreakingChangesTransf = true;
	          }
	          if(areBreakingChangesModel(element)==true){
	        	  areBreakingChangesModel = true;
	          }
	    }
	    //if there are breaking changes in the transf, create a file
	    try{
	    	if (f.createNewFile()){
		        System.out.println("BreakingChangesTransf file is created");
		      }else{
		        System.out.println("BreakingChangesTransf file already exists");
		      }
	    }catch (Exception e){
	    	e.printStackTrace();
	    }
	  //if there are breaking changes in the model, create a file
	    try{
	    	if (f2.createNewFile()){
		        System.out.println("BreakingChangesModel file is created");
		      }else{
		        System.out.println("BreakingChangesModel file already exists");
		      }
	    }catch (Exception e){
	    	e.printStackTrace();
	    }
	}

}
