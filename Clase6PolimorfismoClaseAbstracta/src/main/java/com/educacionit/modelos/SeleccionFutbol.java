package com.educacionit.modelos;

//clase Padre Abstracta
//Una clase abstracta es aquella que se utiliza pura y exclusivamente para mecanismos de herencia
//pero no me permite instanciar objetos de ella

//new SeleccionFutbol(); //ERROOOORRR por ser abstracta

public abstract class SeleccionFutbol {

    protected int id;
    protected String nombre;
    protected String apellido;
    protected int edad;

    public SeleccionFutbol() {
    }

    public SeleccionFutbol(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void concentrarse() {
        System.out.println("clase Padre :  Concentrarse () ");
    }

    public void viajar() {
        System.out.println("clase Padre :  viajar () ");
    }

    public void partidoFutbol() {
        System.out.println("clase Padre :  partidoFutbol () ");
    }

    // IMPORTANTE -> METODO ABTRACTO : No se implementa dentro de la clase abstracta
    // pero si en la primer
    // clase hija concreta
    public abstract void entrenamiento();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
