package com.educacionit;

public class Profesor extends Persona{

    private int sueldo;

    public Profesor(String nombre, String apellido, Documento documento, byte edad, int sueldo) {
        super(nombre, apellido, documento, edad);
        this.sueldo = sueldo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public void guardar() {
        System.out.println("se guardo exitosamente el profesor en la base de datos");
    }

    @Override
    public void eliminar() {
        System.out.println("se borro exitosamente el profesor en la base de datos");
    }

    @Override
    public void modificar() {
        System.out.println("se modifico exitosamente el profesor en la base de datos");
    }
}
