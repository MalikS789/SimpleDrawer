/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Thread;

import CreatingRGBscrollbar.RGBscrollbar;
import View.DrawerMain;

/**
 *
 * @author Malik
 */
public class RGBscrollbarPreviewThread extends Thread {
    
    @Override
    public void run() {
        while (DrawerMain.running) {
            int[] RGB = RGBscrollbar.getRGB();
            DrawerMain.UpdateColour(RGB);
        }
    }
}
