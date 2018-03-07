/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.ShapeType;
import java.awt.Color;

/**
 *
 * @author ac8441o
 */
public class SinglePointShape {
    
    public int xStart, yStart;
    public  Color colour;
    public  int thickness;
    public  ShapeType shapeType;
    
    
    public SinglePointShape(Color c,int t,ShapeType so,int xs, int ys) {
        colour = c;
        thickness = t;
        shapeType = so;
        xStart = xs;
        yStart = ys;

        
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
