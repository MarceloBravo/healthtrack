package com.example.healthtrack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsuarioTest {
    private Usuario usuario;

    @BeforeEach
    void setUp() {
        usuario = new Usuario("Juan", 80.0);
    }

    @Test
    void testGetNombre() {
        Assertions.assertEquals("Juan", usuario.getNombre());
    }

    @Test
    void testGetPeso() {
        Assertions.assertEquals(80.0, usuario.getPeso());
    }

    @Test
    void testActualizarPeso() {
        usuario.actualizarPeso(75.5);
        Assertions.assertEquals(75.5, usuario.getPeso());
    }

    @Test
    void testMostrarInformacion() {
        // Solo verifica que el método no lanza excepción
        usuario.mostrarInformacion();
    }
}
