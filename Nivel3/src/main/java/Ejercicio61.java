
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
public class Ejercicio61 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPOTENCIA DE UN NUMERO ENTERO.");
        System.out.println("\nIngresa un numero entero: ");
        int num = scanner.nextInt();
        System.out.println("\nIngresa el exponente: ");
        int expo = scanner.nextInt();
        int resultado = num;
        if (expo == 0){
            if (num == 0)
            {
                System.out.println("\n¡Error!");
                resultado = 0;
            }
            else
                resultado = 1;
        }
        else {
            for (int i=1; i<expo;i++)
                resultado *= num;
        }
        System.out.println("\nEl resultado de la potencia es: "+resultado);
    }
}
