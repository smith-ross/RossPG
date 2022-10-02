package output;

public class OutputString {
	String lineString;
	String outputColor = "";
	
	public OutputString(String lineString) {
		this.lineString = lineString;
	}
	
	public OutputString(String lineString, String outputColor) {
		this.lineString = lineString;
		this.outputColor = outputColor;
	}
	
	public void write() {
		System.out.print(this.outputColor + this.lineString + ConsoleColors.RESET);
	}
	
	public void writeLine() {
		System.out.println(this.outputColor + this.lineString + ConsoleColors.RESET);
	}
	
	public void setColor(String outputColor) {
		this.outputColor = outputColor;
	}
}
