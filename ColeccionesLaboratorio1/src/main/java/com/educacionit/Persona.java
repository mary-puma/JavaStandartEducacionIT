package com.educacionit;

import java.util.Date;
import java.util.Objects;

public abstract class  Persona{

    private String nombre;
    private String apellido;
    private Documento documento;
    private Date fechaNac;

    public Persona(String nombre, String apellido, Documento documento, Date fechaNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.fechaNac = fechaNac;
    }

    public abstract String mostrarNombreYTipoPersona();

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

    public Documento getDocumento() {
        return documento;
    }

    public Date getFechaNac() {
        return fechaNac;
    }
}
