package com.educacionit.modelos;

//clases hijas de la clase SeleccionFutbol
public class Entrenador extends SeleccionFutbol {

    private String idFederacion;

    public Entrenador() {
        super();
    }

    public Entrenador(int id, String nombre, String apellido, int edad, String idFederacion) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

    @Override // anotacion me indica que estoy implementando un
    // meotodo que esta definido en un padre
    public void entrenamiento() {
        System.out.println("Soy un metodo abtracto implementado en la clase hija Entrenador  ( Clase entrenador )");

    }

    @Override
    public void partidoFutbol() {
        System.out.println(" dirige un Partido ( Clase entrenador ) ");
    }

    public void planificarEntrenamieto() {
        System.out.println("planifica un nuevo entrenamiento  ( Clase entrenador )  ");
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    // implemente el medoto toString de la clase Object , osea le di un
    // comportamiento
    public String toString() {
        return "Entrenador [idFederacion=" + idFederacion + ", id=" + id + ", nombre=" + nombre + ", apellido="
                + apellido + ", edad=" + edad + "]";
    }

}
