package com.educacionit.model;

public class Docente extends Persona{

    private int legajo;
    private  String carrera;

    public Docente(){
    }

    public Docente(String nombre, String apellido, int dni, String correo, String direccion, int legajo,String carrera) {
        super(nombre, apellido, dni, correo, direccion);
        this.legajo = legajo;
        this.carrera = carrera;
    }

    public String publicarNotas(){
        return "las notas publicadas son 123..";
    }

    @Override
    public String toString() {
        return super.toString()+" Docente{" +
                "legajo=" + legajo +
                ", carrera='" + carrera + '\'' +
                '}';
    }
    //polimorfismo
    public void iniciar(){
        super.iniciar();
        System.out.println("hola docente");
    }
}
