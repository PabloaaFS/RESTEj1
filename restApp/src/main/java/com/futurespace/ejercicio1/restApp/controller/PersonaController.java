package com.futurespace.ejercicio1.restApp.controller;

import com.futurespace.ejercicio1.restApp.model.Persona;
import com.futurespace.ejercicio1.restApp.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Define un método getPersona() anotado con @GetMapping("/persona") que
 * maneja las solicitudes GET en la ruta /persona.
 * En este método, creamos un objeto Persona con datos de ejemplo y lo devolvemos,
 * que automáticamente se serializará a JSON gracias a la anotación @RestController.
 */
@RestController
public class PersonaController {

    /**
     * Inyecta la dependencia de PersonaRepository en el controlador.
     * Esto significa que Spring se encargará de crear una instancia de PersonaRepository
     * y la asignará automáticamente al campo personaRepository del controlador.
     */
    @Autowired
    private PersonaRepository personaRepository;

    @GetMapping("/persona")
    public List<Persona> getPersona() {
        return personaRepository.getListaPersonas();

    }
}
