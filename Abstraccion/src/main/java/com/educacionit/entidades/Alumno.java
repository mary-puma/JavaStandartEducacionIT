package com.educacionit.entidades;

import java.util.Arrays;
import java.util.Date;

public class Alumno extends Persona{

    private String[] cursos;
    private Date fechaIngreso;

    public Alumno(){
        super();
    }

    public Alumno(String nombre, String apellido, Documento documento, Date fechaNacimiento, String[] cursos,Date fechaIngreso) {
        super(nombre, apellido, documento, fechaNacimiento);
        this.cursos = cursos;
        this.fechaIngreso = fechaIngreso;
    }
    public String nomYAp(){
        return "Alumno: "+getNombre()+" "+getApellido();
    }
    @Override
    public String toString() {
        return "Alumno [toString()=" + super.toString() + ", cursos=" + Arrays.toString(cursos) +", fecha de ingreso "+fechaIngreso+ " ]";
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String[] getCursos() {
        return cursos;
    }

    public void setCursos(String[] cursos) {
        this.cursos = cursos;
    }

}
