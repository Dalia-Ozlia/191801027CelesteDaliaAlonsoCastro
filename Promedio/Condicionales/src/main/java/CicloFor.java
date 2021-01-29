
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
public class CicloFor {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame el número de la serie: ");
        int serie = scanner.nextInt();
        for (int i=0; i<=serie; i++)
            System.out.println(i);
        int i=0;
        while (i>=0 && i==serie){
            System.out.println(i);
            i--;
        }     
    }
}
