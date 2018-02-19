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
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Malik
 */
public class JSONShapeReaderTest {
    
    JSONShapeReader me = new JSONShapeReader();      
    
    public JSONShapeReaderTest() throws FileNotFoundException {
        me.getShapesFromFile("stored_shapes.json");
    }

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
    
    /**
     * Test of getShapesFromFile method, of class JSONShapeReader.
     */
    @Test
    public void testGetShapesFromFile() throws Exception {
        try {
             me.getShapesFromFile("stored_shapes.json");
        } catch (FileNotFoundException ex) {
            fail("JSON file could not be imported from, FAIL");
        }
    }

    /**
     * Test of generateTestJSON method, of class JSONShapeReader.
     */
    @Test
    public void testGenerateTestJSON() {
//        System.out.println("generateTestJSON");
//        String file = "";
//        JSONShapeReader.generateTestJSON(file);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class JSONShapeReader.
     */
    @Test
    public void testMain() throws Exception {
//        System.out.println("main");
//        String[] args = null;
//        JSONShapeReader.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
