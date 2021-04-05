package TestEmpleado;

import java.sql.*;
import java.util.Scanner;
import DaoOzliaMae.DaoEmpleado;
import Empleado.Empleado;
/**
 *
 * @author celes
 */
public class EmpleadoActualizar {
    public static void main(String[] args) throws SQLException{
        Scanner nuevo = new Scanner(System.in);
        int opcion,id;
        Empleado empleado;
        do{
            System.out.println("\n1.- Cambiar nombre.");
            System.out.println("2.- Cambiar tipo de empleado.");
            System.out.println("3.- Cambiar contraseña.");
            System.out.println("0.- Salir.");
            System.out.println("\tOpcion: ");
            opcion = nuevo.nextInt();
            
            switch(opcion){
                case 0:
                    break;
                case 1:
                    System.out.println("Ingrese el ID:");
                    id = nuevo.nextInt();
                    System.out.println("Ingrese el nuevo nombre: ");
                    nuevo.nextLine();
                    String nombre = nuevo.nextLine();
                    empleado = new Empleado(id);
                    empleado.setNombre(nombre);
                    DaoEmpleado.actualizar(empleado, opcion);
                    System.out.println("Empleado actualizado.");
                    break;
                case 2:
                    System.out.println("Ingrese el ID:");
                    id = nuevo.nextInt();
                    System.out.println("Ingrese tipo de empleado: ");
                    nuevo.nextLine();
                    String empTipo = nuevo.nextLine();
                    empleado = new Empleado(id);
                    empleado.setEmpTipo(empTipo);
                    DaoEmpleado.actualizar(empleado, opcion);
                    System.out.println("Empleado actualizado.");
                    break;
                case 3:
                    System.out.println("Ingrese el ID:");
                    id = nuevo.nextInt();
                    System.out.println("Ingrese nueva contraseña: ");
                    nuevo.nextLine();
                    String password = nuevo.nextLine();
                    empleado = new Empleado(id);
                    empleado.setPassword(password);
                    DaoEmpleado.actualizar(empleado, opcion);
                    System.out.println("Empleado actualizado.");
                    break;
                default:
                    System.out.println("Opción invalida. Intente de nuevo.\n");
                    break;
            }
        }while(opcion != 0);
    }
}
