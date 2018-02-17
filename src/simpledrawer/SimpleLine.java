/*
 * SimpleLine.java
 *
 * @author Gill Windall
 *
 * Represents a line that can be drawn on a drawing area
 *
 */
package simpledrawer;

import java.awt.Color;

 interface Line
    {
     
       int getXEnd(); 
       void setXEnd(int xEnd);
       int getYEnd();
       void setYEnd(int yEnd);
    }

public class SimpleLine extends SimpleLineOval implements Line{
    
    // Location of the end of the line
    private int xEnd, yEnd;

    public SimpleLine(int xs, int ys, int xe, int ye, Color c, int t, ShapeType so) {
        super(c,t,so,xs,ys);
        xEnd = xe;
        yEnd = ye;
    }

     public int getXEnd() {
        return xEnd;
    }

    public void setXEnd(int xEnd) {
        this.xEnd = xEnd;
    }

    public int getYEnd() {
        return yEnd;
    }

    public void setYEnd(int yEnd) {
        this.yEnd = yEnd;
    }
}
