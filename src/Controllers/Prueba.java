/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import Models.Usuarios;
import java.sql.SQLException;

/**
 *
 * @author miguel
 * Esta clase es para realizar las pruebas del código creado en los controladores
 */
public class Prueba {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //Prueba para obtener usuario
        //Instancia de la clase UsuarioServicio para consulta
        CtrlUsuarios us = new CtrlUsuarios();      
        //instancia de un objeto Usuario, para almacenar el usuario obtenido
        Usuarios user = null;
        //Para probar el código solo deben mandar a llamar al método correspondiente creado para la funcionalidad
        //En este caso imprimo el resultado obtenido y el código creado es correcto
        user = us.obtenerPorId(Conexion.conectar(),1);
        System.out.println(user.toString());
        
        //de aquí en seguida podemos seguir agragando las demas prubas...
    }
}
