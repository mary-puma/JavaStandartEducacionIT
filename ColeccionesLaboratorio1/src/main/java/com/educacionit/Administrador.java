package com.educacionit;

import java.util.Date;

public class Administrador extends  Empleado{

    public Administrador(String nombre, String apellido, Documento documento, Date fechaNac, Date fechaCargo, float sueldo) {
        super(nombre, apellido, documento, fechaNac, fechaCargo, sueldo);
    }

    @Override
    public String mostrarNombreYTipoPersona() {
        return "Administrador: "+getNombre()+" "+getApellido();
    }


}
