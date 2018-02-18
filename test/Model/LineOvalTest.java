/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

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
public class LineOvalTest {
    
    public LineOvalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getXStart method, of class LineOval.
     */
    @Test
    public void testGetXStart() {
        System.out.println("getXStart");
        LineOval instance = new LineOvalImpl();
        int expResult = 0;
        int result = instance.getXStart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setXStart method, of class LineOval.
     */
    @Test
    public void testSetXStart() {
        System.out.println("setXStart");
        int xStart = 0;
        LineOval instance = new LineOvalImpl();
        instance.setXStart(xStart);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getYStart method, of class LineOval.
     */
    @Test
    public void testGetYStart() {
        System.out.println("getYStart");
        LineOval instance = new LineOvalImpl();
        int expResult = 0;
        int result = instance.getYStart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setYStart method, of class LineOval.
     */
    @Test
    public void testSetYStart() {
        System.out.println("setYStart");
        int yStart = 0;
        LineOval instance = new LineOvalImpl();
        instance.setYStart(yStart);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColour method, of class LineOval.
     */
    @Test
    public void testGetColour() {
        System.out.println("getColour");
        LineOval instance = new LineOvalImpl();
        Color expResult = null;
        Color result = instance.getColour();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColour method, of class LineOval.
     */
    @Test
    public void testSetColour() {
        System.out.println("setColour");
        Color colour = null;
        LineOval instance = new LineOvalImpl();
        instance.setColour(colour);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getThickness method, of class LineOval.
     */
    @Test
    public void testGetThickness() {
        System.out.println("getThickness");
        LineOval instance = new LineOvalImpl();
        int expResult = 0;
        int result = instance.getThickness();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setThickness method, of class LineOval.
     */
    @Test
    public void testSetThickness() {
        System.out.println("setThickness");
        int thickness = 0;
        LineOval instance = new LineOvalImpl();
        instance.setThickness(thickness);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getShapeType method, of class LineOval.
     */
    @Test
    public void testGetShapeType() {
        System.out.println("getShapeType");
        LineOval instance = new LineOvalImpl();
        ShapeType expResult = null;
        ShapeType result = instance.getShapeType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setShapeType method, of class LineOval.
     */
    @Test
    public void testSetShapeType() {
        System.out.println("setShapeType");
        ShapeType shapeType = null;
        LineOval instance = new LineOvalImpl();
        instance.setShapeType(shapeType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class LineOvalImpl implements LineOval {

        public int getXStart() {
            return 0;
        }

        public void setXStart(int xStart) {
        }

        public int getYStart() {
            return 0;
        }

        public void setYStart(int yStart) {
        }

        public Color getColour() {
            return null;
        }

        public void setColour(Color colour) {
        }

        public int getThickness() {
            return 0;
        }

        public void setThickness(int thickness) {
        }

        public ShapeType getShapeType() {
            return null;
        }

        public void setShapeType(ShapeType shapeType) {
        }
    }
    
}
