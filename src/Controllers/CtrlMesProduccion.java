/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.MesProduccion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author miguel
 */
public class CtrlMesProduccion {
   private final String tabla = "mes_producion";
   
   public void guardar(Connection conexion, MesProduccion mp) throws SQLException{
       try{
           PreparedStatement consulta;
           if(mp.getId_mes()==null){
               consulta = conexion.prepareStatement("INSERT INTO "+this.tabla+" (concepto_id,proyecto_id,monto) VALUES(?,?,?)");
               consulta.setInt(1,mp.getConcepto_id());
               consulta.setInt(2,mp.getProyecto_id());
               consulta.setDouble(3,mp.getMonto());
           }else{
               consulta = conexion.prepareStatement("UPDATE "+this.tabla+" SET monto=? WHERE id_mes=?");
               consulta.setDouble(1,mp.getMonto());
               consulta.setDouble(2,mp.getMonto());
           }
           consulta.executeUpdate();
       }catch(SQLException ex){
           throw new SQLException(ex);
       }
   }
}
