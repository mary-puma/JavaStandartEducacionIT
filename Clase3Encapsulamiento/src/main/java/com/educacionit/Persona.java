package com.educacionit;

public class Persona {
    // encalsulamos los atributos de la clase
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }
//
//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}

    public String getApellido() {
        return apellido;
    }

//	public void setApellido(String apellido) {
//		this.apellido = apellido;
//	}

    public int getEdad() {
        return edad;
    }

    private void setEdad(int edad) {
        if (edad <= 0) {
            System.out.println("error , no puede setear el valor " + edad);
        } else {
            System.out.println("la edad fue seteada correctamente ");
            this.edad = edad;
        }
    }

    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
    }
}
