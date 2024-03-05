package com.futurespace.restAppGetPost.controller;

import com.futurespace.restAppGetPost.model.Persona;
import com.futurespace.restAppGetPost.service.Personas;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persona")
public class PersonaController {
    private Personas personas;

    // Constructor
    public PersonaController() {
        personas = new Personas();
    }

    // Endpoint para obtener datos de una persona por su DNI
    @GetMapping("/{dni}")
    public Persona obtenerPersona(@PathVariable String dni) {
        for (Persona persona : personas.getPersonas()) {
            if (persona.getDni().equals(dni)) {
                return persona;
            }
        }
        return null; // Devuelve null si no se encuentra la persona con el DNI especificado
    }

    // Endpoint para actualizar datos de una persona por su DNI
    @PutMapping("/{dni}")
    public void actualizarPersona(@PathVariable String dni, @RequestBody Persona persona) {
        personas.actualizarPersona(dni, persona);
    }
}

