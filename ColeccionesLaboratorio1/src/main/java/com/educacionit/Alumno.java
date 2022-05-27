package com.educacionit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Alumno extends Persona{

    private  String[] cursos;
    private Date fechaIng;

    public Alumno(String nombre, String apellido, Documento documento, Date fechaNac,  String[] cursos, Date fechaIng) {
        super(nombre, apellido, documento, fechaNac);
        this.cursos = cursos;
        this.fechaIng = fechaIng;
    }


    @Override
    public String mostrarNombreYTipoPersona() {
        return "Alumno: "+ getNombre()+" "+getApellido();
    }

    @Override
    public String toString() {
        return "Alumno{" +
                super.toString()+
                "cursos=" + Arrays.toString(cursos) +
                ", fechaIng=" + fechaIng +
                '}';
    }
}
