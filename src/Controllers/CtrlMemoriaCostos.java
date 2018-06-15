/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.MemoriaCostos;
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
public class CtrlMemoriaCostos {
    //Nombre de la tabla a la que hace referencia en la base de datos
    private final String tabla = "memoria_costos";
    
    //Método para guardar o actualizar un registro
    //Necesitas la coxecion y un objeto Usuario en este caso, sus datos
    public void guardar(Connection conexion, MemoriaCostos mc) throws SQLException{
        //Todo el codigo colocado dentro de un Try-Catch para validar si no hubo errores en la ejecucion de las cosultas
        try{
            //PreparedStatement es un objeto para ejecutar una consulta
            PreparedStatement consulta;
            //Para verificar si es actualización o cración, si el id del usuario es nulo, entonces se creara uno nuevo
            if(mc.getId_concepto()== null){
                //consulta almacena la consulta como objeto, y prepareStatement es la instrucción en sql
                consulta = conexion.prepareStatement("INSERT INTO "+this.tabla+"(categoria_id,nombre,u_m,volumen,costo_unitario,total,proyecto_id) VALUES(?,?,?,?,?,?,?)");
                //Las lineas enseguida, colocan un valor en los signos de interrogacion de cierre introducidos en la linea anterios
                consulta.setInt(1,mc.getCategoria_id());
                consulta.setString(2,mc.getNombre());
                consulta.setString(3,mc.getU_m());
                consulta.setDouble(4,mc.getVolumen());
                consulta.setDouble(5,mc.getCosto_unitario());
                consulta.setDouble(6,mc.getTotal());
                consulta.setInt(7,mc.getProyecto_id());
                //la intruccion depende del tipo de dato, setString para cadena, setInt para entero, etc.
            }else{
                //Los datos para realizar la actualización, con la misma estructura que la anterior
                consulta= conexion.prepareStatement("UPDATE "+this.tabla+" SET categoria_id=?, nombre=?, u_m=?, volumen=?, costo_unitario=?, total=?, proyecto_id=? WHERE id_memoria=?");
                consulta.setInt(1,mc.getCategoria_id());
                consulta.setString(2,mc.getNombre());
                consulta.setString(3,mc.getU_m());
                consulta.setDouble(4,mc.getVolumen());
                consulta.setDouble(5,mc.getCosto_unitario());
                consulta.setDouble(6,mc.getTotal());
                consulta.setInt(7,mc.getProyecto_id());
                consulta.setInt(8,mc.getId_concepto());
            }   
            consulta.executeUpdate();
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
    }
    //Los códigos enseguida para obtener, eliminar, y obtener todos, son basadas con la misma estructura anterior
    
    public MemoriaCostos obtenerPorId(Connection conexion, Integer id_concepto) throws SQLException{
        MemoriaCostos mc = null;
        try{
            PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM "+this.tabla+" WHERE id_memoria=?");
            consulta.setInt(1,id_concepto);
            ResultSet resultado = consulta.executeQuery();
            while(resultado.next()){
                mc = new MemoriaCostos(id_concepto,resultado.getInt("categoria_id"),resultado.getString("nombre"),resultado.getString("u_m"),resultado.getDouble("volumen"),resultado.getDouble("costo_unitario"),resultado.getDouble("total"),resultado.getInt("proyecto_id"));
            }
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
        return mc;
    }
    
    public void eliminar(Connection conexion, Integer id_concepto) throws SQLException{
        try{
            PreparedStatement consulta = conexion.prepareCall("DELETE FROM "+this.tabla+"WHERE id_memoria=?");
            consulta.setInt(1,id_concepto);
            consulta.executeQuery();
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
    }
    
    public List<MemoriaCostos> obtenerTodos(Connection conexion) throws SQLException{
        List<MemoriaCostos> conceptos = new ArrayList<>();
        try{
            PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM "+this.tabla);
            ResultSet resultado = consulta.executeQuery();
            while(resultado.next()){
                conceptos.add(new MemoriaCostos(resultado.getInt("id_memoria"),resultado.getInt("categoria_id"),resultado.getString("nombre"),resultado.getString("u_m"),resultado.getDouble("volumen"),resultado.getDouble("costo_unitario"),resultado.getDouble("total"),resultado.getInt("proyecto_id")));
            }
        }catch(SQLException ex){
            throw new SQLException(ex);
        }                
        return conceptos;
    }
}
