/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Proyectos;
import java.sql.Connection;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author miguel
 */
public class CtrlProyectosTest {
    
    public CtrlProyectosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of guardar method, of class CtrlProyectos.
     */
    /*@Test
    public void testGuardar() throws Exception {
        System.out.println("guardar");
        Connection conexion = Conexion.conectar();
        Proyectos proyecto = new Proyectos(null,"Chile habanero","completo",1);
        Proyectos proyecto2 = new Proyectos(7,"Nuevo Proyecto","completo",1);
        CtrlProyectos instance = new CtrlProyectos();
        instance.guardar(conexion, proyecto2);
        assertTrue(instance.obtenerPorId(conexion,1)!=null);
    }*/

    /**
     * Test of obtenerTodos method, of class CtrlProyectos.
     */
    /*@Test
    public void testObtenerTodos() throws Exception {
        System.out.println("obtenerTodos");
        Connection conexion = Conexion.conectar();
        CtrlProyectos instance = new CtrlProyectos();
        List result = instance.obtenerTodos(conexion);
        System.out.println(result.toString());
        assertTrue(result.size()>1);
    }*/
    
    @Test
    public void testEliminar() throws Exception{
        System.out.println("eliminar");
        Connection conexion = Conexion.conectar();
        Integer id_proyecto = 7;
        CtrlProyectos instance = new CtrlProyectos();
        instance.eliminar(conexion, id_proyecto);
        assertTrue(true);
    }
}
