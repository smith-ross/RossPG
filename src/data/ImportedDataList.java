package data;

import java.util.ArrayList;

public class ImportedDataList {
	private ArrayList<ImportedDataItem> storedItems;
	
	public void add(ImportedDataItem newItem) {
		storedItems.add(newItem);
	}
	
	public String getValueOf(String name) {
		for (ImportedDataItem item : storedItems) {
			if (name.equals(item.getName())) {
				return item.getValue();
			}
		}
		return "Not Found";
	}
	
}
