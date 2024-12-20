/**
 *
 * @author camil
 */
public class TipoVar {

    public static void main(String[] args) {
        System.out.println("*** Uso de var en Java ***");
        //Sin el uso de var
        String nombre1 = "Jonatan";
        System.out.println("nombre1 = " + nombre1);
        //Uso de var
        var nombre2 = "Camilo";
        System.out.println("nombre2 = " + nombre2);
        
        var edad = 30; // se refiere al tipo int
        System.out.println("edad = " + edad);
        var sueldo = 500.000F; // se indica tipo float
        System.out.println("sueldo = " + sueldo);
        var esCasado = false; // se infiere tipo boolean
        System.out.println("esCasado = " + esCasado);
        esCasado = true;
        System.out.println("esCasado = " + esCasado);
        //esCasado = "No"; no podemos asignar un tipo distinto
    }
}
