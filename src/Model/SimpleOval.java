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

public class SimpleOval extends TwoPointShape implements Oval{

    private int xBottomRight, yBottomRight;

    public SimpleOval(int xs, int ys, int xbr, int ybr, Color c, int t, ShapeType so) {
        super(c,t,so,xs,ys);
        xBottomRight = xbr;
        yBottomRight = ybr;
    }

    /**
     * @return the xBottomRight
     */
    @Override
    public int getxBottomRight() {
        return xBottomRight;
    }

    /**
     * @param xBottomRight the xBottomRight to set
     */
    @Override
    public void setxBottomRight(int xBottomRight) {
        this.xBottomRight = xBottomRight;
    }

    /**
     * @return the yBottomRight
     */
    @Override
    public int getyBottomRight() {
        return yBottomRight;
    }

    /**
     * @param yBottomRight the yBottomRight to set
     */
    @Override
    public void setyBottomRight(int yBottomRight) {
        this.yBottomRight = yBottomRight;
    }
    
     // @return the area in pixels of the ellipse. Does this always work?
     
    public double getArea() {
        int line1 = xBottomRight - xStart;
        int line2 = yBottomRight - yStart;
        System.out.println(line1 + ", " + line2 + " " + Math.PI * line1 / 2 * line2 / 2);
        return Math.PI * line1 / 2 * line2 / 2;
    }
}
