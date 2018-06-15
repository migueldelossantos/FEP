/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.CategoriaProd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author miguel
 */
public class CtrlCategoriaProd {
    private final String tabla = "categoria_prod";
    
    public void guardar(Connection conexion,CategoriaProd cp) throws SQLException{
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
    
    public CategoriaProd obtenerPorId(Connection conexion, Integer id_categoria) throws SQLException{
        CategoriaProd cp = null;
        try{
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("SELECT * FROM "+this.tabla+" WHERE id_categoria=?");
            consulta.setInt(1,id_categoria);
            ResultSet result = consulta.executeQuery();
            while(result.next()){
                cp = new CategoriaProd(result.getInt("id_categoria"),result.getString("nombre"));
            }
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
        return cp;
    }
}
