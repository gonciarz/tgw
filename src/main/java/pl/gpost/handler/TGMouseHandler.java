package pl.gpost.handler;

/**
 * pl.gpost.handler.TGMouseHandler is an interface that a class implements when
 * it would like to receive Java AWT mouse events from pl.gpost.TGCanvas.
 * The provided methods are an attempt to reduce the complexity
 * of the, more general, MouseListener and MouseMotionListener
 * interfaces.
 * <p/>
 * In the case of TG, TGDriver registers with pl.gpost.TGCanvas, passing
 * the events on to the current jLogo program, invoking specific
 * user-defined procedures if they exist.
 * <p/>
 * In the case of pl.gpost.TurtleGraphicsWindow, the methods in this
 * interface are stubs that should be overridden by child classes
 * if they want to handle mouse input events.
 * <p/>
 *
 * @author Guy Haas
 */

public interface TGMouseHandler {

    /**
     * tgMouseClicked() is invoked by pl.gpost.TGCanvas for all objects implementing
     * TGMouseHander which have registered to receive the mouse click event
     * when the left mouse button is clicked in the graphics canvas when
     * it is active.
     *
     * @param x X coordinate of mouse's location on the graphics canvas
     * @param y Y coordinate of mouse's location on the graphics canvas
     */
    public void tgMouseClicked(int x, int y);


    /**
     * tgMouseMoved() is invoked by pl.gpost.TGCanvas, for all objects implementing
     * TGMouseHander that have registered to receive mouse moved events
     * when the mouse is moved within the graphics canvas when it's active.
     *
     * @param x X coordinate of mouse's location on the graphics canvas
     * @param y Y coordinate of mouse's location on the graphics canvas
     */
    public void tgMouseMoved(int x, int y);

}
