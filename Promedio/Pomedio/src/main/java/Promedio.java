
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
public class Promedio {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un numero flotante");
        double numUno = scanner.nextDouble();
        System.out.println("Dame un numero flotante");
        double numDos = scanner.nextDouble();
        System.out.println("Dame un numero flotante");
        double numTres = scanner.nextDouble();
        System.out.println("Promedio:");
        System.out.println ((numUno + numDos + numTres)/3);
    }
}
