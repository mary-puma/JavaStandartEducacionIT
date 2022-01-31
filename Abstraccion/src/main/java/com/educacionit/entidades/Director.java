package com.educacionit.entidades;

import java.util.Date;

public class Director extends Empleado {
    private String carrera;

    public Director(String nombre, String apellido, Documento documento, Date fechaNacimiento, Date fechaIng,float sueldo, String carrera) {
        super(nombre, apellido, documento, fechaNacimiento, fechaIng,sueldo);
        this.carrera = carrera;

    }
    public String nomYAp(){
        return "Director: "+getNombre()+""+getApellido();
    }

    @Override
    public String toString() {
        return "Alumno [toString()=" + super.toString() + ", carrera=" + carrera+" ]";
    }


}
