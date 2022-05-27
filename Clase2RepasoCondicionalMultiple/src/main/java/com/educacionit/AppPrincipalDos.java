package com.educacionit;

import java.util.Scanner;
//Enunciado :
//Desarrollar un algoritmo que permita ingresar un numero entero comprendido entre 1 y 10 ,
//y que muestre por pantalla si el numero es par o impar

    public class AppPrincipalDos {

        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            int num;

            do {
                System.out.println("ingrese un numero comprendido entre 1 y 10");
                num = teclado.nextInt();
                if (num < 1 || num > 10) {
                    System.out.println("el numero ingresado no se encuentra dentro del rango especificado , intenta de nuevo ");
                }
            } while (num < 1 || num > 10);

            switch (num) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 9:
                    System.out.println("Numero Impar");
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                case 10:
                    System.out.println("Numero Par");
                    break;
            }

            teclado.close();
        }

    }

