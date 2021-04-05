
import java.sql.*;
import java.util.Scanner;
import DaoUsuarios.DaoUsuarios;
import Usuario.Usuario;

/**
 *
 * @author celes
 */
public class Eliminar {
    public static void main(String[] args){
        Scanner nuevo = new Scanner(System.in);
        System.out.println("Ingrese la id: ");
        int id = nuevo.nextInt();
        
        Usuario usuario = new Usuario(id);
        
        /*String url="jdbc:mysql://127.0.0.1:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL ";
        try{
            Connection conexion = DriverManager.getConnection(url,"root","");
            String SQL = "DELETE FROM usuario WHERE id=?";
            PreparedStatement declaracion = conexion.prepareStatement(SQL);
            Scanner nuevo = new Scanner(System.in);
            System.out.println("Ingrese ID de usuario a eliminar");
            String id = nuevo.nextLine();
            declaracion.setString(1, id);
            declaracion.executeUpdate();
            declaracion.close();
            conexion.close();
            System.out.println("Eliminación de usiario exitoso.");
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }*/
    }
}