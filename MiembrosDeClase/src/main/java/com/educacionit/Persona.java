package com.educacionit;

import java.util.Random;

public class Persona {

    private int id;
    private String nombre;
    private String apellido;
    private Documento documento;
    private byte edad;
    private static int contador = 0;

    //colocamos el contador para que ningun objeto quede sin id
    public Persona(){
        contador++;
        id = contador;
    }

    public Persona(String nombre,String apellido,Documento documento) {
        contador++;
        this.id = contador;
        this.apellido = apellido;
        this.nombre = nombre;
        this.documento = documento;
        this.edad = asignarEdad();

    }
    public byte asignarEdad(){
        Random nuevaEdad = new Random();
        return (byte) nuevaEdad.nextInt(127);
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public static void setContador(int contador) {
        Persona.contador = contador;
    }
    public String mostrarAtributos(){
        String mensaje = "nombre: "+ nombre+ " apellido: "+apellido+" id: "+id+" edad: "+edad+documento.mostrarAtributos();
        return  mensaje;
    }

    public static int getContador() {
        return contador;
    }
}
