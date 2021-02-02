
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
public class Ejercicio76 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String oracion="",paCorta=null,paLarga=null,palabra=null;
        int lonCorta=0,lonLarga=0,lonActual=0;
        System.out.println("\nIngresa el número de palabras de la oración.");
        int numPal = scanner.nextInt();
        if (numPal == 0 || numPal == 1)
            System.out.println("\n¡Error!");
        else {
            for (int i=0; i<numPal;i++){
                System.out.println("Palabra "+(i+1));
                palabra = scanner.next();
                oracion +=" "+palabra;
                lonActual = palabra.length();
                if (i == 0){
                    paCorta = paLarga = palabra;
                    lonCorta = lonLarga = lonActual;
                    System.out.println("Primera palabra");
                }
                else {
                    if (lonActual > lonLarga){
                        paLarga = palabra;
                        lonLarga = lonActual;
                    }
                    else {
                        if (lonActual < lonCorta){
                            paCorta = palabra;
                            lonCorta = lonActual;
                        }
                    }  
                }
            }
            System.out.println("Oración:"+oracion);
            System.out.println("La palabra corta es: "+paCorta);
            System.out.println("La palabra larga es: "+paLarga);
        }
    }
}
