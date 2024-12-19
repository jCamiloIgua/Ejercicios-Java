/**
 *
 * @author camil
 */
/*
Tienda en linea (Detalle Producto)
En el siguiente reto deben crear varias variables para almacenar el
detalle de un producto de una tienda en linea
El detalle a almacenar del producto es el siguiente:
* Nombre del Producto
* Precio
* Cantidad Disponible
* Estado disponible 

Deben asignar valores de prueba a cada variable, escoger el nombre
de cada variable aplicando las buenas practicas y imprimir el valor de cada
variable

Finalmente deben modificar el valor de cada variable con nuevos datos y mandar
a imprimir nuevamente el valor de cada variable y asi comprobar que se
modificaron correctamente los valores
*/
public class TiendaLinea {
    
    public static void main(String[] args) {
        String nombreProducto = "Computador Asus";
        double precioProducto = 20.000;
        int cantidadDisponibleProducto = 20;
        boolean disponibleVenta = true;
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precioProducto = " + precioProducto);
        System.out.println("cantidadDisponibleProducto = " + cantidadDisponibleProducto);
        System.out.println("disponibleVenta = " +  disponibleVenta);
        System.out.println("<<Cambio de valores>>");
        nombreProducto = "Celular Asus";
        precioProducto = 10.000;
        cantidadDisponibleProducto = 2;
        disponibleVenta = false; 
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precioProducto = " + precioProducto);
        System.out.println("cantidadDisponibleProducto = " + cantidadDisponibleProducto);
        System.out.println("disponibleVenta = " +  disponibleVenta);
    }
    
}
