package com.educacionit;

public abstract class Persona implements IPersistencia,IDireccionesIP {

    private static int contador = 0;
    private int id;
    private String nombre;
    private String apellido;
    private Documento documento;
    private byte edad;


    public Persona(String nombre,String apellido,Documento documento,byte edad) {
        contador++;
        this.id = contador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.edad = edad;

    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", documento=" + documento +
                ", edad=" + edad +
                '}';
    }

    public static int getContador() {
        return contador;
    }
    public void mostrarConstantesDeLaInterface(){
        System.out.println(IPBASEDEDATO);
        System.out.println(IPSERVICIODOS);
        System.out.println(IPSERVICIOUNO);
        System.out.println(IPSERVICIOTRES);
    }
}

