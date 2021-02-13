
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author celes
 */
public class TestCliente {
    public static void main(String[]arg){
        Scanner nuevo = new Scanner (System.in);
        //Scanner nuevo_1 = new Scanner (System.in);
        System.out.println ("INGRESA TUS DATOS");
        System.out.println ("Nombre: ");
        String nombre = nuevo.nextLine();
        System.out.println ("DNI: ");
        int dni = nuevo.nextInt();
        System.out.println ("Telefono: ");
        int telefono = nuevo.nextInt();
        System.out.println ("Edad: ");
        int edad = nuevo.nextInt();
        nuevo.nextLine();
        System.out.println ("INGRESA LOS DATOS DEL AUTO");
        System.out.println ("Marca: ");
        String marca = nuevo.nextLine();
        System.out.println ("Color: ");
        String color = nuevo.nextLine();
        System.out.println ("Transmisión: ");
        String transmision = nuevo.nextLine();
        System.out.println ("Precio: ");
        double precio = nuevo.nextFloat();
        System.out.println ("Matricula: ");
        int matricula = nuevo.nextInt();
        
        Coche auto1 = new Coche(marca,color,precio,matricula,transmision);
        Cliente client1 = new Cliente(nombre,dni,telefono,edad,auto1);
        Coche auto2 = new Coche("Volkswagen","Blanco",250.400,12345,"Manual");
        Cliente client2 = new Cliente("Abril",150518,22487614,20,auto2);
        Coche auto3 = new Coche("Volkswagen","Rojo",350.500,12346,"Trendline");
        Cliente client3 = new Cliente("Enrique",80670,25358321,50,auto3);
        Coche auto4 = new Coche("BMW","Negro",550.600,12347,"Automatico");
        Cliente client4 = new Cliente("Alvaro",90879,24749314,41,auto4);
        System.out.println(client1);
        System.out.println(client2);
        System.out.println(client3);
        System.out.println(client4);
    }
}
