package com.educacionit;

public class Main {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();

        try {
            System.out.println(cal.calculo(4,0));
        }catch (CalculoException e){
            System.out.println(e.getMessage());
        }
    }
}
