package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOUsuario {

    // Método para insertar un nuevo usuario en la base de datos
    public void insertarUsuario(String nombre, String correo, String contraseña, String rol) {
        String sql = "INSERT INTO usuarios (nombre, correo, contraseña, rol) VALUES (?, ?, ?, ?)";
        
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setString(2, correo);
            ps.setString(3, contraseña);
            ps.setString(4, rol);  // Se asigna el rol del usuario
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para actualizar un usuario en la base de datos
    public void actualizarUsuario(int id, String nombre, String correo, String contraseña, String rol) {
        String sql = "UPDATE usuarios SET nombre = ?, correo = ?, contraseña = ?, rol = ? WHERE id = ?";
        
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setString(2, correo);
            ps.setString(3, contraseña);
            ps.setString(4, rol);  // Se actualiza el rol del usuario
            ps.setInt(5, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para eliminar un usuario de la base de datos
    public void eliminarUsuario(int id) {
        String sql = "DELETE FROM usuarios WHERE id = ?";
        
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para obtener los datos de un usuario según su ID
    public void obtenerUsuario(int id) {
        String sql = "SELECT * FROM usuarios WHERE id = ?";
        
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeQuery();
            // Puedes agregar el procesamiento de los resultados aquí (si necesitas mostrar o trabajar con los datos)
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
