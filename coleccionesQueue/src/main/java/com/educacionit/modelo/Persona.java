package com.educacionit.modelo;

import java.util.Date;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private Documento documento;
    private Date fechaNac;

    public Persona(String nombre, String apellido, int edad, Documento documento, Date fechaNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.fechaNac = fechaNac;
        this.edad = edad;
    }

    public abstract String mostrarNombreYTipoPersona();

    // sobreescribimos el equals porque tenemos que especificar cuando se consideran iguales estos objetos
    //en los envoltorios como String no hace falta sobrescibir este metodo
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        //if (getClass() != obj.getClass())
        //  return false;
        Persona other = (Persona) obj;
        if (documento == null) {
            if (other.documento != null)
                return false;
        } else if (!documento.equals(other.documento))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((documento == null) ? 0 : documento.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", documento=" + documento +
                ", fechaNac=" + fechaNac +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }


}
