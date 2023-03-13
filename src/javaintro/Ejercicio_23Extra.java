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
public class Ejercicio_23Extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String[][] sopa = new String[20][20];
        String pal;

        System.out.println("Ingrese 5 palabras de entre 3 y 5 caracteres:");
        for (int i = 0; i < 5; i++) {
            pal = leer.nextLine();
            if (pal.length() > 5 || pal.length() < 3) {
                do {
                    System.out.println("La palabra ingresada no contiene la cantidad de caracteres deseados."
                            + "Por favor ingrese una palabra nuevamente: ");
                    pal = leer.nextLine();
                } while (pal.length() > 5 || pal.length() < 3);
            }
        }
    }
}
