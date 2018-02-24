/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.ShapeType;
import Controller.ShapeEvent;
import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Malik
 */
public class ShapeEventTest {

    ShapeEvent ss;

    public ShapeEventTest() {
        List<Point> QuadrilateralPoints = new ArrayList<>();
        QuadrilateralPoints.add(new Point(0, 0));
        QuadrilateralPoints.add(new Point(1, 0));
        QuadrilateralPoints.add(new Point(1, 1));
        QuadrilateralPoints.add(new Point(0, 1));
        ss = new ShapeEvent(QuadrilateralPoints, Color.BLACK, 5, ShapeType.QUADRILATERAL, "SHAPE");
    }

    /**
     * Test of getXStart method, of class ShapeEvent.
     */
    @Test
    public void testGetXStart() {
        System.out.println("getXStart");
        ShapeEvent instance = ss;
        int expResult = 0;
        int result = instance.getXStart();
        if (expResult != result) {
            fail("Unexpected value returned, FAIL");
        }
    }

    /**
     * Test of setXStart method, of class ShapeEvent.
     */
    @Test
    public void testSetXStart() {
        try {
            System.out.println("setXStart");
            int xStart = 0;
            ShapeEvent instance = ss;
            instance.setXStart(xStart);
        } catch (Exception ex) {
            fail("Cannot set value, FAIL");
        }
    }

    /**
     * Test of getYStart method, of class ShapeEvent.
     */
    @Test
    public void testGetYStart() {
        System.out.println("getYStart");
        ShapeEvent instance = ss;
        int expResult = 0;
        int result = instance.getYStart();
        if (expResult != result) {
            fail("Unexpected value returned, FAIL");
        }
    }

    /**
     * Test of setYStart method, of class ShapeEvent.
     */
    @Test
    public void testSetYStart() {
        try {
            System.out.println("setYStart");
            int yStart = 0;
            ShapeEvent instance = ss;
            instance.setYStart(yStart);
        } catch (Exception ex) {
            fail("Cannot set value, FAIL");
        }
    }

//    /**
//     * Test of getXBottomRight method, of class ShapeEvent.
//     */
//    @Test
//    public void testGetXBottomRight() {
////        System.out.println("getXBottomRight");
////        ShapeEvent instance = ss;
////        int result = instance.getXBottomRight();
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setXBottomRight method, of class ShapeEvent.
//     */
//    @Test
//    public void testSetXBottomRight() {
////        try {
////            System.out.println("setXBottomRight");
////            int xbottomright = 0;
////            ShapeEvent instance = ss;
////            instance.setXBottomRight(xbottomright);
////        } catch (Exception ex) {
////            fail("Cannot set value, FAIL");
////        }
//    }
//
//    /**
//     * Test of getYBottomRight method, of class ShapeEvent.
//     */
//    @Test
//    public void testGetYBottomRight() {
////        System.out.println("getYBottomRight");
////        ShapeEvent instance = ss;
////        int result = instance.getYBottomRight();
////        if (result != null) {
////            // TODO review the generated test code and remove the default call to fail.
////            fail("The test case is a prototype.");
////        }
//    }
//
//    /**
//     * Test of setYBottomRight method, of class ShapeEvent.
//     */
//    @Test
//    public void testSetYBottomRight() {
////        try {
////            System.out.println("setYBottomRight");
////            int ybottomright = 0;
////            ShapeEvent instance = ss;
////            instance.setYBottomRight(ybottomright);
////        } catch (Exception ex) {
////            fail("Cannot set value, FAIL");
////        }
//    }

    /**
     * Test of getXEnd method, of class ShapeEvent.
     */
    @Test
    public void testGetXEnd() {
        System.out.println("getXEnd");
        ShapeEvent instance = ss;
        int expResult = 1;
        int result = instance.getXEnd();
        if (expResult != result) {
            fail("Unexpected value returned, FAIL");
        }
    }

    /**
     * Test of setXEnd method, of class ShapeEvent.
     */
    @Test
    public void testSetXEnd() {
        try {
            System.out.println("setXEnd");
            int xEnd = 0;
            ShapeEvent instance = ss;
            instance.setXEnd(xEnd);
        } catch (Exception ex) {
            fail("Cannot set value, FAIL");
        }
    }

    /**
     * Test of getYEnd method, of class ShapeEvent.
     */
    @Test
    public void testGetYEnd() {
        System.out.println("getYEnd");
        ShapeEvent instance = ss;
        int expResult = 0;
        int result = instance.getYEnd();
        if (expResult != result) {
            fail("Unexpected value returned, FAIL");
        }
    }

    /**
     * Test of setYEnd method, of class ShapeEvent.
     */
    @Test
    public void testSetYEnd() {
        try {
            System.out.println("setYEnd");
            int yEnd = 1;
            ShapeEvent instance = ss;
            instance.setYEnd(yEnd);
        } catch (Exception ex) {
            fail("Cannot set value, FAIL");
        }
    }

    /**
     * Test of getXextra method, of class ShapeEvent.
     */
    @Test
    public void testGetXextra() {
        System.out.println("getXextra");
        ShapeEvent instance = ss;
        int expResult = 1;
        int result = instance.getXextra();
        if (expResult != result) {
            fail("Unexpected value returned, FAIL");
        }
    }

    /**
     * Test of setXextra method, of class ShapeEvent.
     */
    @Test
    public void testSetXextra() {
        try {
            System.out.println("setXextra");
            int xextra = 1;
            ShapeEvent instance = new ShapeEvent();
            instance.setXextra(xextra);
        } catch (Exception ex) {
            fail("Cannot set value, FAIL");
        }
    }

