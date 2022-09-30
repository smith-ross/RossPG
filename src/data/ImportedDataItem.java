package data;

public class ImportedDataItem {
	
	private String name;
	private String value;
	
	public ImportedDataItem (String importString) {
		String[] splitString = importString.split("=");
		name = splitString[0];
		value = splitString[1];
	}
	
	public String getName() { return name; }
	public String getValue() {return value; }

	public String toString() {
		return "ImportedDataItem [name=" + name + ", value=" + value + "]";
	}
	
}
