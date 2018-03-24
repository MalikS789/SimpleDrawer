/*
 * TriangleDrawer.java
 *
 * @author Gill Windall
 *
 * This class can be given a SimpleTriangle object and draw it using a 
 * Graphics2D object.
 * 
 */
package Controller;

import Controller.Interface.SimpleDrawer;
import Model.SimpleTriangle;
import Model.SimpleTriangle;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class TriangleDrawer implements SimpleDrawer{

    @Inject
    private SimpleTriangle triangle; // the triangle to be drawn

    public TriangleDrawer(SimpleTriangle triangle) {
        this.triangle = triangle;
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
        Color c = scaleColour(triangle.getColour(), currentBrightness);
        g2d.setColor(c);
        // set the thickness of the line
        g2d.setStroke(new BasicStroke(triangle.getThickness()));

        // draw the triangle
        g2d.drawLine(triangle.getVertices().get(0).x, triangle.getVertices().get(0).y, triangle.getVertices().get(1).x, triangle.getVertices().get(1).y);
        g2d.drawLine(triangle.getVertices().get(2).x, triangle.getVertices().get(2).y, triangle.getVertices().get(1).x, triangle.getVertices().get(1).y);
        g2d.drawLine(triangle.getVertices().get(2).x, triangle.getVertices().get(2).y, triangle.getVertices().get(0).x, triangle.getVertices().get(0).y);
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
