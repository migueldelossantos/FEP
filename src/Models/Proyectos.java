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
public class Proyectos {
    private Integer id_proyecto;
    private String nombre;
    private String estado;
    private Integer usuario_id;

    public Proyectos() {
        this.id_proyecto = null;
        this.nombre = null;
        this.estado = null;
        this.usuario_id = null;
    }
    
    public Proyectos(Integer id_proyecto, String nombre, String estado, Integer usuario_id) {
        this.id_proyecto = id_proyecto;
        this.nombre = nombre;
        this.estado = estado;
        this.usuario_id = usuario_id;
    }

    public Integer getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(Integer id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Integer usuario_id) {
        this.usuario_id = usuario_id;
    }

    @Override
    public String toString() {
        return "Proyectos{" + "id_proyecto=" + id_proyecto + ", nombre=" + nombre + ", estado=" + estado + ", usuario_id=" + usuario_id + '}';
    }
}
