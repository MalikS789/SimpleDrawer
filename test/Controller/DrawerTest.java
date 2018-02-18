/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.Color;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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
        Color c = null;
        float currentBrightness = 0.0F;
        Drawer instance = new Drawer();
        Color expResult = null;
        Color result = instance.scaleColour(c, currentBrightness);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
