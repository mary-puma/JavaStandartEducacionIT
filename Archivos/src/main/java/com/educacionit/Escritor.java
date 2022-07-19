package com.educacionit;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Escritor {
    public static void main(String[] args) throws IOException {

        //Instancia un objeto file de salida
        File outputFile = new File("destino.txt");

        //Instancia un FileWriter que se encargara de escribir
        FileWriter out = new FileWriter(outputFile);

        //construyendo un bufferWrite
        BufferedWriter writeMejorado = new BufferedWriter(out);

        //construye un cadena de caracteres a ser guardada en el archivo
        String linea1 = "estoy escribiendo en un archivo, soy la linea 1";
        String linea2 = "soy la linea 2";
        String linea3 = "soy la linea 3";

        //escribir en el archivo de salida
        writeMejorado.write(linea1,0,linea1.length());
        writeMejorado.newLine();
        writeMejorado.write(linea2,0,linea2.length());
        writeMejorado.newLine();
        writeMejorado.write(linea3,0,linea3.length());

        //cierra el stream
        writeMejorado.close();

        System.out.println("el archivo ha sido escrito...");

    }
}
