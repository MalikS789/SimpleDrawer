/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Event.ShapeType;
import java.awt.Color;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Malik
 */
public class SimpleOvalTest {

    SimpleOval ol;

    public SimpleOvalTest() {
        ol = new SimpleOval(0, 0, 50, 50, Color.BLACK, 5, ShapeType.OVAL);
    }

    /**
     * Test of getxBottomRight method, of class SimpleOval.
     */
    @Test
    public void testGetxBottomRight() {
        System.out.println("getxBottomRight");
        int expResult = 50;
        int result = ol.getxBottomRight();
        if (expResult != result) {
            fail("Unexpected result from method, Fail");
        }
    }

    /**
     * Test of setxBottomRight method, of class SimpleOval.
     */
    @Test
    public void testSetxBottomRight() {
        System.out.println("setxBottomRight");
        try {
            ol.setxBottomRight(50);
        } catch (Exception ex) {
            fail("can't set value for bottom x , FAIL");
        }
    }

    /**
     * Test of getyBottomRight method, of class SimpleOval.
     */
    @Test
    public void testGetyBottomRight() {
        System.out.println("getyBottomRight");
        int expResult = 50;
        int result = ol.getyBottomRight();
        if (expResult != result) {
            fail("Unexpected result from method, Fail");
        }
    }

    /**
     * Test of setyBottomRight method, of class SimpleOval.
     */
    @Test
    public void testSetyBottomRight() {
        System.out.println("setyBottomRight");
        try {
            ol.setyBottomRight(50);
        } catch (Exception ex) {
            fail("can't set value for bottom y , FAIL");
        }
    }

    /**
     * Test of getArea method, of class SimpleOval.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        double expResult = 1963.4954084936207;
        double result = ol.getArea();
        if (expResult != result) {
            fail("Area calculated wasn't correct, FAIL");
        }
    }

}
