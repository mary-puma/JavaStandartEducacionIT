package com.educacionit;
//template para luego poder instanciar objetos
public class Auto {
    // atributos de la clase : definen las caracteristicas de los objetos
    String color;
    int cantidadPuertas;
    String marca;
    String modelo;
    int anio;
    float cilindrada;
    float precio;
    float capacidadMaxCombutible;
    float capacidadActualCombutible;

    //sobrecarga de metodos constructores

    // public : modificador de acceso ,
    public Auto() {
        // constructor vacio no recibe ningun parametro , si es el unico constructor que bvoy a utilizar no hace
        // falta definirlo , exite implicitamente en todas las clases
    }

    // metodo constructor con parametros
    public Auto(String color, int cantidadPuertas, String marca, String modelo, int anio, float cilindrada,
                float precio) {
        this.color = color;
        this.cantidadPuertas = cantidadPuertas;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.cilindrada = cilindrada;
        this.precio = precio;
    }

    // metodo constructor con todos los parametros
    public Auto(String color, int cantidadPuertas, String marca, String modelo, int anio, float cilindrada,
                float precio, float capacidadMaxCombutible, float capacidadActualCombutible) {
        this.color = color;
        this.cantidadPuertas = cantidadPuertas;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.cilindrada = cilindrada;
        this.precio = precio;
        this.capacidadMaxCombutible = capacidadMaxCombutible;
        this.capacidadActualCombutible = capacidadActualCombutible;
    }


    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    //sobrecarga de metodos
    // metodos : definen el comportamiento de los objetos
    void acelerar(int kmXhs) {
        System.out.println("Estoy acelerando mi " + marca + " " + modelo + " a " + kmXhs + "kmXhs");
    }

    void acelerar() {
        System.out.println("Estoy acelerando mi " + marca + " " + modelo );
    }

    void frenar() {
        System.out.println("Estoy frenando mi " + marca + " " + modelo);
    }

    void cargarCombustible(float litrosAcargar) {
        if ((capacidadActualCombutible + litrosAcargar) <= capacidadMaxCombutible) {
            capacidadActualCombutible += litrosAcargar;
            System.out.println("Se cargo " + litrosAcargar + " litros de combustible");
            System.out.println("Capacidad actual de su tanque " + capacidadActualCombutible + " litros");
        } else {
            System.out.println("No se puede cargar " + litrosAcargar + " por que su tanque no posee tanta capacidad");

        }
    }

    void arrancar(String metodoEncendido) {
        System.out.println("Estoy encendiendo con " + metodoEncendido);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "color='" + color + '\'' +
                ", cantidadPuertas=" + cantidadPuertas +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", cilindrada=" + cilindrada +
                ", precio=" + precio +
                ", capacidadMaxCombutible=" + capacidadMaxCombutible +
                ", capacidadActualCombutible=" + capacidadActualCombutible +
                '}';
    }
}
