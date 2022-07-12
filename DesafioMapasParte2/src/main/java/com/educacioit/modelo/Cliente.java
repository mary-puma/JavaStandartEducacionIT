package com.educacioit.modelo;

import java.util.List;

public class Cliente {

    private Documento documento;
    private String descripcion;
    private List<String> productos;

    public Cliente(Documento documento, String descripcion, List<String> productos) {
        this.documento = documento;
        this.descripcion = descripcion;
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "documento=" + documento +
                ", descripcion='" + descripcion + '\'' +
                ", productos=" + productos +
                '}';
    }

    public Documento getDocumento() {
        return documento;
    }
}
