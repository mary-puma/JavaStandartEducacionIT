package com.educacionit;
/*Se requiere se haga un sistema que agregue personas a una lista y se le pidan los siguientes datos:
1. Id (numérico entero único)
2. Nombre
3. Apellido
4. Tipo de Documento y Numero de Documento (crear un clase para este tipo de dato)
5. Edad.
6. Deberá crear 2 constructores. (constructor por defecto, constructor sin edad y que le agine la edad automáticamente)
7. Se requiere que el sistema le asigne a través de una variable de clase un id auto incrementable.
8. Se utilizara para el ejercicio el método mostrarAtributos.
9. Se debe mostrar cuantas personas se asignaron.*/

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class AppPrincipal {


    public static void main(String[] args) {

        Persona [] vecPersonas;
        int cantidad;

        System.out.println("ingrese la cantidad de personas que quiere ingresar");
        Scanner teclado = new Scanner(System.in);
        cantidad = teclado.nextInt();

        vecPersonas = new Persona[cantidad];
        for(int i=0;i< vecPersonas.length;i++){

            Persona persona = new Persona();
            Documento documento = new Documento();
            System.out.println("ingrese el nombre de la persona "+(i+1));
            persona.setNombre(teclado.next());
            System.out.println("ingrese el apellido ");
            persona.setApellido(teclado.next());

            System.out.println("ingrese tipo de documento ");
            documento.setTipoDni(teclado.next());
            System.out.println("ingrese el Nº DNI" );
            documento.setNumDni(teclado.nextInt());
            persona.setDocumento(documento);
            System.out.println("ingrese la edad");
            persona.setEdad(teclado.nextByte());

            vecPersonas[i] = persona;

        }

        //mostramos el vector
        for (int i=0; i< vecPersonas.length;i++){
            System.out.println(vecPersonas[i].mostrarAtributos());
        }
        System.out.println("cantidad de personas asignadas: "+Persona.getContador());

    }

}
