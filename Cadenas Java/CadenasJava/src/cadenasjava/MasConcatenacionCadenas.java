package cadenasjava;

/**
 *
 * @author camil
 */
public class MasConcatenacionCadenas {

    public static void main(String[] args) {
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        //Forma basica
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("Forma basica cadena3 = " + cadena3);
        
        //Metodo concat
        cadena3 = cadena1.concat(" ").concat(cadena2);
        System.out.println("Usando metodo concat cadena3 = " + cadena3);
        
        //Con StringBuilder //eficiente
        var constructorCadenas = new StringBuilder();
        constructorCadenas.append(cadena1).append(" ").append(cadena2);
        var resultado = constructorCadenas .toString();
        System.out.println("resultado = " + resultado);
        
        // StringBuffer //para multiprocesos
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        var resultado1 = stringBuffer.toString();
        System.out.println("resultado1 = " + resultado1);
        
        //usando join mas comun
        resultado = String.join(" ",cadena1,cadena2);
        System.out.println("Usando joinresultado1 = " + resultado);
    }
}
