package TestRefaccion;

import DaoOzliaMae.DaoRefaccion;
import Refaccion.Refaccion;
import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author celes
 */
public class RefaccionActualizar {
    public static void main(String[] args) throws SQLException{
        Scanner nuevo = new Scanner(System.in);
        int opcion,id;
        Refaccion refaccion;
        do{
            System.out.println("\n1.- Cambiar descripción.");
            System.out.println("2.- Cambiar marca.");
            System.out.println("3.- Cambiar costo.");
            System.out.println("4.- Cambiar Centro de Costos (CC).");
            System.out.println("0.- Salir.");
            System.out.println("\tOpcion: ");
            opcion = nuevo.nextInt();
            
            switch(opcion){
                case 0:
                    break;
                case 1:
                    System.out.println("Ingrese el ID:");
                    id = nuevo.nextInt();
                    System.out.println("Ingrese descripción: ");
                    nuevo.nextLine();
                    String descripcion = nuevo.nextLine();
                    refaccion = new Refaccion(id);
                    refaccion.setDescripcion(descripcion);
                    DaoRefaccion.actualizar(refaccion, opcion);
                    System.out.println("Refacción actualizada.");
                    break;
                case 2:
                    System.out.println("Ingrese el ID:");
                    id = nuevo.nextInt();
                    System.out.println("Ingrese nueva marca: ");
                    nuevo.nextLine();
                    String marca = nuevo.nextLine();
                    refaccion = new Refaccion(id);
                    refaccion.setMarca(marca);
                    DaoRefaccion.actualizar(refaccion, opcion);
                    System.out.println("Refacción actualizada.");
                    break;
                case 3:
                    System.out.println("Ingrese el ID:");
                    id = nuevo.nextInt();
                    System.out.println("Ingrese nuevo costo: ");
                    float costo = nuevo.nextFloat();
                    refaccion = new Refaccion(id);
                    refaccion.setCosto(costo);
                    DaoRefaccion.actualizar(refaccion, opcion);
                    System.out.println("Refacción actualizada.");
                    break;
                case 4:
                    System.out.println("Ingrese el ID:");
                    id = nuevo.nextInt();
                    System.out.println("Ingrese nuevo Centro de Costos (CC): ");
                    int cc = nuevo.nextInt();
                    refaccion = new Refaccion(id);
                    refaccion.setCc(cc);
                    DaoRefaccion.actualizar(refaccion, opcion);
                    System.out.println("Refacción actualizada.");
                    break;
                default:
                    System.out.println("Opción invalida. Intente de nuevo.\n");
                    break;
            }
        }while(opcion != 0);
    }
}
