/*
 * ShapeEvent.java
 *
 * @author Gill Windall
 *
 * Represents a shape event holding data for a shape read from file
 *
 */
package Controller.Event;

import Controller.ShapeType;
import java.awt.Color;
import java.awt.Point;
import java.lang.reflect.Field;
import java.util.List;

public class ShapeEvent {

    private int xStart, yStart;// Shape start location
    private int xEnd, yEnd; // Shape end location
    private int xBottomRight, yBottomRight;
    private int xextra, yextra;// triangle third location
    private int xxextra, yyextra;// quadrilateral fourth location
    private Color colour;// Shape characteristics
    private int thickness;
    private ShapeType shapeType;// Type of shape e.g. line or oval
    private String eventType; // currently always SHAPE

    public ShapeEvent(int xs, int ys, int xe, int ye, Color c, int t, ShapeType st, String eType) { //Legacy constructor
        xStart = xs;
        yStart = ys;
        xEnd = xe;
        yEnd = ye;
        colour = c;
        thickness = t;
        shapeType = st;
        eventType = eType;
    }

    public ShapeEvent(List<Point> v, Color c, int t, ShapeType st, String eType) { //specific constructor
        xStart = v.get(0).x;
        yStart = v.get(0).y;
        xEnd = v.get(1).x;
        yEnd = v.get(1).y;
        xextra = v.get(2).x;
        yextra = v.get(2).y;
        xxextra = v.get(3).x;
        yyextra = v.get(3).y;
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

    public int getXBottomRight() {
        return xBottomRight;
    }

    public void setXBottomRight(int xbottomright) {
        this.xBottomRight = xbottomright;
    }

    public int getYBottomRight() {
        return yBottomRight;
    }

    public void setYBottomRight(int ybottomright) {
        this.yBottomRight = ybottomright;
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
        this.xxextra = xxextra;
    }

    public int getYYextra() {
        return yyextra;
    }

    public void setYYextra(int yyextra) {
        this.yyextra = yyextra;
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
