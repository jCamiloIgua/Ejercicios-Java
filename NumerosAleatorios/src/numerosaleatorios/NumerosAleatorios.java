package numerosaleatorios;

import java.util.Random;

/**
 *
 * @author camil
 */
public class NumerosAleatorios {

    public static void main(String[] args) {
        
        Random generar = new Random();
        /*Generar un numero entero aleatorio entre 0 y 9 */
        var numeroEntre0y9 = generar.nextInt(10);
        System.out.println("Numero aleatorio entre 0 y 9: " + numeroEntre0y9);
        
        /* Generar entre 1 y 10*/
        var numeroEntre1y10 = generar.nextInt(10) + 1;
        System.out.println("Numero aleatorio entre 1 y 10: " + numeroEntre1y10);
        
        // Generar un numero flotante entre 0.0 y 1.0
        var flotanteAleatorio = generar.nextFloat(); //por defecto lo genera con este rango
        System.out.println("Numero aleatorio entre 0.0 y 1.0: " + flotanteAleatorio);
        
        //Simular el lanzamiento de un dado (1 y 6) de 6 caras
        var dado = generar.nextInt(6) + 1; // 1 a 6
        System.out.println("Resultado de lanzar un dado : " + dado);
    }
    
}
