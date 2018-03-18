/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Event.ShapeEventGeneratorFromXML;
import Model.Event.ShapeEventListener;
import javax.xml.parsers.ParserConfigurationException;
import org.junit.Test;
import static org.junit.Assert.*;
import org.xml.sax.SAXException;

/**
 *
 * @author Malik
 */
public class ShapeEventGeneratorFromXMLTest {

    /**
     * Test of registerShapeEventListener method, of class
     * ShapeEventGeneratorFromXML.
     */
    @Test
    public void testRegisterShapeEventListener() {
        try {
            System.out.println("registerShapeEventListener");
            String type = "";
            ShapeEventListener dbel = null;
            ShapeEventGeneratorFromXML instance = new ShapeEventGeneratorFromXML();
            instance.registerShapeEventListener(type, dbel);
        } catch (ParserConfigurationException | SAXException ex) {
            fail("Unable to register shapeevent listener for some reason, FAIL");
        }
    }
}
