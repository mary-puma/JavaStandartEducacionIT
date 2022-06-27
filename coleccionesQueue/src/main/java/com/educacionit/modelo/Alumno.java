package com.educacionit.modelo;

import java.util.Arrays;
import java.util.Date;

public class Alumno extends Persona {
    private String[] cursos;


    public Alumno(String nombre, String apellido, int edad, Documento documento, Date fechaNac, String[] cursos) {
        super(nombre, apellido,edad, documento, fechaNac);
        this.cursos = cursos;
    }


    @Override
    public String mostrarNombreYTipoPersona() {
        return "Alumno: " + getNombre() + " " + getApellido();
    }

    @Override
    public String toString() {
        return "Alumno{" +
                super.toString() +
                "cursos=" + Arrays.toString(cursos) +
                '}';
    }
}
