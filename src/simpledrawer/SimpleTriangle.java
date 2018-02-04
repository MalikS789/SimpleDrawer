/*
 * SimpleTriangle.java
 *
 * @author Gill Windall
 *
 * Represents a triangle that can be drawn on a drawing area
 *
 */
package simpledrawer;

import java.awt.Color;
import java.awt.Point;
import java.util.List;

public class SimpleTriangle {

    private List<Point> vertices; // points that define the triangle
    // Shape characteristics
    private Color colour;
    private int thickness;
    // Type of shape e.g. line or oval or triangle
    private ShapeType shapeType;

    public SimpleTriangle(List<Point> v, Color c, int t, ShapeType st) {
        vertices = v;
        colour = c;
        thickness = t;
        shapeType = st;
    }

    public List<Point> getVertices() {
        return vertices;
    }

    public void setVertices(List<Point> vertices) {
        this.vertices = vertices;
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
     * @return the area in pixels of the triangle. Does this work okay?
     */
    public double getArea() {
        int term1 = vertices.get(0).x * (vertices.get(1).y - vertices.get(2).y);
        int term2 = vertices.get(1).x * (vertices.get(2).y - vertices.get(0).y);
        int term3 = vertices.get(2).x * (vertices.get(0).y - vertices.get(1).y);

        return Math.abs((term1 + term2 + term3) / 2.0);
    }
}
