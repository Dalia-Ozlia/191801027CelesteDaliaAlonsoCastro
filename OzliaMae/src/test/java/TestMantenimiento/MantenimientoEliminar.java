package TestMantenimiento;

import DaoOzliaMae.DaoMantenimiento;
import Mantenimiento.Mantenimiento;
import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author celes
 */
public class MantenimientoEliminar {
    public static void main(String[] args) throws SQLException{
        Scanner nuevo = new Scanner(System.in);
        System.out.println("Ingrese ID de mantenimiento: ");
        int id = nuevo.nextInt();
        
        Mantenimiento mantenimiento = new Mantenimiento(id);
        DaoMantenimiento.eliminar(mantenimiento);
        System.out.println("Registro eliminado.");
    }
}
