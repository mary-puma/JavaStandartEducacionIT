package com.educacionit;

import java.util.ArrayList;
import java.util.Date;

public class Profesor extends  Empleado{

    private  String[] cursos;

    public Profesor(String nombre, String apellido, Documento documento, Date fechaNac, Date fechaCargo, float sueldo,  String[] cursos) {
        super(nombre, apellido, documento, fechaNac, fechaCargo, sueldo);
        this.cursos = cursos;
    }

    @Override
    public String mostrarNombreYTipoPersona() {
        return "Profesor: "+getNombre()+" "+getApellido();
    }
}
