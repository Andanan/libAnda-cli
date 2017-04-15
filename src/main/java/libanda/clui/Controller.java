package libanda.clui;

public class Controller {

	public static final int MIN_WIDTH = 10;
	public static final int MIN_PADDING = 0;

	private static final CharMap DEFAULT_CHAR_MAP = CharMap.getAsciiCharSet();
	private static final int DEFAULT_PADDING = 1;
	private static final int DEFAULT_WIDTH = 80;

	private CharMap charMap;
	private int paddingLeft;
	private int paddingRight;
	private int width;

	/**
	 * Intended behavior:<br />
	 * Create new instance of Controller with default values for width,
	 * padding-left, padding-right and the default CharMap specified in private
	 * constants
	 */
	public Controller() {
		setCharMap(DEFAULT_CHAR_MAP);
		setPadding(PaddingPosition.BOTH, DEFAULT_PADDING);
		setWidth(DEFAULT_WIDTH);
	}

	/**
	 * Intended behavior:<br />
	 * Create new instance of Controller with default values for width,
	 * padding-left and padding-right specified in private constants. Use the
	 * specified CharMap.
	 * 
	 * @param charMap
	 *            - The CharMap which will be used
	 * @throws NullPointerException
	 *             If the passed CharMap is null
	 */
	public Controller(CharMap charMap) throws NullPointerException {
		setCharMap(charMap);
		setPadding(PaddingPosition.BOTH, DEFAULT_PADDING);
		setWidth(DEFAULT_WIDTH);
	}

	/**
	 * Intended behavior:<br />
	 * Create new instance of Controller with default values for padding-left,
	 * padding-right and the default CharMap specified in private constants. Use
	 * the specified width.<br />
	 * Clamps the passed width to range [10 .. INT_MAX]
	 * 
	 * @param width
	 *            - The width which will be used to draw all components.
	 */
	public Controller(int width) {
		setCharMap(DEFAULT_CHAR_MAP);
		setPadding(PaddingPosition.BOTH, DEFAULT_PADDING);
		setWidth(width);
	}

	/**
	 * Intended behavior:<br />
	 * Create new instance of Controller with default values for padding-left
	 * and padding-right specified in private constants. Use the specified width
	 * and CharMap.<br />
	 * Clamps the passed width to range [10 .. INT_MAX]
	 * 
	 * @param charMap
	 *            - The CharMap which will be used
	 * @param width
	 *            - The width which will be used to draw all components.
	 * @throws NullPointerException
	 *             If the passed CharMap is null
	 */
	public Controller(CharMap charMap, int width) throws NullPointerException {
		setCharMap(charMap);
		setPadding(PaddingPosition.BOTH, DEFAULT_PADDING);
		setWidth(width);
	}

	/**
	 * Intended behavior:<br />
	 * Set the width which will be used to draw all components.<br />
	 * Clamps the passed width to range [10 .. INT_MAX]
	 * 
	 * @param width
	 *            - The width which will be used to draw all components.
	 */
	public void setWidth(int width) {
		if (width < MIN_WIDTH)
			width = MIN_WIDTH;
		this.width = width;
	}

	/**
	 * Intended behavior:<br />
	 * Returns the width which will be used to draw all components
	 * 
	 * @return The width which will be used to draw all components
	 */
	public int getWidth() {
		return this.width;
	}

	/**
	 * Intended behavior:<br />
	 * Set the CharMap which will be used to draw all components.
	 * 
	 * @param charMap
	 *            - The CharMap which will be used to draw all components
	 * @throws NullPointerException
	 *             If the passed CharMap is null
	 */
	public void setCharMap(CharMap charMap) throws NullPointerException {
		if (charMap == null)
			throw new NullPointerException("CharMap is null");
		this.charMap = charMap;
	}

	/**
	 * Intended behavior:<br />
	 * Returns the CharMap which will be used to draw all components.
	 * 
	 * @return The CharMap which will be used to draw all components.
	 */
	public CharMap getCharMap() {
		return this.charMap;
	}

	/**
	 * Intended behavior:<br />
	 * Set the padding width for the specified PaddingPosition(s).<br />
	 * Clamps the passed padding width to range [0 .. INT_MAX]
	 * 
	 * @param position
	 *            - The specified PaddingPosition(s)
	 * @param width
	 *            - The width of the padding to be set
	 * @throws NullPointerException
	 *             If the passed PaddingPosition is null
	 */
	public void setPadding(PaddingPosition position, int width) throws NullPointerException {
		if (width < MIN_PADDING)
			width = MIN_PADDING;
		if (position == PaddingPosition.LEFT || position == PaddingPosition.BOTH) {
			this.paddingLeft = width;
		}
		if (position == PaddingPosition.RIGHT || position == PaddingPosition.BOTH) {
			this.paddingRight = width;
		}
	}

	/**
	 * Intended behavior:<br />
	 * Returns the padding on the right which is used to draw all components.
	 * 
	 * @return The padding on the right which is used to draw all components.
	 */
	public int getPaddingRight() {
		return this.paddingRight;
	}

	/**
	 * Intended behavior:<br />
	 * Returns the padding on the left which is used to draw all components.
	 * 
	 * @return The padding on the left which is used to draw all components.
	 */
	public int getPaddingLeft() {
		return this.paddingLeft;
	}

	/**
	 * Intended behavior:<br />
	 * Clears all paddings specified by the passed PaddingPosition (sets them to
	 * 0)
	 * 
	 * @param position
	 *            - The PaddingPosition specifying which paddings should be
	 *            cleared.
	 * @throws NullPointerException
	 *             If the passed PaddingPosition is null
	 */
	public void clearPadding(PaddingPosition position) throws NullPointerException {
		setPadding(PaddingPosition.BOTH, 0);
	}

}
