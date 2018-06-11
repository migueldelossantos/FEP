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
public class Memoria_costos {
    private Integer id_concepto;
    private Integer categoria_id;
    private String nombre;
    private String u_m;
    private Double volumen;
    private Double costo_unitario;
    private Double total;
    private Integer proyecto_id;

    public Memoria_costos() {
        this.id_concepto = null;
        this.categoria_id = null;
        this.nombre = null;
        this.u_m = null;
        this.volumen = null;
        this.costo_unitario = null;
        this.total = null;
        this.proyecto_id = null;
    }
    
    public Memoria_costos(Integer id_concepto, Integer categoria_id, String nombre, String u_m, Double volumen, Double costo_unitario, Double total, Integer proyecto_id) {
        this.id_concepto = id_concepto;
        this.categoria_id = categoria_id;
        this.nombre = nombre;
        this.u_m = u_m;
        this.volumen = volumen;
        this.costo_unitario = costo_unitario;
        this.total = total;
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

    public String getU_m() {
        return u_m;
    }

    public void setU_m(String u_m) {
        this.u_m = u_m;
    }

    public Double getVolumen() {
        return volumen;
    }

    public void setVolumen(Double volumen) {
        this.volumen = volumen;
    }

    public Double getCosto_unitario() {
        return costo_unitario;
    }

    public void setCosto_unitario(Double costo_unitario) {
        this.costo_unitario = costo_unitario;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Integer getProyecto_id() {
        return proyecto_id;
    }

    public void setProyecto_id(Integer proyecto_id) {
        this.proyecto_id = proyecto_id;
    }

    @Override
    public String toString() {
        return "Memoria_costos{" + "id_concepto=" + id_concepto + ", categoria_id=" + categoria_id + ", nombre=" + nombre + ", u_m=" + u_m + ", volumen=" + volumen + ", costo_unitario=" + costo_unitario + ", total=" + total + ", proyecto_id=" + proyecto_id + '}';
    }
    
}
