package com.example.apiclientes.controllers;

import com.example.apiclientes.entities.ClienteEntity;
import com.example.apiclientes.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClienteController {

    private final ClienteService clienteService;
    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }
    @GetMapping("clientes")
    public List<ClienteEntity>getClientes(){
        return clienteService.getClientes();
    }
    @GetMapping("clientes/empresa/{empresa}")
    public List<ClienteEntity>buscarClientesPorEmpresa(@PathVariable String empresa){
        return clienteService.buscarClientesPorEmpresa(empresa);
    }

    @GetMapping("clientes/nombre/{nombre}")
    public List<ClienteEntity>buscarClientesPorNombreContaining(@PathVariable String nombre){
        return clienteService.buscarClientesPorNombreContaining(nombre);
    }

    @GetMapping("clientes/id/{id}")
    public ClienteEntity buscarPorId(@PathVariable String id){
        if(id != null){
            Integer unId = Integer.valueOf(id);
            return clienteService.findById(unId);

        }else return null;

    }
}
