/*
 * SimpleOval.java
 *
 * @author Gill Windall
 *
 * Represents an oval that can be drawn on a drawing area
 *
 */
package Model;

import java.awt.Color;

interface Oval {

    int getxBottomRight();

    void setxBottomRight(int xBottomRight);

    int getyBottomRight();

    void setyBottomRight(int yBottomRight);
}

public class SimpleOval extends TwoPointShape implements Oval {

    public SimpleOval(int xs, int ys, int xbr, int ybr, Color c, int t, ShapeType so) {
        super(c, t, so, xs, ys, xbr, ybr);
    }

    // @return the area in pixels of the ellipse. Does this always work?
    public double getArea() {
        int line1 = getXEnd() - getXStart();
        int line2 = getYEnd() - getYStart();
        System.out.println(line1 + ", " + line2 + " " + Math.PI * line1 / 2 * line2 / 2);
        return Math.PI * line1 / 2 * line2 / 2;
    }

    @Override
    public int getxBottomRight() {
        return getXEnd();
    }

    @Override
    public void setxBottomRight(int xBottomRight) {
        setXEnd(xBottomRight);
    }

    @Override
    public int getyBottomRight() {
        return getYEnd();
    }

    @Override
    public void setyBottomRight(int yBottomRight) {
        setYEnd(yBottomRight);
    }
}
