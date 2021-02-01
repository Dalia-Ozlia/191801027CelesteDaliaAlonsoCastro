
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
public class Ejercicio67 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        double resultado = 0;
        System.out.println("\nSERIE DE GREGORY-LEIBNIZ.");
        System.out.println("\nIngresa la estimacion (Ej:1 ó 10): ");
        int k = scanner.nextInt();
        if (k == 0)
            System.out.println("\n¡Error!");
        else {
            for (int i=1; i<k+1;i++)
                resultado += (Math.pow(-1,i+1))/(2*i-1);
            resultado *= 4;
            System.out.println("\nLa estimación de Pi es: "+resultado);
        }
    }
}
