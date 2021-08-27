package com.example.apiclientes.services;

import com.example.apiclientes.entities.ClienteEntity;
import com.example.apiclientes.entities.ProductoEntity;
import com.example.apiclientes.repositories.ClienteRepository;
import com.example.apiclientes.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public ProductoEntity findById(Integer id){
        return productoRepository.findById(id).orElse(null);
    }

    public List<ProductoEntity> getProductos(){
        return productoRepository.findAll();
    }

    public List<ProductoEntity>findProductosByNombreContaining(String nombre){
        return productoRepository.findProduductosByNombreContaining(nombre);
    }

    public List<ProductoEntity>findProductosByCategoriaContaining(String categoria){
        return productoRepository.findProductosByCategoriaContaining(categoria);
    }

}
