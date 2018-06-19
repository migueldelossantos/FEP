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
 * @author arguellesalcazar101
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
     * @throws java.lang.Exception
     */
    /*@Test
    public void testGuardar() throws Exception {
        Connection conexion = Conexion.conectar();
        MesProduccion mp = new MesProduccion(null, 1, 1, 123.0);
        CtrlMesProduccion instance = new CtrlMesProduccion();
        instance.guardar(conexion, mp);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertTrue(mp.getMonto().equals(instance.obtenerPorId(conexion,1).getMonto()));
    }

    /**
     * Test of obtenerPorId method, of class CtrlMesProduccion.
     * @throws java.lang.Exception
     */
    @Test
    public void testObtenerPorId() throws Exception {
        System.out.println("obtenerPorId");
        Connection conexion = Conexion.conectar();
        Integer id_mes = 1;
        CtrlMesProduccion instance = new CtrlMesProduccion();
        MesProduccion expResult = new MesProduccion(1, 1, 1, 123.);
        MesProduccion result = instance.obtenerPorId(conexion, id_mes);
        
        assertTrue(expResult.getMonto().equals(result.getMonto()));
    }
    
    
}
