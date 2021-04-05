
package TestRefaccion;

import DaoOzliaMae.DaoRefaccion;
import Refaccion.Refaccion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author celes
 */
public class RefaccionLista {
    public static void main(String[] args) throws SQLException{
        List<Refaccion> listaRefacciones = new ArrayList<>();
        listaRefacciones = DaoRefaccion.listaRefacciones();
        
        for(Refaccion refaccion:listaRefacciones){
                  System.out.println(refaccion.datosCompletos());
        }
    }
}
