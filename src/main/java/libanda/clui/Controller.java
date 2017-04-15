package libanda.clui;

public class Controller {

	/**
	 * Intended behavior:<br />
	 * Create new instance of Controller with default values for width,
	 * padding-left, padding-right and the default CharMap specified in private
	 * constants
	 */
	public Controller() {

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

	}

	/**
	 * Intended behavior:<br />
	 * Returns the width which will be used to draw all components
	 * 
	 * @return The width which will be used to draw all components
	 */
	public int getWidth() {
		return 0;
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

	}

	/**
	 * Intended behavior:<br />
	 * Returns the CharMap which will be used to draw all components.
	 * 
	 * @return The CharMap which will be used to draw all components.
	 */
	public CharMap getCharMap() {
		return new CharMap();
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

	}

	/**
	 * Intended behavior:<br />
	 * Returns the padding on the right which is used to draw all components.
	 * 
	 * @return The padding on the right which is used to draw all components.
	 */
	public int getPaddingRight() {
		return -1;
	}

	/**
	 * Intended behavior:<br />
	 * Returns the padding on the left which is used to draw all components.
	 * 
	 * @return The padding on the left which is used to draw all components.
	 */
	public int getPaddingLeft() {
		return -1;
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

	}

}
