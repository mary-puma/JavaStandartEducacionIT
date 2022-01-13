package com.educacionit;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        float numHombres=0, numMujeres=0, totalAlumnos=0, porcetajeHombres=0, porcentajeMujeres=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el numero de mujeres");
        numMujeres = teclado.nextFloat();

        System.out.println("ingrese el numero de hombres");
        numHombres = teclado.nextFloat();

        totalAlumnos = numHombres + numMujeres;
        porcentajeMujeres = numMujeres * 100 / totalAlumnos;
        porcetajeHombres = numHombres * 100 / totalAlumnos;

        System.out.println("porcentaje de mujeres: "+ porcentajeMujeres);
        System.out.println("porcentaje de hombres: "+ porcetajeHombres);
        teclado.close();

    }

}
