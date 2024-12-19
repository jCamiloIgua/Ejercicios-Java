/**
 *
 * @author camil
 */
public class TiposDatos {

    public static void main(String[] args) {
       //Tipos de Datos en Java
       //Enteros
       //comando completar con variable: soutv
       byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte);
       short tiposhort = 32000;
        System.out.println("tiposhort = " + tiposhort);
       int tipoint = 2147483647;
        System.out.println("tipoint = " + tipoint);
       long tipolong = 987654321098765432L;
        System.out.println("tipolong = " + tipolong);
       //Por defecto Java tona el long como un entero, para indicar que es un tipo de dato long se usa L
       
       //Punto flotante
       float tipoFloat = 3.14F;
        System.out.println("tipoFloat = " + tipoFloat);
      double tipoDouble = 3.1315D;
        System.out.println("tipoDouble = " + tipoDouble);
        //Por defecto cuando se indica un float Java lo toma como un duuble, por ese motivo se usa la F
        //para indicar que la variable es de tipo float F
        
        // Caracter
        char tipoChar = 'A'; //Caracteres del juego unicode
        System.out.println("tipoChar = " + tipoChar);
        
        //Tambien se puede usar el valor decimal del valor unicode y se pueda
        //optener el valor de letra
        tipoChar = 65; //aSCII
        System.out.println("tipoChar = " + tipoChar);
        //https://aac.unicode.org/
        
        // Booleano 
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
       tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);
        
        // Tipos Object (Referencia)
        String nombre = null; //default value
        System.out.println("nombre = " + nombre);
        nombre = "Camilo";
        System.out.println("nombre = " + nombre);
        
        //Valor por defecto de cada variable
        //Entero = default value 0
        //Flotante = default value = 0.0
        //Caracter = default value = '\u0000'
       //tipobooleano = false
       
       //Si es un tipo String y no tiene valor su valor por defecto es null, ya 
       //que no esta apuntando a ningun objeto 
    }
    
}
