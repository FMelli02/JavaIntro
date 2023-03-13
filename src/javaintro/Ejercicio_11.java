/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;
/**
 *
 * @author Usuario
 */
public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos números enteros positivos");
        int num1, num2;
        
        do {
            num1=leer.nextInt();
        } while (num1<=0);
        System.out.println("Entero 1 guardado correctamente");
        
        do {
            num2=leer.nextInt();
        } while (num2<=0);
        System.out.println("Entero 2 guardado correctamente");
        
        
        int opcion;
        
        int suma, resta, multiplicación;
        double div;
        String salida= " ";
        
        do {
            
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opción:");
            opcion=leer.nextInt();
            switch (opcion) {
            case 1:
                suma=num1+num2;
                System.out.println("El resultado de la suma es: "+suma);
                break;
            case 2:
                resta=num1-num2;
                System.out.println("El resultado de la resta es: "+ resta);
                break;
            case 3:
                multiplicación=num1*num2;
                System.out.println("El resultado de la multiplicación es: "+multiplicación);
                break;
            case 4:
                div=num1/num2;
                System.out.println("El resultado de la división es: "+div);
                break;
            case 5:
                System.out.println("¿Quiere salir del programa? (S/N)");
                salida=leer.next();
                salida=toUpperCase(salida);
                break;
            default:
                System.out.println("Comando no encontrado");
        }
        } while ((salida.equals("N")) || (opcion>=1 || opcion<=5));
        
    }
}
