/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Event.ShapeType;
import java.awt.Color;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Malik
 */
public class DrawingPanelTest {

    public DrawingPanelTest() {
    }

    /**
     * Test of getCurrentShapeType method, of class DrawingPanel.
     */
    @Test
    public void testGetCurrentShapeType() {
        System.out.println("getCurrentShapeType");
        DrawingPanel instance = new DrawingPanel();
        ShapeType expResult = ShapeType.LINE;
        ShapeType result = instance.getCurrentShapeType();
        assertEquals(expResult, result);
        if (expResult != result) {
            fail("Unexpected result returned, FAIL");
        }
    }

    /**
     * Test of setCurrentShapeType method, of class DrawingPanel.
     */
    @Test
    public void testSetCurrentShapeType() {
        try {
            System.out.println("setCurrentShapeType");
            ShapeType currentShapeType = null;
            DrawingPanel instance = new DrawingPanel();
            instance.setCurrentShapeType(currentShapeType);
        } catch (Exception ex) {
            fail("Unable to call default constructor, FAIL");
        }
    }

    /**
     * Test of getCurrentBrightness method, of class DrawingPanel.
     */
    @Test
    public void testGetCurrentBrightness() {
        System.out.println("getCurrentBrightness");
        DrawingPanel instance = new DrawingPanel();
        float expResult = 1.0F;
        float result = instance.getCurrentBrightness();
        if (expResult != result) {
            fail("Unexpected Brightness value, FAIL");
        }
    }

    /**
     * Test of setCurrentBrightness method, of class DrawingPanel.
     */
    @Test
    public void testSetCurrentBrightness() {
        try {
            System.out.println("setCurrentBrightness");
            float currentBrightness = 0.0F;
            DrawingPanel instance = new DrawingPanel();
            instance.setCurrentBrightness(currentBrightness);
        } catch (Exception ex) {
            fail("Unable to set brightness value, FAIL");
        }
    }

    /**
     * Test of setCurrentThickness method, of class DrawingPanel.
     */
    @Test
    public void testSetCurrentThickness() {
        try {
        System.out.println("setCurrentThickness");
        int currentThickness = 45;
        DrawingPanel instance = new DrawingPanel();
        instance.setCurrentThickness(currentThickness);
        } catch (Exception ex) {
            fail("Unable to error handle a thickness value that is too high, FAIL");
        }
    }

    /**
     * Test of setCurrentColor method, of class DrawingPanel.
     */
    @Test
    public void testSetCurrentColor() {
        try {
            System.out.println("setCurrentColor");
            Color currentColor = Color.BLACK;
            DrawingPanel instance = new DrawingPanel();
            instance.setCurrentColor(currentColor);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception ex) {
            fail("Unable set colour of panel, FAIL");
        }
    }

    /**
     * Test of clearDisplay method, of class DrawingPanel.
     */
    @Test
    public void testClearDisplay() {
        try {
            System.out.println("clearDisplay");
            DrawingPanel instance = new DrawingPanel();
            instance.clearDisplay();
        } catch (Exception ex) {
            // TODO review the generated test code and remove the default call to fail.
            fail("Couldn't clear display, FAIL");
        }
    }

    /**
     * Test of rotate method, of class DrawingPanel.
     */
    @Test
    public void testRotate() {
        try {
            System.out.println("rotate");
            int amount = 90;
            DrawingPanel instance = new DrawingPanel();
            instance.rotate(amount);
        } catch (Exception ex) {
            fail("Unable to rotate shapes, FAIL");
        }
    }

    /**
     * Test of setShapes method, of class DrawingPanel.
     */
    @Test
    public void testSetShapes() {
        try {
            System.out.println("setShapes");
            List shapes = null;
            DrawingPanel instance = new DrawingPanel();
            instance.setShapes(shapes);
        } catch (Exception ex) {
            fail("Unable to set shapes, FAIL");
        }
    }

}
