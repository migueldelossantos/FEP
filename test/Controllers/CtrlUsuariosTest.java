/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Usuarios;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author miguel
 */
public class CtrlUsuariosTest {
    
    public CtrlUsuariosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of guardar method, of class CtrlUsuarios.
     */
    @Test
    public void testGuardar() throws Exception {
        System.out.println("guardar");
        Connection conexion = Conexion.conectar();
        Usuarios u = new Usuarios(null,"juan", "juan");
        CtrlUsuarios instance = new CtrlUsuarios();
        instance.guardar(conexion, u);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertTrue(u.getNombre().equals(instance.obtenerPorId(conexion,2).getNombre()));
    }

    /**
     * Test of obtenerPorId method, of class CtrlUsuarios.
     */
    @Test
    public void testObtenerPorId() throws Exception {
        System.out.println("obtenerPorId");
        Connection conexion = null;
        Integer id_usuario = null;
        CtrlUsuarios instance = new CtrlUsuarios();
        Usuarios expResult = null;
        Usuarios result = instance.obtenerPorId(conexion, id_usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class CtrlUsuarios.
     */
    @Test
    public void testEliminar() throws Exception {
        System.out.println("eliminar");
        Connection conexion = null;
        Integer id_usuario = null;
        CtrlUsuarios instance = new CtrlUsuarios();
        instance.eliminar(conexion, id_usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerTodos method, of class CtrlUsuarios.
     */
    @Test
    public void testObtenerTodos() throws Exception {
        System.out.println("obtenerTodos");
        Connection conexion = null;
        CtrlUsuarios instance = new CtrlUsuarios();
        List<Usuarios> expResult = null;
        List<Usuarios> result = instance.obtenerTodos(conexion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
