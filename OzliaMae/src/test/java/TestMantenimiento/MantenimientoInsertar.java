package TestMantenimiento;

import DaoOzliaMae.DaoMantenimiento;
import DaoOzliaMae.DaoEmpleado;
import Empleado.Empleado;
import Mantenimiento.Mantenimiento;
import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author celes
 */
public class MantenimientoInsertar {
    public static void main(String[] args) throws SQLException{
        Scanner nuevo = new Scanner (System.in);
        boolean accesoPass;
        System.out.println("Ingresa tu número de control: ");
        int empID = nuevo.nextInt();
        nuevo.nextLine();
        System.out.println("Ingresa tu contraseña: ");
        String password = nuevo.nextLine();
        accesoPass = DaoEmpleado.acceso(empID, password);
        
        if (accesoPass == true){
            System.out.println("Ingrese ID de herramienta: ");
            int herrID = nuevo.nextInt();
            nuevo.nextLine();
            System.out.println("Comentario: ");
            String comentario = nuevo.nextLine();
            Mantenimiento mantenimiento = new Mantenimiento(empID, herrID, 1, comentario);
            
            DaoMantenimiento.insertarAbrirMatto(mantenimiento);
            System.out.println("Mantenimiento registrado.");
        }
        else
            System.out.println("Contraseña incorrecta.");
    }
}
