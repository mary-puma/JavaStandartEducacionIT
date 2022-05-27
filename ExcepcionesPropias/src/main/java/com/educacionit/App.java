package com.educacionit;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        boolean correctoTipoDoc = false;

        //Persona persona1 = new Persona();
        System.out.println("ingrese el nombre ");
        String nombre = teclado.next();
        System.out.println("ingrese el apellido ");
        String apellido = teclado.next();
        System.out.println("ingrese el tipo de doumento ");
        String tipo = teclado.next();
        System.out.println("ingrese el numero ");
        int numero = teclado.nextInt();

        try{
            for(int i = 0; i<TipoDocumento.vecTipoDoc.length; i++) {
                if (tipo.equalsIgnoreCase(TipoDocumento.vecTipoDoc[i])) {
                    correctoTipoDoc = true;
                    break;
                }
            }
            if(!correctoTipoDoc){
                throw new PersonaException(1);
            }else {
                Persona persona1 = new Persona(nombre,apellido,new Documento(numero,tipo));
                System.out.println(persona1);
            }

        }catch (PersonaException e){
            System.out.println(e.getMessage());
        }

        teclado.close();
    }
}
