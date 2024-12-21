package cadenasjava;
/**
 *
 * @author camil
 */
public class MetodosDeCadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Metodos de cadenas
        var cadena1 = "Hola Mundo";
        
        //Obtener el largo de una cadena length()
        var longitud = cadena1.length();
        System.out.println("longitud = " + longitud);
        
        //Remplazar caracteres
        var nuevaCadena = cadena1.replace('o','a');
        System.out.println("nuevaCadena = " + nuevaCadena);
        
        //Convetir a mayusculas
        var mayusculas = cadena1.toUpperCase();
        System.out.println("mayusculas = " + mayusculas);
        
        //Convertir a minusculas
        var minusculas = cadena1.toLowerCase();
        System.out.println("minusculas = " + minusculas);
        
        //Eliminar espacios al inicio y al final
        var cadena2 = " Animes     ";
        System.out.println("cadena2 con espacios = " + cadena2);
        System.out.println("cadena2 sin espacios = " + cadena2.trim());
        
    }
    
}
