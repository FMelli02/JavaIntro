/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro;

/**
 *
 * @author Usuario
 */
public class Ejercicio_15 {
    public static void main(String[] args) {
        
        System.out.println("Ingrese el tamaño del vector:");
        
        int[] vector=new int[100];
        
        for (int i = 0; i < 100; i++) {
            vector[i]=i+1;
        }
        for (int i = 99; i >= 0; i--) {
            System.out.println("["+vector[i]+"]");
        }
    }
}
