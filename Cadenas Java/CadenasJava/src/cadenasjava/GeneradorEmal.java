package cadenasjava;

/**
 *
 * @author camil
 */
public class GeneradorEmal {

    public static void main(String[] args) {
        /*
         Crear un programa para generar un email a partir de los
        siguientes datos:
        * Nombre :  Jonatan Camilo Igua Contreras
        * Universidad : Uniminuto
        * Dominio : com.co
        Resultado Final:
        email: jonatan.camilo.igua.contreras@uniminuto.com.co
        */
        
        //Salida esperada
        /*
        *** Generador de Email ***
        Nombre usuario: Jonatan Camilo Igua Contreras
        Nombre usuario normalizado: jonatan.camilo.igua.contreras
        
        Nombre universidad: Uniminuto
        Extencion del dominio: .com.co
        Dominio de email normalizado: @uniminuto.com.co
        */
        
        var nombreUsuario = "     Jonatan Camilo Igua Contreras          ";
        var universidad = "Uniminuto";
        var dominio = "com.co";
        
        //normalizacion de datos
        //quitar los espacios trimp quita los espacios solo al inicio y al final de la cadena)
        //colocar los nombres en miniscula //añadir los puntos al nombre con remplace en los espacios de cada dato
        //trimp es menos regusto que strip pero hacen lo mismo strip se añadio en la version 11
        var nombreNormalizado = nombreUsuario.toLowerCase().strip().replace(" ", ".");
        var universidadNormalizado = universidad.toLowerCase();
      
        //Crear extencion Email
        var emailExtencion = new StringBuilder();
        emailExtencion.append("@").append(universidadNormalizado).append(".").append(dominio);
        var resultadoExtencion = emailExtencion.toString();
        
        //Email completo
        var resultadoFinalEmail = nombreNormalizado.concat(resultadoExtencion);
        
        //Salida ejercicio
        System.out.println("*** Generador de Email***");
        System.out.println("Nombre Usuario: " + nombreUsuario);
        System.out.println("Nombre usuario normalizado: " + nombreNormalizado);
        System.out.println("\n");
        System.out.println("Nombre universidad: " + universidad);
        System.out.println("Extencion del dominio: " + dominio);
        System.out.println("Dominio de email normalizado: " + resultadoExtencion);
        System.out.println("\n");
        System.out.println("Email final generado: " + resultadoFinalEmail);
    }
    
}
