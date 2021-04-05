package TestRefaccion;

import DaoOzliaMae.DaoRefaccion;
import Refaccion.Refaccion;
import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author celes
 */
public class RefaccionInsertar {
    public static void main(String[] args) throws SQLException{
        Scanner nuevo = new Scanner (System.in);
        System.out.println("Descripción: ");
        String descripcion = nuevo.nextLine();
        System.out.println("Marca: ");
        String marca = nuevo.nextLine();
        System.out.println("Costo: ");
        float costo = nuevo.nextFloat();
        System.out.println("Centro de costos (CC): ");
        int cc = nuevo.nextInt();
        System.out.println("Mantenimiento ID asociado: ");
        int mattoID = nuevo.nextInt();
        Refaccion refaccion = new Refaccion(cc, mattoID, descripcion, marca, costo);
        
        DaoRefaccion.insertar(refaccion);
        System.out.println("Refacción ingresada.");
    }
}
