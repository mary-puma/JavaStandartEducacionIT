package com.educacionit.principal;

import com.educacionit.*;
import com.educacionit.excepciones.PersonaException;

import java.util.*;

public class App {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        String nombre;
        String apellido;
        String tipoDoc = null;
        Integer numDoc = null;
        Date fechaDeNac;
        boolean correctoDoc = false;
        Date fechaCargo;
        float sueldo;
        int cant;
        String[] cursos;
        Persona persona = null;
        boolean salir = true;

        Set<Persona> personas = new HashSet<>();
        List<Persona> listaPersonas = new ArrayList<>();

        int opcion =menu();

        while (opcion!=0){

            System.out.println("ingrese el nombre de la persona: ");
            nombre = teclado.next();
            System.out.println("ingrese el apellido de la persona:");
            apellido = teclado.next();
            System.out.println("ingrese la fecha de nacimiento: ");
            fechaDeNac = obtenerFecha();

            do {
                try {
                    System.out.println("ingrese el tipo de documento: ");
                    tipoDoc = teclado.next();
                    for (int i = 0; i < Constantes.tipoDoc.length; i++) {
                        if (tipoDoc.equalsIgnoreCase(Constantes.tipoDoc[i])) {//al ingresar un numero como tipo de doc no lanza la exception
                            correctoDoc = true;
                            break;
                        }
                    }
                    if (!correctoDoc) {
                        throw new PersonaException(1);
                    } else {
                        System.out.println("ingrese el numero de documento: ");
                        numDoc = teclado.nextInt();
                    }

                } catch (PersonaException e) {
                    System.out.println(e.getMessage());
                }
            }while (!correctoDoc);

            switch (opcion) {
                case 1:
                    System.out.println("ingrese la fecha de ingreso del alumno: ");
                    Date fechaIng = obtenerFecha();
                    System.out.println("ingrese la cantidad de cursos ");
                    cant = teclado.nextInt();
                    cursos = cargarCursos(cant);
                    persona = new Alumno(nombre, apellido, new Documento(tipoDoc, numDoc), fechaDeNac, cursos, fechaIng);
                    break;
                case 2:
                    System.out.println("ingrese el sueldo del director: ");
                    sueldo = teclado.nextFloat();
                    System.out.println("ingrese fecha del cargo: ");
                    fechaCargo = obtenerFecha();
                    System.out.println("ingrese la carrera");
                    String carrera = teclado.next();
                    persona = new Director(nombre, apellido, new Documento(tipoDoc, numDoc), fechaDeNac, fechaCargo, sueldo, carrera);
                    break;
                case 3:
                    System.out.println("ingrese la fecha del cargo: ");
                    fechaCargo = obtenerFecha();
                    System.out.println("ingrese el sueldo: ");
                    sueldo = teclado.nextFloat();
                    persona = new Administrador(nombre, apellido, new Documento(tipoDoc, numDoc), fechaDeNac, fechaCargo, sueldo);
                    break;
                case 4:
                    System.out.println("ingrese la fecha del cargo: ");
                    fechaCargo = obtenerFecha();
                    System.out.println("ingrese el sueldo: ");
                    sueldo = teclado.nextFloat();
                    System.out.println("ingrese la cantidad de cursos ");
                    cant = teclado.nextInt();
                    cursos = cargarCursos(cant);
                    persona = new Profesor(nombre, apellido, new Documento(tipoDoc, numDoc), fechaDeNac, fechaCargo, sueldo, cursos);
                    break;
                case 0:
                    break;
            }

            personas.add(persona);
            opcion = menu();
        }

        //mostrar la lista de personas
        for (Persona p:personas){
            System.out.println(p);
        }

        // agregamos la coleccion a la lista para proceder a ordenarla
        listaPersonas.addAll(personas);
        listaPersonas.sort(new OrdenarPorDocumento());

        System.out.println();
        System.out.println("Personas Ordenadas:");
        // mostramos el tipo de perona usando el foreach
        for (Persona p1 : listaPersonas) {
            System.out.println(p1);
        }

        teclado.close();



    }

    private static String[] cargarCursos(int cant) {
        String[] cursos = new String[cant];
        for (int i=0; i<cant;i++){
            System.out.println("ingrese el nombre del curso: ");
            cursos[i] = teclado.next();
        }
        return cursos;
    }

    private static Date obtenerFecha() {
        int anio = 0;
        int mes = 0;
        int dia = 0;
        while (true) {
            try {
                System.out.print("Ingrese el año: ");
                anio = teclado.nextInt();
                break;
            } catch (Exception e) {
                System.err.println("debe ingresar un dato valido: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Ingrese el mes en numero, ej: 1 que indica enero, 12 que indica diciembre: ");
                mes = teclado.nextInt();
                if (mes < 1 || mes > 12) {
                    throw new Exception("los meses deben estar comprendidos entre 1 y 12");
                }
                break;
            } catch (Exception e) {
                System.err.println("debe ingresar un dato valido: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Ingrese el dia: ");
                dia = teclado.nextInt();
                if (dia < 1) {
                    throw new Exception("los dias deben ser un numero positivo");
                } else {
                    if (mes == 2) {
                        if (dia > 28) {
                            throw new Exception("el mes 2 posee un maximo de 28 dias");
                        }
                    } else if ((dia > 30) && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
                        throw new Exception("los dias para estos meses debe estar comprendidos entre 1 y 30");
                    } else if ((dia > 31)) {
                        throw new Exception("los dias para estos meses debe estar comprendidos entre 1 y 31");
                    }
                }

                break;
            } catch (Exception e) {
                System.err.println("debe ingresar un dato valido: " + e.getMessage());
            }
        }

        return new Date(anio - 1900, mes - 1, dia);
    }

    public static int menu(){
        System.out.println("---------Menu--------- ");
        System.out.println("1-Alumno \n" +
                "2-Administrador \n" +
                "3-Dirctor \n" +
                "4-Profesor\n"+
                "0-Salir \n");

        int opcion = teclado.nextInt();
        return opcion;
    }


}
