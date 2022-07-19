package com.educacionit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Lector {
    public static void main(String[] args) throws IOException {

        //Instancia un objeto file de entrada
        File inputFile = new File("destino.txt");

        //Instancia un FileReader que se encargara de leer
        FileReader in = new FileReader(inputFile);

        BufferedReader readerMejorado = new BufferedReader(in);

        Boolean eof = false;
        String lineaLeida = "";

        //leer el archivo mientras contenga datos
        while (!eof) {

            //levanta una linea del archivo
            lineaLeida = readerMejorado.readLine();

            if (lineaLeida != null)
                System.out.println(lineaLeida);
            else
                eof = true;

        }

        //cierra el stream
        readerMejorado.close();
    }
}
