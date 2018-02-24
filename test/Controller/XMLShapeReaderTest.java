/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.FileNotFoundException;
import javax.xml.parsers.ParserConfigurationException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.xml.sax.SAXException;

/**
 *
 * @author Malik
 */
public class XMLShapeReaderTest {

    private final XMLShapeReader me;

    public XMLShapeReaderTest() throws ParserConfigurationException, SAXException {
        this.me = new XMLShapeReader();
    }

    @Before
    public void setUp() {
    }

    /**
     * Test of getShapesFromFile method, of class XMLShapeReader.
     */
    @Test
    public void testGetShapesFromFile() throws Exception {
        try {
             me.getShapesFromFile("stored_shapes.xml");
        } catch (FileNotFoundException ex) {
            fail("XML file could not be imported from, FAIL");
        }
    }

    @Test
    public void testGetSlList() {
        try {
            System.out.println("Lines loaded = " + me.getSlList().size());
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
            System.out.println("Ovals loaded = " + me.getOlList().size());
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
            System.out.println("Trangles loaded = " + me.getStList().size());
        } catch (Exception ex) {
            fail("Cannot load triangles lists, FAIL");
        }
    }

    /**
     * Test of getSsList method, of class JSONShapeReader.
     */
    @Test
    public void testGetQlList() {
        try {
            System.out.println("quadrilateral loaded = " + me.getQlList().size());
        } catch (Exception ex) {
            fail("Cannot load quadrilateral lists, FAIL");
        }
    }
}
