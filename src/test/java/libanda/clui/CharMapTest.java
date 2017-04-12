package libanda.clui;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class CharMapTest {
	
	/* Predefined charsets */
	private CharMap asciiCharSet;
	private CharMap simpleUnicodeCharSet;
	private CharMap duplexUnicodeCharSet;
	private CharMap mixedUnicodeCharSet;

	/* ASCII chars */
	private char plus = '+';
	private char minus = '-';
	private char pipe = '|';
	private char space = ' ';
	
	/* simple unicode chars */
	private char su_innerHorizontalLine = '\u2500';
	private char su_outerHorizontalLine = su_innerHorizontalLine;
	private char su_innerVerticalLine = '\u2502';
	private char su_outerVerticalLine = su_innerVerticalLine;
	private char su_topLeftCorner = '\u250C';
	private char su_topCenter = '\u252C';
	private char su_topRightCorner = '\u2510';
	private char su_centerLeft = '\u251c';
	private char su_junction = '\u253c';
	private char su_centerRight = '\u2524';
	private char su_bottomLeftCorner = '\u2514';
	private char su_bottomCenter = '\u2534';
	private char su_bottomRightCorner = '\u2518';
	
	/* duplex line unicode chars */
	private char du_innerHorizontalLine = '\u2550';
	private char du_outerHorizontalLine = du_innerHorizontalLine;
	private char du_innerVerticalLine = '\u2551';
	private char du_outerVerticalLine = du_innerVerticalLine;
	private char du_topLeftCorner = '\u2554';
	private char du_topCenter = '\u2566';
	private char du_topRightCorner = '\u2557';
	private char du_centerLeft = '\u2560';
	private char du_junction = '\u256c';
	private char du_centerRight = '\u2563';
	private char du_bottomLeftCorner = '\u255a';
	private char du_bottomCenter = '\u2569';
	private char du_bottomRightCorner = '\u255d';
	
	/* mixed line unicode chars */
	private char mu_innerHorizontalLine = su_innerHorizontalLine;
	private char mu_outerHorizontalLine = du_outerHorizontalLine;
	private char mu_innerVerticalLine = su_innerVerticalLine;
	private char mu_outerVerticalLine = du_outerVerticalLine;
	private char mu_topLeftCorner = du_topLeftCorner;
	private char mu_topCenter = '\u2564';
	private char mu_topRightCorner = du_topRightCorner;
	private char mu_centerLeft = '\u255F';
	private char mu_junction = su_junction;
	private char mu_centerRight = '\u2562';
	private char mu_bottomLeftCorner = du_bottomLeftCorner;
	private char mu_bottomCenter = '\u2567';
	private char mu_bottomRightCorner = du_bottomRightCorner;
	
	@Before
	public void initializeCluiCharSets() {
		this.asciiCharSet = CharMap.getAsciiCharSet();
		this.simpleUnicodeCharSet = CharMap.getSimpleUnicodeCharSet();
		this.duplexUnicodeCharSet = CharMap.getDuplexUnicodeCharSet();
		this.mixedUnicodeCharSet = CharMap.getMixedUnicodeCharSet();
	}
	
	@Test
	public void validateAsciiCharSet() {
		assertEquals(plus, this.asciiCharSet.get(CharMap.TOP_LEFT_CORNER));
		assertEquals(plus, this.asciiCharSet.get(CharMap.TOP_CENTER));
		assertEquals(plus, this.asciiCharSet.get(CharMap.TOP_RIGHT_CORNER));
		assertEquals(plus, this.asciiCharSet.get(CharMap.CENTER_LEFT));
		assertEquals(plus, this.asciiCharSet.get(CharMap.JUNCTION));
		assertEquals(plus, this.asciiCharSet.get(CharMap.CENTER_RIGHT));
		assertEquals(plus, this.asciiCharSet.get(CharMap.BOTTOM_LEFT_CORNER));
		assertEquals(plus, this.asciiCharSet.get(CharMap.BOTTOM_CENTER));
		assertEquals(plus, this.asciiCharSet.get(CharMap.BOTTOM_RIGHT_CORNER));
		
		assertEquals(minus, this.asciiCharSet.get(CharMap.OUTER_HORIZONTAL));
		assertEquals(minus, this.asciiCharSet.get(CharMap.INNER_HORIZONTAL));

		assertEquals(pipe, this.asciiCharSet.get(CharMap.OUTER_VERTICAL));
		assertEquals(pipe, this.asciiCharSet.get(CharMap.INNER_VERTICAL));

		assertEquals(space, this.asciiCharSet.get(CharMap.SPACE));
	}
	@Test
	public void validateSimpleUnicodeCharSet() {
		assertEquals(this.su_topLeftCorner, this.simpleUnicodeCharSet.get(CharMap.TOP_LEFT_CORNER));
		assertEquals(this.su_topCenter, this.simpleUnicodeCharSet.get(CharMap.TOP_CENTER));
		assertEquals(this.su_topRightCorner, this.simpleUnicodeCharSet.get(CharMap.TOP_RIGHT_CORNER));
		assertEquals(this.su_centerLeft, this.simpleUnicodeCharSet.get(CharMap.CENTER_LEFT));
		assertEquals(this.su_junction, this.simpleUnicodeCharSet.get(CharMap.JUNCTION));
		assertEquals(this.su_centerRight, this.simpleUnicodeCharSet.get(CharMap.CENTER_RIGHT));
		assertEquals(this.su_bottomLeftCorner, this.simpleUnicodeCharSet.get(CharMap.BOTTOM_LEFT_CORNER));
		assertEquals(this.su_bottomCenter, this.simpleUnicodeCharSet.get(CharMap.BOTTOM_CENTER));
		assertEquals(this.su_bottomRightCorner, this.simpleUnicodeCharSet.get(CharMap.BOTTOM_RIGHT_CORNER));
		
		assertEquals(this.su_outerHorizontalLine, this.simpleUnicodeCharSet.get(CharMap.OUTER_HORIZONTAL));
		assertEquals(this.su_innerHorizontalLine, this.simpleUnicodeCharSet.get(CharMap.INNER_HORIZONTAL));

		assertEquals(this.su_outerVerticalLine, this.simpleUnicodeCharSet.get(CharMap.OUTER_VERTICAL));
		assertEquals(this.su_innerVerticalLine, this.simpleUnicodeCharSet.get(CharMap.INNER_VERTICAL));

		assertEquals(this.space, this.simpleUnicodeCharSet.get(CharMap.SPACE));
	}
	@Test
	public void validateDuplexUnicodeCharSet() {
		assertEquals(this.du_topLeftCorner, this.duplexUnicodeCharSet.get(CharMap.TOP_LEFT_CORNER));
		assertEquals(this.du_topCenter, this.duplexUnicodeCharSet.get(CharMap.TOP_CENTER));
		assertEquals(this.du_topRightCorner, this.duplexUnicodeCharSet.get(CharMap.TOP_RIGHT_CORNER));
		assertEquals(this.du_centerLeft, this.duplexUnicodeCharSet.get(CharMap.CENTER_LEFT));
		assertEquals(this.du_junction, this.duplexUnicodeCharSet.get(CharMap.JUNCTION));
		assertEquals(this.du_centerRight, this.duplexUnicodeCharSet.get(CharMap.CENTER_RIGHT));
		assertEquals(this.du_bottomLeftCorner, this.duplexUnicodeCharSet.get(CharMap.BOTTOM_LEFT_CORNER));
		assertEquals(this.du_bottomCenter, this.duplexUnicodeCharSet.get(CharMap.BOTTOM_CENTER));
		assertEquals(this.du_bottomRightCorner, this.duplexUnicodeCharSet.get(CharMap.BOTTOM_RIGHT_CORNER));
		
		assertEquals(this.du_outerHorizontalLine, this.duplexUnicodeCharSet.get(CharMap.OUTER_HORIZONTAL));
		assertEquals(this.du_innerHorizontalLine, this.duplexUnicodeCharSet.get(CharMap.INNER_HORIZONTAL));

		assertEquals(this.du_outerVerticalLine, this.duplexUnicodeCharSet.get(CharMap.OUTER_VERTICAL));
		assertEquals(this.du_innerVerticalLine, this.duplexUnicodeCharSet.get(CharMap.INNER_VERTICAL));

		assertEquals(this.space, this.duplexUnicodeCharSet.get(CharMap.SPACE));
	}
	@Test
	public void validateMixedUnicodeCharSet() {
		assertEquals(this.mu_topLeftCorner, this.mixedUnicodeCharSet.get(CharMap.TOP_LEFT_CORNER));
		assertEquals(this.mu_topCenter, this.mixedUnicodeCharSet.get(CharMap.TOP_CENTER));
		assertEquals(this.mu_topRightCorner, this.mixedUnicodeCharSet.get(CharMap.TOP_RIGHT_CORNER));
		assertEquals(this.mu_centerLeft, this.mixedUnicodeCharSet.get(CharMap.CENTER_LEFT));
		assertEquals(this.mu_junction, this.mixedUnicodeCharSet.get(CharMap.JUNCTION));
		assertEquals(this.mu_centerRight, this.mixedUnicodeCharSet.get(CharMap.CENTER_RIGHT));
		assertEquals(this.mu_bottomLeftCorner, this.mixedUnicodeCharSet.get(CharMap.BOTTOM_LEFT_CORNER));
		assertEquals(this.mu_bottomCenter, this.mixedUnicodeCharSet.get(CharMap.BOTTOM_CENTER));
		assertEquals(this.mu_bottomRightCorner, this.mixedUnicodeCharSet.get(CharMap.BOTTOM_RIGHT_CORNER));
		
		assertEquals(this.mu_outerHorizontalLine, this.mixedUnicodeCharSet.get(CharMap.OUTER_HORIZONTAL));
		assertEquals(this.mu_innerHorizontalLine, this.mixedUnicodeCharSet.get(CharMap.INNER_HORIZONTAL));

		assertEquals(this.mu_outerVerticalLine, this.mixedUnicodeCharSet.get(CharMap.OUTER_VERTICAL));
		assertEquals(this.mu_innerVerticalLine, this.mixedUnicodeCharSet.get(CharMap.INNER_VERTICAL));

		assertEquals(this.space, this.mixedUnicodeCharSet.get(CharMap.SPACE));
	}
	
	@Test
	public void getCharMapTest() {
		int key1 = 0;
		int key2 = 1;
		char val1 = 'a';
		char val2 = 'b';
		Map<Integer, Character> refMap = new HashMap<>();
		refMap.put(key1, val1);
		refMap.put(key2, val2);
		
		CharMap cluiCharMap = new CharMap() {
			{
				this.charMap = new HashMap<>();
				this.charMap.put(key1, val1);
				this.charMap.put(key2, val2);
			}
		};
		assertEquals(refMap, cluiCharMap.getCharMap());
	}
	
	@Test
	public void setTest() {
		int key1 = 1, key2 = -4, key3 = 0;
		char val1 = 'a', val2 = 'b', val3 = 'c';
		CharMap ccm = new CharMap();
		
		// ensure values are not present before
		assertTrue(ccm.getCharMap().isEmpty());
		
		ccm.set(key1, val1);
		ccm.set(key2, val2);
		ccm.set(key3, val3);
		
		// validate set values
		Map<Integer, Character> charMap = ccm.charMap;
		assertEquals(val1, (char) charMap.get(key1));
		assertEquals(val2, (char) charMap.get(key2));
		assertEquals(val3, (char) charMap.get(key3));
	}
	
	@Test
	public void getTest() {
		int key1 = 1, key2 = -4, key3 = 0;
		char val1 = 'a', val2 = 'b', val3 = 'c';
		CharMap ccm = new CharMap() {
			{
				this.charMap = new HashMap<>();
				this.charMap.put(key1, val1);
				this.charMap.put(key2, val2);
				this.charMap.put(key3, val3);
			}
		};
		assertEquals(val1, ccm.get(key1));
		assertEquals(val2, ccm.get(key2));
		assertEquals(val3, ccm.get(key3));
	}
	
	@Test
	public void consturctorTest() {
		CharMap ccm = new CharMap();
		assertEquals(new HashMap<Integer, Character>(), ccm.getCharMap());
		assertTrue(ccm.getCharMap().isEmpty());
	}
	
	@Test
	public void _2paramConsturctorTest() {
		CharMap ccm1 = CharMap.getAsciiCharSet();
		CharMap ccm2 = new CharMap();
		CharMap ccm3 = new CharMap(null);
		CharMap ccm12 = new CharMap(ccm1);
		CharMap ccm22 = new CharMap(ccm2);

		assertEquals(ccm1.charMap, ccm12.charMap);
		assertEquals(ccm2.charMap, ccm22.charMap);
		assertEquals(ccm2.charMap, ccm3.charMap);
	}
}
