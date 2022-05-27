package com.educacionit.entidades;

import java.util.Date;

public abstract class Empleado extends Persona {


    private Date fechaIng;
    private float sueldo;

    public Empleado(String nombre, String apellido, Documento documento, Date fechaNacimiento, Date fechaIng,float sueldo) {
        super(nombre, apellido, documento, fechaNacimiento);
        this.fechaIng = fechaIng;
        this.sueldo = sueldo;
    }

    public Empleado() {

    }

    @Override
    public String toString() {
        return "Empleado{" +
                "toString()=" + super.toString()+
                "fechaIng=" + fechaIng +
                ", sueldo=" + sueldo +
                '}';
    }

    public Date getFechaIng() {
        return fechaIng;
    }

    public void setFechaIng(Date fechaIng) {
        this.fechaIng = fechaIng;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
}
