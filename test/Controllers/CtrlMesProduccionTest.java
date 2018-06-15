/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.MesProduccion;
import java.sql.Connection;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author miguel
 */
public class CtrlMesProduccionTest {
    
    public CtrlMesProduccionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of guardar method, of class CtrlMesProduccion.
     */
    @Test
    public void testGuardar() throws Exception {
        System.out.println("guardar");
        Connection conexion = null;
        MesProduccion mp = null;
        CtrlMesProduccion instance = new CtrlMesProduccion();
        instance.guardar(conexion, mp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
