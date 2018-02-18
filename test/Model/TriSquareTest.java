/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Color;
import java.awt.Point;
import java.util.List;
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
public class TriSquareTest {
    
    public TriSquareTest() {
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
     * Test of getVertices method, of class TriSquare.
     */
    @Test
    public void testGetVertices() {
        System.out.println("getVertices");
        TriSquare instance = new TriSquareImpl();
        List<Point> expResult = null;
        List<Point> result = instance.getVertices();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVertices method, of class TriSquare.
     */
    @Test
    public void testSetVertices() {
        System.out.println("setVertices");
        List<Point> vertices = null;
        TriSquare instance = new TriSquareImpl();
        instance.setVertices(vertices);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColour method, of class TriSquare.
     */
    @Test
    public void testGetColour() {
        System.out.println("getColour");
        TriSquare instance = new TriSquareImpl();
        Color expResult = null;
        Color result = instance.getColour();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColour method, of class TriSquare.
     */
    @Test
    public void testSetColour() {
        System.out.println("setColour");
        Color colour = null;
        TriSquare instance = new TriSquareImpl();
        instance.setColour(colour);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getThickness method, of class TriSquare.
     */
    @Test
    public void testGetThickness() {
        System.out.println("getThickness");
        TriSquare instance = new TriSquareImpl();
        int expResult = 0;
        int result = instance.getThickness();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setThickness method, of class TriSquare.
     */
    @Test
    public void testSetThickness() {
        System.out.println("setThickness");
        int thickness = 0;
        TriSquare instance = new TriSquareImpl();
        instance.setThickness(thickness);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getShapeType method, of class TriSquare.
     */
    @Test
    public void testGetShapeType() {
        System.out.println("getShapeType");
        TriSquare instance = new TriSquareImpl();
        ShapeType expResult = null;
        ShapeType result = instance.getShapeType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setShapeType method, of class TriSquare.
     */
    @Test
    public void testSetShapeType() {
        System.out.println("setShapeType");
        ShapeType shapeType = null;
        TriSquare instance = new TriSquareImpl();
        instance.setShapeType(shapeType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class TriSquareImpl implements TriSquare {

        public List<Point> getVertices() {
            return null;
        }

        public void setVertices(List<Point> vertices) {
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
