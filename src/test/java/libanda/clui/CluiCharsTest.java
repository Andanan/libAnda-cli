package libanda.clui;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CluiCharsTest {
	
	/* Predefined charsets */
	private CluiChars asciiCharSet;
	private CluiChars simpleUnicodeCharSet;
	private CluiChars duplexUnicodeCharSet;
	private CluiChars mixedUnicodeCharSet;

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
		this.asciiCharSet = CluiChars.getAsciiCharSet();
		this.simpleUnicodeCharSet = CluiChars.getSimpleUnicodeCharSet();
		this.duplexUnicodeCharSet = CluiChars.getDuplexUnicodeCharSet();
		this.mixedUnicodeCharSet = CluiChars.getMixedUnicodeCharSet();
	}
	
	@Test
	public void validateAsciiCharSet() {
		assertEquals(plus, this.asciiCharSet.get(CluiChars.TOP_LEFT_CORNER));
		assertEquals(plus, this.asciiCharSet.get(CluiChars.TOP_CENTER));
		assertEquals(plus, this.asciiCharSet.get(CluiChars.TOP_RIGHT_CORNER));
		assertEquals(plus, this.asciiCharSet.get(CluiChars.CENTER_LEFT));
		assertEquals(plus, this.asciiCharSet.get(CluiChars.JUNCTION));
		assertEquals(plus, this.asciiCharSet.get(CluiChars.CENTER_RIGHT));
		assertEquals(plus, this.asciiCharSet.get(CluiChars.BOTTOM_LEFT_CORNER));
		assertEquals(plus, this.asciiCharSet.get(CluiChars.BOTTOM_CENTER));
		assertEquals(plus, this.asciiCharSet.get(CluiChars.BOTTOM_RIGHT_CORNER));
		
		assertEquals(minus, this.asciiCharSet.get(CluiChars.OUTER_HORIZONTAL));
		assertEquals(minus, this.asciiCharSet.get(CluiChars.INNER_HORIZONTAL));

		assertEquals(pipe, this.asciiCharSet.get(CluiChars.OUTER_VERTICAL));
		assertEquals(pipe, this.asciiCharSet.get(CluiChars.INNER_VERTICAL));

		assertEquals(space, this.asciiCharSet.get(CluiChars.SPACE));
	}
	@Test
	public void validateSimpleUnicodeCharSet() {
		assertEquals(this.su_topLeftCorner, this.simpleUnicodeCharSet.get(CluiChars.TOP_LEFT_CORNER));
		assertEquals(this.su_topCenter, this.simpleUnicodeCharSet.get(CluiChars.TOP_CENTER));
		assertEquals(this.su_topRightCorner, this.simpleUnicodeCharSet.get(CluiChars.TOP_RIGHT_CORNER));
		assertEquals(this.su_centerLeft, this.simpleUnicodeCharSet.get(CluiChars.CENTER_LEFT));
		assertEquals(this.su_junction, this.simpleUnicodeCharSet.get(CluiChars.JUNCTION));
		assertEquals(this.su_centerRight, this.simpleUnicodeCharSet.get(CluiChars.CENTER_RIGHT));
		assertEquals(this.su_bottomLeftCorner, this.simpleUnicodeCharSet.get(CluiChars.BOTTOM_LEFT_CORNER));
		assertEquals(this.su_bottomCenter, this.simpleUnicodeCharSet.get(CluiChars.BOTTOM_CENTER));
		assertEquals(this.su_bottomRightCorner, this.simpleUnicodeCharSet.get(CluiChars.BOTTOM_RIGHT_CORNER));
		
		assertEquals(this.su_outerHorizontalLine, this.simpleUnicodeCharSet.get(CluiChars.OUTER_HORIZONTAL));
		assertEquals(this.su_innerHorizontalLine, this.simpleUnicodeCharSet.get(CluiChars.INNER_HORIZONTAL));

		assertEquals(this.su_outerVerticalLine, this.simpleUnicodeCharSet.get(CluiChars.OUTER_VERTICAL));
		assertEquals(this.su_innerVerticalLine, this.simpleUnicodeCharSet.get(CluiChars.INNER_VERTICAL));

		assertEquals(this.space, this.simpleUnicodeCharSet.get(CluiChars.SPACE));
	}
	@Test
	public void validateDuplexUnicodeCharSet() {
		assertEquals(this.du_topLeftCorner, this.duplexUnicodeCharSet.get(CluiChars.TOP_LEFT_CORNER));
		assertEquals(this.du_topCenter, this.duplexUnicodeCharSet.get(CluiChars.TOP_CENTER));
		assertEquals(this.du_topRightCorner, this.duplexUnicodeCharSet.get(CluiChars.TOP_RIGHT_CORNER));
		assertEquals(this.du_centerLeft, this.duplexUnicodeCharSet.get(CluiChars.CENTER_LEFT));
		assertEquals(this.du_junction, this.duplexUnicodeCharSet.get(CluiChars.JUNCTION));
		assertEquals(this.du_centerRight, this.duplexUnicodeCharSet.get(CluiChars.CENTER_RIGHT));
		assertEquals(this.du_bottomLeftCorner, this.duplexUnicodeCharSet.get(CluiChars.BOTTOM_LEFT_CORNER));
		assertEquals(this.du_bottomCenter, this.duplexUnicodeCharSet.get(CluiChars.BOTTOM_CENTER));
		assertEquals(this.du_bottomRightCorner, this.duplexUnicodeCharSet.get(CluiChars.BOTTOM_RIGHT_CORNER));
		
		assertEquals(this.du_outerHorizontalLine, this.duplexUnicodeCharSet.get(CluiChars.OUTER_HORIZONTAL));
		assertEquals(this.du_innerHorizontalLine, this.duplexUnicodeCharSet.get(CluiChars.INNER_HORIZONTAL));

		assertEquals(this.du_outerVerticalLine, this.duplexUnicodeCharSet.get(CluiChars.OUTER_VERTICAL));
		assertEquals(this.du_innerVerticalLine, this.duplexUnicodeCharSet.get(CluiChars.INNER_VERTICAL));

		assertEquals(this.space, this.duplexUnicodeCharSet.get(CluiChars.SPACE));
	}
	@Test
	public void validateMixedUnicodeCharSet() {
		assertEquals(this.mu_topLeftCorner, this.mixedUnicodeCharSet.get(CluiChars.TOP_LEFT_CORNER));
		assertEquals(this.mu_topCenter, this.mixedUnicodeCharSet.get(CluiChars.TOP_CENTER));
		assertEquals(this.mu_topRightCorner, this.mixedUnicodeCharSet.get(CluiChars.TOP_RIGHT_CORNER));
		assertEquals(this.mu_centerLeft, this.mixedUnicodeCharSet.get(CluiChars.CENTER_LEFT));
		assertEquals(this.mu_junction, this.mixedUnicodeCharSet.get(CluiChars.JUNCTION));
		assertEquals(this.mu_centerRight, this.mixedUnicodeCharSet.get(CluiChars.CENTER_RIGHT));
		assertEquals(this.mu_bottomLeftCorner, this.mixedUnicodeCharSet.get(CluiChars.BOTTOM_LEFT_CORNER));
		assertEquals(this.mu_bottomCenter, this.mixedUnicodeCharSet.get(CluiChars.BOTTOM_CENTER));
		assertEquals(this.mu_bottomRightCorner, this.mixedUnicodeCharSet.get(CluiChars.BOTTOM_RIGHT_CORNER));
		
		assertEquals(this.mu_outerHorizontalLine, this.mixedUnicodeCharSet.get(CluiChars.OUTER_HORIZONTAL));
		assertEquals(this.mu_innerHorizontalLine, this.mixedUnicodeCharSet.get(CluiChars.INNER_HORIZONTAL));

		assertEquals(this.mu_outerVerticalLine, this.mixedUnicodeCharSet.get(CluiChars.OUTER_VERTICAL));
		assertEquals(this.mu_innerVerticalLine, this.mixedUnicodeCharSet.get(CluiChars.INNER_VERTICAL));

		assertEquals(this.space, this.mixedUnicodeCharSet.get(CluiChars.SPACE));
	}
}
