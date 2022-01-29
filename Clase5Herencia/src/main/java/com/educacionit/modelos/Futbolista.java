package com.educacionit.modelos;

public class Futbolista extends SeleccionFutbol {

    private int dorsal;
    private String demarcacion;

    public Futbolista() {
        super();
    }

    public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion) {
       super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }


    public void jugarPartido() {
        System.out.println("clase futbolista: jugar partido()");

    }

    public void entrenar() {
        System.out.println("clase futbolista: entrenar()");

    }


    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

}

