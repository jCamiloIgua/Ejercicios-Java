
package entradadatosconsola;

import java.util.Scanner;

/**
 *
 * @author camil
 */
public class LeerTiposDatos {
    public static void main(String[] args) {
        //Leer distintos tipos de datos
        //Crear el Scanner
        var console = new Scanner(System.in);
        
        //Leer un tipo int
        System.out.println("Ingresa tu edad: ");
        var edad = console.nextInt();
        System.out.println("Edad: " + edad);
        
        //Leer tipo Double
        System.out.println("Ingresa tu altura: ");
        var altura = console.nextDouble(); //1.73
        System.out.println("altura = " + altura); //soutv
        
        //Consumir el caracter de salto de linea (despues de un numero y luego un texto)
        console.nextLine();
        
        //Leer un String
        System.out.println("Ingresa tu nombre: ");
        var nombre = console.nextLine();
        System.out.println("nombre = " + nombre);
        
    }
}
