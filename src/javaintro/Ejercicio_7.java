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
public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase:");
        String frase=leer.nextLine();
        
        if (frase.equals("eureka")) {
            System.out.println("Correcto");
        }else {
            System.out.println("Incorrecto");
        }
    }
}
