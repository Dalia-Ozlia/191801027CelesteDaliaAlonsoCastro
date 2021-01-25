
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
public class Tacos {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuantos tacos ordenaron?");
        int numUno = scanner.nextInt();
        System.out.println("¿Cuantos refrescos ordenaron?");
        int numDos = scanner.nextInt();
        System.out.println("Total:");
        System.out.println ((numUno * 17) + (numDos * 10));
    }
}
