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
public class SimpleLineTest {

    SimpleLine sl;

    public SimpleLineTest() {
        sl = new SimpleLine(0, 0, 10, 10, Color.BLACK, 5, ShapeType.LINE);
    }

    /**
     * Test of getXEnd method, of class SimpleLine.
     */
    @Test
    public void testGetXEnd() {
        System.out.println("getXEnd");
        int expResult = 10;
        int result = sl.getXEnd();
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
            sl.setXEnd(50);
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
        int result = sl.getYEnd();
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
            sl.setYEnd(50);
        } catch (Exception ex) {
            fail("Cannot set the specified value to the data, FAIL");
        }
    }
}
