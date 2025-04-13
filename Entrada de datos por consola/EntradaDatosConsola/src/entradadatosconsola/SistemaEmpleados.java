
package entradadatosconsola;

import java.util.Scanner;

public class SistemaEmpleados {
/*
    Se solicita crear un programa para pedir la informacion de un empledo, los datos solicitados se deben
    introducir por consola
    * Nombre del empleado
    * Edad (int)
    * Salario (double)
    * Es jefe de departamento (boolean)
    */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        //Variables
        String employeeName;
        int edad;
        double salario;
        boolean jefe;
        
        System.out.println("<<Sistema de Empleados>>");
        System.out.println("Ingrese nombre del empleado: ");
        employeeName = console.nextLine();
        System.out.println("Ingrese edad del empleado  " +  employeeName);
        edad = console.nextInt();
        System.out.println("Ingrese el salario del empleado: ");
        salario = console.nextDouble();
        System.out.println("Ingrese si tiene rol de jefe: ");
        jefe = console.nextBoolean();
        
        System.out.println("<<DATOS INGRESADOS>>");
        System.out.println("Nombre: " + employeeName);
        System.out.println("Edad: " + edad);
        System.out.printf("Salario: " + salario);
        System.out.println("\n");
        System.out.println("Estado rol de Jefe: " + jefe);
        
    }
    
}
