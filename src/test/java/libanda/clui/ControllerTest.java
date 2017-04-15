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
		CharMap[] charMaps = { CharMap.getAsciiCharSet(), CharMap.getSimpleUnicodeCharSet(),
				CharMap.getDuplexUnicodeCharSet(), CharMap.getMixedUnicodeCharSet(), null };
		for (CharMap charMap : charMaps) {
			// if charMap is null: test if NullPointerException is thrown on
			// instantiation of Controller
			if (charMap == null) {
				boolean npeCatched = false;
				try {
					ctrl = new Controller(charMap);
				} catch (NullPointerException e) {
					npeCatched = true;
				}
				assertTrue(npeCatched);
			} else {
				// If charMap is not null: test if values are set correctly
				ctrl = new Controller(charMap);
				assertEquals(charMap, ctrl.getCharMap());
				assertEquals(DEFAULT_PADDING_LEFT, ctrl.getPaddingLeft());
				assertEquals(DEFAULT_PADDING_RIGHT, ctrl.getPaddingRight());
				assertEquals(DEFAULT_WIDTH, ctrl.getWidth());
			}
		}
	}

	@Test
	public void ConstructorWidthTest() {
		int[] testWidths = { Integer.MIN_VALUE, -10, 1, 0, 1, 10, 50, 55, Integer.MAX_VALUE };
		for (int testWidth : testWidths) {
			ctrl = new Controller(testWidth);
			assertEquals(DEFAULT_CHAR_MAP, ctrl.getCharMap());
			assertEquals(DEFAULT_PADDING_LEFT, ctrl.getPaddingLeft());
			assertEquals(DEFAULT_PADDING_RIGHT, ctrl.getPaddingRight());
			if (testWidth <= Controller.MIN_WIDTH) {
				assertEquals(Controller.MIN_WIDTH, ctrl.getWidth());
			} else {
				assertEquals(testWidth, ctrl.getWidth());
			}
		}
	}

	@Test
	public void ConstructorCharMapWidthTest() {
		CharMap[] charMaps = { CharMap.getAsciiCharSet(), CharMap.getSimpleUnicodeCharSet(),
				CharMap.getDuplexUnicodeCharSet(), CharMap.getMixedUnicodeCharSet(), null };
		int[] testValues = { Integer.MIN_VALUE, -10, -1, 0, 1, 9, 10, 30, Integer.MAX_VALUE };
		boolean npeCatched;

		for (CharMap charMap : charMaps) {
			for (int testWidth : testValues) {
				// if charMap is null: test if NullPointerException is thrown on
				// instantiation of Controller
				if (charMap == null) {
					npeCatched = false;
					try {
						ctrl = new Controller(charMap, testWidth);
					} catch (NullPointerException e) {
						npeCatched = true;
					}
					assertTrue(npeCatched);
				} else { // If charMap is not null: test if values are set
							// correctly
					ctrl = new Controller(charMap, testWidth);
					assertEquals(DEFAULT_PADDING_LEFT, ctrl.getPaddingLeft());
					assertEquals(DEFAULT_PADDING_RIGHT, ctrl.getPaddingRight());
					if (testWidth < Controller.MIN_WIDTH) {
						assertEquals(Controller.MIN_WIDTH, ctrl.getWidth());
						assertEquals(charMap, ctrl.getCharMap());
					} else {
						assertEquals(testWidth, ctrl.getWidth());
						assertEquals(charMap, ctrl.getCharMap());
					}
				}

			}
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
