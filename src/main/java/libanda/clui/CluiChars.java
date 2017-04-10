package libanda.clui;

public class CluiChars {
	
	public static final int TOP_LEFT_CORNER = 0;
	public static final int TOP_CENTER = 1;
	public static final int TOP_RIGHT_CORNER = 2;
	public static final int CENTER_LEFT = 3;
	public static final int JUNCTION = 4;
	public static final int CENTER_RIGHT = 5;
	public static final int BOTTOM_LEFT_CORNER = 6;
	public static final int BOTTOM_CENTER = 7;
	public static final int BOTTOM_RIGHT_CORNER = 8;
	public static final int OUTER_HORIZONTAL = 9;
	public static final int INNER_HORIZONTAL = 10;
	public static final int OUTER_VERTICAL = 11;
	public static final int INNER_VERTICAL = 12;
	public static final int SPACE = 13;

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
