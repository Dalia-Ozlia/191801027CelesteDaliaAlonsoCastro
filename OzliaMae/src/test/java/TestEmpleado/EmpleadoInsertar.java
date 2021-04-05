package TestEmpleado;

import java.sql.*;
import java.util.Scanner;
import DaoOzliaMae.DaoEmpleado;
import Empleado.Empleado;
/**
 *
 * @author celes
 */
public class EmpleadoInsertar {
    public static void main(String[] args) throws SQLException{
        Scanner nuevo = new Scanner (System.in);
        System.out.println("Número de control: ");
        int empID = nuevo.nextInt();
        nuevo.nextLine();
        System.out.println("Nombre: ");
        String nombre = nuevo.nextLine();
        System.out.println("Tipo de empleado: ");
        String empTipo = nuevo.nextLine();
        System.out.println("Contraseña: ");
        String password = nuevo.nextLine();
        Empleado empleado = new Empleado(empID,nombre, empTipo, password);
        
        DaoEmpleado.insertar(empleado);
        System.out.println("Empleado ingresado.");
    }
}
