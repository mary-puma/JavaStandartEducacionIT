package com.educacionit.modelo;

import java.util.Date;

public abstract class Empleado extends Persona {


    private float sueldo;

    public Empleado(String nombre, String apellido,int edad, Documento documento, Date fechaNac,float sueldo) {
        super(nombre, apellido, edad,documento, fechaNac);
        this.sueldo = sueldo;
    }
}
