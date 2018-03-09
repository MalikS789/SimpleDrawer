/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.SimpleShape;
import java.awt.Color;
import java.awt.Point;
import java.util.List;
import Model.SimpleLine;
import Model.SimpleOval;
import Model.SimpleTriangle;
import Model.SimpleQuadrilateral;


/**
 *
 * @author ac8441o
 */
public class ShapeFactory {
    
    public static SimpleShape createShape(List<Point> v, Color c, int t, ShapeType ss) {
                if(ss.equals("LINE"))
                  return new SimpleLine(v,c, t,ss);
                else if(ss.equals("OVAL"))
                    return new SimpleOval(v,c, t,ss);
                else if(ss.equals("TRIANGLE"))
                    return new SimpleTriangle(v,c, t,ss);
                else if(ss.equals("QUADRILATERAL"))
                    return new SimpleQuadrilateral(v,c, t,ss);
                else
                    return null;
    }           
}
