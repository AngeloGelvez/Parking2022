package com.turboparking.entidades;

/**
 *
 * @author Flia Almeida
 */
public class Persona {
    private Integer identificacion;
    private String nombre;
    private String capacidad;
    private String nacionalidad;

    public Persona(Integer identificacion, String nombre, String capacidad, String nacionalidad) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nacionalidad = nacionalidad;
    }
}
