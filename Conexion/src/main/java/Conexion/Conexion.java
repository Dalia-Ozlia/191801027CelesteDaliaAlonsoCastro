package Conexion;
import java.sql.*;

/**
 *
 * @author celes
 */
public class Conexion {
    //Static es una palabra reservada que determina que el atributo es de la clase y no del objeto
    //Final es un modificador que indica que el atributo es una constante por lo que no se le prodra cambiar
    private static final String URL ="jdbc:mysql://127.0.0.1:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL ";
    private static final String USUARIO="root",PASSWORD ="";
    public static Connection getConnection;
    
    //Throws SQLExceotion es el try y catch implementado en un metodo
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL,USUARIO,PASSWORD);
    }
    
    //Polimorfismo
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