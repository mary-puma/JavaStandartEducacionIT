package com.educacionit;

import java.util.Arrays;

public class PersonaException extends Exception{

    private Integer codigo;

    public PersonaException(Integer codigo){
        super();
        this.codigo = codigo;
    }

    //public PersonaException(String message) {
      //  super(message);
   // }

    @Override
    public String getMessage() {
        switch (codigo) {
            case 1:
                return "Los Documentos validos son: " + Arrays.toString(TipoDocumento.vecTipoDoc);
            default:
                return super.getMessage();
        }
    }
}
