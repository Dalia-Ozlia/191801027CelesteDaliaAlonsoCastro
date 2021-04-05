
package TestRefaccion;

import DaoOzliaMae.DaoRefaccion;
import Refaccion.Refaccion;
import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author celes
 */
public class RefaccionEliminar {
    public static void main(String[] args) throws SQLException{
        Scanner nuevo = new Scanner(System.in);
        System.out.println("Ingrese ID de refacción: ");
        int id = nuevo.nextInt();
        
        Refaccion refaccion = new Refaccion(id);
        DaoRefaccion.eliminar(refaccion);
        System.out.println("Registro eliminado.");
    }
}
