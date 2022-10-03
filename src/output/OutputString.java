// We were gonna have cool coloured text output, but Windows doesn't support ANSI colouring by default :(

package output;

public class OutputString {
	String lineString;
	
	public OutputString(String lineString) {
		this.lineString = lineString;
	}
	public void write() {
		System.out.print(this.lineString);
	}
	
	public void writeLine() {
		System.out.println(this.lineString);
	}
}
