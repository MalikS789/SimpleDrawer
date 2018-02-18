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


public class OvalDrawer extends Drawer{

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
    public void drawShape(Graphics2D g2d, float currentBrightness) {
        // scale the brightness of the colour
        Color c = scaleColour(oval.getColour(), currentBrightness);
        g2d.setColor(c);
        // set the thickness of the line
        g2d.setStroke(new BasicStroke(oval.getThickness()));

        int xs = oval.getXStart();
        int ys = oval.getYStart();
        
        // draw the oval        
        g2d.drawOval(xs, ys,oval.getxBottomRight() - xs, oval.getyBottomRight() - ys);

    }
    }
