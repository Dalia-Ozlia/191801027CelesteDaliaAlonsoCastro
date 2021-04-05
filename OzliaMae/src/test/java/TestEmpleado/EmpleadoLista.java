package TestEmpleado;

import java.sql.*;
import DaoOzliaMae.DaoEmpleado;
import Empleado.Empleado;
import Conexion.Conexion;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author celes
 */
public class EmpleadoLista {
    public static void main(String[] args) throws SQLException{
        List<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados = DaoEmpleado.listaEmpleados();
        
        for(Empleado empleado:listaEmpleados){
                  System.out.println(empleado.datosCompletos());
        }
    }
}
