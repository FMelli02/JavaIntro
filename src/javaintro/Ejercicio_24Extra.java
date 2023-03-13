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
public class Ejercicio_24Extra {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, n1, n2, n3;
        
        System.out.println("Ingrese el término n de la sucesión:");
        n=leer.nextInt();
        
        n1=0;
        n2=1;
        n3=0;
        
        while (n3<n) {
            if (n<=1) {
                n3=1;
                System.out.println(n3);
            }else{
                n3=n1+n2;
                n1=n2;
                n2=n3;
                System.out.print("["+n3+"]");
            }
        }
        System.out.println("");
        
    }
}
