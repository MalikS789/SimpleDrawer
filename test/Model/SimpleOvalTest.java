/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.ShapeType;
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
public class SimpleOvalTest {

    SimpleOval ol;

    public SimpleOvalTest() {
        List<Point> OvalPoints = new ArrayList<>();
        OvalPoints.add(new Point(0, 0));
        OvalPoints.add(new Point(50, 50));
        ol = new SimpleOval(OvalPoints, Color.BLACK, 5, ShapeType.OVAL);
    }

    /**
     * Test of getxBottomRight method, of class SimpleOval.
     */
    @Test
    public void testGetxBottomRight() {
        System.out.println("getxBottomRight");
        int expResult = 50;
        int result = ol.getVertices().get(1).x;
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
            ol.setVertice(new Point(0, 50), 1);
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
        int result = ol.getVertices().get(1).y;
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
            ol.setVertice(new Point(0, 50), 1);
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
