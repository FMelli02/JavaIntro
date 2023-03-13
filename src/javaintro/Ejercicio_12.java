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
public class Ejercicio_12 {
   public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       String frase;
       int contT, contF;
       contT=0;
       contF=0;
       do {
           System.out.println("Ingrese una frase:");
           frase=leer.nextLine();
           int i = frase.length();
           if (frase.substring(0,1).equals("X") && frase.length()<=5 && frase.substring(i-1,i).equals("O")) {
               contT+= 1;
           }else{
               contF+= 1;
           }
       } while (!frase.equals("&&&&&"));
       
       System.out.println("La cantidad de lecturas correctas son: "+contT);
       System.out.println(" ");
       System.out.println("La cantidad de lecturas incorrectas son: "+(contF-1));
       
   } 
}
