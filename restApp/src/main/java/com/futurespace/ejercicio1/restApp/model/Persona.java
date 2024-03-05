package com.futurespace.ejercicio1.restApp.model;

import java.time.LocalDate;

/**
 * Define los atributos solicitados (nombre, primerApellido, segundoApellido, nombreCompleto, fechaNacimiento, sexo)
 * junto con sus respectivos getters y setters.
 * También calculamos el nombre completo a partir de los otros atributos en el constructor.
 */

public class Persona {
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private LocalDate fechaNacimiento;
    private String sexo;

    // Constructor, getters y setters

    public Persona() {
    }

    public Persona(String nombre, String primerApellido, String segundoApellido, LocalDate fechaNacimiento, String sexo) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombreCompleto() {
        return nombre + " " + primerApellido + " " + segundoApellido;
    }

    @Override
    public String toString() {
        return "Persona{" +
                ", nombre='" + nombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
