package com.example.apiclientes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiClientesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiClientesApplication.class, args);
        /*Las APIs deben permitir: crear, eliminar, modificar
        o buscar productos y clientes.Para buscar productos se
        puede filtrar por código, categoria, nombre o descripcion.
        Para buscar clientes se puede filtrar por nombre, cargo,
         empresa o por mail.Deseable: crear un endpoint /buscar que "detecte"
         automáticamente el tipo de búsqueda o permita evaluar distintos atributos.Ej.:
          api/clientes/buscar/ada*/
    }

}
