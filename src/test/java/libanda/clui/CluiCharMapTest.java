package libanda.clui;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class CluiCharMapTest {
	
	/* Predefined charsets */
	private CluiCharMap asciiCharSet;
	private CluiCharMap simpleUnicodeCharSet;
	private CluiCharMap duplexUnicodeCharSet;
	private CluiCharMap mixedUnicodeCharSet;

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
		this.asciiCharSet = CluiCharMap.getAsciiCharSet();
		this.simpleUnicodeCharSet = CluiCharMap.getSimpleUnicodeCharSet();
		this.duplexUnicodeCharSet = CluiCharMap.getDuplexUnicodeCharSet();
		this.mixedUnicodeCharSet = CluiCharMap.getMixedUnicodeCharSet();
	}
	
	@Test
	public void validateAsciiCharSet() {
		assertEquals(plus, this.asciiCharSet.get(CluiCharMap.TOP_LEFT_CORNER));
		assertEquals(plus, this.asciiCharSet.get(CluiCharMap.TOP_CENTER));
		assertEquals(plus, this.asciiCharSet.get(CluiCharMap.TOP_RIGHT_CORNER));
		assertEquals(plus, this.asciiCharSet.get(CluiCharMap.CENTER_LEFT));
		assertEquals(plus, this.asciiCharSet.get(CluiCharMap.JUNCTION));
		assertEquals(plus, this.asciiCharSet.get(CluiCharMap.CENTER_RIGHT));
		assertEquals(plus, this.asciiCharSet.get(CluiCharMap.BOTTOM_LEFT_CORNER));
		assertEquals(plus, this.asciiCharSet.get(CluiCharMap.BOTTOM_CENTER));
		assertEquals(plus, this.asciiCharSet.get(CluiCharMap.BOTTOM_RIGHT_CORNER));
		
		assertEquals(minus, this.asciiCharSet.get(CluiCharMap.OUTER_HORIZONTAL));
		assertEquals(minus, this.asciiCharSet.get(CluiCharMap.INNER_HORIZONTAL));

		assertEquals(pipe, this.asciiCharSet.get(CluiCharMap.OUTER_VERTICAL));
		assertEquals(pipe, this.asciiCharSet.get(CluiCharMap.INNER_VERTICAL));

		assertEquals(space, this.asciiCharSet.get(CluiCharMap.SPACE));
	}
	@Test
	public void validateSimpleUnicodeCharSet() {
		assertEquals(this.su_topLeftCorner, this.simpleUnicodeCharSet.get(CluiCharMap.TOP_LEFT_CORNER));
		assertEquals(this.su_topCenter, this.simpleUnicodeCharSet.get(CluiCharMap.TOP_CENTER));
		assertEquals(this.su_topRightCorner, this.simpleUnicodeCharSet.get(CluiCharMap.TOP_RIGHT_CORNER));
		assertEquals(this.su_centerLeft, this.simpleUnicodeCharSet.get(CluiCharMap.CENTER_LEFT));
		assertEquals(this.su_junction, this.simpleUnicodeCharSet.get(CluiCharMap.JUNCTION));
		assertEquals(this.su_centerRight, this.simpleUnicodeCharSet.get(CluiCharMap.CENTER_RIGHT));
		assertEquals(this.su_bottomLeftCorner, this.simpleUnicodeCharSet.get(CluiCharMap.BOTTOM_LEFT_CORNER));
		assertEquals(this.su_bottomCenter, this.simpleUnicodeCharSet.get(CluiCharMap.BOTTOM_CENTER));
		assertEquals(this.su_bottomRightCorner, this.simpleUnicodeCharSet.get(CluiCharMap.BOTTOM_RIGHT_CORNER));
		
		assertEquals(this.su_outerHorizontalLine, this.simpleUnicodeCharSet.get(CluiCharMap.OUTER_HORIZONTAL));
		assertEquals(this.su_innerHorizontalLine, this.simpleUnicodeCharSet.get(CluiCharMap.INNER_HORIZONTAL));

		assertEquals(this.su_outerVerticalLine, this.simpleUnicodeCharSet.get(CluiCharMap.OUTER_VERTICAL));
		assertEquals(this.su_innerVerticalLine, this.simpleUnicodeCharSet.get(CluiCharMap.INNER_VERTICAL));

		assertEquals(this.space, this.simpleUnicodeCharSet.get(CluiCharMap.SPACE));
	}
	@Test
	public void validateDuplexUnicodeCharSet() {
		assertEquals(this.du_topLeftCorner, this.duplexUnicodeCharSet.get(CluiCharMap.TOP_LEFT_CORNER));
		assertEquals(this.du_topCenter, this.duplexUnicodeCharSet.get(CluiCharMap.TOP_CENTER));
		assertEquals(this.du_topRightCorner, this.duplexUnicodeCharSet.get(CluiCharMap.TOP_RIGHT_CORNER));
		assertEquals(this.du_centerLeft, this.duplexUnicodeCharSet.get(CluiCharMap.CENTER_LEFT));
		assertEquals(this.du_junction, this.duplexUnicodeCharSet.get(CluiCharMap.JUNCTION));
		assertEquals(this.du_centerRight, this.duplexUnicodeCharSet.get(CluiCharMap.CENTER_RIGHT));
		assertEquals(this.du_bottomLeftCorner, this.duplexUnicodeCharSet.get(CluiCharMap.BOTTOM_LEFT_CORNER));
		assertEquals(this.du_bottomCenter, this.duplexUnicodeCharSet.get(CluiCharMap.BOTTOM_CENTER));
		assertEquals(this.du_bottomRightCorner, this.duplexUnicodeCharSet.get(CluiCharMap.BOTTOM_RIGHT_CORNER));
		
		assertEquals(this.du_outerHorizontalLine, this.duplexUnicodeCharSet.get(CluiCharMap.OUTER_HORIZONTAL));
		assertEquals(this.du_innerHorizontalLine, this.duplexUnicodeCharSet.get(CluiCharMap.INNER_HORIZONTAL));

		assertEquals(this.du_outerVerticalLine, this.duplexUnicodeCharSet.get(CluiCharMap.OUTER_VERTICAL));
		assertEquals(this.du_innerVerticalLine, this.duplexUnicodeCharSet.get(CluiCharMap.INNER_VERTICAL));

		assertEquals(this.space, this.duplexUnicodeCharSet.get(CluiCharMap.SPACE));
	}
	@Test
	public void validateMixedUnicodeCharSet() {
		assertEquals(this.mu_topLeftCorner, this.mixedUnicodeCharSet.get(CluiCharMap.TOP_LEFT_CORNER));
		assertEquals(this.mu_topCenter, this.mixedUnicodeCharSet.get(CluiCharMap.TOP_CENTER));
		assertEquals(this.mu_topRightCorner, this.mixedUnicodeCharSet.get(CluiCharMap.TOP_RIGHT_CORNER));
		assertEquals(this.mu_centerLeft, this.mixedUnicodeCharSet.get(CluiCharMap.CENTER_LEFT));
		assertEquals(this.mu_junction, this.mixedUnicodeCharSet.get(CluiCharMap.JUNCTION));
		assertEquals(this.mu_centerRight, this.mixedUnicodeCharSet.get(CluiCharMap.CENTER_RIGHT));
		assertEquals(this.mu_bottomLeftCorner, this.mixedUnicodeCharSet.get(CluiCharMap.BOTTOM_LEFT_CORNER));
		assertEquals(this.mu_bottomCenter, this.mixedUnicodeCharSet.get(CluiCharMap.BOTTOM_CENTER));
		assertEquals(this.mu_bottomRightCorner, this.mixedUnicodeCharSet.get(CluiCharMap.BOTTOM_RIGHT_CORNER));
		
		assertEquals(this.mu_outerHorizontalLine, this.mixedUnicodeCharSet.get(CluiCharMap.OUTER_HORIZONTAL));
		assertEquals(this.mu_innerHorizontalLine, this.mixedUnicodeCharSet.get(CluiCharMap.INNER_HORIZONTAL));

		assertEquals(this.mu_outerVerticalLine, this.mixedUnicodeCharSet.get(CluiCharMap.OUTER_VERTICAL));
		assertEquals(this.mu_innerVerticalLine, this.mixedUnicodeCharSet.get(CluiCharMap.INNER_VERTICAL));

		assertEquals(this.space, this.mixedUnicodeCharSet.get(CluiCharMap.SPACE));
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
		
		CluiCharMap cluiCharMap = new CluiCharMap() {
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
		CluiCharMap ccm = new CluiCharMap();
		
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
		CluiCharMap ccm = new CluiCharMap() {
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
		CluiCharMap ccm = new CluiCharMap();
		assertEquals(new HashMap<Integer, Character>(), ccm.getCharMap());
		assertTrue(ccm.getCharMap().isEmpty());
	}
	
	@Test
	public void _2paramConsturctorTest() {
		CluiCharMap ccm1 = CluiCharMap.getAsciiCharSet();
		CluiCharMap ccm2 = new CluiCharMap();
		CluiCharMap ccm3 = new CluiCharMap(null);
		CluiCharMap ccm12 = new CluiCharMap(ccm1);
		CluiCharMap ccm22 = new CluiCharMap(ccm2);

		assertEquals(ccm1.charMap, ccm12.charMap);
		assertEquals(ccm2.charMap, ccm22.charMap);
		assertEquals(ccm2.charMap, ccm3.charMap);
	}
}
