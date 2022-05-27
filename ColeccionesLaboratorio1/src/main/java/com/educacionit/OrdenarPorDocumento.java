package com.educacionit;

import java.util.Comparator;

public class OrdenarPorDocumento implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
        int tipo;

       tipo = o1.getDocumento().getTipoDoc().compareTo(o2.getDocumento().getTipoDoc());

       if (tipo == 0)
       {
           return o1.getDocumento().getNumeroDoc()-o2.getDocumento().getNumeroDoc();
       }
        return tipo;
    }
}
