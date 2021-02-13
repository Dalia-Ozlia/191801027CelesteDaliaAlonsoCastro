
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author celes
 */
public class TestCine {
    public static void main (String[] arg) {
        Scanner nuevo = new Scanner (System.in);
        Scanner sc = new Scanner (System.in);
        //Una lista ligada puede ser de un tipo de variable o de una clase
        //ArrayList <Pelicula> peliculas = new ArrayList(); 
        Cine cine = new Cine("Cinepolis",9,11);
        int opcion;
        do {
            System.out.println("\n\t|-----------------------|");
            System.out.println("\t|\t  MENU\t\t|");
            System.out.println("\t|1. Agregar pelicula.\t|");
            System.out.println("\t|2. Salir.\t\t|");
            System.out.println("\t|-----------------------|");
            System.out.println("\tSeleccione opción: ");
            opcion = nuevo.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("\nINGRESE LOS DATOS DE LA PELICULA: ");
                    System.out.println("Titulo: ");
                    String tituloPeli = sc.nextLine();
                    System.out.println("Ingresando..."+tituloPeli);
                    Pelicula nuevaPeli = new Pelicula (tituloPeli);
                    
                    //Agregar objetos a la lista ligada
                    //peliculas.add(nuevaPeli);
                    cine.agregarPelicula(nuevaPeli);
                    break;
                case 2:
                    break;
                default:
                    System.out.println("\tOpcion no valida. Intente de nuevo.");
                    break;
            }
        }while (opcion != 2);
        
        System.out.println ("\nCARTELERA: ");
        System.out.println (cine.imprimirPeliculas());
        System.out.println("\nNúmero de películas en cartelera: "+ cine.numPeliculas());
        System.out.println (cine.menuPeliculas());
        System.out.println("\nIngresa la hora actual formato 24hrs usando punto decimal (Ej:9.37 ó 21.56)");
        double hora = nuevo.nextFloat();
        System.out.println (cine.horarioCine(hora));
    }
}
