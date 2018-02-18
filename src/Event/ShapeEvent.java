/*
 * ShapeEvent.java
 *
 * @author Gill Windall
 *
 * Represents a shape event holding data for a shape read from file
 *
 */
package Event;

import java.awt.*;
import java.lang.reflect.Field;
import Model.ShapeType;
import java.util.ArrayList;

public class ShapeEvent {

    // Shape characteristics
    static java.util.List<Point> vertices = new ArrayList();// points that define the shape
    private Color colour;
    private int thickness;
    private ShapeType shapeType;
    private String eventType; // currently always SHAPE

    public ShapeEvent(int xs, int ys, int xe, int ye, Color c, int t, ShapeType st, String eType) { //legacy contructor
        vertices.add(new Point(xs,ys));
        vertices.add(new Point(xe,ye));
        colour = c;
        thickness = t;
        shapeType = st;
        eventType = eType;
    }

    public ShapeEvent(java.util.List<Point> v, Color c, int t, ShapeType st, String eType) { //specific constructor
        vertices = v; // points that define the shape
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

    public static int getVerticeX(int index) {
        try {
            return vertices.get(index).x;
        } catch (Exception ex) {
            return 0;
        }
    }

    public static int getVerticeY(int index) {
        try {
            return vertices.get(index).y;
        } catch (Exception ex) {
            return 0;
        }
    }

    public static void setVerticeX(int index, int value) {
        //System.out.println("previous Value of X = (" + getVerticeX(index) + ")");
        try {
            vertices.set(index, new Point(value, getVerticeY(index)));
            //System.out.println("Current Value of verticies = (" + getVerticeX(index) + ")");
        } catch (Exception ex) {
            vertices.add(index, new Point(value, getVerticeY(index)));
            //System.out.println("Current Value of verticies = (" + getVerticeX(index) + ")");
        }
    }

    public static void setVerticeY(int index, int value) {
       // System.out.println("previous Value of Y = (" + getVerticeY(index) + ")");
        try {
            vertices.set(index, new Point(getVerticeX(index), value));
            //System.out.println("Current Value of Y = (" + getVerticeY(index) + ")");
        } catch (Exception ex) {
            vertices.add(index, new Point(getVerticeX(index), value));
           // System.out.println("Current Value of verticies = (" + getVerticeY(index) + ")");
        }
    }

    public static int getNumberOfVerticies() {
        return vertices.size();
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
}
