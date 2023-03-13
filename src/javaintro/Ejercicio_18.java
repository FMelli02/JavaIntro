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
public class Ejercicio_18 {
    public static void main(String[] args) {
        
        int[][] A=new int[4][4];
        int[][] B=new int[4][4];
        
        System.out.println("Matriz A:");
        System.out.println(" ");
                
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                A[i][j]=(int)(Math.random()*10);
            }
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("["+A[i][j]+"]");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("Matriz Transpuesta B:");
        System.out.println(" ");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                B[i][j]=A[j][i];
            }
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("["+B[i][j]+"]");
            }
            System.out.println("");
        }
    }
}
