package com.example.healthtrack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
    private final IUsuario iusuario;

    @Autowired
    public UsuarioController(IUsuario iusuario) {
        this.iusuario = iusuario;
    }

    @GetMapping("/peso")
    public String getPeso() {
        return "Peso actual: " + this.iusuario.getPeso() + " kg";
    }

    @PostMapping("/actualizarPeso")
    public String actualizarPeso(@RequestParam double nuevoPeso) {
        this.iusuario.actualizarPeso(nuevoPeso);
        return "Peso actualizado a: " + this.iusuario.getPeso() + " kg";
    }

    @GetMapping("/nombre")
    public String getNombre() {
        return "Nombre del usuario: " + this.iusuario.getNombre();
    }

    @GetMapping("/informacion")
    public String mostrarInformacion() {
        this.iusuario.mostrarInformacion();
        return "Información del usuario mostrada en la consola.";
    }
}
