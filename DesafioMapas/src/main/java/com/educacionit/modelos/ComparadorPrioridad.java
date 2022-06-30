package com.educacionit.modelos;

import java.util.Comparator;

public class ComparadorPrioridad implements Comparator<Turno> {

    private static final int EDAD_PRIORIDAD = 55;

    @Override
    public int compare(Turno turno1, Turno turno2) {

        //primero se atendera a las personas mayores de 55
        //los demas seran atendidos segun el numero de turno de llegada que tienen

        if (turno1.getPersona().getEdad() >= EDAD_PRIORIDAD && turno2.getPersona().getEdad() >= EDAD_PRIORIDAD) {
            return turno1.getNumero() - turno2.getNumero();
        }
        //si la persona1 tiene mas de 55 entoces  significa que es prioridad por eso va el -1 porq
        //le decimos que turno1 es menor que turno2 es decir va a colocar primero a turno1
        if (turno1.getPersona().getEdad() >= EDAD_PRIORIDAD) {
            return -1;
        }
        //si la persona2 tiene mas de 55 entoces  significa que es prioridad por eso va el 1 porq
        //le decimos que el turno2 es menor que el turno1 es decir va a colocar primero a turno2
        if (turno2.getPersona().getEdad() >= EDAD_PRIORIDAD) {
            return 1;
        }
        return turno1.getNumero() - turno2.getNumero();
    }
}
