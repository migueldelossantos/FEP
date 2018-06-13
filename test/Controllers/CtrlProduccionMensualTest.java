/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.ProduccionMensual;
import java.sql.Connection;
import java.sql.SQLException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author arguellesalcazar101
 */
public class CtrlProduccionMensualTest {
    
    public CtrlProduccionMensualTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of guardar method, of class CtrlProduccionMensual.
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    @Test
    public void testGuardar() throws SQLException, ClassNotFoundException {
        System.out.println("guardar");
        Connection conexion = Conexion.conectar();
        ProduccionMensual pm = new ProduccionMensual(null, 1, "concepto pm 1", 1);
        CtrlProduccionMensual instance = new CtrlProduccionMensual();
        instance.guardar(conexion, pm);
        System.out.println(pm);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertTrue(pm.getNombre().equals(instance.obtenerPorId(conexion,1).getNombre()));
        
    }
    
}
