import java.awt.Image;
import java.awt.Rectangle;

/**
 * TGGraphicsOp is an interface that a class implements when
 * it provides TGCanvas with support for a graphics operation.
 * As examples, TGLineOp draws a line on the provided Image,
 * TGLabelOp draws a String on the provided Image.
 * <P>
 * @author Guy Haas
 */

public interface TGGraphicsOp
{
   /**
    * Do something to or with the provided Image. The
    * Rectangle returned is a cliprect for the area of
    * the Image that was changed.
    *
    * @param image the object on which to draw
    * @return rectangular bounds of the pixels in the Image that were changed
    */
   public Rectangle doIt( Image image );

} // end interface TGGraphicsOp
