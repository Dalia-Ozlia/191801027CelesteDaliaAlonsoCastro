
package DaoUsuarios;

import Conexion.Conexion;
import Usuario.Usuario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author celes
 */
public class DaoUsuarios {
    private String SQL;
    
    public static List<Usuario> listaUsuarios() throws SQLException{
        List<Usuario> listaUsuarios = new ArrayList<>();
        Connection conexion = Conexion.getConnection();
        Statement declaracion = conexion.createStatement();
        String SQL = "SELECT * FROM usuario";
        ResultSet resultado = declaracion.executeQuery(SQL);
        
        while (resultado.next()){
            Usuario usuario = new Usuario(resultado.getInt("id"),resultado.getString("nombre_usuario"), resultado.getString("contraseña"), resultado.getString("fecha_alta"), resultado.getBoolean("status"));
            listaUsuarios.add(usuario);
        }
        
        Conexion.close(conexion,declaracion);
        return listaUsuarios;
    }
    
    public static void insertar(Usuario usuario) throws SQLException{
        Connection conexion = Conexion.getConnection();
        String SQL = "INSERT INTO usuarios(nombre_usuario,contraña,status)VALUES(?,?,?))";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        
        declaracion.setString(1, usuario.getNombreUs());
        declaracion.setString(2, usuario.getContraseña());
        declaracion.setInt(3, 1);
        
        declaracion.executeUpdate();
        
        Conexion.close(conexion, declaracion);
    }
    
    public static void eliminar(Usuario usuario) throws SQLException{
        
        Connection conexion = Conexion.getConnection();
        String SQL = "DELETE FROM usuarios WHERE id = ?";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        
        declaracion.setInt(1, usuario.getId());
        declaracion.executeUpdate();
        
        Conexion.close(conexion, declaracion);
    }
    
    public static void actualizar(Usuario usuario, int opcion) throws SQLException{
        
        Connection conexion = Conexion.getConnection();
        
        if(opcion == 1){
            String SQL = "UPDATE usuarios SET nombre_usuario = ? WHERE id = ?";
            PreparedStatement declaracion = conexion.prepareStatement(SQL);
            declaracion.setString(1, usuario.getNombreUs());
            declaracion.setInt(2, usuario.getId());
                
            declaracion.executeUpdate();
            Conexion.close(conexion, declaracion);
        }
        else if(opcion == 2){
            String SQL = "UPDATE usuarios SET contraseña = ? WHERE id = ?";
            PreparedStatement declaracion = conexion.prepareStatement(SQL);
            declaracion.setString(1, usuario.getContraseña());
            declaracion.setInt(2, usuario.getId());
                
            declaracion.executeUpdate();
            Conexion.close(conexion, declaracion);
        }
    }
}
