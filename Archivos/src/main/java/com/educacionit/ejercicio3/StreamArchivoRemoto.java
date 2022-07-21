package com.educacionit.ejercicio3;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class StreamArchivoRemoto {

    public static void main(String[] args) {

        try {
            URL url = new URL("https://www.mercadolibre.com");
            BufferedReader readerMejorado = new BufferedReader(new InputStreamReader(url.openConnection().getInputStream()));

            Boolean eof = false;
            String lineaLeida;

            //leer el archivo mientras contenga datos
            while (!eof) {

                //levanta una linea del archivo
                lineaLeida = readerMejorado.readLine();

                if (lineaLeida != null)
                    System.out.println(lineaLeida);
                else
                    eof = true;

            }

        }catch (MalformedURLException e){
            System.out.println("la url no es valida"+ e.toString());

        }catch (IOException io){
            System.out.println("no se puede leer de internet "+ io.toString());
        }

}
}
