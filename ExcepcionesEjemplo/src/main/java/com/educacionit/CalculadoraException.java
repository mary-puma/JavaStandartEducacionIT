package com.educacionit;

public class CalculadoraException extends RuntimeException{
    private String descripcion;

    public CalculadoraException(String descripcion){
        setDescripcion(descripcion);
    }

    public String getMessage(){
        return getDescripcion();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
