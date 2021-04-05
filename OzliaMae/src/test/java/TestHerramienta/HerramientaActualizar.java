package TestHerramienta;

import java.sql.*;
import java.util.Scanner;
import DaoOzliaMae.DaoHerramienta;
import Herramienta.Herramienta;
/**
 *
 * @author celes
 */
public class HerramientaActualizar {
    public static void main(String[] args) throws SQLException{
        Scanner nuevo = new Scanner(System.in);
        int opcion,id;
        Herramienta herramienta;
        do{
            System.out.println("\n 1.- Cambiar número de serie.");
            System.out.println("2.- Cambiar marca.");
            System.out.println("3.- Cambiar torque.");
            System.out.println("4.- Cambiar ubicación.");
            System.out.println("0.- Salir.");
            System.out.println("\tOpcion: ");
            opcion = nuevo.nextInt();
            
            switch(opcion){
                case 0:
                    break;
                case 1:
                    System.out.println("Ingrese el ID:");
                    id = nuevo.nextInt();
                    System.out.println("Ingrese el nuevo número de serie: ");
                    nuevo.nextLine();
                    int noSerie = nuevo.nextInt();
                    herramienta = new Herramienta(id);
                    herramienta.setNoSerie(noSerie);
                    DaoHerramienta.actualizar(herramienta, opcion);
                    System.out.println("Herramienta actualizada.");
                    break;
                case 2:
                    System.out.println("Ingrese el ID:");
                    id = nuevo.nextInt();
                    System.out.println("Ingrese la nueva marca: ");
                    nuevo.nextLine();
                    String marca = nuevo.nextLine();
                    herramienta = new Herramienta(id);
                    herramienta.setMarca(marca);
                    DaoHerramienta.actualizar(herramienta, opcion);
                    System.out.println("Herramienta actualizada.");
                    break;
                case 3:
                    System.out.println("Ingrese el ID:");
                    id = nuevo.nextInt();
                    System.out.println("Ingrese el nuevo torque: ");
                    nuevo.nextLine();
                    int torque = nuevo.nextInt();
                    herramienta = new Herramienta(id);
                    herramienta.setTorque(torque);
                    DaoHerramienta.actualizar(herramienta, opcion);
                    System.out.println("Herramienta actualizada.");
                    break;
                case 4:
                    System.out.println("Ingrese el ID:");
                    id = nuevo.nextInt();
                    System.out.println("Ingrese la nueva ubicación: ");
                    nuevo.nextLine();
                    String ubicacion = nuevo.nextLine();
                    herramienta = new Herramienta(id);
                    herramienta.setUbicacion(ubicacion);
                    DaoHerramienta.actualizar(herramienta, opcion);
                    System.out.println("Herramienta actualizada.");
                    break;
                default:
                    System.out.println("Opción invalida. Intente de nuevo.\n");
                    break;
            }
        }while(opcion != 0);
    }
}
