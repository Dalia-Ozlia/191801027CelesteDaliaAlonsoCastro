package Conexion;
import java.sql.*;
/**
 *
 * @author CELESTE DALIA
 */
public class Conexion {
    private static final String URL ="jdbc:mysql://127.0.0.1:3306/ozlia_mae?zeroDateTimeBehavior=CONVERT_TO_NULL ";
    private static final String USUARIO = "root",PASSWORD = "";
    public static Connection getConnection;
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL,USUARIO,PASSWORD);
    }
    
    public static void close(Connection conexion) throws SQLException{
        conexion.close();
    }
    
    public static void close(Connection conexion,Statement declaracion) throws SQLException{
        conexion.close();
        declaracion.close();
    }
    
    public static void close(Connection conexion,ResultSet resultado,Statement declaracion) throws SQLException{
        resultado.close();
        conexion.close();
        declaracion.close();
    }
}