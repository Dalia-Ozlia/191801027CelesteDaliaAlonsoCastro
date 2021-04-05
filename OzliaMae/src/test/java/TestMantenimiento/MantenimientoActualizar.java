package TestMantenimiento;

import DaoOzliaMae.DaoEmpleado;
import DaoOzliaMae.DaoMantenimiento;
import Mantenimiento.Mantenimiento;
import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author celes
 */
public class MantenimientoActualizar {
    public static void main(String[] args) throws SQLException{
        Scanner nuevo = new Scanner(System.in);
        int opcion,id;
        Mantenimiento mantenimiento;
        do{
            System.out.println("\n1.- Cerrar un mantenimiento.");
            System.out.println("2.- Cambiar herrID.");
            System.out.println("3.- Cambiar comentario.");
            System.out.println("4.- Cambiar cliente-recibe.");
            System.out.println("0.- Salir.");
            System.out.println("\tOpcion: ");
            opcion = nuevo.nextInt();
            
            switch(opcion){
                case 0:
                    break;
                case 1:
                    boolean accesoPass;
                    System.out.println("Ingresa tu número de control: ");
                    int empID = nuevo.nextInt();
                    nuevo.nextLine();
                    System.out.println("Ingresa tu contraseña: ");
                    String password = nuevo.nextLine();
                    accesoPass = DaoEmpleado.acceso(empID, password);
                    if (accesoPass == true){
                        System.out.println("Ingrese el ID de mantenimiento: ");
                        id = nuevo.nextInt();
                        System.out.println("Ingrese fecha y hora de cierre (Formato /'AAAA-MM-DD HH:MM/'): ");
                        nuevo.nextLine();
                        String fechaHoraFin = nuevo.nextLine();
                        System.out.println("Ingrese nombre del cliente-recibe: ");
                        String recibe = nuevo.nextLine();
                        System.out.println("Ingrese comentario (Mantenimiento realizado breve): ");
                        String comentario = nuevo.nextLine();
                        mantenimiento = new Mantenimiento(empID, 0, fechaHoraFin, recibe, comentario);
                        mantenimiento.setMattoID(id);
                        
                        DaoMantenimiento.actualizar(mantenimiento, opcion);
                        System.out.println("Mantenimiento cerrado.");
                    }
                    else
                        System.out.println("Contraseña incorrecta.");
                    break;
                case 2:
                    System.out.println("Ingrese el ID de mantenimiento: ");
                    id = nuevo.nextInt();
                    System.out.println("Ingrese el nuevo ID de herramienta: ");
                    int herrID = nuevo.nextInt();
                    mantenimiento = new Mantenimiento(id);
                    mantenimiento.setHerrID(herrID);

                    DaoMantenimiento.actualizar(mantenimiento, opcion);
                    System.out.println("Mantenimiento actualizado.");
                    break;
                case 3:
                    System.out.println("Ingrese el ID de mantenimiento: ");
                    id = nuevo.nextInt();
                    System.out.println("Ingrese el nuevo comentario: ");
                    nuevo.nextLine();
                    String comentario = nuevo.nextLine();
                    mantenimiento = new Mantenimiento(id);
                    mantenimiento.setComentario(comentario);

                    DaoMantenimiento.actualizar(mantenimiento, opcion);
                    System.out.println("Mantenimiento actualizado.");
                    break;
                case 4:
                    System.out.println("Ingrese el ID de mantenimiento: ");
                    id = nuevo.nextInt();
                    System.out.println("Ingrese el nuevo cliente-recibe: ");
                    nuevo.nextLine();
                    String recibe = nuevo.nextLine();
                    mantenimiento = new Mantenimiento(id);
                    mantenimiento.setRecibe(recibe);

                    DaoMantenimiento.actualizar(mantenimiento, opcion);
                    System.out.println("Mantenimiento actualizado.");
                    break;
                default:
                    System.out.println("Opción invalida. Intente de nuevo.\n");
                    break;
            }
        }while(opcion != 0);
    } 
}
