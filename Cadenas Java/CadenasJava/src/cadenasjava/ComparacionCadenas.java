package cadenasjava;

/**
 *
 * @author camil
 */
public class ComparacionCadenas {
    
    public static void main(String[] args) {
        var cadena1 = "Rias";
        var cadena2 = "Rias";
        var cadena3 = new String("Rias");
        
        //Comparacion de cadenas (==) comparan la referencias
        System.out.print("cadena1 es igual en referencia a cadena2: ");
        System.out.println(cadena1 == cadena2);
        
        //Comparacion cadena1 con cadena3 (refetencias)
        System.out.print("cadena1 es igual en referencia a cadena3: ");
        System.out.println(cadena1 == cadena3);
        
        //Comparar contenido se usa el metodo equals
        System.out.print("cadena1 es igual en contenido a cadena 3: ");
        var verificacion = cadena1.equals(cadena3);
        System.out.println(verificacion);
    }
    
}
