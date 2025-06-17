
package com.mycompany.operadores;

public class OperadoresAsignacion {
    
    public static void main(String[] args){
        System.out.println("***Operadores de Asignacion***");
        
        //Asignacion =
        int miNumero = 10;
        System.out.printf("Asignacion: %d%n",miNumero);
        // +=
        miNumero += 5;
        System.out.printf("Asignacion += %d%n",miNumero);
        
        miNumero *= 2;
        System.out.printf("Asignacion *= %d%n",miNumero);
        
        //Asignacion variables multiples
        //Deben ser de un mismo tipo
        int a = 10, b = 15, c = 20;
        System.out.printf("Datos: a = %d%n , b = %d%n, c = %d%n",
                a,b,c);
        
    }
    
}
