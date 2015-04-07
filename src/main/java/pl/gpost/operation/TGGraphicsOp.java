package pl.gpost.operation;

import java.awt.Image;
import java.awt.Rectangle;

/**
 * pl.gpost.operation.TGGraphicsOp is an interface that a class implements when
 * it provides pl.gpost.TGCanvas with support for a graphics operation.
 * As examples, pl.gpost.operation.TGLineOp draws a line on the provided Image,
 * pl.gpost.operation.TGLabelOp draws a String on the provided Image.
 * <p/>
 *
 * @author Guy Haas
 */

public interface TGGraphicsOp {
    /**
     * Do something to or with the provided Image. The
     * Rectangle returned is a cliprect for the area of
     * the Image that was changed.
     *
     * @param image the object on which to draw
     * @return rectangular bounds of the pixels in the Image that were changed
     */
    public Rectangle doIt(Image image);

} // end interface pl.gpost.operation.TGGraphicsOp
