package com.educacionit.ejercicio2;

import java.io.*;

public class LecturaDesdeClasspath {

    public LecturaDesdeClasspath() {
    }

    public static void main(String[] args) throws Exception {

        //Archivo a leer
        String archivoALeer = "com/educacionit/archivo/notas.txt";

        //obtiene un stream al archivo a leer
        var data = LecturaDesdeClasspath.class.getClassLoader().getResourceAsStream(archivoALeer);
        InputStreamReader inputStreamReader = new InputStreamReader(data);//data es null, revisar porque no encuentra el archivo en la ruta

        BufferedReader readerMejorado = new BufferedReader(inputStreamReader);

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
