package TestHerramienta;

import java.sql.*;
import java.util.Scanner;
import DaoOzliaMae.DaoHerramienta;
import Herramienta.Herramienta;

/**
 *
 * @author celes
 */
public class HerramientaInsertar {
    public static void main(String[] args) throws SQLException{
        Scanner nuevo = new Scanner (System.in);
        System.out.println("Número de serie: ");
        int noSerie = nuevo.nextInt();
        nuevo.nextLine();
        System.out.println("Marca: ");
        String marca = nuevo.nextLine();
        System.out.println("Torque: ");
        int torque = nuevo.nextInt();
        nuevo.nextLine();
        System.out.println("Ubicación (N-No. de Nave Ej: N004): ");
        String ubicacion = nuevo.nextLine();
        Herramienta herramienta = new Herramienta(torque, noSerie, marca, ubicacion);
        
        DaoHerramienta.insertar(herramienta);
        System.out.println("Herramienta ingresada.");
    }
}
