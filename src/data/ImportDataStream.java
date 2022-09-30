package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ImportDataStream {
	private String folderPath;
	private HashMap <String, ImportedDataList> data;
	
	public ImportDataStream (String folderPath) {
		this.folderPath = folderPath;
		
		File folder = new File(folderPath);
		
		
		File[] dataFiles = folder.listFiles();
		
		for (File f : dataFiles) {
			try {

				  data.put(f.getName(), new ImportedDataList());
			      Scanner reader = new Scanner(f);
			      
			      while (reader.hasNextLine()) {
			        String line = reader.nextLine();
			        data.get(f.getName())
			        		.add(
		        				new ImportedDataItem(line)
			        		);
			      }
			      reader.close();
			      
		    } catch (FileNotFoundException e) {
		      System.out.println("Unable to read file.");
		      e.printStackTrace();
		    }
		}
		
	}
	
	public ImportedDataList getImportedList(String dataHeader) {
		return data.get(dataHeader);
	}
	
}
