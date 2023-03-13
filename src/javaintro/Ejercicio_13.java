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
public class Ejercicio_13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int n;
        System.out.println("Ingrese un número entero:");
        n=leer.nextInt();
        
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                if ((a>0 && a<n-1) && (b>0 && b<n-1)) {
                    System.out.print("   ");
                }else{
                    System.out.print(" * ");
                }
            }
            System.out.println("");
        }
    }
}
