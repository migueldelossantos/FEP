/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.ProduccionMensual;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author miguel
 */
public class CtrlProduccionMensual {
    private final String tabla = "produccion_mensual";
    
    /**
     * Metodo para guardar concepto a produccion mensual
     * @param conexion
     * @param pm 
     * @throws java.sql.SQLException 
     */
    public void guardar(Connection conexion, ProduccionMensual pm) throws SQLException{
        try{
            PreparedStatement consulta;
            if(pm.getId_concepto() == null){
                consulta = conexion.prepareStatement("INSERT INTO " + this.tabla 
                        + "(categoria_id, nombre, proyecto_id) VALUES(?, ?, ?)");
                consulta.setInt(1,pm.getCategoria_id());
                consulta.setString(2,pm.getNombre());
                consulta.setInt(3,pm.getProyecto_id());
            }else{
                consulta= conexion.prepareStatement("UPDATE " + this.tabla
                        + " SET categoria_id=?, nombre=?, proyecto_id=? WHERE id_conepto=?");
                consulta.setInt(1,pm.getCategoria_id());
                consulta.setString(2,pm.getNombre());
                consulta.setInt(3,pm.getProyecto_id());
                consulta.setInt(4, pm.getId_concepto());
            } 
            consulta.executeUpdate();
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
    }
    
    public ProduccionMensual obtenerPorId(Connection conexion, Integer id_concepto) throws SQLException{
        ProduccionMensual pm = null;
        try{
            PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM " + this.tabla +" WHERE id_concepto=?");
            consulta.setInt(1,id_concepto);
            ResultSet resultado = consulta.executeQuery();
            while(resultado.next()){
                pm = new ProduccionMensual(id_concepto,resultado.getInt("categoria_id") ,resultado.getString("nombre"),resultado.getInt("proyecto_id"));
            }
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
        return pm;
    }
    
}
