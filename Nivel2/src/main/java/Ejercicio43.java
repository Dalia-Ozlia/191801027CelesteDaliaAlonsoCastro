
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author celes
 */
public class Ejercicio43 {
    public static void main (String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero entero.");
        int num1 = scanner.nextInt();
        System.out.println("Ingresa un numero entero.");
        int num2 = scanner.nextInt();
        if (num1 == num2)
            System.out.println("Los numeros son iguales");
        else if (num1<num2){
            System.out.println("El numero mayor es: "+num2);
            System.out.println("El numero menor es: "+num1);
        }
        else {
            System.out.println("El numero mayor es: "+num1);
            System.out.println("El numero menor es: "+num2);
        }    
    }
}
