package armines.compare;

import org.eclipse.emf.compare.*;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.diff.service.DiffService;
import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.compare.match.service.MatchService;
import org.eclipse.emf.compare.util.ModelUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;


public class CompareUMLModels {

	/**
	 * @param args
	 */
	public static void compare(String file1, String file2) {
//		URI uri1 = URI.createFileURI("C:\\Users\\Jokin\\Dropbox\\workspace_dropbox\\WikiWhirlEvolution\\metamodels\\" + file1);
//		URI uri2 = URI.createFileURI("C:\\Users\\Jokin\\Dropbox\\workspace_dropbox\\WikiWhirlEvolution\\metamodels\\" + file2);
//		URI uri1 = URI.createFileURI("C:\\Users\\jokin\\Dropbox\\workspace_java2uml\\ContinuousEvolution\\" + file1);
//		URI uri2 = URI.createFileURI("C:\\Users\\jokin\\Dropbox\\workspace_java2uml\\ContinuousEvolution\\" + file2);
		
		URI uri1 = URI.createFileURI("metamodels\\" + file1);
		URI uri2 = URI.createFileURI("metamodels\\" + file2);
	 
		//Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		//Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("uml", new EcoreResourceFactoryImpl());
		ResourceSet resourceSet1 = new ResourceSetImpl();
		ResourceSet resourceSet2 = new ResourceSetImpl();
	 
		resourceSet1.getResource(uri1, true);
		resourceSet2.getResource(uri2, true);
	 
//		IComparisonScope scope = EMFCompare.createDefaultScope(resourceSet1, resourceSet2);
//		Comparison comparison = EMFCompare.builder().build().compare(scope);
//		try {
//			ModelUtils.save(comparison, "C:\\Users\\Jokin\\Dropbox\\workspace_dropbox\\WikiWhirlEvolution\\models\\diff_model.xmi");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		//List<Diff> differences = comparison.getDifferences();
//		for (Diff diff : differences) {
//			System.out.println(diff.toString());
//		}
		
//		EObject targetModel = (EObject)resourceSet1.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
//		EObject ecoreModel2 = (EObject)resourceSet2.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
//		EObject ecoreModel1 = (EObject)resourceSet1.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
//		EObject ecoreModel2 = (EObject)resourceSet2.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		EObject model1 = null;
		EObject model2 = null;
		try {
			// Loads the two models passed as arguments
			 model1 = ModelUtils.load(new File("metamodels\\" + file1), resourceSet1);
		     model2 = ModelUtils.load(new File("metamodels\\" + file2), resourceSet2);
		
		} catch (IOException e) {
			e.printStackTrace();
		}
        Map options = new HashMap();
		DiffModel diff = null;
		try {
			
			
			final MatchModel match = MatchService.doMatch(model1, model2, options);
			diff = DiffService.doDiff(match);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			//ModelUtils.save(diff, "models\\diff_model.xmi");
			ModelUtils.save(diff, "diff_model.xmi");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ok");
	}
	private static void addResourceToModel(ResourceSet resourceSet, EObject obj, String path) {
		Resource res = resourceSet.createResource(URI.createURI(path));
		res.getContents().add(obj);
		
	}
	/**
	 * Creates and return a new empty {@link Comparison} object with a defaut {@link EMFCompareConfiguration}.
	 * 
	 * @return the created {@link Comparison}.
	 */
	private static Comparison createEmptyComparison() {
		final Comparison emptyComparison = CompareFactory.eINSTANCE.createComparison();
		return emptyComparison;
	}
	
	public static void main(String[] args) {
		//compare("ExamXML.ecore","ExamXML_v2.ecore");
		compare("FactorialUMLActivityDiagramMini.uml","FactorialUMLActivityDiagramMini_Tanja.uml");
		//compare(args[0],args[1]);
	}

}
