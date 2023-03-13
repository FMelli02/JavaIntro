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
public class Ejercicio_20 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int[][] A=new int[3][3];
        
        System.out.println("Ingrese las coordenadas de la matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j]=leer.nextInt();
                if ((A[i][j])<1 || (A[i][j])>9) {
                    do {
                        System.out.println("El número ingresado no es válido"
                                + " por favor ingrese uno nuevamente");
                        A[i][j]=leer.nextInt();
                    } while ((A[i][j])<1 || (A[i][j])>9);
                    
                }
            }
        }
        System.out.println("");
        System.out.println("Matriz A");
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+A[i][j]+"]");
            }
            System.out.println("");
        }
        int fila1, fila2, fila3, col1, col2, col3, dia1, dia2;
        
        //Inicio algoritmo filas
        fila1=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                fila1=fila1+A[0][j];
            }
        }
        
        fila2=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                fila2=fila2+A[1][j];
            }
        }
        
        fila3=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                fila3=fila3+A[2][j];
            }
        }
        
        //Inicio algoritmo columnas
        col1=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                col1=col1+A[i][0];
            }
        }
        
        col2=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                col2=col2+A[i][1];
            }
        }
        
        col3=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                col3=col3+A[i][2];
            }
        }
        
        //Inicio algoritmo diagonales
        dia1=0;
        for (int k = 0; k < 3; k++) {
            dia1=dia1+A[k][k];
        }
        
        dia2=0;
        for (int k = 0; k < 3; k++) {
            dia2=dia2+A[k][2-k];
        }
        
        if (fila1/3==fila2/3 && fila2/3==fila3/3 && fila3/3==col1/3 && col1/3==col2/3 && col2/3==col3/3 && col3/3==dia1 && dia1==dia2) {
            System.out.println("La matriz introducida es una matriz mágica. Y su suma es de: "+ fila1/3);
        }else {
            System.out.println("La matriz introducida no es una matriz mágica");
        }
    }
}
