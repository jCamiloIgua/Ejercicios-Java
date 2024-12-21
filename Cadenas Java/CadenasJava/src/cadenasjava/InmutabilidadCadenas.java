package cadenasjava;
/**
 *
 * @author camil
 */
public class InmutabilidadCadenas {

    public static void main(String[] args) {
        var cadena1 = "Hola";
        System.out.println("cadena1 = " + cadena1);
        var cadena2 = cadena1; //para no perder la referencia del objeto
        //de la memoria heat
        cadena1 = "adios";
        System.out.println("cadena1 modificado = " + cadena1);
        System.out.println("Cadena2 anterior = " + cadena2);
    }
    
}
