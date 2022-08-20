/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablasmultiplicar;

import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class TablasMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // definir variables
        System.out.println("Ingrese Límite de A:");
        int limite_a = sc.nextInt();
        System.out.println("Ingrese Límite de B:");
        int limite_b = sc.nextInt();
        /*
        // ejemplo con for
        for (int a = 1; a <= limite_a; a++) {
            for (int b = 1; b <= limite_b; b++) {
                int resultado = a * b;
                System.out.println(a+"x"+b+"="+resultado);
            }
        }
        */
        int a = 1;
        while(a <= limite_a){
            int b = 1;
            System.out.println("b:"+b);
            while(b <= limite_b){
                String palabra = "Hola";
                System.out.println("Resultado de "+ a +"x"+b+":"+(a*b));
                b++;
            }
            a++;
        }
        
        
        
    }
    
}
