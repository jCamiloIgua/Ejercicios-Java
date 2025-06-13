package com.mycompany.operadores;

/**
 *
 * @author camil
 */
public class OperadoresUnarios {
     public static void main(String[] args) {
         System.out.println("**Operadores Unarios**");
         int a = 3, b = -2, resultado;
         var c = true; //valor boleano
         
         //Operador Unario +
         resultado = +a; //vuelve el valor positivo
         System.out.printf("Resultado +a: %d%n", resultado);
         
         //Operador Unario - 
         resultado = -a; //Vuelve el valor negatigo
         System.out.printf("Resultado -a: %d%n", resultado);
         
         //Operadores unarios incremento/ decremento
         //Pre-incremento
         a = 3;
         resultado = ++a; //primero se incrementa el valor
         System.out.printf("Resultado ++a: %d%n", resultado);
         System.out.printf("a ya se incremento : %d%n", resultado);
         //Post-incremento
         a = 3;
         resultado = a++; //primero se usa el valor y despues se incrementa
         System.out.printf("Resultado a++: %d%n", resultado);
         System.out.printf("a en este momento se incrementa: %d%n", resultado);
         
         //Pre-decremento 
         b = -2;
         resultado = --b; //primero se incrementa y depues se usa el valor
         System.out.printf("Resultado --b %d%n", resultado);
         System.out.printf("b ya se decremento: %d%n", resultado);
         
         //Post-decremento
         b = -2;
         resultado = b--;//primero se usa el valor y despues se incrementa
         System.out.printf("Resultado b--: %d%n", resultado);
         System.out.println("b =" + b);
         
         
         
         
         
     }
    
}
