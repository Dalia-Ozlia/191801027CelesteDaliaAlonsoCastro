
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
public class TestMaterias {
    public static void main(String[]arg){
        Scanner scan = new Scanner (System.in);
        System.out.println ("INGRESA LOS DATOS DE LA MATERIA");
        System.out.println ("Nombre: ");
        String nombre = scan.nextLine();
        System.out.println ("Codigo: ");
        String codigo = scan.nextLine();
        System.out.println ("Carrera: ");
        String carrera = scan.nextLine();
        System.out.println ("Cuatrimestre: ");
        int cuatrimestre = scan.nextInt();
        System.out.println ("Creditos: ");
        int creditos = scan.nextInt();
        
        Materia ingles = new Materia("Ingles VII","Ing08","Ing. IT",8,5);
        Materia baseDatos = new Materia("Base de datos","BD01","Ing. IT",5,8);
        Materia seguridad = new Materia("Seguridad Industrial","Seg01","Ing. Industrial",4,8);
        Materia manual = new Materia(nombre,codigo,carrera,cuatrimestre,creditos);
        System.out.println(ingles);
        System.out.println(baseDatos);
        System.out.println(seguridad);
        System.out.println(manual);
    }
}
