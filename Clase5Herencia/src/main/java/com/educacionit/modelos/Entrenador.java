package com.educacionit.modelos;

public class Entrenador extends SeleccionFutbol {

    private String idFederacion;

    public Entrenador() {
        super();
    }

    public Entrenador(int id, String nombre, String apellido, int edad, String idFederacion) {
        super(id,nombre,apellido,edad);
        this.idFederacion = idFederacion;
    }

    public void dirigirPartido() {
        System.out.println("clase entrenador: dirigirPartido()");
    }

    public void dirigirEntrenamieto() {
        System.out.println("clase entrenador: dirigirEntrenamiento() ");
    }


    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

}
