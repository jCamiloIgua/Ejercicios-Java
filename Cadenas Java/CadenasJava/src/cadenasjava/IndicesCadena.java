package cadenasjava;

/**
 *
 * @author camil
 */
public class IndicesCadena {
// In this excercise is necesary use the indices
    public static void main(String[] args) {
        var cadenaDatos = "Hola mundo";
        System.out.println("cadenaDatos = " + cadenaDatos);
        //Recuperar primer caractes de la cadena
        
        var primerCaracter = cadenaDatos.charAt(0);
        System.out.println("primerCaracter = " + primerCaracter);
        
        //Recuperar ultimo caracter
        var ultimoCaracter = cadenaDatos.charAt(9);
        System.out.println("ultimoCaracter = " + ultimoCaracter);
        
        //Recuperar la letra M de hola mundo
        var letraM = cadenaDatos.charAt(5);
        System.out.println("letraM = " + letraM);
    }
    
}
