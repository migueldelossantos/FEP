/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.ProduccionMensual;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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

    
    /**
     * Test of guardar method, of class CtrlProduccionMensual.
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    @Test
    public void testGuardar() throws SQLException, ClassNotFoundException {
        System.out.println("guardar");
        Connection conexion = Conexion.conectar();
        ProduccionMensual pm = new ProduccionMensual(1, 1, "concepto pm 1", 1);
        CtrlProduccionMensual instance = new CtrlProduccionMensual();
        instance.guardar(conexion, pm);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertTrue(pm.getNombre().equals(instance.obtenerPorId(conexion,1).getNombre()));
        
        
    }

    /**
     * Test of obtenerPorId method, of class CtrlProduccionMensual.
     * @throws java.lang.Exception
     */
    /*@Test
    public void testObtenerPorId() throws Exception {
        System.out.println("obtenerPorId");
        Connection conexion = Conexion.conectar();
        Integer id_concepto = 1;
        CtrlProduccionMensual instance = new CtrlProduccionMensual();
        ProduccionMensual expResult = new ProduccionMensual(1, 1, "concepto pm 1", 1);
        ProduccionMensual result = instance.obtenerPorId(conexion, id_concepto);
        
        assertTrue(expResult.getNombre().equals(result.getNombre()));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerTodos method, of class CtrlProduccionMensual.
     * @throws java.lang.Exception
     */
    /*@Test
    public void testObtenerTodos() throws Exception {
        System.out.println("obtenerTodos");
        Connection conexion = Conexion.conectar();
        CtrlProduccionMensual instance = new CtrlProduccionMensual();
        List<ProduccionMensual> expResult;
        expResult = new ArrayList<>();
        expResult.add(new ProduccionMensual(1, 1, "concepto pm 1", 1));
        expResult.add(new ProduccionMensual(2, 1, "concepto pm 1", 1));
        expResult.add(new ProduccionMensual(2, 1, "concepto pm 1", 1));
        expResult.add(new ProduccionMensual(2, 1, "concepto pm 1", 1));
        expResult.add(new ProduccionMensual(2, 1, "concepto pm 1", 1));
        expResult.add(new ProduccionMensual(2, 1, "concepto pm 1", 1));
        
        
        List<ProduccionMensual> result = instance.obtenerTodos(conexion);        
        assertEquals(expResult.size(), result.size());
        // TODO review the generated test code and remove the default call to fail.
    }
    */
}
