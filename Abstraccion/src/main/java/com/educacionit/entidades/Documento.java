package com.educacionit.entidades;

public final class Documento {
    private String tipoDoc;
    private int numDni;

    public Documento(){
    }

    public Documento(String tipoDoc,int numDni) {
        this.tipoDoc = tipoDoc;
        this.numDni = numDni;
    }
    public String toString() {
        return "Documento [tipo=" + tipoDoc + ", numero=" + numDni + "]";
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public int getNumDni() {
        return numDni;
    }

    public void setNumDni(int numDni) {
        this.numDni = numDni;
    }
}
