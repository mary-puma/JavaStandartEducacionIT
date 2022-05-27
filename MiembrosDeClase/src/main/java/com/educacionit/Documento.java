package com.educacionit;

public class Documento {
    private String tipoDni;
    private int numDni;

    public Documento(){

    }

    public Documento(String tipoDni,int numDni) {
        this.tipoDni = tipoDni;
        this.numDni =numDni;
    }

    public String mostrarAtributos() {
        return " tipoDocumento=" + tipoDni + ", numeroDocumento=" + numDni;
    }

    public void setTipoDni(String tipoDni) {
        this.tipoDni = tipoDni;
    }

    public void setNumDni(int numDni) {
        this.numDni = numDni;
    }
}
