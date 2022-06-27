package com.educacionit.programa;

import com.educacionit.modelo.*;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class App {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        String nombre;
        String apellido;
        Date fechaDeNac, fechaCargo;
        int cant, edad;
        String[] cursos;
        String tipoDoc;
        int opcion;
        int numDoc;
        float sueldo;

        Set<Persona> personaSet = new HashSet<>();
        Persona persona = null;


        opcion = menu();
        while (opcion != 0) {

            System.out.println("ingrese el nombre de la persona: ");
            nombre = teclado.next();
            System.out.println("ingrese el apellido de la persona:");
            apellido = teclado.next();
            System.out.println("ingrese la edad:");
            edad = teclado.nextInt();
            System.out.println("ingrese la fecha de nacimiento: ");
            fechaDeNac = obtenerFecha();

            System.out.println("ingrese el tipo de documento:");
            tipoDoc = teclado.next();

            System.out.println("ingrese el numero de dni");
            numDoc = teclado.nextInt();


            switch (opcion) {
                case 1:
                    System.out.println("ingrese la cantidad de cursos ");
                    cant = teclado.nextInt();
                    cursos = cargarCursos(cant);
                    persona = new Alumno(nombre, apellido, edad, new Documento(tipoDoc, numDoc), fechaDeNac, cursos);
                    break;

                case 2:
                    System.out.println("ingrese el sueldo: ");
                    sueldo = teclado.nextFloat();
                    System.out.println("ingrese la cantidad de cursos ");
                    cant = teclado.nextInt();
                    cursos = cargarCursos(cant);
                    persona = new Profesor(nombre, apellido, edad, new Documento(tipoDoc, numDoc), fechaDeNac, sueldo, cursos);
                    break;
                case 0:
                    break;
            }

            //agregamos a las personas en una coleccionde de tipo hashset para que no halla duplicados
            // (dos personas son iguales si sus numero de documento son iguales)
            personaSet.add(persona);
            opcion = menu();

        }
        //la coleccion no esta ordenada
        for (Persona p : personaSet) {
            System.out.println(p);
        }

        //Se nos pide que después de ingresado todos las personas sean atendidas para tomar la asistencia del instituto por orden de edad de
        //mayor a menor. (debe imprimir quien será atendido y quien esta siendo atendido)
        //PriorityQueue: Este implementación almacena los elementos y los ordena según una prioridad dada, si no se le asigna prioridad asumirá que el orden de
        //los objetos será por el orden natural.

        ComparadorPrioritario comparadorPrioritario = new ComparadorPrioritario();
        Queue<Persona> personaQueue = new PriorityQueue<>(comparadorPrioritario);
        personaQueue.addAll(personaSet);

        System.out.println("orden en el que seran atendidos");
        while (!personaQueue.isEmpty()) {
            System.out.println("Por atender a " + personaQueue.peek());//devuelve el elemento al principio de la cola
            System.out.println("esta siendo atendido " + personaQueue.poll());//devuelve el elemento del principio de la cola y lo elimina

        }


    }

    private static String[] cargarCursos(int cant) {
        String[] cursos = new String[cant];
        for (int i = 0; i < cant; i++) {
            System.out.println("ingrese el nombre del curso: ");
            cursos[i] = teclado.next();
        }
        return cursos;
    }

    private static Date obtenerFecha() {
        //este metodo hay que mejorarlo porque no valida la fecha

        /*
         * La clase SimpleDateFormat nos ayuda a mostrar las fechas en el formato que
         * queramos o a reconstruirlas a partir de una cadena de texto
         */

        // le debemos dar un patron a evaluar
        // d: indica dias
        // M: en mayusculas indica Mes
        // Y: indica año
        final String PATRON = "dd/MM/yyyy";
        final SimpleDateFormat FORMATO_FECHA = new SimpleDateFormat(PATRON);
        String fechaUsuario = "";
        Date fecha = null;
        while (true) {
            try {
                System.out.print("Formato Fecha[dd/mm/aaaa]: ");
                fechaUsuario = teclado.next();
                // el metodo parse recibe un string y retorna un objeto de tipo DATE
                fecha = FORMATO_FECHA.parse(fechaUsuario);
                break;
            } catch (ParseException e) {
                System.err.println("debe ingresar un dato valido: " + e.getMessage());
            }
        }
        return fecha;
    }

    public static int menu() {
        int opcion;
        do {
            System.out.println("---------Menu--------- ");
            System.out.println("1-Alumno \n" +
                    "2-Profesor\n" +
                    "0-Salir \n");
            opcion = teclado.nextInt();

        } while (opcion < 0 || opcion > 2);

        return opcion;
    }


}

