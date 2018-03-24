/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.ShapeType;
import java.awt.Color;
import java.awt.Point;
import java.util.List;

/**
 *
 * @author Malik
 */
public class SimpleShape {

    // Shape characteristics
    protected Color colour;
    protected int thickness;
    // Type of shape e.g. line or oval or triangle
    protected ShapeType shapeType;
    protected List<Point> vertices; // points that define the triangle

    public SimpleShape(List<Point> v, Color c, int t, ShapeType ss) {
        colour = c;
        thickness = t;
        shapeType = ss;
        vertices = v;
    }

    
    public List<Point> getVertices() {
        return vertices;
    }

    public void setVertices(List<Point> vertices) {
        this.vertices = vertices;
    }

    public void setVertice(Point vertice, int index) {
        vertices.set(index, vertice);
    }

    public int getXStart() {
        return this.vertices.get(0).x;
    }

    public int getYStart() {
        return this.vertices.get(0).y;
    }

    public void setXStart(int xs) {
        this.vertices.get(0).x = xs;
    }

    public void setYStart(int ys) {
        this.vertices.get(0).y = ys;
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
