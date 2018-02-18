/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Color;
import java.awt.Point;
import java.util.List;

/**
 *
 * @author ac8441o
 */

interface TriSquare
{
List<Point> getVertices();  
void setVertices(List<Point> vertices);
Color getColour();
void setColour(Color colour);
int getThickness();
void setThickness(int thickness);
ShapeType getShapeType();
void setShapeType(ShapeType shapeType);

}
public class MultiPointShape extends SimpleShape{
    
    public MultiPointShape(List<Point> v, Color c, int t, ShapeType ss) {
        vertices = v;
        colour = c;
        thickness = t;
        shapeType = ss;
    }
    
}
