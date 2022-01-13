package com.educacionit;
// 1)Calcular el promedio de 10 valores almacenados en un Vector. Determinar además cuantos son mayores que el promedio, imprimir el promedio, el número de datos mayores que el promedio y una lista de valores mayores que el promedio .

import java.util.Scanner;

public class AppPrincipal {
    public static void main(String[] args) {
        // definimos las variables de trabajo
        int limite = 10, mayores = 0;
        float promedio = 0, sumatoria = 0;
        int[] valoresArrays = new int[limite];
        int[] mayoresAlPromedio;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < limite; i++) {
            // solicitamos al usuario ingrese los valores y los guardamos en cada indice del
            // array
            System.out.println("ingrese el numero " + (i + 1));
            valoresArrays[i] = teclado.nextInt();
            sumatoria += valoresArrays[i];// acumulamos todos los valores que tiene el array en una variable para poder
            // obtener luego el promedio
        }

        System.out.println("La suma de todos los valores es : " + sumatoria);
        // calculamos el promedio
        promedio = sumatoria / limite;

        // mostramos el array cargado
        for (int i = 0; i < limite; i++) {
            System.out.print(valoresArrays[i] + " - ");
        }

        // contamos los valores mayores al promedio
        for (int i = 0; i < limite; i++) {
            if (valoresArrays[i] > promedio) {
                mayores++;// sumo uno cada vez que encuentro un valor mayor al promedio dentro del array
                // de valores
            }
        }

        System.out.println(
                "Existen " + mayores + " datos mayores al promedio " + promedio + " dentro del array de valores ");

        mayoresAlPromedio = new int[mayores];
        int j = 0; // variable que controlar el indice de el array "mayoresQueElPromedio"

        for (int i = 0; i < limite; i++) {
            if (valoresArrays[i] > promedio) {
                mayoresAlPromedio[j] = valoresArrays[i];
                j++;
            }

        }
        // mostramos lo valores que son mayores al promedio
        for (int i = 0; i < mayores; i++) {
            System.out.print(mayoresAlPromedio[i] + " - ");
        }

        teclado.close();

    }

}


