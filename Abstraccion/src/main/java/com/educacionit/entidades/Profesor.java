package com.educacionit.entidades;

import java.util.Arrays;
import java.util.Date;

public class Profesor extends Empleado {
    private String[] cursos;

    public Profesor(){
        super();
    }

    public Profesor(String nombre, String apellido, Documento documento, Date fechaNacimiento, Date fechaIng, float sueldo, String[] cursos) {
        super(nombre, apellido, documento, fechaNacimiento, fechaIng, sueldo);
        this.cursos = cursos;
    }
    public String nomYAp(){
        return "Profesor: "+getNombre()+" "+getApellido();
    }
    @Override
    public String toString() {
        return "Profesor [toString()=" + super.toString() + ", cursos=" + Arrays.toString(cursos) +" ]";
    }

    public String[] getCursos() {
        return cursos;
    }

    public void setCursos(String[] cursos) {
        this.cursos = cursos;
    }
}
