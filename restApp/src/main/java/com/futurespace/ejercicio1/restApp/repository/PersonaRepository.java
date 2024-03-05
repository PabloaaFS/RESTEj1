package com.futurespace.ejercicio1.restApp.repository;

import com.futurespace.ejercicio1.restApp.model.Persona;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @Repository se utiliza para indicar que esta clase es un componente de repositorio
 * en una aplicación Spring. Esta anotación es una de las anotaciones de componentes
 * de Spring y se usa para etiquetar clases que acceden a la base de datos o realizan
 * operaciones de almacenamiento y recuperación de datos.
 */
@Repository
public class PersonaRepository {

    /**
     * Campo que almacena la lista de personas.
     */
    private List<Persona> listaPersonas;

    /**
     * Declara un constructor público public PersonaRepository(),
     * se ejecuta al crear una instancia de PersonaRepository.
     * Dentro del constructor, inicializa la lista de personas (listaPersonas) como un nuevo objeto ArrayList.
     * Agrega una persona predefinida a la lista de personas utilizando el método add() de ArrayList.
     * Esta persona tiene nombre, apellidos, fecha de nacimiento y sexo.
     */
    public PersonaRepository() {
        listaPersonas = new ArrayList<>();

        listaPersonas.add(new Persona("Luis", "Fabiano", "Clemente", LocalDate.of(1980, 11, 8), "Masculino"));
    }

    /**
     * Declara un método público getListaPersonas() que devuelve la lista de personas almacenadas en el repositorio.
     * Este método simplemente devuelve la lista de personas (listaPersonas).
     * @return
     */
    public List<Persona> getListaPersonas() {
        return listaPersonas;
    }
}
