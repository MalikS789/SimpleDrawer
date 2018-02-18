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
public class SimpleOvalTest {
    
    public SimpleOvalTest() {
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
     * Test of getxBottomRight method, of class SimpleOval.
     */
    @Test
    public void testGetxBottomRight() {
        System.out.println("getxBottomRight");
        SimpleOval instance = null;
        int expResult = 0;
        int result = instance.getxBottomRight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setxBottomRight method, of class SimpleOval.
     */
    @Test
    public void testSetxBottomRight() {
        System.out.println("setxBottomRight");
        int xBottomRight = 0;
        SimpleOval instance = null;
        instance.setxBottomRight(xBottomRight);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getyBottomRight method, of class SimpleOval.
     */
    @Test
    public void testGetyBottomRight() {
        System.out.println("getyBottomRight");
        SimpleOval instance = null;
        int expResult = 0;
        int result = instance.getyBottomRight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setyBottomRight method, of class SimpleOval.
     */
    @Test
    public void testSetyBottomRight() {
        System.out.println("setyBottomRight");
        int yBottomRight = 0;
        SimpleOval instance = null;
        instance.setyBottomRight(yBottomRight);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
