
package com.mycompany.operadores;

import java.util.Scanner;


public class ValorDentroRango {
    public static void main(String[] args) {
        //Rangos
        final var MINIMO = 0;
        final var MAXIMO = 5;
        
        //Solicitar valor
        System.out.print("Ingrese un valor entre 0 y 5: ");
        var dato = Integer.parseInt(new Scanner(System.in).nextLine());
        //varificar rango
        var rangoVerificar = (dato >=MINIMO && dato<=MAXIMO);
        System.out.printf("Esta en el rango? %b%n", rangoVerificar);
    }
}
