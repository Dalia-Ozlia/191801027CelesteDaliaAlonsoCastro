package TestEmpleado;

import java.sql.*;
import java.util.Scanner;
import DaoOzliaMae.DaoEmpleado;
import Empleado.Empleado;
/**
 *
 * @author celes
 */
public class EmpleadoEliminar {
    public static void main(String[] args) throws SQLException{
        Scanner nuevo = new Scanner(System.in);
        System.out.println("Ingrese ID del empleado: ");
        int id = nuevo.nextInt();
        
        Empleado empleado = new Empleado(id);
        System.out.println(empleado.datosCompletos());
        DaoEmpleado.eliminar(empleado);
        System.out.println("Registro eliminado.");
    }
}
