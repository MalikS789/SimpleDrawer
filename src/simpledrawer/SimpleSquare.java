/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledrawer;

import java.awt.Color;
import java.awt.Point;
import java.util.List;

/**
 *
 * @author Malik
 */
class SimpleSquare {

    private List<Point> vertices; // points that define the triangle
    // Shape characteristics
    private Color colour;
    private int thickness;
    // Type of shape e.g. line or oval or triangle
    private ShapeType shapeType;

    public SimpleSquare(List<Point> v, Color c, int t, ShapeType ss) {
        vertices = v;
        colour = c;
        thickness = t;
        shapeType = ss;
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
}
