package DaoOzliaMae;

import Conexion.Conexion;
import Refaccion.Refaccion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import DaoOzliaMae.DaoMantenimiento;

/**
 *
 * @author celes
 */
public class DaoRefaccion {
    private String SQL;
    
    public static List<Refaccion> listaRefacciones() throws SQLException{
        List<Refaccion> listaRefacciones = new ArrayList<>();
        Connection conexion = Conexion.getConnection();
        Statement declaracion = conexion.createStatement();
        String SQL = "SELECT * FROM refaccion";
        ResultSet resultado = declaracion.executeQuery(SQL);
        
        while (resultado.next()){
            Refaccion refaccion = new Refaccion(resultado.getInt("refaID"), resultado.getInt("cc"), resultado.getInt("mattoID"), resultado.getString("descripcion"), resultado.getString("marca"), resultado.getFloat("costo"));
            listaRefacciones.add(refaccion);
        }
        Conexion.close(conexion,declaracion);
        return listaRefacciones;
    }
    
    public static void insertar(Refaccion refaccion) throws SQLException{
        Connection conexion = Conexion.getConnection();
        int herrID = DaoMantenimiento.asociar(refaccion.getMattoID());
        
        String SQL = "INSERT INTO refaccion(descripcion, marca, costo, cc, mattoID) VALUES (?,?,?,?,?)";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        declaracion.setString(1, refaccion.getDescripcion());
        declaracion.setString(2, refaccion.getMarca());
        declaracion.setFloat(3, refaccion.getCosto());
        declaracion.setInt(4, refaccion.getCc());
        declaracion.setInt(5, refaccion.getMattoID());
        
        declaracion.executeUpdate();
        
        Conexion.close(conexion, declaracion);
    }
    
    public static void eliminar(Refaccion refaccion) throws SQLException{
        Connection conexion = Conexion.getConnection();
        String SQL = "DELETE FROM refaccion WHERE refaID = ?";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        declaracion.setInt(1, refaccion.getRefaID());
        declaracion.executeUpdate();
        
        Conexion.close(conexion, declaracion);
    }
    
    public static void actualizar(Refaccion refaccion, int opcion) throws SQLException{
        Connection conexion = Conexion.getConnection();
        String SQL;
        PreparedStatement declaracion;
        switch(opcion){
            case 1:
                SQL = "UPDATE refaccion SET descripcion = ? WHERE refaID = ?";
                declaracion = conexion.prepareStatement(SQL);
                declaracion.setString(1,refaccion.getDescripcion());
                declaracion.setInt(2,refaccion.getRefaID());
                declaracion.executeUpdate();
                Conexion.close(conexion, declaracion);
                break;
            case 2:
                SQL = "UPDATE refaccion SET marca = ? WHERE refaID = ?";
                declaracion = conexion.prepareStatement(SQL);
                declaracion.setString(1,refaccion.getMarca());
                declaracion.setInt(2,refaccion.getRefaID());
                declaracion.executeUpdate();
                Conexion.close(conexion, declaracion);
                break;
            case 3:
                SQL = "UPDATE refaccion SET costo = ? WHERE refaID = ?";
                declaracion = conexion.prepareStatement(SQL);
                declaracion.setFloat(1,refaccion.getCosto());
                declaracion.setInt(2,refaccion.getRefaID());
                declaracion.executeUpdate();
                Conexion.close(conexion, declaracion);
                break;
            case 4:
                SQL = "UPDATE refaccion SET cc = ? WHERE refaID = ?";
                declaracion = conexion.prepareStatement(SQL);
                declaracion.setInt(1,refaccion.getCc());
                declaracion.setInt(2,refaccion.getRefaID());
                declaracion.executeUpdate();
                Conexion.close(conexion, declaracion);
                break;
        }
    }
    
    public static List<Refaccion> buscar(int mattoID) throws SQLException{
        List<Refaccion> listaRefacciones = new ArrayList<>();
        Connection conexion = Conexion.getConnection();
        Refaccion refaccion = new Refaccion();      
        Statement declaracion = conexion.createStatement();
        String SQL = "SELECT * FROM refaccion WHERE mattoID = " + mattoID;
        ResultSet resultado = declaracion.executeQuery(SQL);
        
        while (resultado.next()){
            refaccion = new Refaccion(resultado.getInt("refaID"), resultado.getInt("cc"), resultado.getInt("mattoID"), resultado.getString("descripcion"), resultado.getString("marca"), resultado.getFloat("costo"));
            listaRefacciones.add(refaccion);
        }
        Conexion.close(conexion,declaracion);
        return listaRefacciones;
    }
}
