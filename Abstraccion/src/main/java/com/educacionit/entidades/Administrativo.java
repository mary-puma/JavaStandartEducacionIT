package com.educacionit.entidades;

import java.util.Date;

public class Administrativo extends Empleado {

    public Administrativo(String nombre, String apellido, Documento documento, Date fechaNacimiento, Date fechaIng, float sueldo) {
        super(nombre, apellido, documento, fechaNacimiento, fechaIng, sueldo);
    }
    public String nomYAp(){
        return "Administrativo: "+getNombre()+" "+getApellido();
    }
    @Override
    public String toString() {
        return "Alumno [toString()=" + super.toString() +" ]";
    }
}
