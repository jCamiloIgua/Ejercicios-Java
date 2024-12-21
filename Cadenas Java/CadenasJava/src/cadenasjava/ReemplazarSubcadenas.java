package cadenasjava;

/**
 *
 * @author camil
 */
public class ReemplazarSubcadenas {

    public static void main(String[] args) {
        // Reemplazar subcadenas
        var cadena = "Hola Mundo";
        System.out.println("cadena = " + cadena);
        
        //Remplazar "Mundo" por "a todos"
        var nuevaCadena = cadena.replace("Mundo", "a todos");
        System.out.println("nuevaCadena = " + nuevaCadena);
        
        // Reemplazar "Hola" por "Adios"
        nuevaCadena = cadena.replace("Hola", "Saludos");
        System.out.println("nuevaCadena = " + nuevaCadena);//Saludos Mundo
    }
    
}
