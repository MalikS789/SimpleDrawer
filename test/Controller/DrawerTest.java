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
    public void testScaleColourRed() {
        System.out.println("scaleColourRed");
        Color c = Color.RED;
        float currentBrightness = 0.5F;
        Drawer instance = new Drawer();
        Color expResult = new Color(127, 0, 0);
        Color result = instance.scaleColour(c, currentBrightness);
        if (!(expResult.equals(result))) {
            fail("Color wasn't scaled successfully (wrong value returned) FAIL");
        }
    }

    @Test
    public void testScaleColourRedInvalidBrightness() {
        System.out.println("testScaleColourRedInvalidBrightness");
        Color c = Color.RED;
        float currentBrightness = -1.0F;
        Drawer instance = new Drawer();
        Color expResult = new Color(0, 0, 0);
        Color result = instance.scaleColour(c, currentBrightness);
        if (!(expResult.equals(result))) {
            fail("Color wasn't scaled successfully (wrong value returned) FAIL");
        }
    }

    @Test
    public void testScaleColourGreen() {
        System.out.println("scaleColourGreen");
        Color c = Color.GREEN;
        float currentBrightness = 0.5F;
        Drawer instance = new Drawer();
        Color expResult = new Color(0, 127, 0);
        Color result = instance.scaleColour(c, currentBrightness);
        if (!(expResult.equals(result))) {
            fail("Color wasn't scaled successfully (wrong value returned) FAIL");
        }
    }

    @Test
    public void testScaleColourGreenInvalidBrightness() {
        System.out.println("testScaleColourGreenInvalidBrightness");
        Color c = Color.GREEN;
        float currentBrightness = -1.0F;
        Drawer instance = new Drawer();
        Color expResult = new Color(0, 0, 0);
        Color result = instance.scaleColour(c, currentBrightness);
        if (!(expResult.equals(result))) {
            fail("Color wasn't scaled successfully (wrong value returned) FAIL");
        }
    }

    @Test
    public void testScaleColourBlue() {
        System.out.println("scaleColourBlue");
        Color c = Color.BLUE;
        float currentBrightness = 0.5F;
        Drawer instance = new Drawer();
        Color expResult = new Color(0, 0, 127);
        Color result = instance.scaleColour(c, currentBrightness);
        if (!(expResult.equals(result))) {
            fail("Color wasn't scaled successfully (wrong value returned) FAIL");
        }
    }

    @Test
    public void testScaleColourBlueInvalidBrightness() {
        System.out.println("testScaleColourBlueInvalidBrightness");
        Color c = Color.BLUE;
        float currentBrightness = -1.0F;
        Drawer instance = new Drawer();
        Color expResult = new Color(0, 0, 0);
        Color result = instance.scaleColour(c, currentBrightness);
        if (!(expResult.equals(result))) {
            fail("Color wasn't scaled successfully (wrong value returned) FAIL");
        }
    }

    }
