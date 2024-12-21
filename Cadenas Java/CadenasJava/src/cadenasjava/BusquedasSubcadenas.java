package cadenasjava;

/**
 *
 * @author camil
 */
public class BusquedasSubcadenas {

    public static void main(String[] args) {
        var cadena1 = "Rias Gremory";
        //Trae el indice de la busqueda
        var subCadena1 = cadena1.indexOf("Rias");
        System.out.println("subCadena1 = " + subCadena1);
        
        var subCadena2 = cadena1.lastIndexOf("G");
        //Esto me la posicion
        System.out.println("subCadena2 = " + subCadena2);
        
        //Sirve chevre+
       
        var anime = cadena1.indexOf("Gremory");
        System.out.println("anime = " + anime);
        //Ejercicio propio en donde se aplicaron los metodos vistos
        System.out.println("Buscar la letra O con la posicion");
        System.out.println("La letra O de gremory esta: " + cadena1.indexOf("o"));
        System.out.println("La letra de la posicion 9 es : " + cadena1.charAt(9));
       
    }
    
}
