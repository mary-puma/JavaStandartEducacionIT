package com.educacionit;

/*Crear un programa que posea una clase Persona que posea las siguientes
características: Documento, Nombre, apellido, edad.
El programa debe simular una cola virtual y asignar un orden de llegada a cada
persona para ello deberá tener las siguientes consideraciones:
-No podrá permitir duplicados por documento.
-Las personas mayores a 55 años se atienden primero, tomando en cuenta
que si hay más de una persona que cumpla este requisito deberá ser
atendida según cómo ingresaron.
-Mostrar por consola quien se atendió y quien se está por atender cada 2
segundos
*/

import com.educacionit.modelos.ComparadorPrioridad;
import com.educacionit.modelos.Persona;
import com.educacionit.modelos.Turno;

import java.util.PriorityQueue;
import java.util.Queue;

public class App {


    public static void main(String[] args) throws InterruptedException {

        int tiempoDeEspera = 2000; // en milisegundos

        Turno p1 = new Turno(new Persona("mary", "perez", 26, "1234"));
        Turno p2 = new Turno(new Persona("belen", "gonzalez", 20, "1234"));
        Turno p3 = new Turno(new Persona("micaela", "flores", 26, "789"));
        Turno p4 = new Turno(new Persona("federico", "lopez", 92, "456"));
        Turno p5 = new Turno(new Persona("luis", "acevedo", 18, "159"));
        Turno p6 = new Turno(new Persona("ariel", "martinez", 80, "369"));

        //no se aceptan duplicados por dni
        Queue<Turno> personaQueue = new PriorityQueue<>(new ComparadorPrioridad());
        personaQueue.add(p1);
        personaQueue.add(p2);
        personaQueue.add(p3);
        personaQueue.add(p4);
        personaQueue.add(p5);
        personaQueue.add(p6);

        //no usar el foreach para recorrer la cola, ya que puede que nos muestre en otro orden porque recorre de otra manera el arbol
        System.out.println("-------------------------------------------------------");
        System.out.println("          Personas en cola por atender");
        System.out.println("-------------------------------------------------------");
        while (!personaQueue.isEmpty()) {
            System.out.println("Atendiendo a:  " + personaQueue.poll());
            Thread.sleep(tiempoDeEspera);
            if (personaQueue.peek() != null) {
                System.out.println("Por Atender a: " + personaQueue.peek());
                Thread.sleep(tiempoDeEspera);
            }

        }
    }

}

