/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.FileNotFoundException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author Malik
 */
public class JSONShapeReaderTest {

    JSONShapeReader me = new JSONShapeReader();

    public JSONShapeReaderTest() {

    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        testGetShapesFromFile();
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of getShapesFromFile method, of class JSONShapeReader.
     */
    @Test
    public void testGetShapesFromFile() {
        try {
            me.getShapesFromFile("stored_shapes.json");
        } catch (FileNotFoundException ex) {
            fail("JSON file could not be imported from, FAIL");
        }
    }

    /**
     * Test of getSlList method, of class JSONShapeReader.
     */
    @Test
    public void testGetSlList() {
        try {
            System.out.println("Lines loaded = " + me.getSlList());
        } catch (Exception ex) {
            fail("Cannot load lines lists, FAIL");
        }
    }

    /**
     * Test of getOlList method, of class JSONShapeReader.
     */
    @Test
    public void testGetOlList() {
        try {
            System.out.println("Ovals loaded = " + me.getOlList());
        } catch (Exception ex) {
            fail("Cannot load oval lists, FAIL");
        }
    }

    /**
     * Test of getStList method, of class JSONShapeReader.
     */
    @Test
    public void testGetStList() {
        try {
            System.out.println("Trangles loaded = " + me.getStList());
        } catch (Exception ex) {
            fail("Cannot load triangles lists, FAIL");
        }
    }

    /**
     * Test of getSsList method, of class JSONShapeReader.
     */
    @Test
    public void testGetSsList() {
        try {
            System.out.println("Squares loaded = " + me.getSsList());
        } catch (Exception ex) {
            fail("Cannot load squares lists, FAIL");
        }
    }
}
