package com.educacioit.modelo;

import java.util.Objects;

public class Documento {

    private String tipoDoc;
    private int dni;

    public Documento(String tipoDoc, int dni) {
        this.tipoDoc = tipoDoc;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "tipoDoc='" + tipoDoc + '\'' +
                ", dni=" + dni +
                '}';
    }

    public int getDni() {
        return dni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Documento documento = (Documento) o;
        return dni == documento.dni && tipoDoc.equals(documento.tipoDoc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoDoc, dni);
    }
}
