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
public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de grados centígrados:");
        float num=leer.nextFloat();
        float f;
        f=32+(9*num/5);
        
        System.out.println("El resultado en grados Fahrenheit es: "+f);
        
    }
    
}
