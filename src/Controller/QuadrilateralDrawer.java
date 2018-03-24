/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Interface.SimpleDrawer;
import Model.SimpleQuadrilateral;
import Model.SimpleQuadrilateral;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Malik
 */
@Stateless
public class QuadrilateralDrawer implements SimpleDrawer{

    @Inject
    private SimpleQuadrilateral quadrilateral; // the quadrilateral to be drawn

    public QuadrilateralDrawer(Model.SimpleQuadrilateral quadrilateral) {
        this.quadrilateral = quadrilateral;
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
        Color c = scaleColour(quadrilateral.getColour(), currentBrightness);
        g2d.setColor(c);
        // set the thickness of the line
        g2d.setStroke(new BasicStroke(quadrilateral.getThickness()));

        // draw the triangle
        g2d.drawLine(quadrilateral.getVertices().get(0).x, quadrilateral.getVertices().get(0).y, quadrilateral.getVertices().get(1).x, quadrilateral.getVertices().get(1).y);
        g2d.drawLine(quadrilateral.getVertices().get(1).x, quadrilateral.getVertices().get(1).y, quadrilateral.getVertices().get(2).x, quadrilateral.getVertices().get(2).y);
        g2d.drawLine(quadrilateral.getVertices().get(2).x, quadrilateral.getVertices().get(2).y, quadrilateral.getVertices().get(3).x, quadrilateral.getVertices().get(3).y);
        g2d.drawLine(quadrilateral.getVertices().get(3).x, quadrilateral.getVertices().get(3).y, quadrilateral.getVertices().get(0).x, quadrilateral.getVertices().get(0).y);
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
