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
public class Ejercicio_16 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector:");
        int n=leer.nextInt();
        double[] vector= new double[n];
        
        for (int i = 0; i < n; i++) {
            vector[i]=Math.floor(Math.random()*10);
            System.out.println("["+vector[i]+"]");
        }
        
        System.out.println("Ingrese el número a buscar:");
        int num=leer.nextInt();
        
        int cont=0;
        int j=0;
        for (int i = 0; i < n; i++) {
            if (vector[i]==num) {
                cont+=1;
                j=i;
            }
        }
        System.out.println("El número se encuentra en la posición "+j+
                " y la cantidad de veces que se repite es "+cont);
       
    }
}
