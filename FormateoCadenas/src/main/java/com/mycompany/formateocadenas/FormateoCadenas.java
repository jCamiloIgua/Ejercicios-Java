package com.mycompany.formateocadenas;

/**
 *
 * @author camil
 */
public class FormateoCadenas {

    public static void main(String[] args) {
        System.out.println("*** Formateo de Cadenas ***");
        var nombre = "Jonatan";
        var edad = 35;
        var salario = 21000.50;
        
        //String.format
        var mensaje = String.format("Nombre: %s, Edad: %d, Salario: $%.2f",
                nombre,edad,salario);
        System.out.println(mensaje);
        
        //Metodo printf
        System.out.printf("Nombre: %s, Edad: %d, Salario: $%.2f",
                nombre,edad,salario);
    }
}
