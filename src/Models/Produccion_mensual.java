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
public class Produccion_mensual {
    private Integer id_concepto;
    private Integer categoria_id;
    private String nombre;
    private Integer proyecto_id;

    public Produccion_mensual() {
        this.id_concepto = null;
        this.categoria_id = null;
        this.nombre = null;
        this.proyecto_id = null;
    }
    
    public Produccion_mensual(Integer id_concepto, Integer categoria_id, String nombre, Integer proyecto_id) {
        this.id_concepto = id_concepto;
        this.categoria_id = categoria_id;
        this.nombre = nombre;
        this.proyecto_id = proyecto_id;
    }

    public Integer getId_concepto() {
        return id_concepto;
    }

    public void setId_concepto(Integer id_concepto) {
        this.id_concepto = id_concepto;
    }

    public Integer getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(Integer categoria_id) {
        this.categoria_id = categoria_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getProyecto_id() {
        return proyecto_id;
    }

    public void setProyecto_id(Integer proyecto_id) {
        this.proyecto_id = proyecto_id;
    }

    @Override
    public String toString() {
        return "Produccion_mensual{" + "id_concepto=" + id_concepto + ", categoria_id=" + categoria_id + ", nombre=" + nombre + ", proyecto_id=" + proyecto_id + '}';
    }
}
