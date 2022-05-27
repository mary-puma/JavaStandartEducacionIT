package com.educacionit;

import java.util.Random;

public class Persona {
    private String nombre;
    private String apellido;
    private byte edad;
    private Documento documento;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Documento documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
    }

    public Persona(String nombre, String apellido, byte edad, Documento documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = asignarEdad();
        this.documento = documento;
    }

    public byte asignarEdad() {
        Random edadGeneradaAutomaticamente = new Random();
        return (byte) edadGeneradaAutomaticamente.nextInt(127);
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento
                + "] es " + (esMayorDeEdad() ? "mayor de edad" : "menor de edad");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }
}
