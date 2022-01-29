package com.educacionit.programa;

import com.educacionit.modelos.Entrenador;
import com.educacionit.modelos.Futbolista;
import com.educacionit.modelos.Masajista;
import com.educacionit.modelos.SeleccionFutbol;

import java.util.ArrayList;

public class Main {

    public static ArrayList<SeleccionFutbol> integrantes= new ArrayList<SeleccionFutbol>();
    //ArrayList de objetos SeleccionFutbol. Independiente de la clase hija a la que pertenezca
    //el objeto
    public static void main(String[] args) {

        // creamos una instancia de cada una de las clases hijas
        Entrenador delBosque = new Entrenador(1,"vicente","DelBosque",62,"29ES48");
        Futbolista iniesta = new Futbolista(2,"Andres","Iniesta",29,6,"Interior derecho");
        Masajista raulMartinez = new Masajista(3,"raul","martinez",42,"licenciado en musculatura",12);

        // agregamos todos los objetos al ArrayList de SeleccionFutbol

        integrantes.add(delBosque);
        integrantes.add(iniesta);
        integrantes.add(raulMartinez);

        //concentrarse
        System.out.println("todos los integrantes comiezan una concentracion");
         for (SeleccionFutbol integranteAux: integrantes){
             System.out.println(integranteAux.getNombre()+" "+integranteAux.getApellido());
             integranteAux.concentrarse();
             integranteAux.viajar();
         }
         //ejecutamos el codigo especifico de las clases hijas, aqui no podemos usar el for eadh para recorrer el arrayList

        //ENTRENAMIENTO
        System.out.println("Entrenaiento:Solamente el etrenador y el futbolista tienen el metodo entrenar");
        System.out.println(delBosque.getNombre()+" " + delBosque.getApellido());
        delBosque.dirigirEntrenamieto();
        System.out.println(iniesta.getNombre()+" "+iniesta.getApellido());
        iniesta.entrenar();
        //MASAJE
        System.out.println("Masaje: solamente el masajista tiene el metodo para dar masaje");
        System.out.println(raulMartinez.getNombre()+" "+raulMartinez.getApellido());
        raulMartinez.darMasaje();
        //PARTIDO FUTBOL
        System.out.println("Partido de futbol: solamente tienen el metodo para el partido de futbol");
        System.out.println(delBosque.getNombre()+" "+delBosque.getApellido());
        delBosque.dirigirPartido();
        System.out.println(iniesta.getNombre()+" "+iniesta.getApellido());
        iniesta.jugarPartido();
    }
}
