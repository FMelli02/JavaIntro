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
public class Ejercicio_17 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector:");
        int n=leer.nextInt();
        
        System.out.println("Ingrese números enteros entre 1 a 5 dígitos:");
        int[] vector= new int[n];
        
        int cont1=0, cont2=0, cont3=0, cont4=0, cont5=0;
        
        for (int i = 0; i < n; i++) {
            vector[i]=leer.nextInt();
            
            if (vector[i]>0 && vector[i]<10) {
                cont1+=1;
            }else if(vector[i]>=10 && vector[i]<100){
                cont2+=1;
            }else if(vector[i]>=100 && vector[i]<1000){
                cont3+=1;
            }else if(vector[i]>=1000 && vector[i]<10000){
                cont4+=1;
            }else if(vector[i]>=10000 && vector[i]<100000){
                cont5+=1;
            }
        }
        
        System.out.println("Números de 1 dígito: "+cont1);
        System.out.println("Números de 2 dígitos: "+cont2);
        System.out.println("Números de 3 dígitos: "+cont3);
        System.out.println("Números de 4 dígitos: "+cont4);
        System.out.println("Números de 5 dígitos: "+cont5);        
    }
}
