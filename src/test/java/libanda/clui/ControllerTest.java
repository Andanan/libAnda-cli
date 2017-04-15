package libanda.clui;

import static junit.framework.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ControllerTest {

	private static final CharMap DEFAULT_CHAR_MAP = CharMap.getAsciiCharSet();
	private static final int DEFAULT_WIDTH = 80;
	private static final int DEFAULT_PADDING_LEFT = 1;
	private static final int DEFAULT_PADDING_RIGHT = 1;

	private Controller ctrl;
	private CharMap charMap;

	@Before
	public void init() {
		ctrl = null;
		charMap = null;
	}

	@Test
	public void ConstructorTest() {
		Controller controller = new Controller();
		assertEquals(DEFAULT_CHAR_MAP, controller.getCharMap());
		assertEquals(DEFAULT_WIDTH, controller.getWidth());
		assertEquals(DEFAULT_PADDING_LEFT, controller.getPaddingLeft());
		assertEquals(DEFAULT_PADDING_RIGHT, controller.getPaddingRight());
	}

	@Test
	public void ConstructorCharMapTest() {
		// CharMap 1 -> Default CharMap
		charMap = DEFAULT_CHAR_MAP;
		ctrl = new Controller(charMap);
		assertEquals(charMap, ctrl.getCharMap());
		assertEquals(DEFAULT_WIDTH, ctrl.getWidth());
		assertEquals(DEFAULT_PADDING_LEFT, ctrl.getPaddingLeft());
		assertEquals(DEFAULT_PADDING_RIGHT, ctrl.getPaddingRight());

		// CharMap 2
		charMap = CharMap.getSimpleUnicodeCharSet();
		ctrl = new Controller(charMap);
		assertEquals(charMap, ctrl.getCharMap());
		assertEquals(DEFAULT_WIDTH, ctrl.getWidth());
		assertEquals(DEFAULT_PADDING_LEFT, ctrl.getPaddingLeft());
		assertEquals(DEFAULT_PADDING_RIGHT, ctrl.getPaddingRight());

		// null
		charMap = null;
		boolean npeCatched = false;
		try {
			ctrl = new Controller(charMap);
		} catch (NullPointerException e) {
			npeCatched = true;
		}
		assertTrue(npeCatched);
	}

	@Test
	public void ConstructorWidthTest() {
		int width;
		// width: default, expect: default
		width = DEFAULT_WIDTH;
		ctrl = new Controller(width);
		assertEquals(DEFAULT_CHAR_MAP, ctrl.getCharMap());
		assertEquals(width, ctrl.getWidth());
		assertEquals(DEFAULT_PADDING_LEFT, ctrl.getPaddingLeft());
		assertEquals(DEFAULT_PADDING_RIGHT, ctrl.getPaddingRight());

		// width: 55, expect: 55
		width = 55;
		ctrl = new Controller(width);
		assertEquals(DEFAULT_CHAR_MAP, ctrl.getCharMap());
		assertEquals(width, ctrl.getWidth());
		assertEquals(DEFAULT_PADDING_LEFT, ctrl.getPaddingLeft());
		assertEquals(DEFAULT_PADDING_RIGHT, ctrl.getPaddingRight());

		// width: 10, expect: 10
		width = 10;
		int expected = 10;
		ctrl = new Controller(width);
		assertEquals(DEFAULT_CHAR_MAP, ctrl.getCharMap());
		assertEquals(expected, ctrl.getWidth());
		assertEquals(DEFAULT_PADDING_LEFT, ctrl.getPaddingLeft());
		assertEquals(DEFAULT_PADDING_RIGHT, ctrl.getPaddingRight());

		// width: -1, expect: 10
		width = -1;
		expected = 10;
		ctrl = new Controller(width);
		assertEquals(DEFAULT_CHAR_MAP, ctrl.getCharMap());
		assertEquals(expected, ctrl.getWidth());
		assertEquals(DEFAULT_PADDING_LEFT, ctrl.getPaddingLeft());
		assertEquals(DEFAULT_PADDING_RIGHT, ctrl.getPaddingRight());

		// width: 9, expect: 10
		width = 9;
		expected = 10;
		ctrl = new Controller(width);
		assertEquals(DEFAULT_CHAR_MAP, ctrl.getCharMap());
		assertEquals(expected, ctrl.getWidth());
		assertEquals(DEFAULT_PADDING_LEFT, ctrl.getPaddingLeft());
		assertEquals(DEFAULT_PADDING_RIGHT, ctrl.getPaddingRight());
	}

	@Test
	public void ConstructorCharMapWidthTest() {
		// Map1, >10_1; expected: Map1, >10_1
		// Map1, >10_2; expected: Map1, >10_2
		// Map1, =10; expected: Map1, 10
		// Map1, <10_1; expected: Map1, 10
		// Map1, <10_2; expected: Map1, 10
		charMap = CharMap.getAsciiCharSet();
		for (int i = Integer.MIN_VALUE; i <= Integer.MAX_VALUE; i++) {
			ctrl = new Controller(charMap, i);
			if (i < 10) {
				assertEquals(i, ctrl.getWidth());
				assertEquals(charMap, ctrl.getCharMap());
			}
		}

		// Map2, >10_1; expected: Map2, >10_1
		// Map2, >10_2; expected: Map2, >10_2
		// Map2, =10; expected: Map2, 10
		// Map2, <10_1; expected: Map2, 10
		// Map2, <10_2; expected: Map2, 10
		charMap = CharMap.getSimpleUnicodeCharSet();
		for (int i = Integer.MIN_VALUE; i <= Integer.MAX_VALUE; i++) {
			ctrl = new Controller(charMap, i);
			if (i < 10) {
				assertEquals(i, ctrl.getWidth());
				assertEquals(charMap, ctrl.getCharMap());
			}
		}

		// MapNull, >10_1; expected: NullPointerException
		// MapNull, >10_2; expected: NullPointerException
		// MapNull, =10; expected: NullPointerException
		// MapNull, <10_1; expected: NullPointerException
		// MapNull, <10_2; expected: NullPointerException
		charMap = null;
		for (int i = Integer.MIN_VALUE; i <= Integer.MAX_VALUE; i++) {
			ctrl = new Controller(charMap, i);
			boolean npeCatched = false;
			try {
				ctrl = new Controller(charMap);
			} catch (NullPointerException e) {
				npeCatched = true;
			}
			assertTrue(npeCatched);
		}
	}

	@Test
	public void SetWidthTest() {
		ctrl = new Controller();

		int width = 55;
		ctrl.setWidth(width);
		assertEquals(width, ctrl.getWidth());

		width = 10;
		ctrl.setWidth(width);
		assertEquals(width, ctrl.getWidth());

		width = -13;
		ctrl.setWidth(width);
		assertEquals(10, ctrl.getWidth());
	}

	@Test
	public void SetCharMapTest() {
		ctrl = new Controller();

		charMap = CharMap.getAsciiCharSet();
		ctrl.setCharMap(charMap);
		assertEquals(charMap, ctrl.getCharMap());

		charMap = CharMap.getDuplexUnicodeCharSet();
		ctrl.setCharMap(charMap);
		assertEquals(charMap, ctrl.getCharMap());

		charMap = null;
		boolean npeCatched = false;
		try {
			ctrl.setCharMap(charMap);
		} catch (NullPointerException e) {
			npeCatched = true;
		}
		assertTrue(npeCatched);
	}

	@Test
	public void SetPaddingLeftTest() {
		PaddingPosition LEFT = PaddingPosition.LEFT;
		int[] testInts = { Integer.MIN_VALUE, -3, 0, 5, 10, Integer.MAX_VALUE };
		for (int width : testInts) {
			ctrl = new Controller();
			ctrl.setPadding(LEFT, width);
			if (width < 0)
				assertEquals(0, ctrl.getPaddingLeft());
			else
				assertEquals(width, ctrl.getPaddingLeft());
		}
	}

	@Test
	public void SetPaddingRightTest() {
		PaddingPosition RIGHT = PaddingPosition.RIGHT;
		int[] testInts = { Integer.MIN_VALUE, -3, 0, 5, 10, Integer.MAX_VALUE };
		for (int width : testInts) {
			ctrl = new Controller();
			ctrl.setPadding(RIGHT, width);
			if (width < 0)
				assertEquals(0, ctrl.getPaddingRight());
			else
				assertEquals(width, ctrl.getPaddingRight());
		}
	}

	@Test
	public void SetPaddingBothTest() {
		PaddingPosition BOTH = PaddingPosition.BOTH;
		int[] testInts = { Integer.MIN_VALUE, -3, 0, 5, 10, Integer.MAX_VALUE };
		for (int width : testInts) {
			ctrl = new Controller();
			ctrl.setPadding(BOTH, width);
			if (width < 0) {
				assertEquals(0, ctrl.getPaddingLeft());
				assertEquals(0, ctrl.getPaddingRight());
			} else {
				assertEquals(width, ctrl.getPaddingLeft());
				assertEquals(width, ctrl.getPaddingRight());
			}
		}
	}

	@Test
	public void ClearPaddingLeftTest() {
		ctrl = new Controller();
		ctrl.clearPadding(PaddingPosition.LEFT);
		assertEquals(0, ctrl.getPaddingLeft());
	}

	@Test
	public void ClearPaddingRightTest() {
		ctrl = new Controller();
		ctrl.clearPadding(PaddingPosition.RIGHT);
		assertEquals(0, ctrl.getPaddingRight());
	}

	@Test
	public void ClearPaddingBothTest() {
		ctrl = new Controller();
		ctrl.clearPadding(PaddingPosition.RIGHT);
		assertEquals(0, ctrl.getPaddingLeft());
		assertEquals(0, ctrl.getPaddingRight());
	}

}
