package DaoOzliaMae;
import Conexion.Conexion;
import Mantenimiento.Mantenimiento;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author celes
 */
public class DaoMantenimiento {
   private String SQL;
    
    public static List<Mantenimiento> listaMantenimientos() throws SQLException{
        List<Mantenimiento> listaMantenimientos = new ArrayList<>();
        Connection conexion = Conexion.getConnection();
        Statement declaracion = conexion.createStatement();
        String SQL = "SELECT * FROM mantenimiento";
        ResultSet resultado = declaracion.executeQuery(SQL);
        
        while (resultado.next()){
            Mantenimiento mantenimiento = new Mantenimiento(resultado.getInt("mattoID"), resultado.getInt("empID"),  resultado.getInt("herrID"), resultado.getInt("status"), resultado.getString("fechaHoraInicio"), resultado.getString("fechaHoraFin"), resultado.getString("recibe"), resultado.getString("comentario"));
            listaMantenimientos.add(mantenimiento);
        }
        Conexion.close(conexion,declaracion);
        return listaMantenimientos;
    }
    
    public static void insertarAbrirMatto(Mantenimiento mantenimiento) throws SQLException{
        Connection conexion = Conexion.getConnection();
        String SQL = "INSERT INTO mantenimiento(comentario, status, empID, herrID,recibe) VALUES (?,?,?,?,?)";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        
        declaracion.setString(1, mantenimiento.getComentario());
        declaracion.setInt(2, mantenimiento.getStatus());
        declaracion.setInt(3, mantenimiento.getEmpID());
        declaracion.setInt(4, mantenimiento.getHerrID());
        declaracion.setString(5, " ");
        
        declaracion.executeUpdate();
        
        Conexion.close(conexion, declaracion);
    }
    
    
    public static void eliminar(Mantenimiento mantenimiento) throws SQLException{
        Connection conexion = Conexion.getConnection();
        String SQL = "DELETE FROM mantenimiento WHERE mattoID = ?";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        declaracion.setInt(1, mantenimiento.getMattoID());
        declaracion.executeUpdate();
        
        Conexion.close(conexion, declaracion);
    }
    
    public static void actualizar(Mantenimiento mantenimiento, int opcion) throws SQLException{
        Connection conexion = Conexion.getConnection();
        String SQL;
        PreparedStatement declaracion;
        switch(opcion){
            case 1:
                SQL = "UPDATE mantenimiento SET empID = ?, fechaHoraFin = ?, recibe = ?, status = ?, comentario = ? WHERE mattoID = ?";
                declaracion = conexion.prepareStatement(SQL);
                declaracion.setInt(1, mantenimiento.getEmpID());
                declaracion.setString(2,mantenimiento.getFechaHoraFin());
                declaracion.setString(3,mantenimiento.getRecibe());
                declaracion.setInt(4,mantenimiento.getStatus());
                declaracion.setString(5,mantenimiento.getComentario());
                declaracion.setInt(6,mantenimiento.getMattoID());

                declaracion.executeUpdate();
                Conexion.close(conexion, declaracion);
                break;
            case 2:
                SQL = "UPDATE mantenimiento SET herrID = ? WHERE mattoID = ?";
                declaracion = conexion.prepareStatement(SQL);
                declaracion.setInt(1, mantenimiento.getHerrID());
                declaracion.setInt(2,mantenimiento.getMattoID());
                declaracion.executeUpdate();
                Conexion.close(conexion, declaracion);
                break;
            case 3:
                SQL = "UPDATE mantenimiento SET comentario = ? WHERE mattoID = ?";
                declaracion = conexion.prepareStatement(SQL);
                declaracion.setString(1, mantenimiento.getComentario());
                declaracion.setInt(2,mantenimiento.getMattoID());
                declaracion.executeUpdate();
                Conexion.close(conexion, declaracion);
                break;
            case 4:
                SQL = "UPDATE mantenimiento SET recibe = ? WHERE mattoID = ?";
                declaracion = conexion.prepareStatement(SQL);
                declaracion.setString(1, mantenimiento.getRecibe());
                declaracion.setInt(2,mantenimiento.getMattoID());
                declaracion.executeUpdate();
                Conexion.close(conexion, declaracion);
                break;
        }
    }
    
