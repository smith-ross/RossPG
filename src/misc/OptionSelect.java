package misc;

import java.util.Scanner;
import java.util.ArrayList;

import output.OutputString;

public class OptionSelect {
	public ArrayList<String> options;
	
	private static final OutputString pleaseSelect = new OutputString("Please select an option:");
	
	public OptionSelect(String...optionsArr) {
		ArrayList<String> options = new ArrayList<String>();
		for (String option : optionsArr) {
			options.add(option);
		}
		this.options = options;
	}
	
	private void write() {
		String output = "";
		for (String option : options) {
			output += "| " + option + " ";
		}
		output += "|";
		System.out.println(output);
	}
	
	public String get() {
		write();
		pleaseSelect.writeLine();
		Scanner scan = new Scanner(System.in);
		String selected = scan.nextLine();
		while (!options.contains(selected.toUpperCase())) {
			pleaseSelect.writeLine();
			selected = scan.nextLine();
		}
		
		return selected.toUpperCase();
	}
	
}
