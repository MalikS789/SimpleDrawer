/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Event.ShapeType;
import java.awt.Color;
import java.awt.Point;
import java.util.List;

/**
 *
 * @author ac8441o
 */
public class MultiPointShape extends SimpleShape implements MultiPoints {

    protected List<Point> vertices; // points that define the triangle

    public MultiPointShape(List<Point> v, Color c, int t, ShapeType ss) {
        super(c, t, ss);
        vertices = v;
    }

    @Override
    public List<Point> getVertices() {
        return vertices;
    }

    @Override
    public void setVertices(List<Point> vertices) {
        this.vertices = vertices;
    }
}
