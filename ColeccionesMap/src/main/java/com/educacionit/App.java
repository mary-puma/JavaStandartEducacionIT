package com.educacionit;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        HashMap<String,Empleado> personal=new HashMap<String, Empleado>();

        personal.put("145",new Empleado("mary"));
        personal.put("146",new Empleado("elena"));
        personal.put("147",new Empleado("belen"));
        personal.put("130",new Empleado("federico"));

        System.out.println(personal);

        //eliminamos un objeto
        personal.remove("147");
        System.out.println(personal);

        //reemplazar un elemento
        personal.put("130",new Empleado("natalia"));
        System.out.println(personal);

        //nos devuelva una coleccion de tipo set y que imprima
        //el metodo entrySet devuelve una coleccion de tipo set, esa coleccion set contiene objetos de tipo map.entry<k,v>
        System.out.println(personal.entrySet());

        for (Map.Entry<String,Empleado> entrada: personal.entrySet()) {
            String clave = entrada.getKey();
            Empleado  valor = entrada.getValue();

            System.out.println("clave = "+clave+" valor = "+valor);

        }
    }
}
