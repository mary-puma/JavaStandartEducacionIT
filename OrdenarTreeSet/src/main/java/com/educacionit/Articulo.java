package com.educacionit;

import java.util.Comparator;

public class Articulo implements Comparable<Articulo>, Comparator<Articulo> {

    private int numero;
    private  String descripcion;

    public Articulo(int numero, String descripcion) {
        this.numero = numero;
        this.descripcion = descripcion;
    }

    public Articulo(){

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int compareTo(Articulo o) {
        return this.numero - o.numero;
    }


    @Override
    public int compare(Articulo o1, Articulo o2) {

        return o1.getDescripcion().compareTo(o2.getDescripcion());
    }
}
