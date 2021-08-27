package com.example.apiclientes.repositories;

import com.example.apiclientes.entities.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<ProductoEntity, Integer> {

List<ProductoEntity> findProduductosByNombreContaining(String nombre);
List<ProductoEntity> findProductosByCategoriaContaining(String categoria);
}
