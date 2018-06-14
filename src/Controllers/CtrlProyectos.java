/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.sql.Connection;
import Models.Proyectos;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author miguel
 */
public class CtrlProyectos {
    //Nombre de la tabla a la que hace referencia en la base de datos
    private final String tabla = "proyectos";
    
    public void guardar(Connection conexion, Proyectos proyecto) throws SQLException{
        try{
            PreparedStatement consulta;
            if(proyecto.getId_proyecto() == null){
                consulta = conexion.prepareStatement("INSERT INTO "+this.tabla+" (nombre,estado,usuario_id) VALUES(?,?,?)");
                consulta.setString(1,proyecto.getNombre());
                consulta.setString(2,proyecto.getEstado());
                consulta.setInt(3,proyecto.getUsuario_id());
            }else{
                //Los datos para realizar la actualización, con la misma estructura que la anterior
                consulta= conexion.prepareStatement("UPDATE "+this.tabla+" SET nombre=?, estado=? WHERE id_proyectos=?");
                consulta.setString(1,proyecto.getNombre());
                consulta.setString(2,proyecto.getEstado());
                consulta.setInt(3,proyecto.getId_proyecto());
            }   
            consulta.executeUpdate();
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
    }
    
    public List obtenerTodos(Connection conexion) throws SQLException{
        List<Proyectos> proyectos  = new ArrayList<>();
        try{
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("SELECT * FROM "+this.tabla+" ");
            ResultSet result = consulta.executeQuery();
            while(result.next()){
                proyectos.add(new Proyectos(result.getInt("id_proyectos"),result.getString("nombre"),result.getString("estado"),result.getInt("usuario_id")));
            }
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
        return proyectos;
    }
}
