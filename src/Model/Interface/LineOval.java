/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Interface;

import Controller.ShapeType;
import java.awt.Color;

import java.util.List;
/**
 *
 * @author ac8441o
 */
public interface LineOval {
    
       
    public int getXStart();

    public void setXStart(int xStart);

    public int getYStart();

    public void setYStart(int yStart);

    public Color getColour();

    public void setColour(Color colour);

    public int getThickness();

    public void setThickness(int thickness);

    public ShapeType getShapeType() ;

    public void setShapeType(ShapeType shapeType) ;

}
