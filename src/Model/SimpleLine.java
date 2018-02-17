/*
 * SimpleLine.java
 *
 * @author Gill Windall
 *
 * Represents a line that can be drawn on a drawing area
 *
 */
package Model;

import java.awt.Color;

interface Line {

    int getXEnd();

    void setXEnd(int xEnd);

    int getYEnd();

    void setYEnd(int yEnd);
}

public class SimpleLine extends TwoPointShape implements Line {

    public SimpleLine(int xs, int ys, int xe, int ye, Color c, int t, ShapeType so) {
        super(c, t, so, xs, ys, xe, ye);
    }
}
