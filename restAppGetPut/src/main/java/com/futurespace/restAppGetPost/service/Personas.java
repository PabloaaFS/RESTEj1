package com.futurespace.restAppGetPost.service;

import com.futurespace.restAppGetPost.model.Persona;

import java.util.ArrayList;
import java.util.List;

public class Personas {
    private List<Persona> personas;

    // Constructor
    public Personas() {
        personas = new ArrayList<>();
        // Cargar 10 personas con datos ficticios
        personas.add(new Persona("11111111A", "Juan", "González", "López", "1990-05-15", "Masculino"));
        personas.add(new Persona("22222222B", "María", "López", "García", "1985-07-20", "Femenino"));
        personas.add(new Persona("33333333C", "Pedro", "Martínez", "Fernández", "1982-12-10", "Masculino"));
        personas.add(new Persona("44444444D", "Ana", "Sánchez", "Pérez", "1995-03-25", "Femenino"));
        personas.add(new Persona("55555555E", "Carlos", "Gómez", "Jiménez", "1988-09-05", "Masculino"));
        personas.add(new Persona("66666666F", "Laura", "Rodríguez", "Ruiz", "1992-11-30", "Femenino"));
        personas.add(new Persona("77777777G", "David", "Hernández", "Díaz", "1980-08-12", "Masculino"));
        personas.add(new Persona("88888888H", "Elena", "Alvarez", "Sanchez", "1993-06-08", "Femenino"));
        personas.add(new Persona("99999999I", "Sara", "Torres", "González", "1987-04-18", "Femenino"));
        personas.add(new Persona("00000000J", "Javier", "Pérez", "López", "1984-10-03", "Masculino"));
    }

    // Getter y setter
    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    // Método para actualizar una persona por su DNI
    public void actualizarPersona(String dni, Persona persona) {
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getDni().equals(dni)) {
                personas.set(i, persona);
                break;
            }
        }
    }
}


