package com.educacionit;

public class Calculadora {

    public float calculo(int a, int b) throws CalculadoraException{
        if (b==0){
            throw new CalculadoraException("no se puede dividir por cero");
        }
        return a/b;
    }
}
