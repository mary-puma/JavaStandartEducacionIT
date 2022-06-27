package com.educacionit.modelo;

import java.util.Arrays;
import java.util.Date;

public class Profesor extends Empleado {

    private String[] cursos;

    public Profesor(String nombre, String apellido, int edad, Documento documento, Date fechaNac, float sueldo, String[] cursos) {
        super(nombre, apellido,edad, documento, fechaNac, sueldo);
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                super.toString()+
                "cursos=" + Arrays.toString(cursos) +
                '}';
    }

    @Override
    public String mostrarNombreYTipoPersona() {
        return "Profesor: " + getNombre() + " " + getApellido();
    }
}
