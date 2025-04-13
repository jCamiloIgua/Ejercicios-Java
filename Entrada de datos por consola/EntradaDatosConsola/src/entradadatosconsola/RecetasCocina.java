
package entradadatosconsola;

import java.util.Scanner;

/**
 *
 * @author camil
 */
/**
 * Crear un programa para solicitar los valores mas importantes de una
 * receta de cocina
 * Los valores a ingresar son:
 * Nombre de la receta
 * Ingredientes principales
 * Tiempo de preparacion (min)
 * Dificultad ( Facil, Media, Alta)
 **/
public class RecetasCocina {

    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in);
        String nombreReceta = "None";
        String ingredientes = "None";
        int tiempoPreparacion = 0;
        String dificultad = "None";
        
        System.out.println("*** Recetas de Cocina ***");
        System.out.println("Ingresa el nombre de la receta: ");nombreReceta = console.nextLine();
        System.out.println("Ingresa los ingredientes: " );ingredientes = console.nextLine();
        System.out.println("Ingrese el tiempo de preparación: ");tiempoPreparacion = console.nextInt(); console.nextLine();
        System.out.println("Ingrese la dificultad de la receta ( Facil, Media, Alta): " );dificultad = console.nextLine();
        
        System.out.println("<<< Receta de cocina >>>");
        System.out.println("Nombre: " + nombreReceta);
        System.out.println("Ingredientes: " + ingredientes);
        System.out.println("Tiempo (min): " + tiempoPreparacion);
        System.out.println("Dificultad: " + dificultad);
    }
    
}
