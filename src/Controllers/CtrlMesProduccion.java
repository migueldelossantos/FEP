/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.MesProduccion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author miguel
 */
public class CtrlMesProduccion {
    private final String tabla = "mes_produccion";
    
    /**
     * Metodo para guarar un mes de produccion
     * @param conexion
     * @param mp
     * @throws SQLException 
     */
    /*
    public void guardar(Connection conexion, MesProduccion mp) throws SQLException{
        try{
            PreparedStatement consulta;
            if(mp.getId_mes() == null){
                consulta = conexion.prepareStatement("INSERT INTO " + this.tabla 
                        + "(concepto_id, proyecto_id, monto) VALUES(?, ?, ?)");
                consulta.setInt(1,mp.getConcepto_id());
                consulta.setInt(2,mp.getProyecto_id());
                consulta.setDouble(3,mp.getMonto());
            }else{
                consulta= conexion.prepareStatement("UPDATE " + this.tabla
                        + " SET concepto_id=?, proyecto_id=?, monto=? WHERE id_mes=?");
                consulta.setInt(1,mp.getConcepto_id());
                consulta.setInt(2,mp.getProyecto_id());
                consulta.setDouble(3,mp.getMonto());
                consulta.setInt(4, mp.getId_mes());
            } 
            consulta.executeUpdate();
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
    }
    */
    /**
     * Metodo para obtener un mes de produccion por su id
     * @param conexion
     * @param id_mes
     * @return
     * @throws SQLException 
     */
    public MesProduccion obtenerPorId(Connection conexion, Integer id_mes) throws SQLException{
        MesProduccion mp = null;
        try{
            PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM " 
                    + this.tabla +" WHERE id_mes=?");
            consulta.setInt(1,id_mes);
            ResultSet resultado = consulta.executeQuery();
            while(resultado.next()){
                mp = new MesProduccion(id_mes,resultado.getInt("concepto_id"),
                        resultado.getInt("proyecto_id"),resultado.getDouble("monto"));
            }
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
        return mp;
    }
}
