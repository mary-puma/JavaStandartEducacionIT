package com.educacionit.excepciones;

import com.educacionit.Constantes;

import java.util.Arrays;

public class PersonaException extends Exception {

    private Integer codigo;

    public PersonaException(Integer codigo) {
        super();
        this.codigo = codigo;
    }

    public PersonaException(String message) {
        super(message);
    }

    public String getMessage(){
        switch (codigo){
            case 1:
                return "los documentos validos son: "+ Arrays.toString(Constantes.tipoDoc);
            default:
                return super.getMessage();
        }
    }

}
