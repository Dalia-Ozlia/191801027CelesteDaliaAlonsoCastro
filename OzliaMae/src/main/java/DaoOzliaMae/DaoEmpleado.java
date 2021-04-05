package DaoOzliaMae;

import Conexion.Conexion;
import Empleado.Empleado;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author celes
 */
public class DaoEmpleado {

    public static boolean acceso(String empID, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String SQL;
    
    public static List<Empleado> listaEmpleados() throws SQLException{
        List<Empleado> listaEmpleados = new ArrayList<>();
        Connection conexion = Conexion.getConnection();
        Statement declaracion = conexion.createStatement();
        String SQL = "SELECT * FROM empleado";
        ResultSet resultado = declaracion.executeQuery(SQL);
        
        while (resultado.next()){
            Empleado empleado = new Empleado(resultado.getInt("empID"),resultado.getString("nombre"),resultado.getString("empTipo"),resultado.getString("password"));
            listaEmpleados.add(empleado);
        }
        Conexion.close(conexion,declaracion);
        return listaEmpleados;
    }
    
    public static void insertar(Empleado empleado) throws SQLException{
        Connection conexion = Conexion.getConnection();
        String SQL = "INSERT INTO empleado(empID,nombre,empTipo,password)VALUES(?,?,?,?)";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        
        declaracion.setInt(1, empleado.getEmpID());
        declaracion.setString(2, empleado.getNombre());
        declaracion.setString(3, empleado.getEmpTipo());
        declaracion.setString(4, empleado.getPassword());
        
        declaracion.executeUpdate();
        
        Conexion.close(conexion, declaracion);
    }
    
    public static void eliminar(Empleado empleado) throws SQLException{
        Connection conexion = Conexion.getConnection();
        String SQL = "DELETE FROM empleado WHERE empID = ?";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        declaracion.setInt(1, empleado.getEmpID());
        declaracion.executeUpdate();
        
        Conexion.close(conexion, declaracion);
    }
    
    public static void actualizar(Empleado empleado, int opcion) throws SQLException{
        Connection conexion = Conexion.getConnection();
        String SQL;
        PreparedStatement declaracion;
        switch(opcion){
            case 1:
                SQL = "UPDATE empleado SET nombre = ? WHERE empID = ?";
                declaracion = conexion.prepareStatement(SQL);
                declaracion.setString(1,empleado.getNombre());
                declaracion.setInt(2, empleado.getEmpID());
                declaracion.executeUpdate();
                Conexion.close(conexion, declaracion);
                break;
            case 2:
                SQL = "UPDATE empleado SET empTipo = ? WHERE empID = ?";
                declaracion = conexion.prepareStatement(SQL);
                declaracion.setString(1, empleado.getEmpTipo());
                declaracion.setInt(2, empleado.getEmpID());
                declaracion.executeUpdate();
                Conexion.close(conexion, declaracion);
                break;
            case 3:
                SQL = "UPDATE empleado SET password = ? WHERE empID = ?";
                declaracion = conexion.prepareStatement(SQL);
                declaracion.setString(1, empleado.getPassword());
                declaracion.setInt(2, empleado.getEmpID());
                declaracion.executeUpdate();
                Conexion.close(conexion, declaracion);
                break;
        }
    }
    
    public static boolean acceso(int empID, String password) throws SQLException{
        Connection conexion = Conexion.getConnection();
        Empleado empleado = new Empleado();      
        Statement declaracion = conexion.createStatement();
        String SQL = "SELECT * FROM empleado WHERE empID = " + empID;
        ResultSet resultado = declaracion.executeQuery(SQL);
        while (resultado.next()){
            empleado = new Empleado(resultado.getInt("empID"),resultado.getString("nombre"),resultado.getString("empTipo"),resultado.getString("password"));
        }
        boolean acceso;
        if (password.equals(empleado.getPassword()))
            acceso = true;
        else
            acceso = false;
        Conexion.close(conexion, declaracion);
        return acceso;
    }
    
    public static Empleado nombre(int empID) throws SQLException{
        Connection conexion = Conexion.getConnection();
        Empleado empleado = new Empleado();      
        Statement declaracion = conexion.createStatement();
        String SQL = "SELECT * FROM empleado WHERE empID = " + empID;
        ResultSet resultado = declaracion.executeQuery(SQL);
        while (resultado.next()){
            empleado = new Empleado(resultado.getInt("empID"),resultado.getString("nombre"),resultado.getString("empTipo"),resultado.getString("password"));
        }
        return empleado;
    }
    
    public static boolean permiso(int empID,String password) throws SQLException{
        Connection conexion = Conexion.getConnection();
        Empleado empleado = new Empleado();      
        Statement declaracion = conexion.createStatement();
        String SQL = "SELECT * FROM empleado WHERE empID = " + empID;
        ResultSet resultado = declaracion.executeQuery(SQL);
        while (resultado.next()){
            empleado = new Empleado(resultado.getInt("empID"),resultado.getString("nombre"),resultado.getString("empTipo"),resultado.getString("password"));
        }
        boolean permiso = false;
        String empTipo = "Coordinador";
        if (password.equals(empleado.getPassword())){
            if (empTipo.equals(empleado.getEmpTipo()))
                permiso = true;
        }
        else
            permiso = false;
        Conexion.close(conexion, declaracion);
        return permiso;
    }
}
