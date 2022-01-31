package com.educacionit.principal;

import com.educacionit.entidades.Alumno;
import com.educacionit.entidades.Documento;
import com.educacionit.entidades.Profesor;

import java.util.Date;
import java.util.Scanner;

public class Main {
    private static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {

        Alumno[] alumnos;
        Profesor[] profesores;
        int cantAlu;

        System.out.println("ingrese la cantidad de alumnos: ");
        Scanner teclado = new Scanner(System.in);
        cantAlu = teclado.nextInt();
        alumnos = new Alumno[cantAlu];

        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = agregarAlumno(i);
        }

        for (Alumno alumAux : alumnos) {
            System.out.println(alumAux);
        }
        System.out.println("ingrese la cantidad de profesores: ");
        int cantProfes = teclado.nextInt();
        profesores = new Profesor[cantProfes];
        for(int i=0;i<profesores.length;i++){
            profesores[i] = agregarProfesor(i);
        }
        for (Profesor profAux : profesores) {
            System.out.println(profAux);
        }



    }

    private static Date obtenerFecha() {
        System.out.print("Ingrese el año: ");
        int anio = teclado.nextInt();
        System.out.print("Ingrese el mes en numero, ej: 1 que indica enero, 12 que indica diciembre: ");
        int mes = teclado.nextInt();
        System.out.print("Ingrese el dia: ");
        int dia = teclado.nextInt();
        return new Date(anio - 1900, mes - 1, dia);

    }
    private static Alumno agregarAlumno(int i){
        Documento documento = new Documento();
        Alumno alumno = new Alumno();
        System.out.println("ingrese el nombre del alumno " + (i + 1));
        alumno.setNombre(teclado.next());
        System.out.println("ingrese el apellido del alumno " + (i + 1));
        alumno.setApellido(teclado.next());
        System.out.println("ingrese el tipo de documeto del alumno " + (i + 1));
        documento.setTipoDoc(teclado.next());
        System.out.println("ingrese el numero de documeto del alumno" + (i + 1));
        documento.setNumDni(teclado.nextInt());
        alumno.setDocumento(documento);
        System.out.println("ingrese la fecha de nacimiento: ");
        Date fechaNac = obtenerFecha();
        alumno.setFechaNacimiento(fechaNac);
        System.out.println("ingrese fecha de ingreso: ");
        Date fechaIng = obtenerFecha();
        alumno.setFechaIngreso(fechaIng);

        System.out.println("ingrese la cantidad de cursos del alumno: " + alumno.getNombre() +" "+ alumno.getApellido());
        int cantCursos = teclado.nextInt();

        alumno.setCursos(agregarCursos(cantCursos));

        return alumno;
    }
    private static Profesor agregarProfesor(int i){
        Profesor profesor = new Profesor();
        Documento documento = new Documento();
        System.out.println("ingrese el nombre del profesor " + (i + 1));
        profesor.setNombre(teclado.next());
        System.out.println("ingrese el apellido del profesor " + (i + 1));
        profesor.setApellido(teclado.next());
        System.out.println("ingrese el tipo de documeto del profesor " + (i + 1));
        documento.setTipoDoc(teclado.next());
        System.out.println("ingrese el numero de documeto del profesor" + (i + 1));
        documento.setNumDni(teclado.nextInt());
        profesor.setDocumento(documento);
        System.out.println("ingrese la fecha de nacimiento: ");
        Date fechaNac = obtenerFecha();
        profesor.setFechaNacimiento(fechaNac);
        System.out.println("ingrese fecha de ingreso: ");
        Date fechaIng = obtenerFecha();
        profesor.setFechaIng(fechaIng);
        System.out.println("ingrese el sueldo: ");
        profesor.setSueldo(teclado.nextFloat());

        System.out.println("ingrese la cantidad de cursos del profesor "+profesor.nomYAp());
        int cantCursos = teclado.nextInt();
        profesor.setCursos(agregarCursos(cantCursos));
        return profesor;

    }
    private static String [] agregarCursos(int cantCursos){
        String[] cursos = new String[cantCursos];
        for(int i=0;i<cursos.length;i++){
            System.out.println("ingrese el nombre del curso: ");
            cursos[i] = teclado.next();
        }
        return cursos;
    }
}
