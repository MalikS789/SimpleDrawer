/*
 * SimpleOval.java
 *
 * @author Gill Windall
 *
 * Represents an oval that can be drawn on a drawing area
 *
 */
package Model;

import Model.Interface.Oval;
import Controller.ShapeType;
import java.awt.Color;

public class SimpleOval implements Oval{

    //Shape start location
    private int xStart, yStart;
    // Location of the bottom right corner of the
    // rectangle that contains the oval
    private int xBottomRight, yBottomRight;
    private Color colour;
    private int thickness;
    // Type of shape e.g. line or oval
    private ShapeType shapeType;

    public SimpleOval(int xs, int ys, int xbr, int ybr, Color c, int t, ShapeType so) {
        colour = c;
        thickness = t;
        shapeType = so;
        xStart = xs;
        yStart = ys;
        xBottomRight = xbr;
        yBottomRight = ybr;
    }

    /**
     * @return the xBottomRight
     */
    public int getxBottomRight() {
        return xBottomRight;
    }

    /**
     * @param xBottomRight the xBottomRight to set
     */
    public void setxBottomRight(int xBottomRight) {
        this.xBottomRight = xBottomRight;
    }

    /**
     * @return the yBottomRight
     */
    public int getyBottomRight() {
        return yBottomRight;
    }

    /**
     * @param yBottomRight the yBottomRight to set
     */
    public void setyBottomRight(int yBottomRight) {
        this.yBottomRight = yBottomRight;
    }

    public int getXStart() {
        return xStart;
    }

    public void setXStart(int xStart) {
        this.xStart = xStart;
    }

    public int getYStart() {
        return yStart;
    }

    public void setYStart(int yStart) {
        this.yStart = yStart;
    }

    public Color getColour() {
        return colour;
    }

    public void setColour(Color colour) {
        this.colour = colour;
    }

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    public ShapeType getShapeType() {
        return shapeType;
    }

    public void setShapeType(ShapeType shapeType) {
        this.shapeType = shapeType;
    }

    /**
     *
     * @return the area in pixels of the ellipse. Does this always work?
     */
    public double getArea() {
        int line1 = xBottomRight - xStart;
        int line2 = yBottomRight - yStart;
        System.out.println(line1 + ", " + line2 + " " + Math.PI * line1 / 2 * line2 / 2);
        return Math.PI * line1 / 2 * line2 / 2;
    }

}
