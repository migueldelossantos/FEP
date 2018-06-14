/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import java.sql.*;
/**
 *
 * @author miguel
 * Este es el archivo de conexión a la base de datos
 */
public class Conexion {
    private static Connection cnx = null;
    
    public static Connection conectar() throws SQLException, ClassNotFoundException{
        if(cnx == null){
            try{
                //Esta linea implementa la libreria para realizar la conexión
                Class.forName("com.mysql.jdbc.Driver");
                //En esta linea se establece la nocexión
                //El segundo argumento entre comillas es el nombre del usuario de su base de datos
                //El tercer argumento es el password para la conexión con la base de datos.
                cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/fep","root","");
            }catch(SQLException ex){
                throw new SQLException(ex);
            }catch(ClassNotFoundException ex){
                throw new ClassNotFoundException(ex.getMessage());
            }
        }
        return cnx;
    }
    
    public static void cerrar() throws SQLException{
        if(cnx != null){
            cnx.close();
        }
    }
}
