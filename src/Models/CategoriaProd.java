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
public class CategoriaProd {
    private Integer id_categoria;
    private String nombre;

    public CategoriaProd() {
        this.id_categoria = null;
        this.nombre = null;
    }
    
    public CategoriaProd(Integer id_categoria, String nombre) {
        this.id_categoria = id_categoria;
        this.nombre = nombre;
    }

    public Integer getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Integer id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Categoria_prod{" + "id_categoria=" + id_categoria + ", nombre=" + nombre + '}';
    }
}
