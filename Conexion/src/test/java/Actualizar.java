
import java.sql.*;
import java.util.Scanner;
import DaoUsuarios.DaoUsuarios;
import Usuario.Usuario;

/**
 *
 * @author celes
 */
public class Actualizar {
    public static void main(String[] args) throws SQLException{
        Scanner nuevo = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("1.- Cambiar nombre de usuario.");
            System.out.println("2.- Cambiar contraseña.");
            System.out.println("\tOpcion:");
            opcion = nuevo.nextInt();
        }while(opcion < 1 && opcion > 2);
                
        if(opcion == 1){
            System.out.println("Ingrese el ID:");
            int id = nuevo.nextInt();
            System.out.println("Ingrese el nombre:");
            nuevo.nextLine();
            String nombreUsuario = nuevo.nextLine();
            Usuario usuario = new Usuario(id, nombreUsuario);
            DaoUsuarios.actualizar(usuario, opcion);
        }
        else if(opcion == 2){
            System.out.println("Ingrese el ID:");
            int id = nuevo.nextInt();
            System.out.println("Ingrese la contraseña:");
            nuevo.nextLine();
            String contraseña = nuevo.nextLine();
            Usuario usuario = new Usuario(id, contraseña);
            DaoUsuarios.actualizar(usuario, opcion);
        }
        
        /*
        String url="jdbc:mysql://127.0.0.1:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL ";
        try{
            Connection conexion = DriverManager.getConnection(url,"root","");
            String SQL = "UPDATE usuario SET id=?"+ "WHERE id=?";
            PreparedStatement declaracion = conexion.prepareStatement(SQL);
            Scanner nuevo = new Scanner(System.in);
            System.out.println("Ingrese el ID que se modificara: ");
            String id = nuevo.nextLine();
            System.out.println("Ingrese el nuevo ID: ");
            String idNuevo = nuevo.nextLine();
            declaracion.setString(1, idNuevo);
            declaracion.setString(2, id);
            declaracion.executeUpdate();
            declaracion.close();
            conexion.close();
            System.out.println("Actualizacion de ID exitosa.");
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }*/
    }
}