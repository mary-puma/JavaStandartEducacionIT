package com.educacionit;
/*
1. Se requiere se haga un sistema que agregue alumnos con lo atributos heredados de persona a una lista y se le pidan los
siguientes datos:
2. Id (numérico entero único)
3. Nombre
4. Apellido
5. Tipo de Documento y Numero de Documento (crear un clase para este tipo de dato) no debe poder heredarse.
6. Edad.
7. La clase alumno tendrá un atributo donde se le asignara cursos.
8. Deberá crear 1 solo constructor con todos los datos.
9. Se requiere que el sistema le asigne a través de una variable de clase un id auto incrementable.
10. Se utilizara para el ejercicio el método toString de la clase Persona y será redefinido en la clase hija..
11. Se debe mostrar cuantas personas se asignaron.
12. Adicionalmente se requiere crear una clase Profesor que herede de la clase Persona y tenga un atributo para asignarle un pago,
esta clase se usara para el siguiente modulo.

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cantidad;
        Alumno [] alumnos;
        System.out.println("ingrese la cantidad de alumnos: ");
        Scanner teclado = new Scanner(System.in);
        cantidad = teclado.nextInt();
        alumnos = new Alumno[cantidad];


        for (int i=0;i<alumnos.length;i++){
            //no puedo usar los setter y getters porq necesitaria crear el contructor vacio en la clase alumno y el ejercicio no pide usar este constructor
            System.out.println("ingrese los datos del alumno "+(i+1));
            System.out.println("ingrese el nombre: ");
            String nombre = teclado.next();
            System.out.println("ingrese el apellido: ");
            String apellido = teclado.next();
            System.out.println("ingrese el tipo de documento: ");
            String tipoDoc = teclado.next();
            System.out.println("ingrese el numero de documento: ");
            int numDoc = teclado.nextInt();
            System.out.println("ingrese la edad: ");
            byte edad = teclado.nextByte();

            Documento documento = new Documento(tipoDoc,numDoc);

            int cantCursos;
            System.out.println("ingrese la cantidad de cursos del alumno "+nombre +" "+ apellido);
            cantCursos= teclado.nextInt();
            String[] cursos = new String[cantCursos];
            for (int j=0;j<cursos.length;j++){
                System.out.println("ingrese el nombre del curso: ");
                cursos[j] = teclado.next();
            }

            Alumno alumno = new Alumno(nombre,apellido,documento,edad,cursos);
            alumnos[i] = alumno;

        }
        for (int i = 0; i < alumnos.length; i++) {
            // mostramos los datos de las alumnos
            System.out.println(alumnos[i]);
        }

        // mostramos la cantidad de personas asignadas
        System.out.println("Cantidad de Personas " + Persona.getContador());
        teclado.close();
    }
}
