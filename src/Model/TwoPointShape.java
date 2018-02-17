/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ac8441o
 */
interface LineOval {

    int getXStart();

    void setXStart(int xStart);

    int getYStart();

    void setYStart(int yStart);

    Color getColour();

    void setColour(Color colour);

    int getThickness();

    void setThickness(int thickness);

    ShapeType getShapeType();

    void setShapeType(ShapeType shapeType);
}

public class TwoPointShape extends SimpleShape implements LineOval {
    
    List<Point> v = new ArrayList();

    public TwoPointShape(Color c, int t, ShapeType so, int xs, int ys, int xbr, int ybr) {
        colour = c;
        thickness = t;
        shapeType = so;
        v.add(new Point(xs, ys));
        v.add(new Point(xbr, ybr));
    }

    @Override
    public int getXStart() {
        return v.get(0).x;
    }

    @Override
    public void setXStart(int xs) {
        v.set(0, new Point(xs, getYStart()));
    }

    @Override
    public int getYStart() {
        return v.get(0).y;
    }

    @Override
    public void setYStart(int ys) {
        v.set(0, new Point(getXStart(), ys));
    }

    public int getXEnd() {
        return v.get(1).x;
    }

    public void setXEnd(int xs) {
        v.set(0, new Point(xs, getYStart()));
    }

    public int getYEnd() {
        return v.get(1).y;
    }

    public void setYEnd(int ys) {
        v.set(0, new Point(getXStart(), ys));
    }

    @Override
    public Color getColour() {
        return colour;
    }

    @Override
    public void setColour(Color colour) {
        this.colour = colour;
    }

    @Override
    public int getThickness() {
        return thickness;
    }

    @Override
    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    @Override
    public ShapeType getShapeType() {
        return shapeType;
    }

    @Override
    public void setShapeType(ShapeType shapeType) {
        this.shapeType = shapeType;
    }
}
