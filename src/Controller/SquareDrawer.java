/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.SimpleSquare;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author Malik
 */
public class SquareDrawer extends Drawer{

    private SimpleSquare square; // the square to be drawn

    public SquareDrawer(SimpleSquare square) {
        this.square = square;
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
        Color c = scaleColour(square.getColour(), currentBrightness);
        g2d.setColor(c);
        // set the thickness of the line
        g2d.setStroke(new BasicStroke(square.getThickness()));

        // draw the triangle
        g2d.drawLine(square.getVertices().get(0).x, square.getVertices().get(0).y, square.getVertices().get(1).x, square.getVertices().get(1).y);
        g2d.drawLine(square.getVertices().get(2).x, square.getVertices().get(2).y, square.getVertices().get(1).x, square.getVertices().get(1).y);
        g2d.drawLine(square.getVertices().get(2).x, square.getVertices().get(2).y, square.getVertices().get(3).x, square.getVertices().get(3).y);
        g2d.drawLine(square.getVertices().get(0).x, square.getVertices().get(0).y, square.getVertices().get(3).x, square.getVertices().get(3).y);
    }

}
