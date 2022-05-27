package com.educacionit.programa;

import java.util.ArrayList;

import com.educacionit.modelos.Entrenador;
import com.educacionit.modelos.Futbolista;
import com.educacionit.modelos.Masajista;
import com.educacionit.modelos.SeleccionFutbol;

public class Main {

    // ArrayList de objetos SeleccionFutbol. Independientemente de la clase hija a
    // la que pertenezca el objeto
    public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

    public static void main(String[] args) {

        // creamos una instancia de cada una de las clases hijas
        SeleccionFutbol delBosque = new Entrenador(1, "Vicente", "Del Bosque", 62, "29ES48");
        SeleccionFutbol iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
        SeleccionFutbol raulMartinez = new Masajista(3, "Raul", "Martinez", 42, "Licenciado en Musculatura", 12);

        // agregamos todos los objetos al ArrayList de SeleccionFutbol
        integrantes.add(delBosque);
        integrantes.add(iniesta);
        integrantes.add(raulMartinez);

        // CONCENTRARSE
        System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo metodo)");

        for (SeleccionFutbol integranteAux : integrantes) {
            System.out.println(integranteAux.getNombre() + " " + integranteAux.getApellido());
            integranteAux.concentrarse();
        }

        // VIAJAR
        System.out.println("Todos los integrantes viajaron a jugar un partido . (Todos ejecutan el mismo metodo)");

        for (SeleccionFutbol integranteAux : integrantes) {// for each
            System.out.println(integranteAux.getNombre() + " " + integranteAux.getApellido());
            integranteAux.viajar();
        }

        // ENTRENAMIENTO
        System.out.println(
                "ENTRENAMIENTO : Todos los integrantes cumplen una funcion en un entrenamiento . (Especializacion)");

        for (SeleccionFutbol integranteAux : integrantes) {// for each
            System.out.println(integranteAux.getNombre() + " " + integranteAux.getApellido());
            integranteAux.entrenamiento();
        }

        // Partido De Futbol
        System.out.println(
                " Partido De Futbol : Todos los integrantes cumplen una funcion en un entrenamiento . (Especializacion)");

        for (SeleccionFutbol integranteAux : integrantes) {// for each
            System.out.println(integranteAux.getNombre() + " " + integranteAux.getApellido());
            integranteAux.partidoFutbol();
        }

//
//		Por último vamos a ver que cada uno de los objetos puede ejecutar métodos propios que solamente ellos los tienen como son el caso de "planificarEntrenamiento(), entrevista() y  darMasaje()" que solo los pueden ejecutar objetos de la clase Entrenador, Futbolista y Masajista respectivamente:

        // Planificar Entrenamiento
        System.out.println(" Planificar Entrenamiento : solo el entrenador puede planificar ");
        System.out.println(delBosque.getNombre() + " " + delBosque.getApellido());
        ((Entrenador) delBosque).planificarEntrenamieto();

        // Entrevista
        System.out.println(" Entrevista : solo el futbolista puede dar una entrevista ");
        System.out.println(iniesta.getNombre() + " " + iniesta.getApellido());
        ((Futbolista) iniesta).entrevista();

        // masaje
        System.out.println(" masaje : solo el masajista puede dar los masajes ");
        System.out.println(raulMartinez.getNombre() + " " + raulMartinez.getApellido());
        ((Masajista) raulMartinez).darMasaje();
        ;

    }

}
