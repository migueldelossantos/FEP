/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Models.Usuarios;

/**
 *
 * @author miguel
 */
public class CtrlUsuarios {
    //Nombre de la tabla a la que hace referencia en la base de datos
    private final String tabla = "usuarios";
    
    //Método para guardar o actualizar un registro
    //Necesitas la coxecion y un objeto Usuario en este caso, sus datos
    public void guardar(Connection conexion, Usuarios u) throws SQLException{
        //Todo el codigo colocado dentro de un Try-Catch para validar si no hubo errores en la ejecucion de las cosultas
        try{
            //PreparedStatement es un objeto para ejecutar una consulta
            PreparedStatement consulta;
            //Para verificar si es actualización o cración, si el id del usuario es nulo, entonces se creara uno nuevo
            if(u.getId_usuario() == null){
                //consulta almacena la consulta como objeto, y prepareStatement es la instrucción en sql
                consulta = conexion.prepareStatement("INSERT INTO "+this.tabla+"(nombre,password) VALUES(?,?)");
                //Las lineas enseguida, colocan un valor en los signos de interrogacion de cierre introducidos en la linea anterios
                consulta.setString(1,u.getNombre());
                //la intruccion depende del tipo de dato, setString para cadena, setInt para entero, etc.
                consulta.setString(2,u.getPassword());
            }else{
                //Los datos para realizar la actualización, con la misma estructura que la anterior
                consulta= conexion.prepareStatement("UPDATE "+this.tabla+" SET nombre=?, password=? WHERE id_usuario=?");
                consulta.setString(1,u.getNombre());
                consulta.setString(2,u.getPassword());
                consulta.setInt(3,u.getId_usuario());
            }   
            consulta.executeUpdate();
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
    }
    //Los códigos enseguida para obtener, eliminar, y obtener todos, son basadas con la misma estructura anterior
    
    public Usuarios obtenerPorId(Connection conexion, Integer id_usuario) throws SQLException{
        Usuarios usuario = null;
        try{
            PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM "+this.tabla+" WHERE id_usuario=?");
            consulta.setInt(1,id_usuario);
            ResultSet resultado = consulta.executeQuery();
            while(resultado.next()){
                usuario = new Usuarios(id_usuario,resultado.getString("nombre"),resultado.getString("password"));
            }
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
        return usuario;
    }
    
    public void eliminar(Connection conexion, Integer id_usuario) throws SQLException{
        try{
            PreparedStatement consulta = conexion.prepareCall("DELETE FROM "+this.tabla+"WHERE id_usuario=?");
            consulta.setInt(1,id_usuario);
            consulta.executeQuery();
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
    }
    
    public List<Usuarios> obtenerTodos(Connection conexion) throws SQLException{
        List<Usuarios> usuarios = new ArrayList<>();
        try{
            PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM "+this.tabla);
            ResultSet resultado = consulta.executeQuery();
            while(resultado.next()){
                usuarios.add(new Usuarios(resultado.getInt("id_usuario"),resultado.getString("nombre"),resultado.getString("passwordd")));
            }
        }catch(SQLException ex){
            throw new SQLException(ex);
        }                
        return usuarios;
    }
}
