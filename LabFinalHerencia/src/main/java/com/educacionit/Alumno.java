package com.educacionit;

import java.util.Arrays;

public class Alumno extends Persona {

    private String [] cursos;

    public Alumno(String nombre,String apellido,Documento documento,byte edad,String [] cursos){
        super(nombre, apellido, documento, edad);
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "Alumno [toString()=" + super.toString() + ", cursos=" + Arrays.toString(cursos) + "]";
    }

    public String[] getCursos() {
        return cursos;
    }

    public void setCursos(String[] cursos) {
        this.cursos = cursos;
    }
}
