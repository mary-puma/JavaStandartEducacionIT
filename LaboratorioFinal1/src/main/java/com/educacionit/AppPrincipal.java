package com.educacionit;
//genere un programa que le pida al usuario que ingrese la cantidad de notas, nota y nombre de cada alumno
//Debe mostrar el promedio de las notas, el menor y el mayor de las notas con su respectivo nombre
//ordenar las notas con sus respectivos nombres
import java.util.Arrays;
import java.util.Scanner;

public class AppPrincipal {
    public static void main(String[] args) {

        int cantidad, indiceMin = 0, indiceMax =0, i;
        float min,max;
        float acu = 0, aux;
        float [] notas;
        String [] nombres;
        String auxNom;
        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrese la cantidad de notas: ");
        cantidad = teclado.nextInt();
        nombres = new String[cantidad];
        notas = new float[cantidad];

        for( i=0; i<notas.length; i++){
            System.out.println("ingrese el nombre del alumno");
            nombres [i] = teclado.next();
            System.out.println("ingrese la nota del alumno "+ nombres [i]);
            notas [i] = teclado.nextFloat();


        }
        min = notas [0];
        max = notas[0];

        for(i=0; i< notas.length; i++){
            acu += notas [i];
            if(notas [i]<min){
                min = notas [i];
                indiceMin = i;

            }else if(notas[i]>max){
                max = notas [i];
                indiceMax = i;
            }

        }

        System.out.println("nota minima = "+ min + "nombre: "+ nombres [indiceMin]);
        System.out.println(("nota maxima = "+ max +"nombre: "+ nombres [indiceMax] ));
        System.out.println("promedio: "+acu/ notas.length);

        System.out.println("-----------VECTOR DESORDENADO----------");
        System.out.println(Arrays.toString(nombres));
        System.out.println(Arrays.toString(notas));

        for(int j = 0; j< notas.length-1; j++){
             i = 0;
            for(i=i+j; i<notas.length; i++){
                if(notas [j] > notas [i]){
                    aux = notas [j];
                    notas [j] = notas [i];
                    notas [i] = aux;

                    auxNom = nombres [j];
                    nombres [j] = nombres [i];
                    nombres [i] = auxNom;

                }
            }

        }
        System.out.println("-----------VECTOR ORDENADO----------");
        System.out.println(Arrays.toString(nombres));
        System.out.println(Arrays.toString(notas));

        // cerramos el flujo con la consola
        teclado.close();

    }
}
