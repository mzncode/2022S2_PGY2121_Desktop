/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosprimos;

import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class NumerosPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**/
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero:");
        int num = sc.nextInt();
        boolean esPrimo = true;
        
        // divisible por si mismo y no por otros (exceptuando el 1)
        
        if(num < 3){
            esPrimo = false;
            System.out.println("No Es Primo.");
        }
        else{
            // num = 100 --> 50
            for (int i = 2; i < num/2; i++) {
                if(num % i == 0){
                    esPrimo = false;
                    System.out.println("No Es Primo");
                }
            }
            if(esPrimo){
                System.out.println("Es Primo");
            }
        }
    }
    
}
