/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author miguel
 */
public class Usuarios {
    
    private Integer id_usuario;
    private String nombre;
    private String password;

    public Usuarios() {
        this.id_usuario = null;
        this.nombre = null;
        this.password = null;
    }
   
    public Usuarios(Integer id_usuario, String nombre, String password) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.password = password;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "id_usuario=" + id_usuario + ", nombre=" + nombre + ", password=" + password + '}';
    }
}
