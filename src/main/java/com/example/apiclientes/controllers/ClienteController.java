package com.example.apiclientes.controllers;

import com.example.apiclientes.entities.ClienteEntity;
import com.example.apiclientes.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clientes")
public class ClienteController {

    private final ClienteService clienteService;
    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }
    @GetMapping()
    public List<ClienteEntity>getClientes(){
        return clienteService.getClientes();
    }
    @GetMapping("empresa/{empresa}")
    public List<ClienteEntity>buscarClientesPorEmpresa(@PathVariable String empresa){
        return clienteService.buscarClientesPorEmpresa(empresa);
    }

    @GetMapping("nombre/{nombre}")
    public List<ClienteEntity>buscarClientesPorNombreContaining(@PathVariable String nombre){
        return clienteService.buscarClientesPorNombreContaining(nombre);
    }

    @GetMapping("id/{id}")
    public ClienteEntity buscarPorId(@PathVariable String id){
        if(id != null){
            Integer unId = Integer.valueOf(id);
            return clienteService.findById(unId);

        }else return null;

    }

    @PostMapping()
    public ClienteEntity save(@RequestBody ClienteEntity cliente){
        clienteService.save(cliente);
        return cliente;

    }

    @DeleteMapping("{id}")
    public String deleteById(@PathVariable Integer id){
        clienteService.deleteById(id);
        return "ok";

    }

    @PostMapping("guardar")
    public ClienteEntity modificar(@RequestBody ClienteEntity cliente){
        clienteService.save(cliente);
        return cliente;
    }

}
