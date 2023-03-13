/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio_14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de euros:");
        float euro=leer.nextFloat();
        
        convertidor(euro);
    }
    
    public static void convertidor(float euro) {
        System.out.println("El valor en libras es: "+(euro*0.86)+" £");
        System.out.println(" ");
        System.out.println("El valor en dólares es: "+(euro*1.28611)+" USD");
        System.out.println(" ");
        System.out.println("El valor en yenes es: "+(euro*129.852)+" ¥");
    }
} 
