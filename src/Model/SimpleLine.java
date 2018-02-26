/*
 * SimpleLine.java
 *
 * @author Gill Windall
 *
 * Represents a line that can be drawn on a drawing area
 *
 */
package Model;

import Model.Interface.Line;
import Controller.ShapeType;
import java.awt.Color;

public class SimpleLine extends TwoPointShape implements Line{
    
    // Location of the end of the line
    private int xEnd, yEnd;

    public SimpleLine(int xs, int ys, int xe, int ye, Color c, int t, ShapeType so) {
        super(c,t,so,xs,ys);
        xEnd = xe;
        yEnd = ye;
    }

    @Override
     public int getXEnd() {
        return xEnd;
    }

    @Override
    public void setXEnd(int xEnd) {
        this.xEnd = xEnd;
    }

    @Override
    public int getYEnd() {
        return yEnd;
    }

    @Override
    public void setYEnd(int yEnd) {
        this.yEnd = yEnd;
    }
}
