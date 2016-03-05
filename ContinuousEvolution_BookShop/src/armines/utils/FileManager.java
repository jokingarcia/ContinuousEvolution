package armines.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.eclipse.emf.common.util.URI;

public class FileManager{
	
	private File logFile = null;
	private BufferedWriter bufferLog = null;
	private Scanner scanner = null;  
	private File fileSource = null;

	public String insertGeneratedFilesDir(String originalPath){
		String newPath = originalPath.substring(0,originalPath.lastIndexOf("/")) + "/generatedFiles" 
				+ originalPath.substring(originalPath.lastIndexOf("/"), originalPath.length());
		System.out.println(newPath);
		return newPath;
	}
	
	public InputStream getStream(String originalPath){
		InputStream fInputStream = null;
		fInputStream = FileManager.class.getClassLoader().getResourceAsStream(originalPath);		
		return fInputStream;
	}
	
	public String [] getTabOfDirectories(File file){
		String[] directories = file.list(new FilenameFilter() {		
			
			  @Override
			  public boolean accept(File dir, String name) {				  
			    return new File(dir, name).isDirectory(); 
			  }
			});
		
		return directories;
	}
	
	public String getDirectories (String[] segments){
		String directories = "";
		int i = 0;
		for (String segment : segments){
			i++;
			if (i < segments.length){
				directories += "/" + segment;
			}
		}
		directories += "/";
		return directories;
	}

	public String getDirectories (File file){
		String directories = getDirectories(file.getAbsolutePath().split("\\\\"));			
		directories = directories.substring(directories.indexOf("/")+1, directories.length());
		return directories;
	}
	
	public String getXDirectories (String[] segments, int numberOfLastDirtoDelete){
		String directories = getDirectories(segments);		
		directories = deleteDir(directories, numberOfLastDirtoDelete);		
		return directories;
	}
	
	public String getXDirectories (File file, int numberOfLastDirtoDelete){
		String directories = getDirectories(file);		
		directories = deleteDir(directories, numberOfLastDirtoDelete);		
		return directories;
	}
	
	public void copyFile(String source, String target){
		InputStream inStream = null;
		OutputStream outStream = null;
	 
    	try{
 
    	    File bfile =new File(target);
 
    	    inStream = getStream(source);
    	    outStream = new FileOutputStream(bfile);
 
    	    byte[] buffer = new byte[1024];
 
    	    int length;
    	    while ((length = inStream.read(buffer)) > 0){	 
    	    	outStream.write(buffer, 0, length);	 
    	    }
 
    	    inStream.close();
    	    outStream.close();
 	 
    	}catch(IOException e){
    		writeLogError(e);
    	}
	}
	
	public String getFileNameWithoutExtension(String filePath){
		String fileNameWithoutExtension = URI.createFileURI(filePath).trimFileExtension().lastSegment();
		return fileNameWithoutExtension;
	}
	
	public void readAndReplaceStrings(String filePath, Object classWithLineTreatment){
		
		try {
			Class<?> [] paramTypeLineTreatment = {String.class};
			Method lineTreatmentObjectMethod = classWithLineTreatment.getClass().getDeclaredMethod("lineTreatment", paramTypeLineTreatment);
						
			String toWrite = "";
			
			if (fileSource == null){
				fileSource = new File(filePath);
			}
			
			try(		
					Scanner scanner = (this.scanner == null?new Scanner(fileSource):this.scanner);	
				){

					while (scanner.hasNextLine()) {						
						String line = scanner.nextLine();
						toWrite += (String) lineTreatmentObjectMethod.invoke(classWithLineTreatment, line);	
					}

			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
			
			try(
				OutputStream outStream = new FileOutputStream(fileSource);
			){					
				outStream.write(toWrite.getBytes(), 0, toWrite.getBytes().length);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e1) {
			e1.printStackTrace();
		} catch (SecurityException e1) {
			e1.printStackTrace();
		}
		
	}
	
	public String getBlock(String startingLine, String firstString, String lastString){
		String block = "";
		String line = "";		
		Boolean flagBeginLine = false;
		
		try {			
									
			try(							
					Scanner scanner = new Scanner(getFileSource());
				){				
					while (scanner.hasNextLine()){			
						line = scanner.nextLine();
						if (line.matches(lastString) & flagBeginLine){
							break;
						}else{
							if(line.equals(startingLine) || flagBeginLine){
								flagBeginLine = true;
								if(line.matches(firstString) || block != ""){
									block += line + "\n";
								}	
							} 
						}						
					}

			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
				
		return block;
	}
	
	public void setLogPath(String logPath){	
		logFile = new File(logPath + "logFile_" + DateFactory.getActualDate() + ".log");
		
		try {
			FileWriter fw = new FileWriter(logFile, true);
			this.bufferLog = new BufferedWriter(fw);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}	
	
	public void writeLogError(Exception exception){
		try {
			bufferLog.write(ExceptionUtils.getStackTrace(exception));
			bufferLog.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private String deleteDir(String directories, int numberOfLastDirtoDelete){
		
		for (int i = 0; i < numberOfLastDirtoDelete; i ++){
			directories = directories.substring(0, directories.lastIndexOf("/"));
		}
		
		return directories;
	}
	
	public File getFileSource() {
		return fileSource;
	}
	
	public File getLogFile() {
		return logFile;
	}
}