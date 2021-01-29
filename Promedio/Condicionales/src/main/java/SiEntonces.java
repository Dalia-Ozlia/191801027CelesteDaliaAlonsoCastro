
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
public class SiEntonces {
    public static void main (String []args){
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        numero = scanner.nextInt();
        if (numero<0)
            System.out.println ("El numero es negatico.");
        else
            System.out.println("El numero es positivo.");
    }
    
}
