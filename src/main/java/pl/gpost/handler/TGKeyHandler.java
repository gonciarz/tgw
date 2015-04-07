package pl.gpost.handler;

/**
 * pl.gpost.handler.TGKeyHandler is an interface that a class implements when it
 * would like to receive Java AWT key events from pl.gpost.TGCanvas. The
 * provided methods are an attempt to reduce the complexity of
 * the, more general, KeyListener interface methods.
 * <p/>
 * In the case of TG, TGDriver registers with pl.gpost.TGCanvas, passing
 * the events on to the current jLogo program, invoking specific
 * user-defined procedures if they exist.
 * <p/>
 * In the case of pl.gpost.TurtleGraphicsWindow, the methods in this
 * interface are stubs that should be overridden by child classes
 * if they want to handle keyboard key events.
 * <p/>
 *
 * @author Guy Haas
 */

public interface TGKeyHandler {

    /**
     * Key number for down arrow in early versions of TG.
     *
     * @deprecated
     */
    public final int DOWN = 128;

    /**
     * Key number for left arrow in early versions of TG.
     *
     * @deprecated
     */
    public final int LEFT = 129;

    /**
     * Key number for right arrow in early versions of TG.
     *
     * @deprecated
     */
    public final int RIGHT = 130;

    /**
     * Key number for up arrow in early versions of TG.
     *
     * @deprecated
     */
    public final int UP = 131;


    /**
     * [Alt] action key's numeric value for jLogo program.
     */
    public final int ALT = 65536;

    /**
     * [Ctrl] action key's numeric value for jLogo program.
     */
    public final int CONTROL = 65537;

    /**
     * [ v ] down-arrow action key's numeric value for jLogo program.
     */
    public final int DOWN_ARROW = 65538;

    /**
     * [ <- ] left-arrow action key's numeric value for jLogo program.
     */
    public final int LEFT_ARROW = 65539;

    /**
     * [ -> ] right-arrow action key's numeric value for jLogo program.
     */
    public final int RIGHT_ARROW = 65540;

    /**
     * [Shift] action key's numeric value for jLogo program.
     */
    public final int SHIFT = 65541;

    /**
     * [ ^ ] up-arrow action key's numeric value for jLogo program.
     */
    public final int UP_ARROW = 65542;


    /**
     * pl.gpost.TGCanvas (a Component) passes on KeyListener.keyPressed()
     * KeyEvents (simplified a bit) to classes that register with
     * it and implement pl.gpost.handler.TGKeyHandler.
     * <p/>
     *
     * @param keyNum a character or action key identifier
     * @see #ALT
     * @see #CONTROL
     * @see #DOWN_ARROW
     * @see #LEFT_ARROW
     * @see #RIGHT_ARROW
     * @see #SHIFT
     * @see #UP_ARROW
     */
    public void tgKeyPressed(int keyNum);


    /**
     * pl.gpost.TGCanvas (a Component) passes on KeyListener.keyReleased()
     * KeyEvents (simplified a bit) to classes that register with
     * it and implement pl.gpost.handler.TGKeyHandler.
     * <p/>
     *
     * @param keyNum a character or action key identifier
     * @see #ALT
     * @see #CONTROL
     * @see #DOWN_ARROW
     * @see #LEFT_ARROW
     * @see #RIGHT_ARROW
     * @see #SHIFT
     * @see #UP_ARROW
     */
    public void tgKeyReleased(int keyNum);


    /**
     * pl.gpost.TGCanvas (a Component) passes on KeyListener.keyTyped()
     * KeyEvents (simplified a bit) to classes that register with
     * it and implement pl.gpost.handler.TGKeyHandler.
     * <p/>
     *
     * @param keyChar a Unicode character
     */
    public void tgKeyTyped(char keyChar);


} // end interface pl.gpost.handler.TGKeyHandler
