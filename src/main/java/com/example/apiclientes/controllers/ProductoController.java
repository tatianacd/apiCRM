package com.example.apiclientes.controllers;

import com.example.apiclientes.entities.ClienteEntity;
import com.example.apiclientes.entities.ProductoEntity;
import com.example.apiclientes.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoController {
    @Autowired
    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }
    @GetMapping("id/{id}")
    public ProductoEntity findById(@PathVariable String id){
        if(id !=null){
            Integer unId = Integer.valueOf(id);
            return productoService.findById(unId);
        }else return null;

    }

    @GetMapping("productos")
    public List<ProductoEntity> getProductos(){
        return productoService.getProductos();
    }

    @GetMapping("nombre/{nombre}")
    public List<ProductoEntity>findProductosByNombreContaining(@PathVariable String nombre){
        return productoService.findProductosByNombreContaining(nombre);
    }

}
