package com.example.healthtrack;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UsuarioControllerFunctionalTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void testActualizarPesoEndpoint() {
        // Llama al endpoint para actualizar el peso
        double nuevoPeso = 72.5;
        String url = "http://localhost:" + port + "/api/usuario/actualizarPeso?nuevoPeso=" + nuevoPeso;
        ResponseEntity<String> response = restTemplate.postForEntity(url, null, String.class);

        assertThat(response.getStatusCode().is2xxSuccessful()).isTrue();
        assertThat(response.getBody()).contains("Peso actualizado a: 72.5 kg");
    }
}
