
import java.io.InputStream;
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
public class TestLeche {
    public static void main(String[]arg){
        Scanner nuevo = new Scanner (System.in);
        System.out.println ("INGRESA LOS DATOS DE LA LECHE");
        System.out.println ("Marca: ");
        String marca = nuevo.nextLine();
        System.out.println ("Tipo: ");
        String tipo = nuevo.nextLine();
        System.out.println ("Numero de lote: ");
        String loteNo = nuevo.nextLine();
        System.out.println ("Fecha de caducidad: ");
        String fechaCaducidad = nuevo.nextLine();
        System.out.println ("Cantidad: ");
        double cantidad = nuevo.nextFloat();
        System.out.println ("Codigo de barras: ");
        int codigoBarras = nuevo.nextInt();
        
        Leche lalaEnt = new Leche("LALA","Entera",1.5,1020515343,"10:02 S04 JLGC","10 JUL 21");
        Leche lalaDes = new Leche("LALA","Deslactosada",1,1020516353,"15:05 S04 JLDT","15 SEP 21");
        Leche lalaLig = new Leche("LALA","Light",1,1020517383,"20:14 S04 AOCC","21 MAY 21");
        Leche manual = new Leche(marca,tipo,cantidad,codigoBarras,loteNo,fechaCaducidad);
        System.out.println(lalaEnt);
        System.out.println(lalaDes);
        System.out.println(lalaLig);
        System.out.println(manual);
    }
}
