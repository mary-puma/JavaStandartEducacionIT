package com.educacionit;
import java.util.Scanner;
//Enunciado : Desarrollar un algoritmo que permita ingresar un número entero comprendido entre 1 y 7 , y que
//muestre por pantalla el dia de la semana al que se corresponde

public class AppPrincipal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numIngresado;
        do{
            System.out.println("ingrese un numero entre 1 y 7");
            numIngresado = teclado.nextInt();
            if(numIngresado<1 || numIngresado>7){
                System.out.println("el valor ingresado no es correcto, intente de nuevo");
            }
        }while (numIngresado<1 || numIngresado>7);


        //condicion multiple(switch)
        switch(numIngresado){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("lunes");
                break;
            case 3:
                System.out.println("martes");
                break;
            case 4:
                System.out.println("miercoles");
                break;
            case 5:
                System.out.println("jueves");
                break;
            case 6:
                System.out.println("viernes");
                break;
            case 7:
                System.out.println("sabado");
                break;

        }
        System.out.println("fin de la App");
        teclado.close();
    }

}
