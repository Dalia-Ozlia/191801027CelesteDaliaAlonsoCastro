
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
public class Ejercicio49 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int opcion,mar1=0,mar2=0,i,play1 = 0,play2 = 0;
        System.out.println("JUEGO PIEDRA, PAPEL O TIJERA.\nJugador uno.");    
        for (int j=1;j<=2;j++){
            System.out.println("\nPARTIDA "+j);
            i = 1;
            do{
                System.out.println("\nJUGADOR "+i);
                System.out.println("Elige una opción.\n1. Piedra.\n2. Papel.\n3. Tijera.");
                opcion = scanner.nextInt();
                switch (opcion)
                {
                    case 1:
                        if (i==1){
                            play1 = 1;
                            i++;
                        }
                        else {
                            play2 = 1;
                            i++;
                        }
                        break;
                    case 2:
                        if (i==1){
                            play1 = 2;
                            i++;
                        }
                        else {
                            play2 = 2;
                            i++;
                        }
                        break;
                    case 3:
                        if (i==1){
                            play1 = 3;
                            i++;
                        }
                        else {
                            play2 = 3;
                            i++;
                        }
                        break;
                    default:
                        System.out.println("Opcion no valida. Pierdes.");
                        if (i==1){
                            play1 = 0;
                            i++;
                        }
                        else {
                            play2 = 0;
                            i++;
                        }
                        break;
                }
            }while (i == 2);
            if (play1 != play2){
                if (play1 > play2)
                mar1++;
                else{
                    if (play1 == 1){
                        if (play2 == 3)
                            mar1++;
                        else{
                            if (play2 == 2)
                            mar2++;
                        }
                    }
                    else 
                        mar2++;
                }  
            }     
        }
        if (mar1 > mar2)
            System.out.println("\nJUGADOR 1 GANA.");
        else{
            if (mar1 == mar2)
                System.out.println("\nES UN EMPATE");
            else
                System.out.println("\nJUGADOR 2 GANA");
        }      
    }
}