package com.example.apiclientes.entities;

import javax.persistence.*;

@Entity
@Table(name = "productos")
public class ProductoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_producto;
    private Integer codigo_producto;
    private String nombre;
    private String descripcion;
    private String categoria;
    private Double precio;

    public ProductoEntity() {
    }

    public ProductoEntity(Integer idProducto, Integer codigoProducto, String nombre, String descripcion, String categoria, Double precio) {
        this.id_producto = idProducto;
        this.codigo_producto = codigoProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precio = precio;
    }

    public Integer getId_producto() {
        return id_producto;
    }

    public void setId_producto(Integer idProducto) {
        this.id_producto = idProducto;
    }

    public Integer getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(Integer codigoProducto) {
        this.codigo_producto = codigoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ProductoEntity{" +
                "idProducto=" + id_producto +
                ", codigoProducto=" + codigo_producto +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", categoria='" + categoria + '\'' +
                ", precio=" + precio +
                '}';
    }
}
