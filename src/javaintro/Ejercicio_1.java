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
public class Ejercicio_1 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 2 números enteros:");  
        int num1=leer.nextInt();
        int num2=leer.nextInt();
        
        int suma=num1+num2;
        
        System.out.println("El resultado de la suma es: "+suma);
        
    }
    
}
