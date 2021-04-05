
import java.sql.*;
import java.util.Scanner;
import DaoUsuarios.DaoUsuarios;
import Usuario.Usuario;
//
/**
 *
 * @author celes
 */
public class Insertar {
    public static void main(String[] args) throws SQLException{
        Scanner nuevo = new Scanner (System.in);
        System.out.println("Nombre del usuario: ");
        String nombreUsuario = nuevo.nextLine();
        System.out.println("Contraseña: ");
        String contraseña = nuevo.nextLine();
        Usuario usuario = new Usuario(nombreUsuario, contraseña);
        DaoUsuarios.insertar(usuario);
        
        System.out.println(usuario);
        
        
        /*String url="jdbc:mysql://127.0.0.1:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL ";
        try{
            //Crear conexion con base de datos
            Connection conexion = DriverManager.getConnection(url,"root","");
            //Crear una declaracion de como se va a trabajar en la clase de datos
            String SQL = "INSERT INTO usuario (nombre_usuario,contraseña,status)VALUES(?,?,?)";
            PreparedStatement declaracion = conexion.prepareStatement(SQL);
            System.out.println("\nIngresa el nombre del usuario: ");
            String nombre = nuevo.nextLine();
            declaracion.setString(1, nombre);
            System.out.println("\nIngresa la contraseña del usuario: ");
            String password = nuevo.nextLine();
            declaracion.setString(2, password);
            System.out.println("\nIngresa el estatus del usuario (1 = vigente ; 0 = no vigente): ");
            int status = nuevo.nextInt();
            declaracion.setInt(3, status);
            //Variable que recibira el resultado de ejecutar la secuencia de SQL
            declaracion.executeUpdate();
            //Cerrar toda conexion con la base de datos
            declaracion.close();
            conexion.close();
            // SELECT MAX usuario.id +1;
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }*/
        
    }
}
