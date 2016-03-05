package armines.execution;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.mofscript.MOFScriptModel.MOFScriptSpecification;
import org.eclipse.mofscript.parser.MofScriptParseError;
import org.eclipse.mofscript.parser.ParserUtil;
import org.eclipse.mofscript.runtime.ExecutionManager;
import org.eclipse.mofscript.runtime.ExecutionMessageListener;
import org.eclipse.mofscript.runtime.MofScriptExecutionException;

public class RunMofScript implements ExecutionMessageListener {

	private ParserUtil parserUtil;
	private ExecutionManager execMgr;
	private String inputModel;
	private String transformation;
	private String curDir;

	/**
	 * Constructor
	 */
	public RunMofScript() {
		parserUtil = null;
		execMgr = null;
		inputModel = null;
		transformation = null;
		curDir = System.getProperty("user.dir");
		parserUtil = new ParserUtil();
		execMgr = ExecutionManager.getExecutionManager();
	}

	/**
	 * Parses a transformation
	 * 
	 * @return number of parse errors
	 */
	protected int parse(String transformation) {
		File f = new File(transformation);
		
		MOFScriptSpecification spec = parserUtil.parse(f, true);
		int errorCount = ParserUtil.getModelChecker().getErrorCount();
		// check for errors:
		Iterator errorIt = ParserUtil.getModelChecker().getErrors(); // Iterator of MofScriptParseError objects
																		
		System.out.println("Parsing result: " + errorCount + " errors");
		if (errorCount > 0) {

			for (; errorIt.hasNext();) {
				MofScriptParseError parseError = (MofScriptParseError) errorIt
						.next();
				System.out.println("\t \t: Error: " + parseError.toString());
			}
		}
		return errorCount;
	}

	/**
	 * Executes the transformation
	 * 
	 * @param inputModel
	 *            - the name (path) of the inputmodel
	 */
	protected void execute(String inputModel) {
		XMIResourceFactoryImpl _xmiFac = null;
	
		//inputModel
		_xmiFac = new XMIResourceFactoryImpl();
		EObject sourceModel = null;
		File sourceModelFile = new File(inputModel);
		ResourceSet rSet = new ResourceSetImpl();
		rSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
			.put("*", _xmiFac);
		URI uri = URI.createFileURI(sourceModelFile.getAbsolutePath());
		System.out.println("Source model path: "+sourceModelFile.getAbsolutePath());
		Resource resource = rSet.getResource(uri, true);
		if (resource != null) {
			if (resource.getContents().size() > 0) {
				sourceModel = resource.getContents().get(0);
			}
		}
		
		// set the source model for the execution manager
		execMgr.addSourceModel(sourceModel);
		execMgr.setCharset("UTF-8");
		// sets the root output directory, if any is desired (e.g. "c:/temp")
		//execMgr.setRootDirectory("..");
		execMgr.setRootDirectory("C:\\Users\\Jokin Garcia\\Dropbox\\workspace_ContinuousEvolution\\ContinuousEvolution_BookShop\\models");
		//execMgr.setRootDirectory("C:\\Users\\Jokin\\Dropbox\\workspace_ContinuousEvolution\\ContinuousEvolution_BookShop\\models");
		
		// if true, files are not generated to the file system, but populated into a filemodel
		// which can be fetched afterwards. Value false will result in standard
		// file generation
		execMgr.setUseFileModel(false);
		// Turns on/off system logging
		execMgr.setUseLog(false);
		// Adds an output listener for the transformation execution.
		execMgr.getExecutionStack().addOutputMessageListener(this);
		
		try {
			execMgr.executeTransformation();
			// execMgr.getOutputModels();
		} catch (MofScriptExecutionException mex) {
			mex.printStackTrace();
		}

	}

	/**
	 * Parsing and executing
	 */
	public void parseAndExecute() {
		// register Form metamodel
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"ecore", new EcoreResourceFactoryImpl());

		// Read source metamodel
		ResourceSet rsSource = new ResourceSetImpl();
		String fileURI = curDir + "\\metamodels\\SWML.ecore";
		Resource resSource = rsSource.getResource(URI.createFileURI(fileURI), true);

		LinkedList<EPackage> packages = new LinkedList<EPackage>();
		EList<EObject> objects = resSource.getContents();
		for (EObject object : objects) {
			if (object instanceof EPackage) {
				EPackage pkg = (EPackage) object;
				EPackage.Registry.INSTANCE.put(pkg.getNsURI(), pkg);
				System.out.println("Registered metamodel: " + pkg.getNsURI());
			}
		}
		
		int errs = parse(transformation);
		if (errs == 0) {
			execute(inputModel);
		}
	}

	/**
	 * ExecutionMessageListener interface operations
	 */
	@Override
	public void executionMessage(String type, String description) {
		//System.out.println(type + " - " + description);
	}

	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		RunMofScript runM = new RunMofScript();
		System.out.println("Current dir: "+runM.curDir);
		runM.setEcoreModel(runM.curDir + "\\models\\sWML_Model.xmi");
		runM.setTransformation(runM.curDir + "\\transformations\\SWMLModel2HTMLCode.m2t");

		runM.parseAndExecute();
		System.out.println("SWMLModel2HTMLCode parseAndExecute end");
	}
	
	public String getEcoreModel() {
		return inputModel;
	}

	public void setEcoreModel(String ecoreModel) {
		this.inputModel = ecoreModel;
	}

	public String getTransformation() {
		return transformation;
	}

	public void setTransformation(String transformation) {
		this.transformation = transformation;
	}
}