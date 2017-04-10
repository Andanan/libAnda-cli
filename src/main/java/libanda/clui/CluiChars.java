package libanda.clui;

public class CluiChars {

	public static CluiChars getAsciiCharSet(){
		CluiChars asciiCharSet = new CluiChars();
		return asciiCharSet;
	}
	public static CluiChars getSimpleUnicodeCharSet(){
		CluiChars simpleUnicodeCharSet = new CluiChars();
		return simpleUnicodeCharSet;
	}
	public static CluiChars getDuplexUnicodeCharSet(){
		CluiChars duplexUnicodeCharSet = new CluiChars();
		return duplexUnicodeCharSet;
	}
	public static CluiChars getMixedUnicodeCharSet(){
		CluiChars mixedUnicodeCharSet = new CluiChars();
		return mixedUnicodeCharSet;
	}
	
	public CluiChars() {
		
	}
	public CluiChars(CluiChars template) {
		
	}
	public char get(int key){
		return '\0';
	}
	public void set(int key, char val) {
		
	}
}
