package com.educacionit;

public class Empleado {

    private String nombre;
    private String apellido;
    private int edad;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}
