package serpienteinfinita;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author camil La idea es crear una serpiente por consola que serpentee
 */
public class SerpienteInfinita {

    public static void main(String[] args) {

        int posicionActual = 15;
        int anchoMaximo = 30;

        boolean primeraPintada = true; //Se usa si es la primera vez que se pinta la cabeza
        //ciclo infinito
        while (true) {

            try {
                Thread.sleep(200);
                
                for (int i = 0; i <= anchoMaximo; i++) { //sea menor o igual a 30

                    if (i == posicionActual) {
                        if (primeraPintada) {
                            System.out.print("&");
                            primeraPintada = false; //si se pinta la cabeza se cambia el estado
                        } else {
                            System.out.print("/¨¨/"); //Se pinto el cuerpo de la serpiente
                        }
                    }else{
                        System.out.print(" ");//pintar los saltos
                    }

                }
                System.out.println();
                //Crear el movimiento
                int cambioLateral = (int) (Math.random() * 3) - 1;//Se usa para mover
                System.out.println(cambioLateral); //valor del cambio de la matriz de la pantalla
                System.out.println(posicionActual);//imprime el valor de la posicion de la pantalla

                posicionActual += cambioLateral;
                if (posicionActual == -1)  posicionActual = 0; //si es -1 es la esquina se coloca cero
                   
                
                if (posicionActual == 31)  posicionActual = 30; //Si se va a salir del rango del 31 y se pone 30
                   
            }catch (InterruptedException ex) {
                Logger.getLogger(SerpienteInfinita.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
        
   }
    
}


