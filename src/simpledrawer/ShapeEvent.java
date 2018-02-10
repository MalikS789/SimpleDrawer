/*
 * ShapeEvent.java
 *
 * @author Gill Windall
 *
 * Represents a shape event holding data for a shape read from file
 *
 */
package simpledrawer;

import java.awt.*;
import java.lang.reflect.Field;

public class ShapeEvent {

    // Shape start location
    private int xStart, yStart;
    // Shape end location
    private int xEnd, yEnd;
    // triangle third location
    private int xextra, yextra;
    // Square fourth location
    private int xxextra, yyextra;
    // Shape characteristics
    private Color colour;
    private int thickness;
    // Type of shape e.g. line or oval
    private ShapeType shapeType;

    private String eventType; // currently always SHAPE

    public ShapeEvent(int xs, int ys, int xe, int ye, Color c, int t, ShapeType st, String eType) {
        xStart = xs;
        yStart = ys;
        xEnd = xe;
        yEnd = ye;
        colour = c;
        thickness = t;
        shapeType = st;
        eventType = eType;
    }

    public ShapeEvent(int xs, int ys, int xe, int ye, int xx, int yy, Color c, int t, ShapeType st, String eType) { //specific constructor for triangles
        xStart = xs;
        yStart = ys;
        xEnd = xe;
        yEnd = ye;
        xextra = xx;
        yextra = yy;
        colour = c;
        thickness = t;
        shapeType = st;
        eventType = eType;
    }

    public ShapeEvent(int xs, int ys, int xe, int ye, int xx, int yy, int xxx, int yyy, Color c, int t, ShapeType st, String eType) { //specific constructor for squares
        xStart = xs;
        yStart = ys;
        xEnd = xe;
        yEnd = ye;
        xextra = xx;
        yextra = yy;
        xxextra = xxx;
        yyextra = yyy;
        colour = c;
        thickness = t;
        shapeType = st;
        eventType = eType;
    }

    /**
     * Default constructor will create a default shape
     */
    public ShapeEvent() {
        this(0, 0, 0, 0, Color.BLACK, 0, ShapeType.LINE, "SHAPE");
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

    public int getXextra() {
        return xextra;
    }

    public void setXextra(int xextra) {
        this.xextra = xextra;
    }

    public int getYextra() {
        return yextra;
    }

    public void setYextra(int yextra) {
        this.yextra = yextra;
    }

    public int getXXextra() {
        return xxextra;
    }

    public void setXXextra(int xxextra) {
        this.xxextra = xextra;
    }

    public int getYYextra() {
        return yyextra;
    }

    public void setYYextra(int yyextra) {
        this.yyextra = yextra;
    }

    public Color getColour() {
        return colour;
    }

    public void setColour(Color colour) {
        this.colour = colour;
    }

    public void setColourByString(String colour) {
        try {
            Color c;
            Field f = Color.class.getField(colour.toUpperCase());
            this.colour = (Color) f.get(null);
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException ex) {
            this.colour = Color.BLACK;
        }
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

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    @Override
    public String toString() {
        return "ShapeEvent{" + "xStart=" + xStart + ", yStart=" + yStart + ", xEnd=" + xEnd + ", yEnd=" + yEnd + ", colour=" + colour + ", thickness=" + thickness + ", shapeType=" + shapeType + ", eventType=" + eventType + '}';
    }
}
