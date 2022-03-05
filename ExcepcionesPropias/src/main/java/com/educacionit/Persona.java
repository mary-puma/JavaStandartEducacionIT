package com.educacionit;

public class Persona  {

    private String nombre;
    private String apellido;
    private Documento documento;

    public Persona(String nombre, String apellido, Documento documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
    }

    public Persona() {
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                 ", " + documento.toString()+
                '}';
    }
}
