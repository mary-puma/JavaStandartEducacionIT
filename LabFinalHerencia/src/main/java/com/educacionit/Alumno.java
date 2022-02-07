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

    @Override
    public void guardar() {
        System.out.println("se guardo exitosamente el alumno en la base de datos");
    }

    @Override
    public void eliminar() {
        System.out.println("se borro exitosamente el alumno en la base de datos");
    }

    @Override
    public void modificar() {
        System.out.println("se modifico exitosamente el alumno en la base de datos");
    }
}
