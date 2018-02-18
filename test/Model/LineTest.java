/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

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
public class LineTest {
    
    public LineTest() {
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
     * Test of getXEnd method, of class Line.
     */
    @Test
    public void testGetXEnd() {
        System.out.println("getXEnd");
        Line instance = new LineImpl();
        int expResult = 0;
        int result = instance.getXEnd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setXEnd method, of class Line.
     */
    @Test
    public void testSetXEnd() {
        System.out.println("setXEnd");
        int xEnd = 0;
        Line instance = new LineImpl();
        instance.setXEnd(xEnd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getYEnd method, of class Line.
     */
    @Test
    public void testGetYEnd() {
        System.out.println("getYEnd");
        Line instance = new LineImpl();
        int expResult = 0;
        int result = instance.getYEnd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setYEnd method, of class Line.
     */
    @Test
    public void testSetYEnd() {
        System.out.println("setYEnd");
        int yEnd = 0;
        Line instance = new LineImpl();
        instance.setYEnd(yEnd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class LineImpl implements Line {

        public int getXEnd() {
            return 0;
        }

        public void setXEnd(int xEnd) {
        }

        public int getYEnd() {
            return 0;
        }

        public void setYEnd(int yEnd) {
        }
    }
    
}
