/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Interface.Shape;
import Controller.ShapeType;
import java.awt.Color;

/**
 *
 * @author Malik
 */
public class SimpleShape implements Shape {

    // Shape characteristics
    protected Color colour;
    protected int thickness;
    // Type of shape e.g. line or oval or triangle
    protected ShapeType shapeType;

    public SimpleShape(Color c, int t, ShapeType ss) {
        colour = c;
        thickness = t;
        shapeType = ss;
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
