/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Interface;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author Ankur Chaudhary
 */
public interface SimpleDrawer {
    
    public void drawShape(Graphics2D g2d, float currentBrightness);
    public Color scaleColour(Color c, float currentBrightness);
}
