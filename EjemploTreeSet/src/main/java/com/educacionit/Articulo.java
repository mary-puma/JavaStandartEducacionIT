package com.educacionit;


public class Articulo implements Comparable<Articulo> {

    private int numero_articulo;
    private  String descripcion;

    public Articulo(int num, String desc){
        this.numero_articulo = num;
        this.descripcion = desc;
    }

    @Override
    public int compareTo(Articulo o) {
        return numero_articulo - o.numero_articulo;
    }

    public int getNumero_articulo() {
        return numero_articulo;
    }

    public void setNumero_articulo(int numero_articulo) {
        this.numero_articulo = numero_articulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
