package com.educacionit;

public class Documento {
    private String tipodocumento;
    private int numeroDocumento;

    public Documento() {
    }

    public Documento(String tipodocumento, int numeroDocumento) {
        this.tipodocumento = tipodocumento;
        this.numeroDocumento = numeroDocumento;
    }

    public String getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(String tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String toString() {
        return "Documento [tipodocumento=" + tipodocumento + ", numeroDocumento=" + numeroDocumento + "]";
    }

}
