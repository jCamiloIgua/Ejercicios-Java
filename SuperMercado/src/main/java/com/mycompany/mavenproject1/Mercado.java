
package com.mycompany.mavenproject1;
public class Mercado {

    public static void main(String[] args) {
       /*
        Mostrar una tabla de productos con los siguietes datos
        Nombre de producto String
        Precio double
        Cantidad en stock int
        Mostrarlo alineado con 2 decimales
        
        %-16s: texto alineado a la izquierda ocupando 16 caracteres
        %6.2f: numero flotante alineado con 2 decimales a la derecha
        %5d: numero entero con espacio reservado de 5 caracteres
        */
       //Frijo
       String nombre1 = "Frijol";
       double precio1 = 20.000;
       int cantidad1 = 10;
       //Papa
       String nombre2 = "Papa";
       double precio2 = 12.000;
       int cantidad2 = 15;
       //Lechuga
       String nombre3 = "Lechuga";
       double precio3 = 14.000;
       int cantidad3 = 25;
       
       int stock = cantidad1+cantidad2+cantidad3;
       double total = (precio1*cantidad1)+(precio2*cantidad2)+(precio3*cantidad3);
       
        System.out.println("###Super Mercado###");
        System.out.printf("Nombre  | Precio | Cantidad%n");
        System.out.printf("%-7s |%7.2f |%6d%n",
                nombre1,precio1,cantidad1);
        System.out.printf("%-7s |%7.2f |%6d%n",
                nombre2,precio2,cantidad2);
        System.out.printf("%-7s |%7.2f |%6d%n",
                nombre3,precio3,cantidad3);
        System.out.printf("Strock: %d%n", stock);
        System.out.printf("Total: %.2f",total);         
    } 
}
