/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Malik
 */
public class DrawerMainTest {

    /**
     * Test of main method, of class DrawerMain.
     */
    @Test
    public void testMain() {
        try {
            System.out.println("main");
            String[] args = null;
            DrawerMain.main(args);
        } catch (Exception ex) {
            fail("Cannot launch GUI, FAIL");
        }
    }
}
