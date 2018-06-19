/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.PresupInversion;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alerd
 */
public class CtrlPresupInversionTest {
    
    public CtrlPresupInversionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of guardar method, of class CtrlPresupInversion.
     * @throws java.lang.Exception
     */
    /*@Test
    public void testGuardar() throws Exception {
        System.out.println("guardar");
        Connection conexion = Conexion.conectar();
        PresupInversion p = new PresupInversion(null, 1, "nuevo", "Pza", 100.0, 10.0, 1000.0, 500.0, 500.0, 1);
        CtrlPresupInversion instance = new CtrlPresupInversion();
        instance.guardar(conexion, p);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(p.getNombre().equals(instance.obtenerPorId(conexion,5).getNombre()));
    }*/

    /**
     * Test of obtenerPorId method, of class CtrlPresupInversion.
     * @throws java.lang.Exception
     */
    @Test
    public void testObtenerPorId() throws Exception {
        System.out.println("obtenerPorId");
        Connection conexion = Conexion.conectar();
        Integer id_concepto = 1;
        CtrlPresupInversion instance = new CtrlPresupInversion();
        PresupInversion result = instance.obtenerPorId(conexion, id_concepto);
        assertTrue(result.getNombre().length() > 0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of eliminar method, of class CtrlPresupInversion.
     * @throws java.lang.Exception
     */
    @Test
    public void testEliminar() throws Exception {
        System.out.println("eliminar");
        Connection conexion = Conexion.conectar();
        Integer id_concepto = 5;
        CtrlPresupInversion instance = new CtrlPresupInversion();
        instance.eliminar(conexion, id_concepto);
        PresupInversion result = instance.obtenerPorId(conexion, id_concepto);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of obtenerTodos method, of class CtrlPresupInversion.
     * @throws java.lang.Exception
     */
    /*@Test
    public void testObtenerTodos() throws Exception {
        System.out.println("obtenerTodos");
        Connection conexion = Conexion.conectar();
        CtrlPresupInversion instance = new CtrlPresupInversion();
        List<PresupInversion> expResult;
        expResult = new ArrayList<>();
        expResult.add(new PresupInversion(1, 1, "nombre concepto", "Pza", 100.0, 10.0, 1000.0, 500.0, 500.0, 1));
        //expResult.add(new PresupInversion(null, 1, "nombre concepto 2", "Pza", 200.0, 20.0, 4000.0, 2000.0, 2000.0, 1));
        List<PresupInversion> result = instance.obtenerTodos(conexion);
        assertEquals(expResult.size(), result.size());
        // TODO review the generated test code and remove the default call to fail.
    }*/
    
}
