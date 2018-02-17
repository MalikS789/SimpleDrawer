/*
 * SimpleOval.java
 *
 * @author Gill Windall
 *
 * Represents an oval that can be drawn on a drawing area
 *
 */
package simpledrawer;

import java.awt.Color;

interface Oval{
   int getxBottomRight();
   void setxBottomRight(int xBottomRight);
   int getyBottomRight();
   void setyBottomRight(int yBottomRight);        
}

public class SimpleOval extends SimpleLineOval implements Oval{

    private int xBottomRight, yBottomRight;

    public SimpleOval(int xs, int ys, int xbr, int ybr, Color c, int t, ShapeType so) {
        super(c,t,so,xs,ys);
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
    /**
     *
     * @return the area in pixels of the ellipse. Does this always work?
     
    public double getArea() {
        int line1 = xBottomRight - xStart;
        int line2 = yBottomRight - yStart;
        System.out.println(line1 + ", " + line2 + " " + Math.PI * line1 / 2 * line2 / 2);
        return Math.PI * line1 / 2 * line2 / 2;
    }
    * */
}
