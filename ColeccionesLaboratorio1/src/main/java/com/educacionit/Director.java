package com.educacionit;

import java.util.Date;

public class Director extends Empleado{
    private String carrera;

    public Director(String nombre, String apellido, Documento documento, Date fechaNac, Date fechaCargo, float sueldo, String carrera) {
        super(nombre, apellido, documento, fechaNac, fechaCargo, sueldo);
        this.carrera = carrera;
    }

    @Override
    public String mostrarNombreYTipoPersona() {
        return "Director: " + getNombre()+" "+getApellido();
    }

    @Override
    public String toString() {
        return "Director{" +
                super.toString()+
                "carrera='" + carrera + '\'' +
                '}';
    }
}
