package TestHerramienta;

import java.sql.*;
import DaoOzliaMae.DaoHerramienta;
import Herramienta.Herramienta;
import Conexion.Conexion;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author celes
 */
public class HerramientaLista {
    public static void main(String[] args) throws SQLException{
        List<Herramienta> listaHerramientas = new ArrayList<>();
        listaHerramientas = DaoHerramienta.listaHerramientas();
        
        for(Herramienta herramienta:listaHerramientas){
                  System.out.println(herramienta.datosCompletos());
        }
    }
}
