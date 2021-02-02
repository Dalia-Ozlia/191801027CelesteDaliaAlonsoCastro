
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
public class EjercicioExtra {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double resultado = 0,monto=0;
        System.out.println("\nCONVERSION DE DIVISAS A PESOS MX.");
        do {
            resultado = 0;
            System.out.println("\nIngresa tu monto: ");
            monto = scanner.nextFloat();
            System.out.println("\nDIVISAS:\n1.Dolares\n2.Euros\n3.Yenes\n4.Quetzales\n0. SALIR\nSELECCIONE OPCION: ");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    resultado = monto * 20.28;
                    break;
                case 2:
                    resultado = monto * 24.51;
                    break;
                case 3:
                    resultado = monto * .19;
                    break;
                case 4:
                    resultado = monto * 2.61;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\nOpcion no valida. Intente de nuevo.");
                    break;
            }
        System.out.print("Resultado: "+resultado);
        System.out.println(" MX");
        }while (opcion != 0);
    }
}