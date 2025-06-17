
package com.mycompany.operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        System.out.println("** Operador and **");
        boolean a = true, b = false;
        //AND
        var resultado = a && b;
        System.out.printf("Valor: %b%n",resultado);
        
        //OR 
        resultado = a || b;
        System.out.printf("Valor: %b%n", resultado);
        
        //Operador !
        //Invierte el valor logico
        // x = true  --> !x = false
        resultado = !a; //a es true sera false
        System.out.println("a " + resultado );
    } 
}
