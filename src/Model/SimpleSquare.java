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
 * @author Malik
 */
public class SimpleSquare extends SimpleTriSquare{

    public SimpleSquare(List<Point> v, Color c, int t, ShapeType ss) {
        super(v,c,t,ss);
    }
}
