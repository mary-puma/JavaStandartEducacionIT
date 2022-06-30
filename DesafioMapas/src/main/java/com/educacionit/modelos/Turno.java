package com.educacionit.modelos;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Turno {

    private Persona persona;
    private Integer numero;
    private static AtomicInteger CONTADOR = new AtomicInteger(1);

    public Turno() {
        super();
        this.numero = CONTADOR.getAndIncrement();
    }

    public Turno(Persona persona) {
        super();
        this.persona = persona;
        this.numero = CONTADOR.getAndIncrement();
    }

    @Override
    public String toString() {
        return "Turno{" +
                "persona=" + persona +
                ", numero=" + numero +
                '}';
    }

    public Persona getPersona() {
        return persona;
    }

    public Integer getNumero() {
        return numero;
    }

}
