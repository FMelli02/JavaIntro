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
public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un entero que defina el límite de la suma:");
        int limite=leer.nextInt();
        
        int suma;
        int num;
        suma=0;
        System.out.println("Ingrese los enteros a sumar:");
        do {
            num=leer.nextInt();
            suma=suma+num;
        } while (suma<=limite);
        System.out.println("El resultado de la suma es: "+suma);
    }
}
