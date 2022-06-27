package com.educacionit;

import java.util.TreeSet;

public class App {

    public static void main(String[] args) {

        //la clase string implementa la interface comparable
        TreeSet<String> ordenaPersonas = new TreeSet<>();

        ordenaPersonas.add("Sandra");
        ordenaPersonas.add("Amanda");
        ordenaPersonas.add("Diana");
        ordenaPersonas.add("mary");

        //los ordena porque el objeto es de tipo String
        for (String persona : ordenaPersonas) {
            System.out.println(persona);

        }

        Articulo articulo1 = new Articulo(1, "mesa");
        Articulo articulo2 = new Articulo(2, "silla");
        Articulo articulo3 = new Articulo(3, "cama");
        Articulo articulo4 = new Articulo(4, "tenedor");

        TreeSet<Articulo> articulos = new TreeSet<>();
        articulos.add(articulo3);
        articulos.add(articulo1);
        articulos.add(articulo2);
        articulos.add(articulo4);

        System.out.println("articulos ordenados por numero de articulo");

        for (Articulo art : articulos) {
            System.out.println(art.getDescripcion());

        }

    }

}
