/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.PresupInversion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author miguel
 */
public class CtrlPresupInversion {
    //Nombre de la tabla a la que hace referencia en la base de datos
    private final String tabla = "presup_inversion";
    public void guardar(Connection conexion, PresupInversion p) throws SQLException{
        try{
            PreparedStatement consulta;
            if(p.getId_concepto()== null){
                consulta = conexion.prepareStatement("INSERT INTO "+this.tabla+
                        "(activo_id,nombre,unidad,cantidad,costo_unitario,montos,programas,socios,proyecto_id) VALUES(?,?,?,?,?,?,?,?,?)");
                consulta.setInt(1,p.getActivo_id());
                consulta.setString(2,p.getNombre());
                consulta.setString(3,p.getUnidad());
                consulta.setDouble(4,p.getCantidad());
                consulta.setDouble(5, p.getCosto_unitario());
                consulta.setDouble(6,p.getMontos());
                consulta.setDouble(7,p.getProgramas());
                consulta.setDouble(8,p.getSocios());
                consulta.setInt(9,p.getProyecto_id());
            }else{
                consulta= conexion.prepareStatement("UPDATE "+this.tabla+
                        " SET activo_id=?, nombre=?, unidad=?, cantidad=?, costo_unitario=?, montos=?, programas=?, socios=?, proyecto_id=? WHERE id_concepto=?");
                consulta.setInt(1,p.getActivo_id());
                consulta.setString(2,p.getNombre());
                consulta.setString(3,p.getUnidad());
                consulta.setDouble(4,p.getCantidad());
                consulta.setDouble(5, p.getCosto_unitario());
                consulta.setDouble(6,p.getMontos());
                consulta.setDouble(7,p.getProgramas());
                consulta.setDouble(8,p.getSocios());
                consulta.setInt(9,p.getProyecto_id());
                consulta.setInt(10, p.getId_concepto());
            }   
            consulta.executeUpdate();
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
    }
    //Los códigos enseguida para obtener, eliminar, y obtener todos, son basadas con la misma estructura anterior
    
    public PresupInversion obtenerPorId(Connection conexion, Integer id_concepto) throws SQLException{
        PresupInversion presup = null;
        try{
            PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM "+this.tabla+" WHERE id_concepto=?");
            consulta.setInt(1,id_concepto);
            ResultSet resultado = consulta.executeQuery();
            while(resultado.next()){
                presup = new PresupInversion(id_concepto,resultado.getInt("activo_id"),resultado.getString("nombre"),
                        resultado.getString("unidad"),resultado.getDouble("cantidad"),resultado.getDouble("costo_unitario"),
                        resultado.getDouble("montos"),resultado.getDouble("programas"),resultado.getDouble("socios"),
                        resultado.getInt("proyecto_id"));
            }
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
        return presup;
    }
    
    public void eliminar(Connection conexion, Integer id_concepto) throws SQLException{
        try{
            PreparedStatement consulta = conexion.prepareCall("DELETE FROM "+this.tabla+" WHERE id_concepto=?");
            consulta.setInt(1,id_concepto);
            consulta.execute();
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
    }
    
    public List<PresupInversion> obtenerTodos(Connection conexion) throws SQLException{
        List<PresupInversion> conceptos = new ArrayList<>();
        try{
            PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM "+this.tabla);
            ResultSet resultado = consulta.executeQuery();
            while(resultado.next()){
                conceptos.add(new PresupInversion(resultado.getInt("id_concepto"),resultado.getInt("activo_id"),resultado.getString("nombre"),resultado.getString("unidad"),resultado.getDouble("cantidad"),resultado.getDouble("costo_unitario"),resultado.getDouble("montos"),resultado.getDouble("programas"),resultado.getDouble("socios"),resultado.getInt("proyecto_id")));
            }
        }catch(SQLException ex){
            throw new SQLException(ex);
        }                
        return conceptos;
    }
}
