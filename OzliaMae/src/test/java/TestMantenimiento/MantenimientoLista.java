package TestMantenimiento;

import DaoOzliaMae.DaoMantenimiento;
import Mantenimiento.Mantenimiento;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author celes
 */
public class MantenimientoLista {
    public static void main(String[] args) throws SQLException{
        List<Mantenimiento> listaMantenimientos = new ArrayList<>();
        listaMantenimientos = DaoMantenimiento.listaMantenimientos();
        
        for(Mantenimiento mantenimiento:listaMantenimientos){
                  System.out.println(mantenimiento.datosCompletos());
        }
    }
}
