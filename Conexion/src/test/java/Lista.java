import java.sql.*;
import DaoUsuarios.DaoUsuarios;
import Usuario.Usuario;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author celes
 */
public class Lista {
   public static void main(String[] args) throws SQLException{
        List<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios = DaoUsuarios.listaUsuarios();
        
        for(Usuario usuario:listaUsuarios){
                  System.out.println(usuario);
        }
        
       
            /*//Crear conexion con base de datos
            //Connection conexion = DriverManager.getConnection(url,"root","");
            Connection conexion = Conexion.getConnection();
            //Crear una declaracion de como se va a trabajar en la clase de datos
            Statement declaracion = conexion.createStatement();
            String SQL = "SELECT * FROM usuario";
            //Variable que recibira el resultado de ejecutar la secuencia de SQL
            ResultSet resultado = declaracion.executeQuery(SQL);
            //Imprimir valores
            System.out.println("\n\tTabla usuario.");
            while(resultado.next()){
                System.out.println(resultado.getInt("id"));
                System.out.println(resultado.getString("nombre_usuario"));
            }
            SQL = "SELECT * FROM pagos";
            //Variable que recibira el resultado de ejecutar la secuencia de SQL
            resultado = declaracion.executeQuery(SQL);
            //Imprimir valores
            System.out.println("\n\tTabla pagos.");
            while(resultado.next()){
                System.out.println(resultado.getInt("folio"));
                System.out.println(resultado.getInt("id"));
                System.out.println(resultado.getString("nombre"));
                System.out.println(resultado.getString("fechaExpiracion"));
                System.out.println(resultado.getInt("cvv"));
                System.out.println(resultado.getLong("numero"));
                System.out.println(resultado.getFloat("total"));
            }
            Conexion.close(conexion, resultado, declaracion);*/
    }
}