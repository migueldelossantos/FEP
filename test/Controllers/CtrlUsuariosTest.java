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
     *
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
    }*/

    /**
     * Test of obtenerPorId method, of class CtrlUsuarios.
     *
    @Test
    public void testObtenerPorId() throws Exception {
        System.out.println("obtenerPorId");
        Connection conexion = Conexion.conectar();
        Integer id_usuario = 1;
        CtrlUsuarios instance = new CtrlUsuarios();
        Usuarios expResult = new Usuarios(1,"miguel","miguel");
        Usuarios result = instance.obtenerPorId(conexion, id_usuario);
        assertEquals(expResult.getId_usuario(), result.getId_usuario());
    }*/
    
    /**
     * Test of obtenerPorNombre method, of class CtrlUsuarios.
     */
    @Test
    public void testObtenerPorNombre() throws Exception {
        System.out.println("obtenerPorNombre");
        Connection conexion = Conexion.conectar();
        String nombre = "miguel";
        CtrlUsuarios instance = new CtrlUsuarios();
        Usuarios expResult = new Usuarios(1,"miguel","miguel");
        Usuarios result = instance.obtenerPorNombre(conexion,nombre);
        assertEquals(expResult.getId_usuario(), result.getId_usuario());
    }    

    /**
     * Test of eliminar method, of class CtrlUsuarios.
     *
    @Test
    public void testEliminar() throws Exception {
        System.out.println("eliminar");
        Connection conexion = Conexion.conectar();
        Integer id_usuario = 3;
        CtrlUsuarios instance = new CtrlUsuarios();
        instance.eliminar(conexion, id_usuario);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.obtenerPorId(conexion, id_usuario)==null);
    }*/

    /**
     * Test of obtenerTodos method, of class CtrlUsuarios.
     *
    @Test
    public void testObtenerTodos() throws Exception {
        System.out.println("obtenerTodos");
        Connection conexion = Conexion.conectar();
        CtrlUsuarios instance = new CtrlUsuarios();
        List<Usuarios> result = instance.obtenerTodos(conexion);
        assertTrue(result.size()>1);
    }*/
    
}
