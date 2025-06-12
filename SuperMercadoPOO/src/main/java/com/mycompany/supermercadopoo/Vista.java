
package com.mycompany.supermercadopoo;

public class Vista {

    public static void main(String[] args) {
        //Construimos un lacteo
        Lacteos lacteo = new Lacteos(
        "Yogur Natural",32.000,12,"Lacteo",7
        );
        //Construimos una bebida
        Bebidas bebida = new Bebidas(
        "Gaseosa Cola",29.000,25,"Bebida",20
        );
        //Construimos una Carne
        Carnes carne = new Carnes(
        "Res Molida",12.000,5,"Carne",250
        );
        
        
        System.out.println("###Super Mercado###");
        System.out.printf("Nombre        |  Precio  | Canti | Tipo%n");
       
        System.out.printf("%-13s | %8.2f | %5d | %s%n", lacteo.getNombre(),lacteo.getPrecio(),
                lacteo.getCantidad(),lacteo.getTipoProducto());
        
        System.out.printf("%-13s | %8.2f | %5d | %s%n", bebida.getNombre(),bebida.getPrecio(),
                bebida.getCantidad(),bebida.getTipoProducto());
        
         System.out.printf("%-13s | %8.2f | %5d | %s%n", carne.getNombre(),carne.getPrecio(),
                carne.getCantidad(),carne.getTipoProducto());
         
         System.out.println("######################################");
         System.out.printf("Tipo   |  V. Fermentacion%n");
         System.out.printf("%s | %d%n", lacteo.getTipoProducto(),
                 lacteo.getValorFermentacion());
         System.out.printf("Tipo   |  N. Azucares Anadidos%n");
         System.out.printf("%s | %d%n", bebida.getTipoProducto(),
                 bebida.getNivelAzucaresAñadidos());
         System.out.printf("Tipo   |  N. Calorias%n");
         System.out.printf("%s  | %d%n", carne.getTipoProducto(),
                 carne.getNivelCalorias());
        
    }
}