    public static int asociar(int mattoID) throws SQLException{
        Connection conexion = Conexion.getConnection();
        Mantenimiento mantenimiento = new Mantenimiento();      
        Statement declaracion = conexion.createStatement();
        String SQL = "SELECT * FROM mantenimiento WHERE mattoID = " + mattoID;
        ResultSet resultado = declaracion.executeQuery(SQL);
        
        while (resultado.next()){
            mantenimiento = new Mantenimiento(resultado.getInt("mattoID"), resultado.getInt("empID"),  resultado.getInt("herrID"), resultado.getInt("status"), resultado.getString("fechaHoraInicio"), resultado.getString("fechaHoraFin"), resultado.getString("recibe"), resultado.getString("comentario"));
        }
        int herrID = mantenimiento.getHerrID();
        Conexion.close(conexion, declaracion);
        return herrID;
    }
    
    public static Mantenimiento buscar(int mattoID) throws SQLException{
        Connection conexion = Conexion.getConnection();
        Mantenimiento mantenimiento = new Mantenimiento();      
        Statement declaracion = conexion.createStatement();
        String SQL = "SELECT * FROM mantenimiento WHERE mattoID = " + mattoID;
        ResultSet resultado = declaracion.executeQuery(SQL);
        
        while (resultado.next()){
            mantenimiento = new Mantenimiento(resultado.getInt("mattoID"), resultado.getInt("empID"),  resultado.getInt("herrID"), resultado.getInt("status"), resultado.getString("fechaHoraInicio"), resultado.getString("fechaHoraFin"), resultado.getString("recibe"), resultado.getString("comentario"));
        }
        Conexion.close(conexion, declaracion);
        return mantenimiento;
    }
    
    public static List<Mantenimiento> filtraar(int status) throws SQLException{
        List<Mantenimiento> listaMantenimientos = new ArrayList<>();
        Connection conexion = Conexion.getConnection();
        Mantenimiento mantenimiento = new Mantenimiento();      
        Statement declaracion = conexion.createStatement();
        String SQL = "SELECT * FROM mantenimiento WHERE status = " + status;
        ResultSet resultado = declaracion.executeQuery(SQL);
        
        while (resultado.next()){
            mantenimiento = new Mantenimiento(resultado.getInt("mattoID"), resultado.getInt("empID"),  resultado.getInt("herrID"), resultado.getInt("status"), resultado.getString("fechaHoraInicio"), resultado.getString("fechaHoraFin"), resultado.getString("recibe"), resultado.getString("comentario"));
            listaMantenimientos.add(mantenimiento);
        }
        return listaMantenimientos;
    }
    
    public static List<Mantenimiento> buscarHerr(int herrID) throws SQLException{
        List<Mantenimiento> listaMantenimientos = new ArrayList<>();
        Connection conexion = Conexion.getConnection();
        Mantenimiento mantenimiento = new Mantenimiento();      
        Statement declaracion = conexion.createStatement();
        String SQL = "SELECT * FROM mantenimiento WHERE herrID = " + herrID;
        ResultSet resultado = declaracion.executeQuery(SQL);
        
        while (resultado.next()){
            mantenimiento = new Mantenimiento(resultado.getInt("mattoID"), resultado.getInt("empID"),  resultado.getInt("herrID"), resultado.getInt("status"), resultado.getString("fechaHoraInicio"), resultado.getString("fechaHoraFin"), resultado.getString("recibe"), resultado.getString("comentario"));
            listaMantenimientos.add(mantenimiento);
        }
        return listaMantenimientos;
    }
}
