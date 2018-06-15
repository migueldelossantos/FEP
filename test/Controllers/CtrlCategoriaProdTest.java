/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.CategoriaProd;
import java.sql.Connection;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author miguel
 */
public class CtrlCategoriaProdTest {
    
    public CtrlCategoriaProdTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of guardar method, of class CtrlCategoriaProd.
     */
    @Test
    public void testGuardar() throws Exception {
        System.out.println("guardar");
        Connection conexion = Conexion.conectar();
        CategoriaProd cm = new CategoriaProd(null,"fertilizantes");
        CtrlCategoriaProd instance = new CtrlCategoriaProd();
        instance.guardar(conexion,cm);
    }

    /**
     * Test of obtenerPorId method, of class CtrlCategoriaProd.
     */
    @Test
    public void testObtenerPorId() throws Exception {
        System.out.println("obtenerPorId");
        Connection conexion = Conexion.conectar();
        Integer id_categoria = 1;
        CtrlCategoriaProd instance = new CtrlCategoriaProd();
        CategoriaProd expResult = instance.obtenerPorId(conexion, id_categoria);
        assertEquals(expResult.getId_categoria(),(Integer)1);
    }
    
}
