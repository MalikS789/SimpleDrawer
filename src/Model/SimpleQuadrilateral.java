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
import javax.ejb.Stateless;

@Stateless
public class SimpleQuadrilateral extends SimpleShape{

    public SimpleQuadrilateral(List<Point> v, Color c, int t, ShapeType ss) {
        super(v,c,t,ss);
    }
}
