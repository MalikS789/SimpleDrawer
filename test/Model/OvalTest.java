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
public class OvalTest {
    
    public OvalTest() {
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
     * Test of getxBottomRight method, of class Oval.
     */
    @Test
    public void testGetxBottomRight() {
        System.out.println("getxBottomRight");
        Oval instance = new OvalImpl();
        int expResult = 0;
        int result = instance.getxBottomRight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setxBottomRight method, of class Oval.
     */
    @Test
    public void testSetxBottomRight() {
        System.out.println("setxBottomRight");
        int xBottomRight = 0;
        Oval instance = new OvalImpl();
        instance.setxBottomRight(xBottomRight);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getyBottomRight method, of class Oval.
     */
    @Test
    public void testGetyBottomRight() {
        System.out.println("getyBottomRight");
        Oval instance = new OvalImpl();
        int expResult = 0;
        int result = instance.getyBottomRight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setyBottomRight method, of class Oval.
     */
    @Test
    public void testSetyBottomRight() {
        System.out.println("setyBottomRight");
        int yBottomRight = 0;
        Oval instance = new OvalImpl();
        instance.setyBottomRight(yBottomRight);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class OvalImpl implements Oval {

        public int getxBottomRight() {
            return 0;
        }

        public void setxBottomRight(int xBottomRight) {
        }

        public int getyBottomRight() {
            return 0;
        }

        public void setyBottomRight(int yBottomRight) {
        }
    }
    
}
