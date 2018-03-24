/*
 * LineDrawer.java
 *
 * @author Gill Windall
 *
 * This class can be given a SimpleLine object and draw it using a 
 * Graphics2D object.
 * 
 */
package Controller;

import Model.SimpleLine;
import Model.SimpleLine;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import javax.ejb.Stateless;
import javax.inject.Inject;
import Controller.Interface.SimpleDrawer;

@Stateless
public class LineDrawer implements SimpleDrawer{
    
    @Inject
    private SimpleLine line; // the line to be drawn

    public LineDrawer(SimpleLine line) {
        this.line = line;
    }

    /**
     * Draw the shape using a Graphics2D object
     *
     * @param g2d Graphics2D object used for drawing
     * @param currentBrightness the current brightness being used to draw
     */
    
    public void drawShape(Graphics2D g2d, float currentBrightness) {
        // scale the brightness of the colour
        Color c = scaleColour(line.getColour(), currentBrightness);
        g2d.setColor(c);
        // set the thickness of the line
        g2d.setStroke(new BasicStroke(line.getThickness()));
        // get start point
        int xs = line.getVertices().get(0).x;
        int ys = line.getVertices().get(0).y;
        int xe = line.getVertices().get(1).x;
        int ye = line.getVertices().get(1).y;

        // draw the line
        g2d.drawLine(xs, ys, xe, ye);
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
