/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.SimpleLine;
import Model.SimpleOval;
import Model.SimpleSquare;
import Model.SimpleTriangle;
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
public class XMLShapeReaderTest {
    
    public XMLShapeReaderTest() {
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
     * Test of getShapesFromFile method, of class XMLShapeReader.
     */
    @Test
    public void testGetShapesFromFile() throws Exception {
        System.out.println("getShapesFromFile");
        String file = "";
        XMLShapeReader instance = new XMLShapeReader();
        instance.getShapesFromFile(file);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSlList method, of class XMLShapeReader.
     */
    @Test
    public void testGetSlList() {
        System.out.println("getSlList");
        XMLShapeReader instance = new XMLShapeReader();
        List<SimpleLine> expResult = null;
        List<SimpleLine> result = instance.getSlList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOlList method, of class XMLShapeReader.
     */
    @Test
    public void testGetOlList() {
        System.out.println("getOlList");
        XMLShapeReader instance = new XMLShapeReader();
        List<SimpleOval> expResult = null;
        List<SimpleOval> result = instance.getOlList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStList method, of class XMLShapeReader.
     */
    @Test
    public void testGetStList() {
        System.out.println("getStList");
        XMLShapeReader instance = new XMLShapeReader();
        List<SimpleTriangle> expResult = null;
        List<SimpleTriangle> result = instance.getStList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSsList method, of class XMLShapeReader.
     */
    @Test
    public void testGetSsList() {
        System.out.println("getSsList");
        XMLShapeReader instance = new XMLShapeReader();
        List<SimpleSquare> expResult = null;
        List<SimpleSquare> result = instance.getSsList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class XMLShapeReader.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        XMLShapeReader.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
