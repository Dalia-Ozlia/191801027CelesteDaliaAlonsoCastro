
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
public class Ejercicio65 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDIBUJO DE UN TRIANGULO.");
        System.out.println("\nIngresa la altura del triangulo: ");
        int alt = scanner.nextInt();
        if (alt == 0 || alt == 1){
            System.out.println("\n¡Error!");
        }
        else {
            for (int i=1; i<=alt;i++){
                for (int j=0; j<i; j++)
                    System.out.print("*");
                System.out.print("\n");
            }
        }
    }
}
