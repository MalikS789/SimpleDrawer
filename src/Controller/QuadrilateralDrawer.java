/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

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
public class QuadrilateralDrawer extends Drawer{

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

}
