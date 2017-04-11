package libanda.clui;

import java.util.HashMap;
import java.util.Map;

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
	
	private Map<Integer, Character> charMap;
	
	private static final char AS_PLUS = '+';
	private static final char AS_MINUS = '-';
	private static final char AS_PIPE = '|';
	private static final char AS_SPACE = ' ';
	private static final char SU_TOP_LEFT_CORNER = '\u250c';
	private static final char SU_TOP_CENTER = '\u252c';
	private static final char SU_TOP_RIGHT_CORNER = '\u2510';
	private static final char SU_CENTER_LEFT = '\u251c';
	private static final char SU_JUNCTION = '\u253c';
	private static final char SU_CENTER_RIGHT = '\u2524';
	private static final char SU_BOTTOM_LEFT_CORNER = '\u2514';
	private static final char SU_BOTTOM_CENTER = '\u2534';
	private static final char SU_BOTTOM_RIGHT_CORNER = '\u2518';
	private static final char SU_OUTER_HORIZONTAL = '\u2500';
	private static final char SU_INNER_HORIZONTAL = SU_OUTER_HORIZONTAL;
	private static final char SU_OUTER_VERTICAL = '\u2502';
	private static final char SU_INNER_VERTICAL = SU_OUTER_VERTICAL;
	private static final char DU_TOP_LEFT_CORNER = '\u2554';
	private static final char DU_TOP_CENTER = '\u2566';
	private static final char DU_TOP_RIGHT_CORNER = '\u2557';
	private static final char DU_CENTER_LEFT = '\u2560';
	private static final char DU_JUNCTION = '\u256c';
	private static final char DU_CENTER_RIGHT = '\u2563';
	private static final char DU_BOTTOM_LEFT_CORNER = '\u255a';
	private static final char DU_BOTTOM_CENTER = '\u2569';
	private static final char DU_BOTTOM_RIGHT_CORNER = '\u255d';
	private static final char DU_OUTER_HORIZONTAL = '\u2550';
	private static final char DU_INNER_HORIZONTAL = DU_OUTER_HORIZONTAL;
	private static final char DU_OUTER_VERTICAL = '\u2551';
	private static final char DU_INNER_VERTICAL = DU_OUTER_VERTICAL;
	private static final char MU_TOP_LEFT_CORNER = DU_TOP_LEFT_CORNER;
	private static final char MU_TOP_CENTER = '\u2564';
	private static final char MU_TOP_RIGHT_CORNER = DU_TOP_RIGHT_CORNER;
	private static final char MU_CENTER_LEFT = '\u255f';
	private static final char MU_JUNCTION = SU_JUNCTION;
	private static final char MU_CENTER_RIGHT = '\u2562';
	private static final char MU_BOTTOM_LEFT_CORNER = DU_BOTTOM_LEFT_CORNER;
	private static final char MU_BOTTOM_CENTER = '\u2567';
	private static final char MU_BOTTOM_RIGHT_CORNER = DU_BOTTOM_RIGHT_CORNER;
	private static final char MU_OUTER_HORIZONTAL = DU_OUTER_HORIZONTAL;
	private static final char MU_INNER_HORIZONTAL = SU_INNER_HORIZONTAL;
	private static final char MU_OUTER_VERTICAL = DU_OUTER_VERTICAL;
	private static final char MU_INNER_VERTICAL = SU_INNER_VERTICAL;
	

	public static CluiChars getAsciiCharSet(){
		CluiChars asciiCharSet = new CluiChars();
		asciiCharSet.set(TOP_LEFT_CORNER, AS_PLUS);
		asciiCharSet.set(TOP_CENTER, AS_PLUS);
		asciiCharSet.set(TOP_RIGHT_CORNER, AS_PLUS);
		asciiCharSet.set(CENTER_LEFT, AS_PLUS);
		asciiCharSet.set(JUNCTION, AS_PLUS);
		asciiCharSet.set(CENTER_RIGHT, AS_PLUS);
		asciiCharSet.set(BOTTOM_LEFT_CORNER, AS_PLUS);
		asciiCharSet.set(BOTTOM_CENTER, AS_PLUS);
		asciiCharSet.set(BOTTOM_RIGHT_CORNER, AS_PLUS);
		asciiCharSet.set(OUTER_HORIZONTAL, AS_MINUS);
		asciiCharSet.set(INNER_HORIZONTAL, AS_MINUS);
		asciiCharSet.set(OUTER_VERTICAL, AS_PIPE);
		asciiCharSet.set(INNER_VERTICAL, AS_PIPE);
		asciiCharSet.set(SPACE, AS_SPACE);
		return asciiCharSet;
	}
	public static CluiChars getSimpleUnicodeCharSet(){
		CluiChars simpleUnicodeCharSet = new CluiChars();
		simpleUnicodeCharSet.set(TOP_LEFT_CORNER, SU_TOP_LEFT_CORNER);
		simpleUnicodeCharSet.set(TOP_CENTER, SU_TOP_CENTER);
		simpleUnicodeCharSet.set(TOP_RIGHT_CORNER, SU_TOP_RIGHT_CORNER);
		simpleUnicodeCharSet.set(CENTER_LEFT, SU_CENTER_LEFT);
		simpleUnicodeCharSet.set(JUNCTION, SU_JUNCTION);
		simpleUnicodeCharSet.set(CENTER_RIGHT, SU_CENTER_RIGHT);
		simpleUnicodeCharSet.set(BOTTOM_LEFT_CORNER, SU_BOTTOM_LEFT_CORNER);
		simpleUnicodeCharSet.set(BOTTOM_CENTER, SU_BOTTOM_CENTER);
		simpleUnicodeCharSet.set(BOTTOM_RIGHT_CORNER, SU_BOTTOM_RIGHT_CORNER);
		simpleUnicodeCharSet.set(OUTER_HORIZONTAL, SU_OUTER_HORIZONTAL);
		simpleUnicodeCharSet.set(INNER_HORIZONTAL, SU_INNER_HORIZONTAL);
		simpleUnicodeCharSet.set(OUTER_VERTICAL, SU_OUTER_VERTICAL);
		simpleUnicodeCharSet.set(INNER_VERTICAL, SU_INNER_VERTICAL);
		simpleUnicodeCharSet.set(SPACE, AS_SPACE);
		return simpleUnicodeCharSet;
	}
	public static CluiChars getDuplexUnicodeCharSet(){
		CluiChars duplexUnicodeCharSet = new CluiChars();
		duplexUnicodeCharSet.set(TOP_LEFT_CORNER, DU_TOP_LEFT_CORNER);
		duplexUnicodeCharSet.set(TOP_CENTER, DU_TOP_CENTER);
		duplexUnicodeCharSet.set(TOP_RIGHT_CORNER, DU_TOP_RIGHT_CORNER);
		duplexUnicodeCharSet.set(CENTER_LEFT, DU_CENTER_LEFT);
		duplexUnicodeCharSet.set(JUNCTION, DU_JUNCTION);
		duplexUnicodeCharSet.set(CENTER_RIGHT, DU_CENTER_RIGHT);
		duplexUnicodeCharSet.set(BOTTOM_LEFT_CORNER, DU_BOTTOM_LEFT_CORNER);
		duplexUnicodeCharSet.set(BOTTOM_CENTER, DU_BOTTOM_CENTER);
		duplexUnicodeCharSet.set(BOTTOM_RIGHT_CORNER, DU_BOTTOM_RIGHT_CORNER);
		duplexUnicodeCharSet.set(OUTER_HORIZONTAL, DU_OUTER_HORIZONTAL);
		duplexUnicodeCharSet.set(INNER_HORIZONTAL, DU_INNER_HORIZONTAL);
		duplexUnicodeCharSet.set(OUTER_VERTICAL, DU_OUTER_VERTICAL);
		duplexUnicodeCharSet.set(INNER_VERTICAL, DU_INNER_VERTICAL);
		duplexUnicodeCharSet.set(SPACE, AS_SPACE);
		return duplexUnicodeCharSet;
	}
	public static CluiChars getMixedUnicodeCharSet(){
		CluiChars mixedUnicodeCharSet = new CluiChars();
		mixedUnicodeCharSet.set(TOP_LEFT_CORNER, MU_TOP_LEFT_CORNER);
		mixedUnicodeCharSet.set(TOP_CENTER, MU_TOP_CENTER);
		mixedUnicodeCharSet.set(TOP_RIGHT_CORNER, MU_TOP_RIGHT_CORNER);
		mixedUnicodeCharSet.set(CENTER_LEFT, MU_CENTER_LEFT);
		mixedUnicodeCharSet.set(JUNCTION, MU_JUNCTION);
		mixedUnicodeCharSet.set(CENTER_RIGHT, MU_CENTER_RIGHT);
		mixedUnicodeCharSet.set(BOTTOM_LEFT_CORNER, MU_BOTTOM_LEFT_CORNER);
		mixedUnicodeCharSet.set(BOTTOM_CENTER, MU_BOTTOM_CENTER);
		mixedUnicodeCharSet.set(BOTTOM_RIGHT_CORNER, MU_BOTTOM_RIGHT_CORNER);
		mixedUnicodeCharSet.set(OUTER_HORIZONTAL, MU_OUTER_HORIZONTAL);
		mixedUnicodeCharSet.set(INNER_HORIZONTAL, MU_INNER_HORIZONTAL);
		mixedUnicodeCharSet.set(OUTER_VERTICAL, MU_OUTER_VERTICAL);
		mixedUnicodeCharSet.set(INNER_VERTICAL, MU_INNER_VERTICAL);
		mixedUnicodeCharSet.set(SPACE, AS_SPACE);
		return mixedUnicodeCharSet;
	}
	
	public CluiChars() {
		this.charMap = new HashMap<>();
	}
	public CluiChars(CluiChars template) {
		this.charMap = new HashMap<>(template.charMap);
	}
	public char get(int key){
		Character c = this.charMap.get(key);
		return (c == null) ? '\0' : c;
	}
	public void set(int key, char val) {
		this.charMap.put(key, val);
	}
	public Map<Integer, Character> getCharMap() {
		return new HashMap<>(this.charMap);
	}
	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((charMap == null) ? 0 : charMap.hashCode());
		return result;
	}
	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CluiChars other = (CluiChars) obj;
		if (charMap == null) {
			if (other.charMap != null)
				return false;
		} else if (!charMap.equals(other.charMap))
			return false;
		return true;
	}
	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CluiChars [charSet=" + charMap + "]";
	}
	
}
