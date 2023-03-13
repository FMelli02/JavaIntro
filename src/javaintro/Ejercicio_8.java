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
public class Ejercicio_8 {
    public static void main (String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra de 8 caracteres:");
        String frase=leer.nextLine();
        int largo;
        largo=frase.length();
        
        if (largo==8) {
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    }
}
