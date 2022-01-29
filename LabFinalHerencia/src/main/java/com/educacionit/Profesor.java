package com.educacionit;

public class Profesor extends Persona{

    private int sueldo;

    public Profesor(String nombre, String apellido, Documento documento, byte edad, int sueldo) {
        super(nombre, apellido, documento, edad);
        this.sueldo = sueldo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}
