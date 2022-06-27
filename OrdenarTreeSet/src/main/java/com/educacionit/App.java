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

        System.out.println("articulos ordenados por numero de articulo:");

        for (Articulo art : articulos) {
            System.out.println(art.getNumero() + " " + art.getDescripcion());
        }

        //una clase no puede implementar dos veces el comparable ni tampoco el compareTO, por eso hacemos que implemente el comparator
        //ordenar articulos por la descripcion
        System.out.println("articulos ordenados por descripcion:");

        //podemos crear otra clase que implemente el comparator y crear una instancia de esta clase, seria lo mismo
        // y util en caso  de que la clase articulo halla sido realizada por otra persona y no halla implementado el comparator en dicha clase
        Articulo comparadorArticulos = new Articulo();
        TreeSet<Articulo> articuloTreeSet = new TreeSet<>(comparadorArticulos);

        articuloTreeSet.add(articulo3);
        articuloTreeSet.add(articulo2);
        articuloTreeSet.add(articulo4);
        articuloTreeSet.add(articulo1);

        for (Articulo art : articuloTreeSet) {
            System.out.println(art.getNumero() + " " + art.getDescripcion());
        }

    }

}

