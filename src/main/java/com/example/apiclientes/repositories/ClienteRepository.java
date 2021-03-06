package com.example.apiclientes.repositories;

import com.example.apiclientes.entities.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Integer> {

    List<ClienteEntity> findClientesByEmpresa(String empresa);

    List<ClienteEntity>findClientesByNombreContaining(String nombre);


}
