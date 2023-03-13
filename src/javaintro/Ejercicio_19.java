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
public class Ejercicio_19 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int[][] A=new int[3][3];
        int[][] B=new int[3][3];
        
        System.out.println("Ingrese los valores de la Matriz A:");
                
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j]=leer.nextInt();
            }
        }
        
        System.out.println("Matriz A:");
        System.out.println(" ");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+A[i][j]+"]");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("Matriz Transpuesta B:");
        System.out.println(" ");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                B[i][j]=A[j][i];
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+B[i][j]+"]");
            }
            System.out.println("");
        }
        
        int cont=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (A[i][j]==-(B[i][j])) {
                    cont+=1;
                }
            }
        }
        if (cont==16) {
            System.out.println("La matriz es simétrica");
        }else{
            System.out.println("La matriz es anti simétrica");
        }
    }
}
