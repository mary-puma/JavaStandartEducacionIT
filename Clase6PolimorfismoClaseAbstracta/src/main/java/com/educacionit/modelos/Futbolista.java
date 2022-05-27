package com.educacionit.modelos;

//clases hijas de la clase SeleccionFutbol
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

    @Override
    public void entrenamiento() {
        System.out.println("Soy un metodo abtracto implementado en la clase hija Futbolista  ( clase Futbolista )  ");
    }

    @Override
    public void partidoFutbol() {
        System.out.println("jugar un Partido ( clase Futbolista ) ");
    }


    public void entrevista() {
        System.out.println("clase Futbolista :  dando una entrevista    ( clase Futbolista ) ");
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
