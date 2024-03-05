package com.futurespace.restAppPost.controller;

import com.futurespace.restAppPost.model.FormData;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormController {
    private FormData formData; // Almacenamiento en memoria

    @PostMapping("/envioformulario")
    public void recibirFormulario(FormData formData) { // Utilizamos un objeto FormData directamente como parámetro

        // Mostrar los datos en la consola
        System.out.println("Datos recibidos:");
        System.out.println("Nombre: " + formData.getNombre());
        System.out.println("Primer Apellido: " + formData.getApellido1());
        System.out.println("Segundo Apellido: " + formData.getApellido2());
        System.out.println("Fecha de Nacimiento: " + formData.getFechaNacimiento());
        System.out.println("Sexo: " + formData.getSexo());
    }
}


