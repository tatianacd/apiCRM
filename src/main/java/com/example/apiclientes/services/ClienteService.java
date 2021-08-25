package com.example.apiclientes.services;

import com.example.apiclientes.entities.ClienteEntity;
import com.example.apiclientes.repositories.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;


    }

    public List<ClienteEntity> getClientes(){
       return clienteRepository.findAll();
    }

    public List<ClienteEntity>buscarClientesPorEmpresa(String empresa){
        return clienteRepository.findClientesByEmpresa(empresa);
    }

    public List<ClienteEntity>buscarClientesPorNombreContaining(String nombre){
        return clienteRepository.findClientesByNombreContaining(nombre);
    }

    public ClienteEntity findById(Integer id){
        return clienteRepository.findById(id).orElse(null);
    }


}
