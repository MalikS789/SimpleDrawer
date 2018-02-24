/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.ShapeEventListener;
import Controller.ShapeEvent;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Malik
 */
public class ShapeEventListenerTest {

    /**
     * Test of processShapeEvent method, of class ShapeEventListener.
     */
    @Test
    public void testProcessShapeEvent() {
        try {
            System.out.println("processShapeEvent");
            Object originator = null;
            ShapeEvent se = null;
            ShapeEventListener instance = new ShapeEventListenerImpl();
            instance.processShapeEvent(originator, se);
        } catch (Exception ex) {
            fail("The test case is a prototype.");
        }
    }

    public class ShapeEventListenerImpl implements ShapeEventListener {

        @Override
        public void processShapeEvent(Object originator, ShapeEvent se) {
        }
    }

}
