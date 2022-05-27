package com.educacionit;

public final class Documento {
    private String tipoDoc;
    private int numDoc;

    public Documento(String tipoDoc, int numDoc) {
        this.tipoDoc = tipoDoc;
        this.numDoc = numDoc;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "tipoDoc='" + tipoDoc + '\'' +
                ", numDoc=" + numDoc +
                '}';
    }
}
