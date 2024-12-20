/**
 *
 * @author camil
 */
/*
Capturar el detalle de la reservacion de hoteles
El detalle que se debe capturar es:
* Nombre del Cliente
* Dias de Estancia
* Tarifa Diaria
* Indicar si la habitacion cuenta con vista al mar

Se debe asignar valores iniciales y mandar a imprimir el valor de cada
variable 
Por ultimo se debe modifacar algunas variables de la reservacion y
mandar imprimir nuevamente cada variable para observar los cambios

*/
public class ReservaHotel {

    public static void main(String[] args) {
        var nombreCliente = "Jonatan Camilo Igua";
        var diasEstancia = 10;
        final var TARIFA_DIARIA = 20.000;
        var conVistaMar= true;     
        System.out.println("<<Detalle de reservacion>>");
        System.out.println("Nombre: " + nombreCliente);
        System.out.println("Dias Estancia: " + diasEstancia);
        System.out.println("Tarifa diaria: " + TARIFA_DIARIA );
        
        if(conVistaMar != false){
            System.out.println("Vista al Mar: Si");
        }else{
             System.out.println("Vista al Mar: No");
        }
        nombreCliente = "Maria Camila";
        diasEstancia = 5;
        conVistaMar=  false;
        System.out.println("<<Cambio de datos>>");
        
        System.out.println("Nombre: " + nombreCliente);
        System.out.println("Dias Estancia: " + diasEstancia);
        System.out.println("Tarifa diaria: " + TARIFA_DIARIA );
         if(conVistaMar != false){
            System.out.println("Vista al Mar: Si");
        }else{
             System.out.println("Vista al Mar: No");
        }
    }
    
}
