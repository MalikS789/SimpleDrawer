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

import Controller.Interface.SimpleDrawer;
import Model.SimpleOval;
import Model.SimpleOval;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class OvalDrawer implements SimpleDrawer {

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
    public Color scaleColour(Color c, float currentBrightness) {
        
        if (currentBrightness > 1.0) {
            currentBrightness = (float) 1.0;
        } else if (currentBrightness < 0.0) {
            currentBrightness = (float) 0.0;
        }
        
        // get the red amount and scale by currentBrightness
        int red = (int) (c.getRed() * currentBrightness);
        // check we've not gone over 255
        red = red > 255 ? 255 : red;
        // do the same for green and blue
        int green = (int) (c.getGreen() * currentBrightness);
        green = green > 255 ? 255 : green;
        int blue = (int) (c.getBlue() * currentBrightness);
        blue = blue > 255 ? 255 : blue;
        Color scaledColour = new Color(red, green, blue);

        return scaledColour;
    }
}
