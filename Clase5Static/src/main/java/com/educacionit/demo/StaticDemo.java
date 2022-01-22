package com.educacionit.demo;

public class StaticDemo {
    public int x; //variable de instacia
    public static int y;//variable estatica(de clase)
    static  int valor = 1024; // esta variable solo es visible para las clases que estan detro de este package porque es de tipo deful

    // retornamos la de suma de la variable de instancia 'x' y
    // la variable de clase 'y'
    int suma() { // dentro de un metodo no static si se puede usar variables static
        return x + y;
    }

    // los metodos declarados como estaticos tiene las siguientes restricciones :

//	1) pueden llamar solamente a otros metodos que sean estaticos dentro de su clase o fuera de su clase
//	2) puede acceder solamente a variables que sean estaticos dentro de su clase o fuera de su clase
//	3) no se tiene una referencia al 'this'

    public static int valDiv2() {
        // suma(); error no se puede llamar por que suma no es un metodo de clase (no es
        // static)
        // int resultado = x;error no se puede utilizar 'X' por que no es static
        // this.valor = valor;error no podes utilizar el this dentro de un metodo static
        return valor / 2;
    }

}
