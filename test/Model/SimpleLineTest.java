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
public class SimpleLineTest {

    SimpleLine sl;

    public SimpleLineTest() {
        List<Point> LinePoints = new ArrayList<>();
        LinePoints.add(new Point(0, 0));
        LinePoints.add(new Point(10, 10));
        sl = new SimpleLine(LinePoints, Color.BLACK, 5, ShapeType.LINE);
    }

    /**
     * Test of getXEnd method, of class SimpleLine.
     */
    @Test
    public void testGetXEnd() {
        System.out.println("getXEnd");
        int expResult = 10;
        int result = sl.getVertices().get(1).x;
        if (expResult != result) {
            fail("Expected value not returned, FAIL");
        }
    }

    /**
     * Test of setXEnd method, of class SimpleLine.
     */
    @Test
    public void testSetXEnd() {
        try {
            System.out.println("setXEnd");
            sl.setVertice(new Point(0, 10), 1);
        } catch (Exception ex) {
            fail("Cannot set the specified value to the data, FAIL");
        }
    }

    /**
     * Test of getYEnd method, of class SimpleLine.
     */
    @Test
    public void testGetYEnd() {
        System.out.println("getYEnd");
        int expResult = 10;
        int result = sl.getVertices().get(1).y;
        if (expResult != result) {
            fail("Expected value not returned, FAIL");
        }
    }

    /**
     * Test of setYEnd method, of class SimpleLine.
     */
    @Test
    public void testSetYEnd() {
        try {
            System.out.println("setYEnd");
            sl.setVertice(new Point(0, 10), 1);
        } catch (Exception ex) {
            fail("Cannot set the specified value to the data, FAIL");
        }
    }
}
