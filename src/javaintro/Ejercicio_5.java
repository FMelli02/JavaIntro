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
public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el número a calcular:");
        int num=leer.nextInt();
        
        int doble=num*2;
        int triple=num*3;
        double rcuadrada=Math.sqrt(num);
        
        System.out.println("El doble del número es: "+doble);
        System.out.println("El triple del número es: "+triple);
        System.out.println("La raíz cuadrada del número es: "+rcuadrada);
        
    }
}
