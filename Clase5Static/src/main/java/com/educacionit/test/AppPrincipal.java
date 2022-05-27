package com.educacionit.test;

import com.educacionit.demo.StaticDemo;

public class AppPrincipal {
    public static void main(String[] args) {
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();

        // cada una de las instancias (obj1 y obj2)
        // tiene su propia copia de la variable x
        obj1.x = 10;
        obj2.x = 12;

        System.out.println("obj1.x y obj2.x con independientes");
        System.out.println("obj1.x = " + obj1.x);
        System.out.println("obj2.x = " + obj2.x);

        // accedo a una variable static directamente mediante el nombre de la clase
        StaticDemo.y = 1000;
        System.out.println("La variable Estatica 'y' es compartida por todas las instancias de la clase");
        System.out.println("obj1.y = " + obj1.y);
        System.out.println("obj2.y = " + obj2.y);
        System.out.println("StaticDemo.y = " + StaticDemo.y);

        obj2.y = 9999;
        System.out.println("La variable Estatica 'y' es compartida por todas las instancias de la clase");
        System.out.println("obj1.y = " + obj1.y);
        System.out.println("obj2.y = " + obj2.y);
        System.out.println("StaticDemo.y = " + StaticDemo.y);

        System.out.println("llamamos a un metodo static mediante el nombre de clase:");
        System.out.println(StaticDemo.valDiv2());
        System.out.println("llamamos a un metodo static mediante las instncias de clase:");
        System.out.println(obj1.valDiv2());
        System.out.println(obj2.valDiv2());
    }

}
