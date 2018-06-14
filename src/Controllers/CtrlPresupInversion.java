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
    
    //Método para guardar o actualizar un registro
    //Necesitas la coxecion y un objeto Usuario en este caso, sus datos
    public void guardar(Connection conexion, PresupInversion p) throws SQLException{
        //Todo el codigo colocado dentro de un Try-Catch para validar si no hubo errores en la ejecucion de las cosultas
        try{
            //PreparedStatement es un objeto para ejecutar una consulta
            PreparedStatement consulta;
            //Para verificar si es actualización o cración, si el id del usuario es nulo, entonces se creara uno nuevo
            if(p.getId_concepto()== null){
                //consulta almacena la consulta como objeto, y prepareStatement es la instrucción en sql
                consulta = conexion.prepareStatement("INSERT INTO "+this.tabla+"(activo_id,nombre,unidad,cantidad,costo_unitario,montos,programas,socios,proyecto_id) VALUES(?,?,?,?,?,?,?,?,?)");
                //Las lineas enseguida, colocan un valor en los signos de interrogacion de cierre introducidos en la linea anterios
                consulta.setInt(1,p.getActivo_id());
                consulta.setString(2,p.getNombre());
                consulta.setString(3,p.getUnidad());
                consulta.setDouble(4,p.getCantidad());
                consulta.setDouble(5, p.getCosto_unitario());
                consulta.setDouble(6,p.getMontos());
                consulta.setDouble(7,p.getProgramas());
                consulta.setDouble(8,p.getSocios());
                consulta.setInt(9,p.getProyecto_id());
                //la intruccion depende del tipo de dato, setString para cadena, setInt para entero, etc.
            }else{
                //Los datos para realizar la actualización, con la misma estructura que la anterior
                consulta= conexion.prepareStatement("UPDATE "+this.tabla+" SET activo_id=?, nombre=?, unidad=?, cantidad=?, costo_unitario=?, montos=?, programas=?, socios=?, proyecto_id=? WHERE id_concepto=?");
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
                presup = new PresupInversion(id_concepto,resultado.getInt("activo_id"),resultado.getString("nombre"),resultado.getString("unidad"),resultado.getDouble("cantidad"),resultado.getDouble("costo_unitario"),resultado.getDouble("montos"),resultado.getDouble("programas"),resultado.getDouble("socios"),resultado.getInt("proyecto_id"));
            }
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
        return presup;
    }
    
    public void eliminar(Connection conexion, Integer id_concepto) throws SQLException{
        try{
            PreparedStatement consulta = conexion.prepareCall("DELETE FROM "+this.tabla+"WHERE id_concepto=?");
            consulta.setInt(1,id_concepto);
            consulta.executeQuery();
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
