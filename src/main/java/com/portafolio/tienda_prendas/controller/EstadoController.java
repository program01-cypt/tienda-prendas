package com.portafolio.tienda_prendas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstadoController {

    @GetMapping("/")
    public String inicio() {
        return "Tienda Prendas - Aplicacion Spring Boot funcionando";
    }

    @GetMapping("/api/estado")
    public String estado() {
        return "Conexión a PostgreSQL exitosa";
    }
}
