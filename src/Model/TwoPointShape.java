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

public class TwoPointShape extends SimpleShape implements TwoPoints{
    // Shape start location
    protected int xStart, yStart;
   
    public TwoPointShape(Color c,int t,ShapeType so,int xs, int ys) {
        super(c,t,so);
        xStart = xs;
        yStart = ys;
        
    } 
    
    @Override
    public int getXStart() {
        return xStart;
    }

    @Override
    public void setXStart(int xStart) {
        this.xStart = xStart;
    }

    @Override
    public int getYStart() {
        return yStart;
    }

    @Override
    public void setYStart(int yStart) {
        this.yStart = yStart;
    }
}

