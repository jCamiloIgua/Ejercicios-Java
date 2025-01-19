/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadenasjava;

import java.util.Scanner;

/**
 *
 * @author camil
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var N = 24;
                
        if(N%2 == 1){//odd
            System.out.println("Weird");
        }else if(N>=2 && N<=5){//even
            System.out.println("Not Weird"); 
        }else if(N>=6 && N <=20){
            System.out.println("Weird");
        }else{
            System.out.println("Not Weird");
        }
        
        Scanner scan = new Scanner(System.in);
       
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
