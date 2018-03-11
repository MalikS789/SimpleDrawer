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
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class OvalDrawer extends Drawer {

    @Inject
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

        int xs = oval.getXStart();
        int ys = oval.getYStart();

        if (oval.getxBottomRight() - xs < 0) {
            //Flip the x values
            int temp = xs;
            xs = oval.getxBottomRight();
            oval.setxBottomRight(temp);
            oval.setXStart(xs);
        }

        if (oval.getyBottomRight() - ys < 0) {
            //Flip the y values
            int temp = ys;
            ys = oval.getyBottomRight();
            oval.setyBottomRight(temp);
            oval.setYStart(ys);
        }

        // draw the oval       
        //System.out.println("Shape being drawn = OVAL (" + xs + " , " + ys + " with a height of " + (oval.getxBottomRight()-xs) + "and a width of " + oval.getyBottomRight() + ")");
        g2d.drawOval(xs, ys, oval.getxBottomRight() - xs, oval.getyBottomRight() - ys);

    }
}
