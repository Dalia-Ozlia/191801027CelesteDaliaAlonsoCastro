package TestHerramienta;

import java.sql.*;
import java.util.Scanner;
import DaoOzliaMae.DaoHerramienta;
import Herramienta.Herramienta;

/**
 *
 * @author celes
 */
public class HerramientaEliminar {
    public static void main(String[] args) throws SQLException{
        Scanner nuevo = new Scanner(System.in);
        System.out.println("Ingrese ID de herramienta: ");
        int id = nuevo.nextInt();
        
        Herramienta herramienta = new Herramienta(id);
        DaoHerramienta.eliminar(herramienta);
        System.out.println("Registro eliminado.");
    }
}
