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
public class SimpleTriangleTest {

    List<Point> TrianglePoints = new ArrayList<>();

    public SimpleTriangleTest() {
        TrianglePoints.add(new Point(1, 1));
        TrianglePoints.add(new Point(2, 2));
        TrianglePoints.add(new Point(3, 1));
    }

    /**
     * Test of getArea method, of class SimpleTriangle.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        SimpleTriangle instance = new SimpleTriangle(TrianglePoints, Color.BLACK, 5, ShapeType.TRIANGLE);
        double expResult = 1.0;
        double result = instance.getArea();
        if (expResult != result) {
            fail("Triangle area returned isn't correct, FAIL");
        }
    }
}
