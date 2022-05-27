package com.educacionit;
/*Se requiere se haga un sistema que agregue personas a una lista y se le pidan los siguientes datos:
1. Nombre
2. Apellido
3. Tipo de Documento y Numero de Documento (crear un clase para este tipo de dato)
4. La edad.
5. Deberá crear 3 constructores. (constructor por defecto, constructor sin edad y que le agine la edad automáticamente y un
constructor con todos los datos)
6. Al finalizar de pedir los datos debe mostrar por consola todos los datos introducidos e indicar si la persona es mayor o menor
de edad.
7. Se utilizara para el ejercicio los métodos setter para asignar valores y getter para mostrar.
Recuerde que los datos todos deben ser privados.*/

import java.util.Scanner;

public class AppPrincipal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Persona[] personas;
        int cantPersonas;

        System.out.println("cuantas personas cargara en el sistema?");
        cantPersonas = teclado.nextInt();
        personas = new Persona[cantPersonas];

        for (int i = 0; i < personas.length; i++) {

            Persona p1 = new Persona();
            Documento d1 = new Documento();

            System.out.println("Ingrese nombre de la persona " + (i + 1));
            p1.setNombre(teclado.next());

            System.out.println("Ingrese apellido de la persona " + (i + 1));
            p1.setApellido(teclado.next());

            System.out.println("Ingrese tipo de documento de la persona " + (i + 1));
            d1.setTipodocumento(teclado.next());

            System.out.println("Ingrese numero documento de la persona " + (i + 1));
            d1.setNumeroDocumento(teclado.nextInt());

            p1.setDocumento(d1);

            System.out.println("seteamos la edad automaticamente");
            p1.setEdad(p1.asignarEdad());

            personas[i] = p1;

        }

        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i].toString());
        }

        teclado.close();
    }
}
