package DaoOzliaMae;

import Conexion.Conexion;
import Herramienta.Herramienta;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author celes
 */
public class DaoHerramienta {
    private String SQL;
    
    public static List<Herramienta> listaHerramientas() throws SQLException{
        List<Herramienta> listaHerramientas = new ArrayList<>();
        Connection conexion = Conexion.getConnection();
        Statement declaracion = conexion.createStatement();
        String SQL = "SELECT * FROM herramienta";
        ResultSet resultado = declaracion.executeQuery(SQL);
        
        while (resultado.next()){
            Herramienta herramienta = new Herramienta(resultado.getInt("herrID"),resultado.getInt("torque"),resultado.getInt("noSerie"),resultado.getString("marca"),resultado.getString("ubicacion"));
            listaHerramientas.add(herramienta);
        }
        Conexion.close(conexion,declaracion);
        return listaHerramientas;
    }
    
    public static void insertar(Herramienta herramienta) throws SQLException{
        Connection conexion = Conexion.getConnection();
        String SQL = "INSERT INTO herramienta(noSerie,marca,torque,ubicacion)VALUES(?,?,?,?)";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        
        declaracion.setInt(1, herramienta.getNoSerie());
        declaracion.setString(2, herramienta.getMarca());
        declaracion.setInt(3, herramienta.getTorque());
        declaracion.setString(4, herramienta.getUbicacion());
        
        declaracion.executeUpdate();
        
        Conexion.close(conexion, declaracion);
    }
    
    public static void eliminar(Herramienta herramienta) throws SQLException{
        Connection conexion = Conexion.getConnection();
        String SQL = "DELETE FROM herramienta WHERE herrID = ?";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        declaracion.setInt(1, herramienta.getHerrID());
        declaracion.executeUpdate();
        
        Conexion.close(conexion, declaracion);
    }
    
    public static void actualizar(Herramienta herramienta, int opcion) throws SQLException{
        Connection conexion = Conexion.getConnection();
        String SQL;
        PreparedStatement declaracion;
        switch(opcion){
            case 1:
                SQL = "UPDATE herramienta SET noSerie = ? WHERE herrID = ?";
                declaracion = conexion.prepareStatement(SQL);
                declaracion.setInt(1, herramienta.getNoSerie());
                declaracion.setInt(2,herramienta.getHerrID());
                declaracion.executeUpdate();
                Conexion.close(conexion, declaracion);
                break;
            case 2:
                SQL = "UPDATE herramienta SET marca = ? WHERE herrID = ?";
                declaracion = conexion.prepareStatement(SQL);
                declaracion.setString(1, herramienta.getMarca());
                declaracion.setInt(2,herramienta.getHerrID());
                declaracion.executeUpdate();
                Conexion.close(conexion, declaracion);
                break;
            case 3:
                SQL = "UPDATE herramienta SET torque = ? WHERE herrID = ?";
                declaracion = conexion.prepareStatement(SQL);
                declaracion.setInt(1, herramienta.getTorque());
                declaracion.setInt(2,herramienta.getHerrID());
                declaracion.executeUpdate();
                Conexion.close(conexion, declaracion);
                break;
            case 4:
                SQL = "UPDATE herramienta SET ubicacion = ? WHERE herrID = ?";
                declaracion = conexion.prepareStatement(SQL);
                declaracion.setString(1, herramienta.getUbicacion());
                declaracion.setInt(2,herramienta.getHerrID());
                declaracion.executeUpdate();
                Conexion.close(conexion, declaracion);
                break;
        }
    }
    
    public static Herramienta ubicacion(int herrID) throws SQLException{
        Connection conexion = Conexion.getConnection();
        Herramienta herramienta = new Herramienta();      
        Statement declaracion = conexion.createStatement();
        String SQL = "SELECT * FROM herramienta WHERE herrID = " + herrID;
        ResultSet resultado = declaracion.executeQuery(SQL);
        while (resultado.next()){
            herramienta = new Herramienta(resultado.getInt("herrID"),resultado.getInt("torque"),resultado.getInt("noSerie"),resultado.getString("marca"),resultado.getString("ubicacion"));
        }
        return herramienta;
    }
    
    public static Herramienta buscar(int noSerie) throws SQLException{
        Connection conexion = Conexion.getConnection();
        Herramienta herramienta = new Herramienta();      
        Statement declaracion = conexion.createStatement();
        String SQL = "SELECT * FROM herramienta WHERE noSerie = " + noSerie;
        ResultSet resultado = declaracion.executeQuery(SQL);
        while (resultado.next()){
            herramienta = new Herramienta(resultado.getInt("herrID"),resultado.getInt("torque"),resultado.getInt("noSerie"),resultado.getString("marca"),resultado.getString("ubicacion"));
        }
        return herramienta;
    }
}
