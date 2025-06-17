
package com.mycompany.operadores;

public class OperadoresComparacion {
    public static void main(String[] args) {
        System.out.println("**Operadores de Comparacion");
        int a = 3, b = 2;
        //Igualdad ==
        var resultado = a == b;//valor boleano
        System.out.printf("Valor: %b%n", resultado);
        
        //Distinto !=
        resultado = a != b;
        System.out.printf("Valor: %b%n", resultado);
        
        //Mayor que >
        resultado = a > b;
        System.out.printf("Valor: %b%n",resultado);
        //Menor que < 
        resultado = a < b;
        System.out.printf("Valor: %b%n",resultado);
    }
}
