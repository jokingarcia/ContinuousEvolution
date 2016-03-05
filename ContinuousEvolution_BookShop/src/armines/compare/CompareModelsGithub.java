package armines.compare;

import org.eclipse.emf.compare.*;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.diff.service.DiffService;
import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.compare.match.service.MatchService;
import org.eclipse.emf.compare.util.ModelUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;


public class CompareModelsGithub {

	/**
	 * @param args
	 */
	public static void compare(String file1, String file2) {
		
		URI uri1 = URI.createFileURI("metamodels\\" + file1);
		URI uri2 = URI.createFileURI("metamodels\\" + file2);
	 
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		ResourceSet resourceSet1 = new ResourceSetImpl();
		ResourceSet resourceSet2 = new ResourceSetImpl();
	 
		resourceSet1.getResource(uri1, true);
		resourceSet2.getResource(uri2, true);
	 
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
			ModelUtils.save(diff, "models\\diff_model.xmi");
			//ModelUtils.save(diff, "diff_model.xmi");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	private static void addResourceToModel(ResourceSet resourceSet, EObject obj, String path) {
		Resource res = resourceSet.createResource(URI.createURI(path));
		res.getContents().add(obj);
		
	}
	public static void getFileFromGithub(String file){
		String link = "https://raw.githubusercontent.com/jokingarcia/ContinuousEvolution_GoogleMaps/master/metamodels/"+file;
		String fileName = "C://Users//Jokin Garcia//Dropbox//workspace_ContinuousEvolution//ContinuousEvolution_GoogleMaps//metamodels//"+file;
		URL url = null;
		try {
			url = new URL(link);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		URLConnection c=null;
		try {
			c = url.openConnection();
		} catch (IOException e) {
			e.printStackTrace();
		}
		c.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; .NET CLR 1.0.3705; .NET CLR 1.1.4322; .NET CLR 1.2.30703)");
		InputStream input = null;
		try {
			input = c.getInputStream();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		byte[] buffer = new byte[4096];
		int n = -1;
		OutputStream output = null;
		try {
			output = new FileOutputStream(new File(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			while ((n = input.read(buffer)) != -1) {
			    if (n > 0) {
			        output.write(buffer, 0, n);
			    }
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
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
		//compare("Company.ecore","Company_v2.ecore");
		getFileFromGithub(args[0]);
		compare(args[0],args[1]);
		System.out.println("ok");
	}

}
