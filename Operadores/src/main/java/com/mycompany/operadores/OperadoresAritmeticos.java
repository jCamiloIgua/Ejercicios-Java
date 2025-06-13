package com.mycompany.operadores;

/**
 *
 * @author camil
 */
public class OperadoresAritmeticos {

    public static void main(String[] args) {
        System.out.println("**Operadores Aritmeticos**");
        int a = 5, b = 3, resultado;
        // Suma
        resultado = a + b;
        System.out.printf("Resultado suma: %d%n", resultado);
        
        //Resta
        resultado = a - b;
        System.out.printf("Resultado resta: %d%n", resultado);
        
        //Multificacion
        resultado = a * b;
        System.out.printf("Resultado multiplicacion: %d%n", resultado);
        
        //Division
        resultado = a / b;
        System.out.printf("Resultado division: %d%n", resultado);
        
        //Modulo
        resultado = a % b;
        System.out.printf("Resultado modulo: %d%n", resultado);
    }
}