    /**
     * Test of getYextra method, of class ShapeEvent.
     */
    @Test
    public void testGetYextra() {
        System.out.println("getYextra");
        ShapeEvent instance = ss;
        int expResult = 1;
        int result = instance.getYextra();
        if (expResult != result) {
            fail("Unexpected value returned, FAIL");
        }
    }

    /**
     * Test of setYextra method, of class ShapeEvent.
     */
    @Test
    public void testSetYextra() {
        try {
            System.out.println("setYextra");
            int yextra = 0;
            ShapeEvent instance = ss;
            instance.setYextra(yextra);
        } catch (Exception ex) {
            fail("Cannot set value, FAIL");
        }
    }

    /**
     * Test of getXXextra method, of class ShapeEvent.
     */
    @Test
    public void testGetXXextra() {
        System.out.println("getXXextra");
        ShapeEvent instance = ss;
        int expResult = 0;
        int result = instance.getXXextra();
        if (expResult != result) {
            fail("Unexpected value returned, FAIL");
        }
    }

    /**
     * Test of setXXextra method, of class ShapeEvent.
     */
    @Test
    public void testSetXXextra() {
        try {
            System.out.println("setXXextra");
            int xxextra = 1;
            ShapeEvent instance = ss;
            instance.setXXextra(xxextra);
        } catch (Exception ex) {
            fail("Cannot set value, FAIL");
        }
    }

    /**
     * Test of getYYextra method, of class ShapeEvent.
     */
    @Test
    public void testGetYYextra() {
        System.out.println("getYYextra");
        ShapeEvent instance = ss;
        int expResult = 1;
        int result = instance.getYYextra();
        if (expResult != result) {
            fail("Unexpected value returned, FAIL");
        }
    }

    /**
     * Test of setYYextra method, of class ShapeEvent.
     */
    @Test
    public void testSetYYextra() {
        try {
            System.out.println("setYYextra");
            int yyextra = 1;
            ShapeEvent instance = ss;
            instance.setYYextra(yyextra);
        } catch (Exception ex) {
            fail("Cannot set value, FAIL");
        }
    }

    /**
     * Test of getColour method, of class ShapeEvent.
     */
    @Test
    public void testGetColour() {
        System.out.println("getColour");
        ShapeEvent instance = ss;
        Color expResult = Color.BLACK;
        Color result = instance.getColour();
        if (expResult != result) {
            fail("Colour should have been set to BLACK, FAIL");
        }
    }

    /**
     * Test of setColour method, of class ShapeEvent.
     */
    @Test
    public void testSetColour() {
        try {
            System.out.println("setColour");
            Color colour = Color.BLACK;
            ShapeEvent instance = ss;
            instance.setColour(colour);
        } catch (Exception ex) {
            fail("Couldn't set the colour of the shape, FAIL");
        }
    }

    /**
     * Test of setColourByString method, of class ShapeEvent.
     */
    @Test
    public void testSetColourByString() {
        try {
            System.out.println("setColourByString");
            String colour = "BLACK";
            ShapeEvent instance = new ShapeEvent();
            instance.setColourByString(colour);
        } catch (Exception ex) {
            // TODO review the generated test code and remove the default call to fail.
            fail("Cannot set value, FAIL");
        }
    }

    /**
     * Test of getThickness method, of class ShapeEvent.
     */
    @Test
    public void testGetThickness() {
        System.out.println("getThickness");
        ShapeEvent instance = ss;
        int expResult = 5;
        int result = instance.getThickness();
        if (expResult != result) {
            // TODO review the generated test code and remove the default call to fail.
            fail("thickness value is incorrect, FAIL");
        }
    }

    /**
     * Test of setThickness method, of class ShapeEvent.
     */
    @Test
    public void testSetThickness() {
        try {
            System.out.println("setThickness");
            int thickness = 5;
            ShapeEvent instance = ss;
            instance.setThickness(thickness);
        } catch (Exception ex) {
            fail("Cannot set value, FAIL");
        }
    }

    /**
     * Test of getShapeType method, of class ShapeEvent.
     */
    @Test
    public void testGetShapeType() {
        System.out.println("getShapeType");
        ShapeEvent instance = ss;
        ShapeType expResult = ShapeType.QUADRILATERAL;
        ShapeType result = instance.getShapeType();
        if (expResult != result) {
            // TODO review the generated test code and remove the default call to fail.
            fail("ShapeType isn't correct, FAIL");
        }
    }

    /**
     * Test of setShapeType method, of class ShapeEvent.
     */
    @Test
    public void testSetShapeType() {
        try {
            System.out.println("setShapeType");
            ShapeType shapeType = ShapeType.QUADRILATERAL;
            ShapeEvent instance = ss;
            instance.setShapeType(shapeType);
        } catch (Exception ex) {
            fail("Cannot set value, FAIL");
        }
    }

    /**
     * Test of getEventType method, of class ShapeEvent.
     */
    @Test
    public void testGetEventType() {
        System.out.println("getEventType");
        ShapeEvent instance = ss;
        String expResult = "SHAPE";
        String result = instance.getEventType();
        if (!expResult.equals(result)) {
            // TODO review the generated test code and remove the default call to fail.
            fail("Event type should be SHAPE, FAIL");
        }
    }

    /**
     * Test of setEventType method, of class ShapeEvent.
     */
    @Test
    public void testSetEventType() {
        try {
            System.out.println("setEventType");
            String eventType = "SHAPE";
            ShapeEvent instance = new ShapeEvent();
            instance.setEventType(eventType);
        } catch (Exception ex) {
            // TODO review the generated test code and remove the default call to fail.
            fail("Cannot set value, FAIL");
        }
    }

}
