/*
 * OvalDrawer.java
 *
 * @author Gill Windall
 *
 * This class can be given a SimpleOval object and draw it using a 
 * Graphics2D object.
 * 
 */
package Controller;

import Model.SimpleOval;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

public class OvalDrawer extends Drawer {

    private SimpleOval oval; // the oval to be drawn

    public OvalDrawer(SimpleOval oval) {
        this.oval = oval;
    }

    /**
     * Draw the shape using a Graphics2D object
     *
     * @param g2d Graphics2D object used for drawing
     * @param currentBrightness the current brightness being used to draw
     */
    @Override
    public void drawShape(Graphics2D g2d, float currentBrightness) {
        // scale the brightness of the colour
        Color c = scaleColour(oval.getColour(), currentBrightness);
        g2d.setColor(c);
        // set the thickness of the line
        g2d.setStroke(new BasicStroke(oval.getThickness()));

        int xs = oval.getVertices().get(0).x;
        int ys = oval.getVertices().get(0).y;
        int xe = oval.getVertices().get(1).x;
        int ye = oval.getVertices().get(1).y;

        if (xe - xs < 0) {
            //Flip the x values
            int xsoriginal = xs;
            oval.setVertice(new Point(xe, ys), 0);
            oval.setVertice(new Point(xsoriginal, ye), 1);
        }

        if (ye - ys < 0) {
            //Flip the y values
            int ysoriginal = ys;
            oval.setVertice(new Point(xs, ye), 0);
            oval.setVertice(new Point(xe, ysoriginal), 1);
        }

        // draw the oval       
        g2d.drawOval(xs, ys, xe - xs, ye - ys);
    }
}
