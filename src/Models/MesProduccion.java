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
public class MesProduccion {
    private Integer id_mes;
    private Integer proyecto_id;
    private Integer concepto_id;
    private Double monto;

    public MesProduccion() {
        this.id_mes = null;
        this.proyecto_id = null;
        this.concepto_id = null;
        this.monto = null;
    }
    
    public MesProduccion(Integer id_mes, Integer proyecto_id, Integer concepto_id, Double monto) {
        this.id_mes = id_mes;
        this.proyecto_id = proyecto_id;
        this.concepto_id = concepto_id;
        this.monto = monto;
    }

    public Integer getId_mes() {
        return id_mes;
    }

    public void setId_mes(Integer id_mes) {
        this.id_mes = id_mes;
    }

    public Integer getProyecto_id() {
        return proyecto_id;
    }

    public void setProyecto_id(Integer proyecto_id) {
        this.proyecto_id = proyecto_id;
    }

    public Integer getConcepto_id() {
        return concepto_id;
    }

    public void setConcepto_id(Integer concepto_id) {
        this.concepto_id = concepto_id;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Mes_produccion{" + "id_mes=" + id_mes + ", proyecto_id=" + proyecto_id + ", concepto_id=" + concepto_id + ", monto=" + monto + '}';
    }
}
