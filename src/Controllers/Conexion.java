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
 */
public class Conexion {
    private static Connection cnx = null;
    public static Connection conectar() throws SQLException, ClassNotFoundException{
        if(cnx == null){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                cnx = DriverManager.getConnection("jdbc:mysql:localhost/java_mysql","miguel","miguel");
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
