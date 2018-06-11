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
public class Presup_inversion {
    private Integer id_concepto;
    private Integer activo_id;
    private String nombre;
    private String unidad;
    private Double cantidad;
    private Double costo_unitario;
    private Double montos;
    private Double programas;
    private Double socios;
    private Integer proyecto_id;

    public Presup_inversion() {
        this.id_concepto = null;
        this.activo_id = null;
        this.nombre = null;
        this.unidad = null;
        this.cantidad = null;
        this.costo_unitario = null;
        this.montos = null;
        this.programas = null;
        this.socios = null;
        this.proyecto_id = null;
    }
    
    public Presup_inversion(Integer id_concepto, Integer activo_id, String nombre, String unidad, Double cantidad, Double costo_unitario, Double montos, Double programas, Double socios, Integer proyecto_id) {
        this.id_concepto = id_concepto;
        this.activo_id = activo_id;
        this.nombre = nombre;
        this.unidad = unidad;
        this.cantidad = cantidad;
        this.costo_unitario = costo_unitario;
        this.montos = montos;
        this.programas = programas;
        this.socios = socios;
        this.proyecto_id = proyecto_id;
    }

    public Integer getId_concepto() {
        return id_concepto;
    }

    public void setId_concepto(Integer id_concepto) {
        this.id_concepto = id_concepto;
    }

    public Integer getActivo_id() {
        return activo_id;
    }

    public void setActivo_id(Integer activo_id) {
        this.activo_id = activo_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getCosto_unitario() {
        return costo_unitario;
    }

    public void setCosto_unitario(Double costo_unitario) {
        this.costo_unitario = costo_unitario;
    }

    public Double getMontos() {
        return montos;
    }

    public void setMontos(Double montos) {
        this.montos = montos;
    }

    public Double getProgramas() {
        return programas;
    }

    public void setProgramas(Double programas) {
        this.programas = programas;
    }

    public Double getSocios() {
        return socios;
    }

    public void setSocios(Double socios) {
        this.socios = socios;
    }

    public Integer getProyecto_id() {
        return proyecto_id;
    }

    public void setProyecto_id(Integer proyecto_id) {
        this.proyecto_id = proyecto_id;
    }

    @Override
    public String toString() {
        return "Presup_inversion{" + "id_concepto=" + id_concepto + ", activo_id=" + activo_id + ", nombre=" + nombre + ", unidad=" + unidad + ", cantidad=" + cantidad + ", costo_unitario=" + costo_unitario + ", montos=" + montos + ", programas=" + programas + ", socios=" + socios + ", proyecto_id=" + proyecto_id + '}';
    }
}
