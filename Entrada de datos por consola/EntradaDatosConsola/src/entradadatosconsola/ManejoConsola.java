
package entradadatosconsola;

import java.util.Scanner;

/**
 *
 * @author camil
 */
public class ManejoConsola {
    public static void main(String[] args) { //psvm
        //Introducir valores por consola
        var consola = new Scanner(System.in); // in -> Input - Entrada de datos
        System.out.println("Escribe tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("Nombre: " + nombre);
    }
}
