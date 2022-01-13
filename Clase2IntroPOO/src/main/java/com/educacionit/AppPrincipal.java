package com.educacionit;

public class AppPrincipal {
    public static void main(String[] args) {
        //instanciamos 3 objetos de la clase Auto

        Auto a1 = new Auto();
        //modificamos el estado de los atributos del objeto a1

        System.out.println("-----------------objeto a1 : estado inicial de sus atributos ---------");
        System.out.println("color : " + a1.color);
        System.out.println("cantidadPuertas : " + a1.cantidadPuertas);
        System.out.println("marca : " + a1.marca);
        System.out.println("modelo : " + a1.modelo);
        System.out.println("anio :" + a1.anio);
        System.out.println("cilindrada :" + a1.cilindrada);
        System.out.println("precio :" + a1.precio);

        // modificamos el estado de los atributos del objeto a1
        a1.color = "rojo";
        a1.cantidadPuertas = 3;
        a1.marca = "Alfa Romeo";
        a1.modelo = "Giuletta";
        a1.anio = 2019;
        a1.cilindrada = 3.0f;
        a1.precio = 15000;

        System.out.println("-----------------objeto a1 : estado de sus atributos ---------");
        System.out.println("color : " + a1.color);
        System.out.println("cantidadPuertas : " + a1.cantidadPuertas);
        System.out.println("marca : " + a1.marca);
        System.out.println("modelo : " + a1.modelo);
        System.out.println("anio :" + a1.anio);
        System.out.println("cilindrada :" + a1.cilindrada);
        System.out.println("precio :" + a1.precio);

        Auto a2 = new Auto();
        System.out.println("-----------------objeto a2 : estado inicial de sus atributos ---------");
        System.out.println("color : " + a2.color);
        System.out.println("cantidadPuertas : " + a2.cantidadPuertas);
        System.out.println("marca : " + a2.marca);
        System.out.println("modelo : " + a2.modelo);
        System.out.println("anio :" + a2.anio);
        System.out.println("cilindrada :" + a2.cilindrada);
        System.out.println("precio :" + a2.precio);

        Auto a3 = new Auto();

        //tarea : modificar el estados de los atributos de a2 y a3 siguiendo el Diagrama de clases
    }
}
