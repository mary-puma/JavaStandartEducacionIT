package com.educacionit;

import java.util.Objects;

public final class Documento {
    private String tipoDoc;
    private Integer numeroDoc;

    public Documento(String tipoDoc, Integer numeroDoc) {
        this.tipoDoc = tipoDoc;
        this.numeroDoc = numeroDoc;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "tipoDoc='" + tipoDoc + '\'' +
                ", numeroDoc=" + numeroDoc +
                '}';
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((numeroDoc == null) ? 0 : numeroDoc.hashCode());
        result = prime * result + ((tipoDoc == null) ? 0 : tipoDoc.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //if (o == null || getClass() != o.getClass()) return false;
        Documento documento = (Documento) o;
        return Objects.equals(tipoDoc, documento.tipoDoc) && Objects.equals(numeroDoc, documento.numeroDoc);
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public Integer getNumeroDoc() {
        return numeroDoc;
    }
}
