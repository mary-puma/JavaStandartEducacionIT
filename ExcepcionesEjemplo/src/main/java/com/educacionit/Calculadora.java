package com.educacionit;

public class Calculadora {

    public float calculo(int a, int b) throws CalculoException{
        if (b==0){
            throw new CalculoException();
        }
        return a/b;
    }
}
