package com.educacionit;

import java.util.Date;

public abstract class Empleado extends Persona {
    private Date fechaCargo;
    private float sueldo;

    public Empleado(String nombre, String apellido, Documento documento, Date fechaNac, Date fechaCargo, float sueldo) {
        super(nombre, apellido, documento, fechaNac);
        this.fechaCargo = fechaCargo;
        this.sueldo = sueldo;
    }
}
