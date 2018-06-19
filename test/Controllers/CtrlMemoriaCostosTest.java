/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.MemoriaCostos;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alejandro
 */
public class CtrlMemoriaCostosTest {
    
    public CtrlMemoriaCostosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of guardar method, of class CtrlMemoriaCostos.
     * @throws java.lang.Exception
     */
    /*@Test
    public void testGuardar() throws Exception {
        System.out.println("guardar");
        Connection conexion = Conexion.conectar();
        MemoriaCostos mc = new MemoriaCostos(1, 1, "hoy", "Caja", 10.0, 100.0, 1000.0, 1);
        CtrlMemoriaCostos instance = new CtrlMemoriaCostos();
        instance.guardar(conexion, mc);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(mc.getNombre().equals(instance.obtenerPorId(conexion,1).getNombre()));
    }*/

    /**
     * Test of obtenerPorId method, of class CtrlMemoriaCostos.
     * @throws java.lang.Exception
     */
    @Test
    public void testObtenerPorId() throws Exception {
        System.out.println("obtenerPorId");
        Connection conexion = Conexion.conectar();
        Integer id_concepto = 1;
        CtrlMemoriaCostos instance = new CtrlMemoriaCostos();
        MemoriaCostos result = instance.obtenerPorId(conexion, id_concepto);
        assertTrue(result.getNombre().length() > 0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of eliminar method, of class CtrlMemoriaCostos.
     */
    @Test
    public void testEliminar() throws Exception {
        System.out.println("eliminar");
        Connection conexion = Conexion.conectar();
        Integer id_concepto = 1;
        CtrlMemoriaCostos instance = new CtrlMemoriaCostos();
        instance.eliminar(conexion, id_concepto);
        assertTrue(true);
    }

    /**
     * Test of obtenerTodos method, of class CtrlMemoriaCostos.
     * @throws java.lang.Exception
     */
    @Test
    public void testObtenerTodos() throws Exception {
        System.out.println("obtenerTodos");
        Connection conexion = Conexion.conectar();
        CtrlMemoriaCostos instance = new CtrlMemoriaCostos();
        List<MemoriaCostos> expResult;
        expResult = new ArrayList<>();
        expResult.add(new MemoriaCostos(1, 1, "hoy", "Caja", 10.0, 100.0, 1000.0, 1));
        List<MemoriaCostos> result = instance.obtenerTodos(conexion);
        System.out.println(result.toString());
        assertEquals(expResult.size(), result.size());
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
