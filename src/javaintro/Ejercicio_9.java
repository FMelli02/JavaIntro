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
public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase o palabra:");
        String frase =leer.nextLine();
        
        
        if (frase.substring(0, 1).equals("A") || (frase.substring(0, 1).equals("a"))) {
            System.out.println("CORRECTO");
        }else {
            System.out.println("INCORRECTO");
        }
    }
}
