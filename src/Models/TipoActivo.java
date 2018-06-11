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
public class TipoActivo {
    private Integer id_activo;
    private String nombre;

    public TipoActivo() {
        this.id_activo = null;
        this.nombre = null;
    }
    
    public TipoActivo(Integer id_activo, String nombre) {
        this.id_activo = id_activo;
        this.nombre = nombre;
    }

    public Integer getId_activo() {
        return id_activo;
    }

    public void setId_activo(Integer id_activo) {
        this.id_activo = id_activo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Tipo_activo{" + "id_activo=" + id_activo + ", nombre=" + nombre + '}';
    }
}
