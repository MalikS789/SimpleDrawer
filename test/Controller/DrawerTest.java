/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.Color;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Malik
 */
public class DrawerTest {

    /**
     * Test of scaleColour method, of class Drawer.
     */
    @Test
    public void testScaleColour() {
        System.out.println("scaleColour");
        Color c = Color.RED;
        float currentBrightness = 0.5F;
        Drawer instance = new Drawer();
        Color expResult = new Color(127, 0, 0);
        Color result = instance.scaleColour(c, currentBrightness);
        if (!(expResult.equals(result)))  {
            fail("Color wasn't scaled successfully (wrong value returned) FAIL");
        }
    }

}
