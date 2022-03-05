package com.educacionit;

public final class Documento {

    private int numDoc;
    private String tipoDoc;

    public Documento(int numDoc, String tipoDoc) {
        this.numDoc = numDoc;
        this.tipoDoc = tipoDoc;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "numDoc=" + numDoc +
                ", tipoDoc='" + tipoDoc + '\'' +
                '}';
    }
}
