/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.CategoriaMemoria;
import Models.CategoriaProd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;

/**
 *
 * @author miguel
 */
public class CtrlCategoriaProd {
    private final String tabla = "categoria_prod";
    
    public void guardar(Connection conexion,CategoriaMemoria cp) throws SQLException{
        try{
            PreparedStatement consulta;
            if(cp.getId_categoria()==null){
                consulta = conexion.prepareCall("INSERT INTO "+this.tabla+" (nombre) VALUES(?)");
                consulta.setString(1,cp.getNombre());
            }else{
                consulta = conexion.prepareCall("UPDATE"+this.tabla+" SET nombre=? WHERE id_categoria=?");
                consulta.setString(1,cp.getNombre());
                consulta.setInt(2,cp.getId_categoria());
            }
            consulta.executeUpdate();
        }catch(SQLException ex){
            throw new SQLException();
        }
    }
    
    public void obtenerPorId(Connection conexion, Integer id_categoria) throws SQLException{
        try{
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("SELECT * FROM "+this.tabla+" WHERE id_categoria=?");
            consulta.setInt(1,id_categoria);
            consulta.execute();
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
    }
}
