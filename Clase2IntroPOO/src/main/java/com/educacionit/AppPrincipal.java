package com.educacionit;

public class AppPrincipal {
    public static void main(String[] args) {
        //instanciamos 3 objetos de la clase Auto

        Auto a1 = new Auto("rojo", 3, "Alfa Romeo", "Giuletta", 2019, 3.0f, 15000f);// se invoca al metodo contructor de
        System.out.println("-----------------objeto a1 : estado de sus atributos ---------");
        System.out.println(a1.toString());

        Auto a2 = new Auto("negro", 5, "Audi", "a6", 2018, 2.0f, 13000f);
        System.out.println("-----------------objeto a2 : estado de sus atributos ---------");
        System.out.println(a2.toString());

        Auto a3 = new Auto("plata", 5, "Jeep", "Grand cherokee", 2013, 6.4f, 26000f);
        System.out.println("-----------------objeto a3 : estado de sus atributos ---------");
        System.out.println(a3.toString());

        // clase 3 :utilizo los metodos en cada uno de los objetos

        System.out.println("***************** invoco a los metodos de la clase Auto con el objeto a1");
        a1.capacidadMaxCombutible = 50;
        a1.arrancar(" la llave");
        a1.acelerar(125);
        a1.frenar();
        a1.cargarCombustible(30);
        a1.cargarCombustible(30);

        System.out.println("***************** invoco a los metodos de la clase Auto con el objeto a2");
        a2.capacidadMaxCombutible = 70;
        a2.arrancar(" la tarjeta");
        a2.acelerar(175);
        a2.frenar();
        a2.cargarCombustible(30);
        a2.cargarCombustible(30);

        System.out.println("***************** invoco a los metodos de la clase Auto con el objeto a3");
        a3.capacidadActualCombutible = 5;
        a3.capacidadMaxCombutible = 100;
        a3.arrancar(" el boton");
        a3.acelerar(210);
        a3.frenar();
        a3.cargarCombustible(85);

        System.out.println("*****************  veamos los estados de los atributos ");
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());

        Auto a4 = new Auto("Chrysler", "300C");
        System.out.println(a4.toString());

    }



}
