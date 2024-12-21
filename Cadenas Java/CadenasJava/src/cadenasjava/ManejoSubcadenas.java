package cadenasjava;
/**
 *
 * @author camil
 */
public class ManejoSubcadenas {

    public static void main(String[] args) {
        // Tema de Subcadenas
        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);
        
        /*
        0 1 2 3 4 5 6 7 8 9
        H o l  a    M u n d o
        
        0 1 2 3
        H o  l a
        Limites (0 a 4 )
        */
        // Subcadena
        var subcadena1 = cadena1.substring(0,4);
        System.out.println("subcadena1 = " + subcadena1);
        
        var subcadena2 = cadena1.substring(5,10);
        System.out.println("subcadena2 = " + subcadena2);
    }
    
}
